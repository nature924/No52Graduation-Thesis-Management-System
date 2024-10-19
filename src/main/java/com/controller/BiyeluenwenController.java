
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 毕业论文
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/biyeluenwen")
public class BiyeluenwenController {
    private static final Logger logger = LoggerFactory.getLogger(BiyeluenwenController.class);

    @Autowired
    private BiyeluenwenService biyeluenwenService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;

    @Autowired
    private PingyuejiaoshiService pingyuejiaoshiService;
    @Autowired
    private ZhidaojiaoshiService zhidaojiaoshiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("评阅教师".equals(role))
            params.put("pingyuejiaoshiId",request.getSession().getAttribute("userId"));
        else if("指导教师".equals(role))
            params.put("zhidaojiaoshiId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = biyeluenwenService.queryPage(params);

        //字典表数据转换
        List<BiyeluenwenView> list =(List<BiyeluenwenView>)page.getList();
        for(BiyeluenwenView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        BiyeluenwenEntity biyeluenwen = biyeluenwenService.selectById(id);
        if(biyeluenwen !=null){
            //entity转view
            BiyeluenwenView view = new BiyeluenwenView();
            BeanUtils.copyProperties( biyeluenwen , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(biyeluenwen.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody BiyeluenwenEntity biyeluenwen, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,biyeluenwen:{}",this.getClass().getName(),biyeluenwen.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            biyeluenwen.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<BiyeluenwenEntity> queryWrapper = new EntityWrapper<BiyeluenwenEntity>()
            .eq("yonghu_id", biyeluenwen.getYonghuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BiyeluenwenEntity biyeluenwenEntity = biyeluenwenService.selectOne(queryWrapper);
        if(biyeluenwenEntity==null){
            biyeluenwen.setBiyeluenwenYesnoTypes(1);
            biyeluenwen.setCreateTime(new Date());
            biyeluenwenService.insert(biyeluenwen);
            return R.ok();
        }else {
            return R.error(511,"只能添加一条数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody BiyeluenwenEntity biyeluenwen, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,biyeluenwen:{}",this.getClass().getName(),biyeluenwen.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            biyeluenwen.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<BiyeluenwenEntity> queryWrapper = new EntityWrapper<BiyeluenwenEntity>()
            .notIn("id",biyeluenwen.getId())
            .andNew()
            .eq("zhonggaoshenhe_name", biyeluenwen.getZhonggaoshenheName())
            .eq("yonghu_id", biyeluenwen.getYonghuId())
            .eq("biyeluenwen_yesno_types", biyeluenwen.getBiyeluenwenYesnoTypes())
            .eq("biyeluenwen_num", biyeluenwen.getBiyeluenwenNum())
            .eq("biyeluenwen_yesno_text", biyeluenwen.getBiyeluenwenYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BiyeluenwenEntity biyeluenwenEntity = biyeluenwenService.selectOne(queryWrapper);
        if("".equals(biyeluenwen.getZhonggaoshenheFile()) || "null".equals(biyeluenwen.getZhonggaoshenheFile())){
                biyeluenwen.setZhonggaoshenheFile(null);
        }
        if(biyeluenwenEntity==null){
            BiyeluenwenEntity biyeluenwenEntity1 = biyeluenwenService.selectById(biyeluenwen.getId());
            if(biyeluenwenEntity1.getBiyeluenwenYesnoTypes() == 3){
                biyeluenwen.setBiyeluenwenYesnoTypes(1);
            }
            biyeluenwenService.updateById(biyeluenwen);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody BiyeluenwenEntity biyeluenwenEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,biyeluenwenEntity:{}",this.getClass().getName(),biyeluenwenEntity.toString());

//        if(biyeluenwenEntity.getBiyeluenwenYesnoTypes() == 2){//通过
//            biyeluenwenEntity.setBiyeluenwenTypes();
//        }else if(biyeluenwenEntity.getBiyeluenwenYesnoTypes() == 3){//拒绝
//            biyeluenwenEntity.setBiyeluenwenTypes();
//        }
        biyeluenwenService.updateById(biyeluenwenEntity);//审核
        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        biyeluenwenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<BiyeluenwenEntity> biyeluenwenList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            BiyeluenwenEntity biyeluenwenEntity = new BiyeluenwenEntity();
//                            biyeluenwenEntity.setZhonggaoshenheName(data.get(0));                    //标题 要改的
//                            biyeluenwenEntity.setZhonggaoshenheFile(data.get(0));                    //论文文件 要改的
//                            biyeluenwenEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            biyeluenwenEntity.setBiyeluenwenYesnoTypes(Integer.valueOf(data.get(0)));   //打分状态 要改的
//                            biyeluenwenEntity.setBiyeluenwenNum(Integer.valueOf(data.get(0)));   //现阶段分数 要改的
//                            biyeluenwenEntity.setBiyeluenwenYesnoText(data.get(0));                    //评语 要改的
//                            biyeluenwenEntity.setCreateTime(date);//时间
                            biyeluenwenList.add(biyeluenwenEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        biyeluenwenService.insertBatch(biyeluenwenList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}

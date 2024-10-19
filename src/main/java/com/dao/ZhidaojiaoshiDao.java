package com.dao;

import com.entity.ZhidaojiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhidaojiaoshiView;

/**
 * 指导教师 Dao 接口
 *
 * @author 
 */
public interface ZhidaojiaoshiDao extends BaseMapper<ZhidaojiaoshiEntity> {

   List<ZhidaojiaoshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

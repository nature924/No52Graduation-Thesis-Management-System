package com.dao;

import com.entity.PingyuejiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PingyuejiaoshiView;

/**
 * 评阅教师 Dao 接口
 *
 * @author 
 */
public interface PingyuejiaoshiDao extends BaseMapper<PingyuejiaoshiEntity> {

   List<PingyuejiaoshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

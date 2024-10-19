package com.dao;

import com.entity.BiyeluenwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BiyeluenwenView;

/**
 * 毕业论文 Dao 接口
 *
 * @author 
 */
public interface BiyeluenwenDao extends BaseMapper<BiyeluenwenEntity> {

   List<BiyeluenwenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author alexshen
 * @email alex_shency@outlook.com
 * @date 2023-10-26 22:44:25
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}

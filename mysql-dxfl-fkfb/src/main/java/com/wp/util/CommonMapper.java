package com.wp.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: wp
 * @Title: CommonMapper
 * @Description: TODO
 * @date 2019/8/8 11:00
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

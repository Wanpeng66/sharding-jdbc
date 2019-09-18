package com.wp.fb;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @author: wp
 * @Title: MyPreciseShardingAlgorithm
 * @Description: TODO
 * @date 2019/9/18 13:34
 */
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
    @Override
    public String doSharding( Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue ) {
        for (String tableName : collection) {
            if (tableName.endsWith( preciseShardingValue.getValue() % 4 + "" )) {
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }
}

package com.wp.service;

import com.wp.domain.User;
import com.wp.mapper.UserMapper;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;
import java.util.UUID;

/**
 * @author: wp
 * @Title: TxService
 * @Description: TODO
 * @date 2019/9/18 17:17
 */
@Service("tx")
public class TxService {

    @Autowired
    UserMapper userMapper;

    @ShardingTransactionType(TransactionType.XA)
    @Transactional
    public void success(){
        userMapper.insert( new User( new Random(  ).nextInt(), UUID.randomUUID().toString(),"" ) );
    }

    @ShardingTransactionType(TransactionType.XA)
    @Transactional
    public void processFailure() {
        userMapper.insert( new User( 10,"qqqqqqqqqq","3333" ) );
        userMapper.insert( new User( 5,"qqqq","3333" ) );
    }
}

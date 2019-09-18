package com.wp;

import com.wp.domain.User;
import com.wp.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlDxflFbApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void fb() {
        //userMapper.insert( new User( 1111,"wpwp","123456" ) );
        List<User> users = userMapper.selectAll();
    }

}

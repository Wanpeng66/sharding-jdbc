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
public class MysqlDxflFkfbApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void fkfb() {
        //userMapper.insert( new User( 6,"qqqq","3333" ) );
        List<User> users = userMapper.selectAll();
        System.out.println(users);
    }

}

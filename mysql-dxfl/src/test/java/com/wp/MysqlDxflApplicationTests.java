package com.wp;

import com.github.pagehelper.PageInterceptor;
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
public class MysqlDxflApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testDxfl(){
		//userMapper.insert( new User("wlj","123456") );
		List<User> users = userMapper.selectAll();
	}

}

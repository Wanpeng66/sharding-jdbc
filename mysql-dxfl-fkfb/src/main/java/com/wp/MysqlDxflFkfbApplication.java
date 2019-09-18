package com.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.wp.mapper")
public class MysqlDxflFkfbApplication {

    public static void main( String[] args ) {
        SpringApplication.run( MysqlDxflFkfbApplication.class, args );
    }

}

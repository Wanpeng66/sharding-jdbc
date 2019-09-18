package com.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wp.mapper")
public class MysqlDxflFbApplication {

    public static void main( String[] args ) {
        SpringApplication.run( MysqlDxflFbApplication.class, args );
    }

}

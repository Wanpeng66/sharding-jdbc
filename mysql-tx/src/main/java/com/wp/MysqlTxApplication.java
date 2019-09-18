package com.wp;

import com.wp.service.TxService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.wp.mapper")
public class MysqlTxApplication {

    public static void main( String[] args ) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(MysqlTxApplication.class, args)) {
            test(applicationContext);
        }

    }

    public static void test(final ConfigurableApplicationContext applicationContext){
        TxService service = (TxService) applicationContext.getBean( "tx" );

        service.success();
        try{
            service.processFailure();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

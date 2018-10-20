package com.pku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**  @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ShareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShareApplication.class, args);
    }
}
  **/


@SpringBootApplication
public class ShareApplication{
    public static void main(String[] args) throws Exception{
        SpringApplication.run(ShareApplication.class,args);
    }
}

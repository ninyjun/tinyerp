package com.ninyjun.tinyerp.account.acctsvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ninyjun.tinyerp.account.acctsvc.repository")
public class AcctSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcctSvcApplication.class, args);
	}

}

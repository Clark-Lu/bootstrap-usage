package com.luchang.bootstrapusage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = {"com.luchang.bootstrapusage"})
public class BootstrapUsageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapUsageApplication.class, args);
	}
}

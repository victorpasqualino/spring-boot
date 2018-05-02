package br.com.s2it.spring.beans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "br.com.s2it.spring.beans.config.service")
public class AppConfig {

}

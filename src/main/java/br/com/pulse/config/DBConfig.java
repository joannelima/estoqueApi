package br.com.pulse.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("br.com.pulse.mapper")
public class DBConfig {
}
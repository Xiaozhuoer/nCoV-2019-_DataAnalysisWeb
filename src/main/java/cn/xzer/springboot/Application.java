package cn.xzer.springboot;

import cn.xzer.springboot.mapper.NCoVCNMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 启动类
 */

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private NCoVCNMapper nCoVCNMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... args)throws Exception{
        nCoVCNMapper.selectAll();
    }
}

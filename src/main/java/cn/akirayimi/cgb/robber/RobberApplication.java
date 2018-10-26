package cn.akirayimi.cgb.robber;

import cn.akirayimi.cgb.robber.service.RestTemplateWithCookies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RobberApplication {

    public static void main(String[] args) {
        SpringApplication.run(RobberApplication.class, args);
    }

//    @Bean
//    RestTemplate restTemplate() {
//        return new RestTemplateWithCookies();
//    }
}

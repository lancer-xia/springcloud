package lancer.io.eureka.consume.rribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/")
    public String home() {
        return "Hello EurekaConsumerRibbon";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }
}

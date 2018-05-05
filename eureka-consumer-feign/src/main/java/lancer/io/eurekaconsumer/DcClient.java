package lancer.io.eurekaconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA
 * Created By lancer
 * Date: 2018/5/5
 * Time: 13:43
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}

package lancer.io.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA
 * Created By lancer
 * Date: 2018/5/5
 * Time: 9:49
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
}
package lancer.io.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * Created By lancer
 * Date: 2018/5/5
 * Time: 14:59
 */
@RestController
public class HelloController {
    @Value("${info.from}")
    private String from;
    @Value("${info.profile}")
    private String profile;
    @Value("${test}")
    private String test;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
    @RequestMapping("/profile")
    public String profile() {
        return this.profile;
    }
    @RequestMapping("/test")
    public String test() {
        return this.test;
    }
}
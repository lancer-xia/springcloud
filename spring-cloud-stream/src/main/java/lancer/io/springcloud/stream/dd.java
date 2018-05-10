package lancer.io.springcloud.stream;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Created By lancer
 * Date: 2018/5/6
 * Time: 14:19
 */
@Data
public class Order {

    private String orderNum;

    private String type;

    private int num;

    private Date createAt;
}
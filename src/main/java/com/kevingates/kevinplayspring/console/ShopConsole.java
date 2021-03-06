package com.kevingates.kevinplayspring.console;

import com.kevingates.kevinplayspring.component.ComponentUser;
import com.kevingates.kevinplayspring.defineannotation.KevinAutowired;
import com.kevingates.kevinplayspring.models.Nft;
import com.kevingates.kevinplayspring.models.Order;
import com.kevingates.kevinplayspring.models.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ShopConsole implements CommandLineRunner {

    @KevinAutowired
    //private User user = new User();
    private User user;

    @Autowired
    private ComponentUser componentUser;

    @Autowired
    private Nft nft;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("How to use bean and component");
        System.out.println("beans: "+user.getName());

        //ComponentDemo
        System.out.println("component: "+componentUser.getValue());

        System.out.println("StringUtils "+ StringUtils.quote("russia"));

        this.beanFactory();
        this.applicationContext();
        this.getBeanByJavaBasedConfiguration();
    }

    public void beanFactory() {
        Resource res = new ClassPathResource("order.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Order order = (Order) factory.getBean("order");

        System.out.println("order: "+order.getOrderInfo());
        System.out.println("order id: "+order.getOrderId());
    }

    public void applicationContext() {
        System.out.println("============application Context==============");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order.xml");
        Order order = applicationContext.getBean("order", Order.class);

        System.out.println("order: "+order.getOrderInfo());
        System.out.println("order id: "+order.getOrderId());
    }

    //Spring - Java Based Configuration
    public void getBeanByJavaBasedConfiguration() {
        System.out.println("============Java Based Configuration==============");
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(Nft.class);
//        Nft nft = ctx.getBean(Nft.class);
        System.out.println("Java Based Configuration: "+nft.getTokenInfo());
    }
}

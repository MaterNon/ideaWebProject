/**
 * FileName: Test
 * Author:   Rex
 * Date:     2018/6/12 17:40
 * Description: 测试使用
 */

package com.inspur.test;

import com.inspur.bean.User;
import com.inspur.service.DrinkService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/sconf/applicationContext-spring.xml");

        User user = (User)context.getBean("user");
        user.setName("效力");
        System.out.println(user.getName());
        DrinkService dsi = (DrinkService)context.getBean("dsi");
        dsi.drinkFood("牛奶");



    }
}

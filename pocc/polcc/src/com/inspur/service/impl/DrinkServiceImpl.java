/**
 * FileName: DrinkServiceImpl
 * Author:   Rex
 * Date:     2018/6/13 9:54
 * Description:
 */

package com.inspur.service.impl;

import com.inspur.bean.User;
import com.inspur.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dsi")
public class DrinkServiceImpl implements DrinkService {
    @Autowired
    private User user;
    @Override
    public String drinkFood(String food) {
        System.out.println(user.getName()+ "喝"+food);
        return "喝"+food;
    }
}

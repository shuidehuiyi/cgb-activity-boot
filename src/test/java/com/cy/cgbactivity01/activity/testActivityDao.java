package com.cy.cgbactivity01.activity;

import com.cy.cgbactivity01.activity.dao.ActivityDao;
import com.cy.cgbactivity01.activity.pojo.Activity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author shuidehuiyi@gmail.com
 * @date 2020/6/3 17:15
 */
@SpringBootTest
public class testActivityDao {
    @Autowired
    private ActivityDao activityDao;
    @Test
    public void testActivityDao(){
        List<Activity> list = activityDao.findAll();
        for (Activity activity : list) {
            System.out.println(activity);
        }
    }
}

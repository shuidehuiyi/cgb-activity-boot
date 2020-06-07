package com.cy.cgbactivity01.activity.service;

import com.cy.cgbactivity01.activity.pojo.Activity;

import java.util.List;

/**
 * @author shuidehuiyi@gmail.com
 * @date 2020/6/3 16:28
 */
public interface ActivityService {
    /** 1 查询所有 活动信息 */
    List<Activity> findAll();
    /** 2 删除活动信息 根据id*/
    void deleteById(Integer id);
    /** 4 根据id 查找活动信息*/
    Activity findById(Integer id);

    int saveActivity(Activity activity);
}

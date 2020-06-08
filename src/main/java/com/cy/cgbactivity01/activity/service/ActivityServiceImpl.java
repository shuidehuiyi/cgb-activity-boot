package com.cy.cgbactivity01.activity.service;

import com.cy.cgbactivity01.activity.dao.ActivityDao;
import com.cy.cgbactivity01.activity.pojo.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author shuidehuiyi@gmail.com
 * @date 2020/6/3 16:29
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityDao activityDao;

    /** 1 查询所有 活动信息 */
    @Override
    public List<Activity> findAll() {
        List<Activity> list = activityDao.findAll();
        return list;
    }
    /** 2 删除活动信息 根据id*/
    @Override
    public void deleteById(Integer id) {
        activityDao.deleteById(id);
    }
    /** 4 根据id 查找活动信息*/
    @Override
    public Activity findById(Integer id) {
        Activity activity = activityDao.findById(id);
        return activity;
    }

    /** 6 */
    @Override
    public Activity saveActivity(Activity entity) {
//        return activityDao.insertActivity(entity);
        if(entity.getId()==null) {
            entity.setCreatedTime(new Date());
             activityDao.addActivity(entity);
        }else {
             activityDao.updateActivity(entity);
        }
        return entity;
    }

}

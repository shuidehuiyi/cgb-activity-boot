package com.cy.cgbactivity01.activity.controller;

import com.cy.cgbactivity01.activity.pojo.Activity;
import com.cy.cgbactivity01.activity.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shuidehuiyi@gmail.com
 * @date 2020/6/3 16:28
 */
@Controller
@RequestMapping("/activity/")
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    /** 1 查询所有 活动信息 */
    @RequestMapping("findAll")
    public String findAll(Model model){

        List<Activity> list = activityService.findAll();
        model.addAttribute("list",list);
        return "activity";
    }
    /**开发人员写了一句话
     *
    */
    /** 2 删除活动信息 根据id*/
    @RequestMapping("deleteById")
    @ResponseBody
    public String deleteById(Integer id,Model model){
        activityService.deleteById(id);

        List<Activity> list = activityService.findAll();
        model.addAttribute("list",list);
        return "delete ok";
    }


    @RequestMapping("doSaveActivity")
    public String addActivity(Activity activity){
        activityService.saveActivity(activity);
        return "forward:findAll";
    }
    /** 4 根据id 查找活动信息*/
    @RequestMapping("findById")
    public String findById(Integer id, Model model){
        Activity activity = activityService.findById(id);
        model.addAttribute("aty",activity);
        return "forward:findAll";
    }

    /** test*/
    @RequestMapping("testhotbushu")
    public String testhot(){
        return "activity";
    }

}

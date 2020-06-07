package com.cy.cgbactivity01.activity.dao;

import com.cy.cgbactivity01.activity.pojo.Activity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author shuidehuiyi@gmail.com
 * @date 2020/6/3 16:28
 */
@Mapper
public interface ActivityDao {
//    @Select("select id,title,category,startTime,endTime,remark,state,createdTime,createdUser from tb_activity")
    @Select("select * from tb_activity order by createdTime desc")
    List<Activity> findAll();
    @Delete("delete from tb_activity where id=#{id}")
    void deleteById(Integer id);

    @Select("select id,title,category,startTime,endTime,remark,state,createdTime,createdUser from tb_activity where id=#{id}")
    Activity findById(Integer id);

    @Insert("insert into tb_activity value(null,#{title},#{category},#{startTime},#{endTime},#{remark},#{state},now(),#{createdUser})")
    int addActivity(Activity entity);

    int updateActivity(Activity activity);
}

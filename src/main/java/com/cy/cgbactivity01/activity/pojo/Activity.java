package com.cy.cgbactivity01.activity.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author shuidehuiyi@gmail.com
 * @date 2020/6/3 16:19
 */
@Data
@NoArgsConstructor
public class Activity {
    private Integer id;
    private String title;
    private String category;
//    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date startTime;
//    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date endTime;
    private String remark;
    private Integer state = 1;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date createdTime;
    private String createdUser;
}

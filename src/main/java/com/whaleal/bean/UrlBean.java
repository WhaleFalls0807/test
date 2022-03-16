package com.whaleal.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @user Lyz
 * @description
 * @date 2022/3/15 17:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UrlBean extends BaseMongoEntity{

    /**
     * 响应码
     */
    private int code;

    /**
     * 返回结果
     */
    private String result;
}

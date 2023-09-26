package com.wit.xzy.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author ZongYou
 **/
@Data
@AllArgsConstructor
public class HelloObject implements Serializable {
        //Serializable序列化接口没有任何方法或者字段，只是用于标识可序列化的语义。
        private Integer id;
        private String message;

}

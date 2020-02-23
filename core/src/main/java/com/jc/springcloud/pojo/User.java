package com.jc.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors //链式写法
@NoArgsConstructor
public class User implements Serializable {

    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 数据库来源
     */
    private String dbSource;

    public User(Long id, String name, String dbSource) {
        this.id = id;
        this.name = name;
        this.dbSource = dbSource;
    }
}

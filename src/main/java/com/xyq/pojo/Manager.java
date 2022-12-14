package com.xyq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/16 13:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {

    private int id;
    private String username;
    private String password;

    public Manager(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

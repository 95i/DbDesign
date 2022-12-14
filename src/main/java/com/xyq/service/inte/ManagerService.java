package com.xyq.service.inte;

import com.xyq.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/16 13:48
 */

public interface ManagerService {

    Manager getManagerByUsername(String username);

}

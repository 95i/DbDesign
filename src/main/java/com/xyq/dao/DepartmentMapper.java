package com.xyq.dao;

import com.xyq.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/17 9:48
 */
@Repository
@Mapper
public interface DepartmentMapper {

    List<Department> getDepartList();

    Department getDepartById(int id);

    void addDepart(String name);

    void delDepart(int id);

    void updateDepart(Department department);

}

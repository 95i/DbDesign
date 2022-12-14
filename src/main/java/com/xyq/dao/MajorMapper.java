package com.xyq.dao;

import com.xyq.pojo.Major;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/17 13:30
 */
@Repository
@Mapper
public interface MajorMapper {

    List<Major> getMajorList();

    Major getMajorById(@Param("id") Integer id);

    void addMajor(Major major);

    void delMajor(int id);

    void updMajor(Major major);

}

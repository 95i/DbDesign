package com.xyq.service.inte;

import com.xyq.pojo.Major;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/17 13:34
 */
public interface MajorService {

    List<Major> getMajorList();

    Major getMajorById(Integer id);

    void addMajor(Major major);

    void delMajor(int id);

    void updMajor(Major major);

}

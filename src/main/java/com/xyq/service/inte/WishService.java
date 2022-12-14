package com.xyq.service.inte;

import com.xyq.pojo.Wish;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/17 15:05
 */
public interface WishService {

    List<Wish> getWishList();

    Wish getWishById(int id);

}

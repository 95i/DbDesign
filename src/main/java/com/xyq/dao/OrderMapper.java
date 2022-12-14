package com.xyq.dao;

import com.xyq.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/16 23:16
 */
@Repository
@Mapper
public interface OrderMapper {

    List<Order> getOrders();

    Order getOrderById(int id);

    List<Order> selectAccuracyOrder(@Param("oid") Integer oid, @Param("username") String username, @Param("status") Integer status);

    List<Order> selectLikeOrder(@Param("oid") Integer oid, @Param("username") String username, @Param("status") Integer status);

    String selectState(@Param("id") Integer id);
}

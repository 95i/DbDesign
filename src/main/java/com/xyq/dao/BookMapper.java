package com.xyq.dao;

import com.xyq.pojo.Book;
import com.xyq.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/16 13:50
 */
@Repository
@Mapper
public interface BookMapper {

    List<Book> getBooks();

    Book getBookById(int id);

    List<Book> selectAccuracyBook(@Param("bookname") String bookName, @Param("state") Integer state);

    List<Book> likeSelectBook(@Param("bookname") String bookName, @Param("state") Integer state);


}

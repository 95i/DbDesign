package com.xyq.service.inte;


import com.xyq.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/16 13:48
 */

public interface BookService {

    List<Book> getBooks();

    Book getBookById(int id);

    List<Book> accuracyFindBook(String bookName, Integer state);

    List<Book> likeFindBook(String bookName, Integer state);


}

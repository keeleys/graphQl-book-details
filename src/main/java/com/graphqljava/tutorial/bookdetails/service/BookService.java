package com.graphqljava.tutorial.bookdetails.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.graphqljava.tutorial.bookdetails.mapper.Book;
import com.graphqljava.tutorial.bookdetails.mapper.BookMapper;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 凉水
 * @date 2019/12/11 3:53 下午
 **/
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> findByName(String name){
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.like("name",name.trim());
        return bookMapper.selectList(wrapper);
    }
}

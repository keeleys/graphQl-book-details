package com.graphqljava.tutorial.bookdetails.service;

import com.graphqljava.tutorial.bookdetails.mapper.Author;
import com.graphqljava.tutorial.bookdetails.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 凉水
 * @date 2019/12/11 4:01 下午
 **/
@Service
public class AuthorService {
    @Autowired
    private AuthorMapper authorMapper;

    public Author get(Integer id){
        return authorMapper.selectById(id);
    }
}

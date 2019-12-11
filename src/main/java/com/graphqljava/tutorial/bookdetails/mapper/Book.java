package com.graphqljava.tutorial.bookdetails.mapper;

import lombok.Data;

/**
 * @author 凉水
 * @date 2019/12/11 3:41 下午
 **/
@Data
public class Book {
    private Integer id;
    private String name;
    private Integer pageCount;
    private Integer authorId;
}

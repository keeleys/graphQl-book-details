package com.graphqljava.tutorial.bookdetails.graphql;

import com.graphqljava.tutorial.bookdetails.mapper.Book;
import com.graphqljava.tutorial.bookdetails.service.AuthorService;
import com.graphqljava.tutorial.bookdetails.service.BookService;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 凉水
 * @date 2019/12/6 5:45 下午
 **/
@Component
public class GraphQLDataFetchers {
    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;

    public DataFetcher getBookByNameDataFetcher() {
        return dataFetchingEnvironment -> {
            String bookName = dataFetchingEnvironment.getArgument("name");
            return bookService.findByName(bookName);
        };
    }

    public DataFetcher getAuthorDataFetcher() {
        return dataFetchingEnvironment -> {
            Book book = dataFetchingEnvironment.getSource();
            Integer authorId = book.getAuthorId();
            return authorService.get(authorId);
        };
    }
}

package com.busanit501.springex.mapper;

import com.busanit501.springex.domain.TodoVO;

import java.util.List;

public interface TodoMapper {
    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> listAll();

    TodoVO getOne(Long tno);
}

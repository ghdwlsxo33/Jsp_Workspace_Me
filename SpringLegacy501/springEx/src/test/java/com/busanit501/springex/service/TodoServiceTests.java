package com.busanit501.springex.service;

import com.busanit501.springex.domain.TodoVO;
import com.busanit501.springex.dto.TodoDTO;
import com.busanit501.springex.mapper.TodoMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoServiceTests {
    @Autowired(required=false)
    private TodoService todoService;

    @Test
    public void testInsert() {
        TodoDTO todoDTO = TodoDTO.builder()
                .title("돈까스333")
                .dueDate(LocalDate.now())
                .finished(false)
                .writer("홍진태333")
                .build();
        todoService.insert(todoDTO);
    }
}

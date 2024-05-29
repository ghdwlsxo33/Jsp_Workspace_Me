package com.busanit501.springex.mapper;

import com.busanit501.springex.domain.TodoVO;
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
public class TodoMapperTests {
    @Autowired(required=false)
    private TodoMapper todoMapper;

    @Test
    public void testGetTime() {
        log.trace("시간 테스트 : " + todoMapper.getTime());
    }

    @Test
    public void testInsert() {
        TodoVO todoVO = TodoVO.builder()
                .title("돈까스123")
                .dueDate(LocalDate.now())
                .finished(false)
                .writer("홍진태123")
                .build();
        todoMapper.insert(todoVO);
    }

}

package com.busanit501.springex.controller;

import com.busanit501.springex.dto.TodoDTO;
import com.busanit501.springex.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/todo")
@Log4j2
@RequiredArgsConstructor
public class TodoController {

    final TodoService todoService;

    @GetMapping("/list")
    public void listTest(Model model) {
        log.info("todo list 조회 화면 테스트 콘솔");
        List<TodoDTO> dtoList = todoService.listAll();
        model.addAttribute("dtoList", dtoList);
    }

    @GetMapping("/read")
    public  void listTest(Long tno, Model model) {
        log.info("todo list 조회 화면 테스트 콘솔");
        // C -> S -> Mapper -> DB
        // C <- S <- Mapper <- DB
        TodoDTO todoDTO = todoService.getOne(tno);
        // 서버 -> 화면, 모델
        model.addAttribute("todoDTO", todoDTO);

    }

    @GetMapping("/register")
    public void registerGetTest() {
        log.info("todo register 등록 화면 Get  테스트 콘솔");
    }

    @PostMapping("/register")
    public String registerPostTest(@Valid TodoDTO todoDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        log.info("post 작업중");
        if (bindingResult.hasErrors()) {
            log.info("bindingResult.hasErrors() 실행됨");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            return "redirect:/todo/register";
        }
        todoService.insert(todoDTO);
        return "redirect:/todo/list";
    }

    @GetMapping("/ex1")
    public void ex1Test(String name, int age) {
        log.info("name : " + name + " age : " + age);
    }

    @GetMapping("/ex2")
    public void ex1Test2(@RequestParam(name = "name", defaultValue = "default lsy") String name, int age) {
        log.info("default name : " + name + " age : " + age);
    }

    @GetMapping("/ex3")
    public void ex1Test3(LocalDate dueDate) {
        log.info("ex3 test");
        log.info("LocalDate 타입 1차 테스트 : " + dueDate);
    }

    @PostMapping("/ex4")
    public void ex1Test4(TodoDTO todoDTO) {
        log.info("ex4 test");
        log.info("TodoDTO 타입 1차 테스트 : " + todoDTO);
    }

    @GetMapping("/ex5")
    public void ex1Test5(Model model) {
        log.info("ex5 test");
        TodoDTO todoDTO = TodoDTO.builder()
                .tno(100L)
                .title("메뉴1")
                .writer("홍진태")
                .dueDate(LocalDate.now())
                .finished(true)
                .build();
        // 서버에서 화면으로 데이터 전달 코드
        model.addAttribute("menu", "컵라면");
        model.addAttribute("todoDTO", todoDTO);
    }

    @PostMapping("/ex6")
    public void ex1Test6(@ModelAttribute("dto") TodoDTO todoDTO, Model model) {
        log.info("ex6 test");
//        TodoDTO todoDTO = TodoDTO.builder()
//                .tno(100L)
//                .title("메뉴1")
//                .writer("홍진태")
//                .dueDate(LocalDate.now())
//                .finished(true)
//                .build();
        model.addAttribute("menu", "컵라면");
        model.addAttribute("todoDTO", todoDTO);
    }

    @GetMapping("/ex7")
    public String ex1Test7(RedirectAttributes redirectAttributes) {
        log.info("ex7 test");
        redirectAttributes.addAttribute("menu", "내일 점심은 칼국수");
        redirectAttributes.addAttribute("menu2", "tomorrow lunch menu lamen");
        //일회용
        redirectAttributes.addFlashAttribute("result", "라면");
        return "redirect:/todo/ex8";
    }

    @GetMapping("/ex8")
    public void ex1Test8() {
        log.info("ex8 test");
    }

    @GetMapping("/ex9")
    public void ex1Test9(String name, int age) {
        log.info("ex9 test");
        log.info("name : " + name + " age : " + age);
    }
}

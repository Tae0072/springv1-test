package com.example.springv1_test.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    public String index() {
        return "index";
    }

    @GetMapping("/board/save-form")
    public String saveFrom() {
        return "board/save-form";
    }

    @GetMapping("/boards/1")
    public String detail() {
        return "board/detail";
    }

    @GetMapping("/boards/1/update-form")
    public String updateForm() {
        return "board/update-form";
    }
}

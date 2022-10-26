package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
@Autowired
    private BoardService boardService;
    @GetMapping("/background")
    public String background() {
        return "background";
    }
    @GetMapping("/board/write")  //로컬호스트 8080에 boardwrite로 보여지기
    public String boardrwriteForm() {

        return "boardwrite";
    }
    @PostMapping("/board/writepro") //폼 액션이랑 같아야함.
    public String boardWritePro(Board board){

        boardService.write(board);

        return  "";
    }
}

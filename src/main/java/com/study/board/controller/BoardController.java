package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
    @GetMapping("/board/list")
    public String boardList(Model model){

        model.addAttribute("list",boardService.boardList());

        return "boardlist";
    }
    @GetMapping("/board/view") //localhost:8080/board/view?id=1
    public String boardView(Model model,Integer id){

        model.addAttribute("board",boardService.boardView(id));
        return "boardview";
    }
}

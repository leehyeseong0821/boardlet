package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //테이블의 의미. JPA가 읽어들인다.
@Data
//SQL 형식에 맞게 적어준다.
public class Board {
    @Id //프라이머리키 key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //SQL
    private Integer id;

    private String name;

    private String title;

    private String content;

}

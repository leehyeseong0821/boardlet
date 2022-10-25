package com.study.board.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 //JPA가 읽어들인다.
@Entity  //테이블을 의미한다.
@Data  //게타 세타를 불러들임
public class Board {
    //SQL에서 적용한 형식에 맞춰서 작성.

    @Id      //프라이머리키
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //전략설정 IDENTITY MY SQL,마리아 DB 사용 SEQUENCE는 오라클 AUTO 알아서지정
    private Integer id;  //게시글번호

    private String title; //제목

    private String content;//내용
}

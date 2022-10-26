package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//상속을 받는다.
public interface BoardRepository extends JpaRepository<Board,Integer> {
}

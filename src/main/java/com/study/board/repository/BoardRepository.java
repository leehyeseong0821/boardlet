package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Jpa레포시토리 상속받는다 extends
@Repository                                                  //엔티티 ID로 지정해준 TYPE을 넣어준다 인티저
public interface BoardRepository extends JpaRepository<Board,Integer> {
}

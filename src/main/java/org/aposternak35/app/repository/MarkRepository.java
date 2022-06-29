package org.aposternak35.app.repository;

import org.aposternak35.app.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {

    List<Mark> findByMark(String mark);
}

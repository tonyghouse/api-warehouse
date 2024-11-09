package com.ghouse.apiwarehouse.project5010.repo;

import com.ghouse.apiwarehouse.project5010.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProblemRepo extends JpaRepository<Problem,String> {

    List<Problem> findAllByOrderBySortOrder();

}

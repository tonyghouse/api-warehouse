package com.ghouse.apiwarehouse.repo;

import com.ghouse.apiwarehouse.entity.CodeSolution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CodeSolutionRepo extends JpaRepository<CodeSolution, Integer> {

    List<CodeSolution> findByProblemId(String problemId);

}

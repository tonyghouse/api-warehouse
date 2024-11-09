package com.ghouse.apiwarehouse.project5010.repo;

import com.ghouse.apiwarehouse.project5010.entity.CodeSolution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CodeSolutionRepo extends JpaRepository<CodeSolution, Integer> {

    List<CodeSolution> findByProblemId(String problemId);

}

package com.ghouse.apiwarehouse.repo;

import com.ghouse.apiwarehouse.entity.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SolutionRepo extends JpaRepository<Solution, Integer> {
    List<Solution> findByProblemId(String problemId);

//    Solution findTopByProblemId(Integer problemId);

}

package com.ghouse.apiwarehouse.project5010.repo;

import com.ghouse.apiwarehouse.project5010.entity.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestCaseRepo extends JpaRepository<TestCase, Integer> {

    List<TestCase> findByProblemId(String problemId);

}

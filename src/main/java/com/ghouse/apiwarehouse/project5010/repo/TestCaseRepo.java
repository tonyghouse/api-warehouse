package com.ghouse.apiwarehouse.repo;

import com.ghouse.apiwarehouse.entity.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestCaseRepo extends JpaRepository<TestCase, Integer> {

    List<TestCase> findByProblemId(String problemId);

}

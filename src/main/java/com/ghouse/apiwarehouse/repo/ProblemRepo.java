package com.ghouse.apiwarehouse.repo;

import com.ghouse.apiwarehouse.entity.Problem;
import com.ghouse.apiwarehouse.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProblemRepo extends JpaRepository<Problem,String> {

}

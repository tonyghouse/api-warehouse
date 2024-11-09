package com.ghouse.apiwarehouse.project5010.repo;

import com.ghouse.apiwarehouse.project5010.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SectionRepo extends JpaRepository<Section,Integer> {

    List<Section> findAllByOrderBySortOrder();

}

package com.ghouse.apiwarehouse.repo;

import com.ghouse.apiwarehouse.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SectionRepo extends JpaRepository<Section,Integer> {

    List<Section> findAllByOrderBySortOrder();

}

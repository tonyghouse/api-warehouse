package com.ghouse.apiwarehouse.repo;

import com.ghouse.apiwarehouse.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPlatformRepo extends JpaRepository<Section,String> {

	List<Section> findByUserId(String userId);
}

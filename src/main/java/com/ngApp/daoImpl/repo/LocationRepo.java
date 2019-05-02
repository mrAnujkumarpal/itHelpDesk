package com.ngApp.daoImpl.repo;

import com.ngApp.model.common.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location,Integer> {

}

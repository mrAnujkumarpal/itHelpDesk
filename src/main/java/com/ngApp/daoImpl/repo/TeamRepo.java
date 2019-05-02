package com.ngApp.daoImpl.repo;

import com.ngApp.model.common.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team, Integer> {

    Team findById(int id);
}

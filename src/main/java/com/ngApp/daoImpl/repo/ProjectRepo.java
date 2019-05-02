package com.ngApp.daoImpl.repo;

import com.ngApp.model.common.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

   Project findById(int id);
}

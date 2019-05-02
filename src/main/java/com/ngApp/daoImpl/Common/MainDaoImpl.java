package com.ngApp.daoImpl.Common;


import com.ngApp.daoImpl.repo.LocationRepo;
import com.ngApp.daoImpl.repo.ProjectRepo;
import com.ngApp.daoImpl.repo.TeamRepo;
import com.ngApp.daoImpl.repo.TicketStatusRepo;
import com.ngApp.model.Ticket.TicketStatus;
import com.ngApp.model.common.Location;
import com.ngApp.model.common.Project;
import com.ngApp.model.common.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MainDaoImpl {

    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private TeamRepo teamRepo;

    @Autowired
    private LocationRepo locationRepo;

    @Autowired
    private TicketStatusRepo ticketStatusRepo;


    public List<Project> getAlEmployees() {
        System.out.println("inside MainDaoImpl");
        return projectRepo.findAll();
    }

    @Transactional
    public void saveNewProject(Project project) {

        Project justSaved = projectRepo.save(project);
        justSaved.setPro_code(String.format("%04d", justSaved.getId()));
        projectRepo.save(justSaved);
    }

    public Project getProjectByProjectId(int id) {
        return projectRepo.findById(id);
    }

    @Transactional
    public void saveNewTeam(Team team) {
        teamRepo.save(team);
    }


    public Team getTeamById(int id) {
        return teamRepo.findById(id);
    }

    public  List<Location> fetchAllLocation(){
        return locationRepo.findAll();
    }

    public List<TicketStatus> fetchAllTktStatus(){
        System.out.println("Fetch All Tickect Status repo....");
        return ticketStatusRepo.findAll();
    }

    public   TicketStatus getTktStatusById(int id){
        return ticketStatusRepo.findById(id);
    }
}

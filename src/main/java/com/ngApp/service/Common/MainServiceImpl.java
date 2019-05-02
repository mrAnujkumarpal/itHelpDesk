package com.ngApp.service.Common;

import com.ngApp.daoImpl.Common.MainDaoImpl;
import com.ngApp.model.Ticket.TicketStatus;
import com.ngApp.model.common.Location;
import com.ngApp.model.common.Project;
import com.ngApp.model.common.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MainServiceImpl implements MainService {

    @Autowired
    private MainDaoImpl mainDao;


    @Override
    public List<Project> getAllProject() {

        System.out.println("Inside MainServiceImpl");
        return mainDao.getAlEmployees();
    }

    @Override
    public Project addNewProjrct(Project project) {

        mainDao.saveNewProject(project);
        return project;
    }

    @Override
    public Project getProjectById(int id) {

        return mainDao.getProjectByProjectId(id);
    }

    @Override
    public Team addNewTeam(Team team) {
        mainDao.saveNewTeam(team);
        return team;
    }


    public Team getTeamById(int id) {

        return mainDao.getTeamById(id);
    }

    public List<Location> getAllLocations() {
        return mainDao.fetchAllLocation();
    }

    public List<TicketStatus> getAllTktStatus(){
        System.out.println("getAllTktStatus");
        return  mainDao.fetchAllTktStatus();
    }

    public   TicketStatus getTktStatusById(int id){
        return mainDao.getTktStatusById(id);
    }

}
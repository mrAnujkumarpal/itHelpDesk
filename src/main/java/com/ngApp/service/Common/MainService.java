package com.ngApp.service.Common;

import com.ngApp.model.Ticket.TicketStatus;
import com.ngApp.model.common.Location;
import com.ngApp.model.common.Project;
import com.ngApp.model.common.Team;

import java.util.List;


public interface MainService {

    List<Project> getAllProject();

    Project addNewProjrct(Project project);

    Project getProjectById(int id);

    Team addNewTeam(Team team);

    Team getTeamById(int id);

    List<Location> getAllLocations();

    List<TicketStatus> getAllTktStatus();

    TicketStatus getTktStatusById(int id);
}

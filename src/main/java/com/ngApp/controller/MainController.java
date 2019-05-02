package com.ngApp.controller;

import com.ngApp.model.Ticket.TicketStatus;
import com.ngApp.model.common.Location;
import com.ngApp.model.common.Project;
import com.ngApp.model.common.Team;
import com.ngApp.service.Common.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    Date currentDate = new Date();
    @Autowired
    private MainService mainService;

    @GetMapping("/getAllProjects")
    public List<Project> getAllProjects() {
        return mainService.getAllProject();
    }

    @GetMapping("/getAllLocations")
    public List<Location> getAllLocations() {
        return mainService.getAllLocations();
    }
  /*  @GetMapping("/getAllTktStatus")
    public List<TicketStatus> getAllTktStatus() {
        System.out.println("getAllTktStatus");
        return mainService.getAllTktStatus();
    }
*/
     @RequestMapping(value = "/getProject", method = RequestMethod.GET)
    public ModelAndView  getProjectPage() {
        ModelAndView mv = new ModelAndView("common/projects");
        return mv;
    }
    
    @RequestMapping(value = "/getAllTktStatus", method = RequestMethod.GET)
    public ResponseEntity<List<TicketStatus>> getAllTktStatus() {
        List<TicketStatus> tktStatus = mainService.getAllTktStatus();
        if(tktStatus.isEmpty()){
            return new ResponseEntity<List<TicketStatus>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<TicketStatus>>(tktStatus, HttpStatus.OK);
    }

    @GetMapping("/getProject/{id}")
    public Project projectById(@PathVariable("id") int id) {
        return mainService.getProjectById(id);
    }

    @PostMapping(value = "/createProject")
    public Project postProject(@RequestBody Project project) {
        project.setPro_createdDate(currentDate);
        Project _project = mainService.addNewProjrct(project);
        return _project;

    }

    @PostMapping(value = "/createTeam")
    public Team postTeam(@RequestBody Team team) {
        team.setTeam_createdDate(currentDate);
        Team _team = mainService.addNewTeam(team);
        return _team;
    }

    @GetMapping("/getTeam/{id}")
    public Team teamById(@PathVariable("id") int id) {
        return mainService.getTeamById(id);
    }

    @GetMapping("/getTktStatusById/{id}")
    public TicketStatus getTktStatusById(@PathVariable("id") int id) {
        return mainService.getTktStatusById(id);
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String defaultPage() {
        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error) {
        ModelAndView mv = new ModelAndView("common/login");
        return mv;
    }


}

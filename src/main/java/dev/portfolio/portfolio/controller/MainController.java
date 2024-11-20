package dev.portfolio.portfolio.controller;


import dev.portfolio.portfolio.service.EducationService;
import dev.portfolio.portfolio.service.PaperService;
import dev.portfolio.portfolio.service.PrizeService;
import dev.portfolio.portfolio.service.ProjectService;
import dev.portfolio.portfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/")
public class MainController {

    private static final String PROJECT = "projects";
    private static final String USER = "user";
    private static final String PRIZE = "prizes";
    private static final String EDUCATION = "educations";
    private static final String PAPER = "papers";
    private final ProjectService projectService;
    private final UserService userService;
    private final PrizeService prizeService;
    private final EducationService educationService;
    private final PaperService paperService;

    public MainController(
            @Autowired ProjectService projectService,
            @Autowired UserService userService,
            @Autowired PrizeService prizeService,
            @Autowired EducationService educationService,
            @Autowired PaperService paperService
    ) {
        this.projectService = projectService;
        this.userService = userService;
        this.prizeService = prizeService;
        this.educationService = educationService;
        this.paperService = paperService;
    }


    @GetMapping
    public String getMainPage(Model model) {
        model.addAttribute(PROJECT, projectService.readAllProject());
        model.addAttribute(USER, userService.readUser());
        model.addAttribute(PRIZE, prizeService.readAllPrize());
        model.addAttribute(EDUCATION, educationService.readAllEducation());
        model.addAttribute(PAPER, paperService.readAllPaper());
        return "index";
    }

}

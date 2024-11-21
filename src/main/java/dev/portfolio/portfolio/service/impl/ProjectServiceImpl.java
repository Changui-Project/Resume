package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dao.ProjectDAO;
import dev.portfolio.portfolio.dto.ProjectDTO;
import dev.portfolio.portfolio.service.ProjectService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectDAO projectDAO;

    public ProjectServiceImpl(
            @Autowired ProjectDAO projectDAO
    ) {
        this.projectDAO = projectDAO;
    }

    @Override
    public List<ProjectDTO> readAllProject() throws IOException {
        return projectDAO.readAllProject();
    }
}

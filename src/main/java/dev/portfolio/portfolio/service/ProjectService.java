package dev.portfolio.portfolio.service;

import dev.portfolio.portfolio.dto.ProjectDTO;
import java.util.List;

public interface ProjectService {
    List<ProjectDTO> readAllProject();
}

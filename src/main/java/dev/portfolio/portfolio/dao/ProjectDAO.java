package dev.portfolio.portfolio.dao;

import dev.portfolio.portfolio.dto.ProjectDTO;
import java.io.IOException;
import java.util.List;

public interface ProjectDAO {
    List<ProjectDTO> readAllProject() throws IOException;
}

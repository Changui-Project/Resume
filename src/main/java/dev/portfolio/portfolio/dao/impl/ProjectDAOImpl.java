package dev.portfolio.portfolio.dao.impl;

import dev.portfolio.portfolio.dao.ProjectDAO;
import dev.portfolio.portfolio.dto.ProjectDTO;
import dev.portfolio.portfolio.parser.JsonParser;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAOImpl implements ProjectDAO {
    private static final Class<ProjectDTO> CLASS = ProjectDTO.class;
    private static final String PATH = "project.json";
    private final JsonParser jsonParser;

    public ProjectDAOImpl(
            @Autowired JsonParser jsonParser
    ) {
        this.jsonParser = jsonParser;
    }

    @Override
    public List<ProjectDTO> readAllProject() throws IOException {
        return jsonParser.parseJsonToDTOList(CLASS, PATH);
    }
}

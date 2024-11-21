package dev.portfolio.portfolio.dao.impl;

import dev.portfolio.portfolio.dao.EducationDAO;
import dev.portfolio.portfolio.dto.EducationDTO;
import dev.portfolio.portfolio.parser.JsonParser;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EducationDAOImpl implements EducationDAO {
    private static final Class<EducationDTO> CLASS = EducationDTO.class;
    private static final String PATH = "education.json";
    private final JsonParser jsonParser;

    public EducationDAOImpl(
            @Autowired JsonParser jsonParser
    ) {
        this.jsonParser = jsonParser;
    }

    @Override
    public List<EducationDTO> readALlEducation() throws IOException {
        return jsonParser.parseJsonToDTOList(CLASS, PATH);
    }
}

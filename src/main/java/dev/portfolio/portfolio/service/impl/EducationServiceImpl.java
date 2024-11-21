package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dao.EducationDAO;
import dev.portfolio.portfolio.dto.EducationDTO;
import dev.portfolio.portfolio.service.EducationService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {
    private final EducationDAO educationDAO;

    public EducationServiceImpl(
            @Autowired final EducationDAO educationDAO
    ) {
        this.educationDAO = educationDAO;
    }

    @Override
    public List<EducationDTO> readAllEducation() throws IOException {
        return educationDAO.readALlEducation();
    }
}

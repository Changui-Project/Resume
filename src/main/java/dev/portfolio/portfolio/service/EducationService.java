package dev.portfolio.portfolio.service;

import dev.portfolio.portfolio.dto.EducationDTO;
import java.io.IOException;
import java.util.List;

public interface EducationService {
    List<EducationDTO> readAllEducation() throws IOException;
}

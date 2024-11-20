package dev.portfolio.portfolio.service;

import dev.portfolio.portfolio.dto.EducationDTO;
import java.util.List;

public interface EducationService {
    List<EducationDTO> readAllEducation();
}

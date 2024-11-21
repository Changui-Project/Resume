package dev.portfolio.portfolio.dao;

import dev.portfolio.portfolio.dto.EducationDTO;
import java.io.IOException;
import java.util.List;

public interface EducationDAO {
    List<EducationDTO> readALlEducation() throws IOException;
}

package dev.portfolio.portfolio.service;

import dev.portfolio.portfolio.dto.PaperDTO;
import java.util.List;

public interface PaperService {
    List<PaperDTO> readAllPaper();
}

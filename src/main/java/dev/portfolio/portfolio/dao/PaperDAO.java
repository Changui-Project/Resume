package dev.portfolio.portfolio.dao;

import dev.portfolio.portfolio.dto.PaperDTO;
import java.io.IOException;
import java.util.List;

public interface PaperDAO {
    List<PaperDTO> readALlPaper() throws IOException;
}

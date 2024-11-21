package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dao.PaperDAO;
import dev.portfolio.portfolio.dto.PaperDTO;
import dev.portfolio.portfolio.service.PaperService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaperServiceImpl implements PaperService {

    private final PaperDAO paperDAO;

    public PaperServiceImpl(
            @Autowired PaperDAO paperDAO
    ) {
        this.paperDAO = paperDAO;
    }

    @Override
    public List<PaperDTO> readAllPaper() throws IOException {
        return paperDAO.readALlPaper();
    }
}

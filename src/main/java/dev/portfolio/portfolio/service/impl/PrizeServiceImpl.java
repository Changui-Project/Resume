package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dao.PrizeDAO;
import dev.portfolio.portfolio.dto.PrizeDTO;
import dev.portfolio.portfolio.service.PrizeService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrizeServiceImpl implements PrizeService {

    private final PrizeDAO prizeDAO;

    public PrizeServiceImpl(
            @Autowired PrizeDAO prizeDAO
    ) {
        this.prizeDAO = prizeDAO;
    }

    @Override
    public List<PrizeDTO> readAllPrize() throws IOException {
        return prizeDAO.readAllPrize();
    }
}

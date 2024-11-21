package dev.portfolio.portfolio.dao;

import dev.portfolio.portfolio.dto.PrizeDTO;
import java.io.IOException;
import java.util.List;

public interface PrizeDAO {
    List<PrizeDTO> readAllPrize() throws IOException;
}

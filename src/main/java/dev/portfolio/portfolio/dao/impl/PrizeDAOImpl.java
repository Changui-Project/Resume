package dev.portfolio.portfolio.dao.impl;

import dev.portfolio.portfolio.dao.PrizeDAO;
import dev.portfolio.portfolio.dto.PrizeDTO;
import dev.portfolio.portfolio.parser.JsonParser;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PrizeDAOImpl implements PrizeDAO {
    private static final Class<PrizeDTO> CLASS = PrizeDTO.class;

    private static final String PATH = "prize.json";
    private final JsonParser jsonParser;

    public PrizeDAOImpl(
            @Autowired JsonParser jsonParser
    ) {
        this.jsonParser = jsonParser;
    }

    @Override
    public List<PrizeDTO> readAllPrize() throws IOException {
        return jsonParser.parseJsonToDTOList(CLASS, PATH);
    }
}

package dev.portfolio.portfolio.dao.impl;

import dev.portfolio.portfolio.dao.PaperDAO;
import dev.portfolio.portfolio.dto.PaperDTO;
import dev.portfolio.portfolio.parser.JsonParser;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaperDAOImpl implements PaperDAO {
    private static final Class<PaperDTO> CLASS = PaperDTO.class;
    private static final String PATH = "paper.json";
    private final JsonParser jsonParser;

    public PaperDAOImpl(
            @Autowired JsonParser jsonParser
    ) {
        this.jsonParser = jsonParser;
    }
    @Override
    public List<PaperDTO> readALlPaper() throws IOException {
        return jsonParser.parseJsonToDTOList(CLASS, PATH);
    }
}

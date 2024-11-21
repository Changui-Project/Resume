package dev.portfolio.portfolio.dao.impl;

import dev.portfolio.portfolio.dao.UserDAO;
import dev.portfolio.portfolio.dto.UserDTO;
import dev.portfolio.portfolio.parser.JsonParser;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
    private static final Class<UserDTO> CLAZZ = UserDTO.class;
    private static final String PATH = "user.json";
    private final JsonParser jsonParser;

    public UserDAOImpl(
            @Autowired JsonParser jsonParser
    ) {
        this.jsonParser = jsonParser;
    }

    public UserDTO readUser() throws IOException {
        return jsonParser.parseJsonToDTO(CLAZZ, PATH);
    }
}

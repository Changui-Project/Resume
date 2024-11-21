package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dao.UserDAO;
import dev.portfolio.portfolio.dto.UserDTO;
import dev.portfolio.portfolio.parser.JsonParser;
import dev.portfolio.portfolio.service.UserService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    public UserServiceImpl(
            @Autowired final UserDAO userDAO
    ){
        this.userDAO = userDAO;
    }
    @Override
    public UserDTO readUser() throws IOException {
        return userDAO.readUser();
    }
}

package dev.portfolio.portfolio.dao;

import dev.portfolio.portfolio.dto.UserDTO;
import java.io.IOException;

public interface UserDAO {
    UserDTO readUser() throws IOException;
}

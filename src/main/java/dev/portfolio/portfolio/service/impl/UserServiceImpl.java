package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dto.UserDTO;
import dev.portfolio.portfolio.service.UserService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO readUser() {
        return UserDTO.of(
                "이창의", "https://github.com/changuii", "https://github.com/changuii", "rhljh7410@gmail.com",
                List.of("백엔드 개발자가 되기 위해 노력하고 있습니다.",
                        "모든 것에는 이유가 있듯이 사소한 것에도 <span class=\"inline-code\">이유를 찾기 위해 노력</span>합니다.",
                        "계명대학교에 재학중입니다."
                )
        );
    }
}

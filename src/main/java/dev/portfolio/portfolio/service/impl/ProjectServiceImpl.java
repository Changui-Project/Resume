package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dto.ProjectDTO;
import dev.portfolio.portfolio.service.ProjectService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectDTO> readAllProject() {
        return List.of(
                ProjectDTO.of("Digital Marketing Platform", "소상공인들이 쉽게 온라인으로 홍보 및 판매를 지원하기 위한 플랫폼입니다.",
                        LocalDate.parse("2023-08-04"), LocalDate.parse("2023-08-25"),
                        List.of("Spring Boot", "Hibernate", "MariaDB"), List.of("내가 했다."),
                        "https://github.com/changuii/DigitalMarketing-Server"
                ),
                ProjectDTO.of("ON & OFF", "온라인과 오프라인을 통합하여 오프라인 매장의 장바구니를 온라인에서 가지고 다니거나, 매장의 위치를 볼 수 있는 플랫폼입니다.",
                        LocalDate.parse("2023-09-01"), LocalDate.parse("2023-12-20"),
                        List.of("Spring Boot", "Spring Gateway", "Spring Eureka", "Hibername", "MariaDB", "AWS EC2",
                                "Docker"), List.of("a"), "https://github.com/TEAM-WARA/ON-OFF"
                ),
                ProjectDTO.of("OFFLOAD", "남는 공간을 쉽게 공유할 수 있도록 공간이 필요한 사람과 공간을 공유하려는 사람을 매칭시켜주는 플랫폼",
                            LocalDate.parse("2023-11-25"), LocalDate.parse("2023-11-29"),
                        List.of("Spring Boot", "Hibernate", "MariaDB"), List.of("a"),
                        "https://github.com/TEAM-WARA/OFFLOAD"
                ),
                ProjectDTO.of("PoopchelinGuide", "주변의 화장실을 길찾기 및 화장실의 리뷰를 통해 별점을 매길 수 있는 앱 서비스",
                        LocalDate.parse("2024-04-20"), LocalDate.parse("2024-04-30"),
                        List.of("Spring Boot","Docker", "AWS EC2", "Hibernate", "MariaDB"),
                        List.of("a"), "https://github.com/PoopchelinGuide"
                ),
                ProjectDTO.of("리뷰 할래?", "사용자의 리뷰를 더 퀄리티있게 작성을 도와주는 웹 서비스",
                        LocalDate.parse("2024-08-12"), LocalDate.parse("2024-08-14"),
                        List.of("Spring Boot", "AWS S3", "AWS EC2", "Docker", "QueryDSL"),
                        List.of("a"), "https://github.com/merge-halle"
                )
        );
    }
}

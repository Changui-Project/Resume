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
                ProjectDTO.of("Digital Marketing Platform", "소상공인들이 쉽게 온라인으로 홍보 및 판매를 지원하기 위한 웹 서비스",
                        LocalDate.parse("2023-08-04"), LocalDate.parse("2023-08-25"),
                        List.of("Spring Boot", "Hibernate", "MariaDB"),
                        List.of("kafka를 학습하고 이를 도입하기 위해 MSA 구조로 서비스를 설계하고 구현",
                                "하지만, 통신이 HTTP 처럼 즉각적인 Response가 있어야 한다고 생각이 매몰되어 Kafka로 각 서버들에게 메시지를 전달한 후, Redis를 이용해 바로 응답을 받는 기형적인 설계가 만들어지게 되었다.",
                                "이 경험 이후, 비동기 통신은 Response를 전달하는 것이 아닌, Polling과 같은 방식을 통해 작업의 결과값을 받도록 해야한다는 것을 알게되었다.",
                                "해당 과정의 회고 : https://g-db.tistory.com/entry/MSA-마이크로서비스-아키텍처의-비동기-처리"),
                        "https://github.com/changuii/DigitalMarketing-Server"
                ),
                ProjectDTO.of("Hello Halal", "할랄 음식점을 쉽게 찾고 접근할 수 있도록 해주는 지도 기반 웹 앱 서비스",
                        LocalDate.parse("2023-08-04"), LocalDate.parse("2023-08-25"),
                        List.of("Spring Boot", "Hibernate", "MariaDB"),
                        List.of("Notion을 활용하여 프론트엔드와 원활하게 소통", "지도기반 좌표 검색 기능 구현", "우수상 수상"),
                        "https://github.com/changuii/DigitalMarketing-Server"
                ),
                ProjectDTO.of("ON & OFF", "온라인과 오프라인을 통합하여 오프라인 매장의 장바구니를 온라인에서 가지고 다니거나, 매장의 위치를 볼 수 있는 웹 앱 서비스",
                        LocalDate.parse("2023-09-01"), LocalDate.parse("2023-12-20"),
                        List.of("Spring Boot", "Spring Gateway", "Spring Eureka", "Spring Security", "Hibername",
                                "MariaDB", "AWS EC2",
                                "Docker"), List.of("지난번의 MSA 구조 설계의 실패를 극복하기 위해 Spring에서 제공하는 여러 클라우드 관련 프로젝트를 학습하고 도입",
                                "Spring Eureka를 도입하여, 각 기능 서버들의 위치를 알 필요 없이 동적으로 Gateway 혹은 기능 서버들이 알 수 있도록 설계",
                                "Spring Gateway를 사용하여 각 기능서버들로 리버스 프록시 구현",
                                "Spring Gateway를 사용하여 각 기능서버들 대신 Gateway에서 모든 JWT 검증을 하도록 만들었고 각 기능서버들은 Gateway가 배포된 EC2의 ip주소만을 허용하여 안전하게 구현",
                                "환경변수를 사용하여 Spring Boot의 application.yaml 설정값이 노출되지 않도록 구현",
                                "카카오 api를 활용하여 oauth 로그인을 구현", "AWS EC2에 모든 서버들을 Docker 컨테이너로 배포"),
                        "https://github.com/TEAM-WARA/ON-OFF"
                ),
                ProjectDTO.of("OFFLOAD", "남는 공간을 쉽게 공유할 수 있도록 공간이 필요한 사람과 공간을 공유하려는 사람을 매칭시켜주는 웹 서비스",
                        LocalDate.parse("2023-11-25"), LocalDate.parse("2023-11-29"),
                        List.of("Spring Boot", "Hibernate", "MariaDB"),
                        List.of("Swagger를 활용하여 API 를 이해하기 쉽게 구현", "우수상을 수상"),
                        "https://github.com/TEAM-WARA/OFFLOAD"
                ),
                ProjectDTO.of("PoopchelinGuide", "주변의 화장실을 길찾기 및 화장실의 리뷰를 통해 별점을 매길 수 있는 웹 앱 서비스",
                        LocalDate.parse("2024-04-20"), LocalDate.parse("2024-04-30"),
                        List.of("Spring Boot", "Docker", "AWS EC2", "Hibernate", "MariaDB"),
                        List.of("백엔드 CRUD를 구현", "React Antd 라이브러리를 활용하여 리뷰들을 페이지와 화장실 팝업창, Floatting button을 구현",
                                "ERD 설계"), "https://github.com/PoopchelinGuide"
                ),
                ProjectDTO.of("리뷰 할래?", "리뷰를 자세하게 적기 힘든 사람들과 리뷰의 품질을 높이고 싶어하는 기업들을 위해 키워드를 통해 리뷰를 작성해주는 웹 서비스",
                        LocalDate.parse("2024-08-12"), LocalDate.parse("2024-08-14"),
                        List.of("Spring Boot", "AWS S3", "AWS EC2", "Docker", "QueryDSL"),
                        List.of("git action을 활용하여 자동으로 AWS EC2에 도커 컨테이너로 배포되도록 구현", "AWS S3를 활용하여 정적 파일들을 관리",
                                "Chat GPT API를 활용하여 주어진 설명을 자세한 리뷰로 변경", "QueryDSL을 활용하여 동적 쿼리 구현", "금상 수상"),
                        "https://github.com/merge-halle"
                )
        );
    }
}

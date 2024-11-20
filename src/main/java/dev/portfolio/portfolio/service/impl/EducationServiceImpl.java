package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dto.EducationDTO;
import dev.portfolio.portfolio.service.EducationService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {
    @Override
    public List<EducationDTO> readAllEducation() {
        return List.of(
                EducationDTO.of("차세대 정보보안 연구실", LocalDate.parse("2023-01-01"),
                        LocalDate.now(), "학부 연구생으로 활동하였다.", "계명대학교 컴퓨터공학과", "", true
                ),
                EducationDTO.of("계명대학교 컴퓨터공학과", LocalDate.parse("2019-03-01"), LocalDate.now(),
                        "학부생", "계명대학교", "", true
                ),
                EducationDTO.of("멋쟁이사자처럼 11기", LocalDate.parse("2023-03-01"),
                        LocalDate.parse("2023-12-31"), "멋쟁이사자처럼 11기 동아리원으로 활동하였다.", "멋쟁이 사자처럼", "", false
                ),
                EducationDTO.of("멋쟁이사자처럼 12기 운영진", LocalDate.parse("2024-01-01"),
                        LocalDate.now(), "멋쟁이사자처럼 12기 운영진으로 조별 스터디 및 동아리를 운영하였다.", "멋쟁이 사자처럼", "", true)
        );
    }
}

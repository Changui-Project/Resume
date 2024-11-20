package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dto.PaperDTO;
import dev.portfolio.portfolio.service.PaperService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PaperServiceImpl implements PaperService {
    @Override
    public List<PaperDTO> readAllPaper() {
        return List.of(
                PaperDTO.of("마이크로 서비스 아키텍쳐 설계 및 구축을 위한 가상화 기술별 성능 비교 분석", LocalDate.parse("2023-11-24"),
                        List.of("a"), "https://www.dbpia.co.kr/journal/articleDetail?nodeId=NODE11701299",
                        "대한전자공학회", "컨퍼런스 논문"
                ),
                PaperDTO.of("의료 환경에서의 Fog-Computing을 위한 인증과 키 합의 스키마 보안 분석 및 제안", LocalDate.parse("2024-06-26"),
                        List.of("a"), "https://www.dbpia.co.kr/journal/articleDetail?nodeId=NODE11891096",
                        "대한전자공학회", "컨퍼런스 논문")
        );
    }
}

package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dto.PrizeDTO;
import dev.portfolio.portfolio.service.PrizeService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PrizeServiceImpl implements PrizeService {
    @Override
    public List<PrizeDTO> readAllPrize() {
        return List.of(
                PrizeDTO.of(
                        "멋쟁이사자처럼 대경권 FEVER 해커톤", "할랄음식", "경북대학교 소프트웨어교육원",
                        "우수상", LocalDate.parse("2023-10-31"), "설명", ""
                ),
                PrizeDTO.of(
                        "4차 산업혁명 인재양성 공유-협업 공모전 ICT솔루션 부문", "OFFLOAD", "한국정보통신보안윤리학회",
                        "우수상", LocalDate.parse("2023-11-24"), "설명", ""
                ),
                PrizeDTO.of(
                        "2024 경북대학교-계명대학교 공동 해커톤", "리뷰할래?", "계명대학교 지식학인재원",
                        "금상", LocalDate.parse("2024-08-14"), "설명", ""
                )
        );
    }
}

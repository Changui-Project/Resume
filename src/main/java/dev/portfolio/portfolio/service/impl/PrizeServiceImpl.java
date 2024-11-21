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
                        "우수상", LocalDate.parse("2023-10-31"), "할랄 음식들을 쉽게 찾을 수 있는 웹 앱 서비스 제작",
                        "/img/경북대학교-2023-우수상.jpeg"
                ),
                PrizeDTO.of(
                        "4차 산업혁명 인재양성 공유-협업 공모전 ICT솔루션 부문", "OFFLOAD", "한국정보통신보안윤리학회",
                        "우수상", LocalDate.parse("2023-11-24"), "공간을 공유하는 사람들을 매칭시켜주는 지도기반 웹 서비스 제작",
                        "/img/정보통신윤리학회-2023-우수상.jpg"
                ),
                PrizeDTO.of(
                        "2024 경북대학교-계명대학교 공동 해커톤", "리뷰할래?", "계명대학교 지식학인재원",
                        "금상", LocalDate.parse("2024-08-14"),
                        "리뷰를 자세하게 적기 힘든 사람들과 리뷰의 품질을 높이고 싶어하는 기업들을 위해 키워드를 통해 리뷰를 작성해주는 웹 서비스",
                        "/img/계명대학교-2024-금상.jpeg"
                )
        );
    }
}

package dev.portfolio.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;

@Getter
public class PaperDTO {
    @JsonProperty("name")
    private final String name;
    @JsonProperty("date")
    private final LocalDate date;
    @JsonProperty("descriptions")
    private final List<String> descriptions;
    @JsonProperty("paperUrl")
    private final String paperUrl;
    @JsonProperty("institute")
    private final String institute;
    @JsonProperty("type")
    private final String type;

    @JsonCreator
    public PaperDTO(@JsonProperty("name") final String name, @JsonProperty("date") final LocalDate date,
                    @JsonProperty("descriptions") final List<String> descriptions,
                    @JsonProperty("paper-url") final String paperUrl, @JsonProperty("institute") final String institute,
                    @JsonProperty("type") final String type) {
        this.name = name;
        this.date = date;
        this.descriptions = descriptions;
        this.paperUrl = paperUrl;
        this.institute = institute;
        this.type = type;
    }

    public static PaperDTO of(final String name, final LocalDate date, final List<String> descriptions,
                              final String paperUrl, final String institute, final String type) {
        return new PaperDTO(name, date, descriptions, paperUrl, institute, type);
    }
}

package dev.portfolio.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import lombok.Getter;

@Getter
public class PrizeDTO {
    @JsonProperty("name")
    private final String name;
    @JsonProperty("projectName")
    private final String projectName;
    @JsonProperty("agency")
    private final String agency;
    @JsonProperty("prize")
    private final String prize;
    @JsonProperty("date")
    private final LocalDate date;
    @JsonProperty("description")
    private final String description;
    @JsonProperty("imageUrl")
    private final String imageUrl;

    @JsonCreator
    public PrizeDTO(@JsonProperty("name") final String name, @JsonProperty("project-name") final String projectName,
                    @JsonProperty("agency") final String agency, @JsonProperty("prize") final String prize,
                    @JsonProperty("date") final LocalDate date, @JsonProperty("description") final String description,
                    @JsonProperty("image-url") final String imageUrl) {
        this.name = name;
        this.projectName = projectName;
        this.agency = agency;
        this.prize = prize;
        this.date = date;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public static PrizeDTO of(final String name, final String projectName, final String agency, final String prize,
                              final LocalDate date, final String description, final String imageUrl) {
        return new PrizeDTO(name, projectName, agency, prize, date, description, imageUrl);
    }
}

package dev.portfolio.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import lombok.Getter;

@Getter
public class EducationDTO {
    @JsonProperty("name")
    private final String name;
    @JsonProperty("startDate")
    private final LocalDate startDate;
    @JsonProperty("endDate")
    private final LocalDate endDate;
    @JsonProperty("description")
    private final String description;
    @JsonProperty("agency")
    private final String agency;
    @JsonProperty("evidenceUrl")
    private final String evidenceUrl;
    @JsonProperty("isProgress")
    private final boolean isProgress;

    public EducationDTO(@JsonProperty("name") final String name, @JsonProperty("startDate") final LocalDate startDate,
                        @JsonProperty("endDate") final LocalDate endDate,
                        @JsonProperty("description") final String description,
                        @JsonProperty("agency") final String agency,
                        @JsonProperty("evidenceUrl") final String evidenceUrl,
                        @JsonProperty("isProgress") final boolean isProgress) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.agency = agency;
        this.evidenceUrl = evidenceUrl;
        this.isProgress = isProgress;
    }

    public static EducationDTO of(final String name, final LocalDate startDate, final LocalDate endDate,
                                  final String description, final String agency, final String evidenceUrl,
                                  final boolean isProgress) {
        return new EducationDTO(name, startDate, endDate, description, agency, evidenceUrl, isProgress);
    }
}

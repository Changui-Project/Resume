package dev.portfolio.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;

@Getter
public class ProjectDTO {

    @JsonProperty("name")
    private final String name;
    @JsonProperty("description")
    private final String description;
    @JsonProperty("startDate")
    private final LocalDate startDate;
    @JsonProperty("endDate")
    private final LocalDate endDate;
    @JsonProperty("techStacks")
    private final List<String> techStacks;
    @JsonProperty("works")
    private final List<String> works;
    @JsonProperty("githubLink")
    private final String githubLink;

    public ProjectDTO(@JsonProperty("name") final String name, @JsonProperty final String description,
                      @JsonProperty("startDate") final LocalDate startDate,
                      @JsonProperty("endDate") final LocalDate endDate,
                      @JsonProperty("techStacks") final List<String> techStacks,
                      @JsonProperty("works") final List<String> works,
                      @JsonProperty("githubLink") final String githubLink
    ) {
        this.name = name;
        this.description = description;
        this.techStacks = techStacks;
        this.works = works;
        this.startDate = startDate;
        this.endDate = endDate;
        this.githubLink = githubLink;
    }

    public static ProjectDTO of(final String name, final String description, final LocalDate startDate,
                                final LocalDate endDate, final List<String> techStacks, final List<String> works,
                                final String githubLink) {
        return new ProjectDTO(name, description, startDate, endDate, techStacks, works, githubLink);
    }
}

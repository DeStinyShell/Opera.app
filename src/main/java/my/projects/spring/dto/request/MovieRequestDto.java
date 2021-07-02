package my.projects.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;

@Getter
public class MovieRequestDto {
    @NotNull
    private String movieTitle;
    @Size(max = 200)
    private String movieDescription;

}

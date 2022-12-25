package com.project.dm.dto.request;

import com.project.dm.entity.type.MoodType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class RecommendMoodMenuRequest {

    @NotNull
    private MoodType moodType;

}

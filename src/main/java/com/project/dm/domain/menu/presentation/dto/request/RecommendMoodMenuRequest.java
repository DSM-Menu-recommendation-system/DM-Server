package com.project.dm.domain.menu.presentation.dto.request;

import com.project.dm.domain.menu.domain.type.MoodType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class RecommendMoodMenuRequest {

    @NotNull
    private MoodType moodType;

}

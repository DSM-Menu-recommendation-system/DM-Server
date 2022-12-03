package com.project.dm.domain.menu.presentation.dto.request;

import com.project.dm.domain.menu.domain.type.MoodType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RecommendMoodMenuRequest {

    private MoodType moodType;

}

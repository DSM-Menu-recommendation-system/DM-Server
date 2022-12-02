package com.project.dm.domain.menu.presentation.dto.request;

import com.project.dm.domain.menu.domain.type.WeatherType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Getter
@NoArgsConstructor
public class RecommendWeatherMenuRequest {

    @NotNull
    private WeatherType weatherType;

}

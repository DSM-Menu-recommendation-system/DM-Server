package com.project.dm.dto.request;

import com.project.dm.entity.type.WeatherType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Getter
@NoArgsConstructor
public class RecommendWeatherMenuRequest {

    @NotNull
    private WeatherType weatherType;

}

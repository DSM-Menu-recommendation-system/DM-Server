package com.project.dm.service;

import com.project.dm.dto.response.RecommendMenuResponse;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;

public interface MenuService {

    RecommendMenuResponse recommendMenu(WeatherType weatherType);

    RecommendMenuResponse recommendMenu(MoodType moodType);

}

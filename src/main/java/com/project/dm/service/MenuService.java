package com.project.dm.service;

import com.project.dm.dto.request.RecommendMoodMenuRequest;
import com.project.dm.dto.request.RecommendWeatherMenuRequest;
import com.project.dm.dto.response.RecommendMenuResponse;

public interface MenuService {

    RecommendMenuResponse recommendMenu(RecommendWeatherMenuRequest request);

    RecommendMenuResponse recommendMenu(RecommendMoodMenuRequest request);

}

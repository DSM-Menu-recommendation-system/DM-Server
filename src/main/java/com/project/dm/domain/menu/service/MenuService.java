package com.project.dm.domain.menu.service;

import com.project.dm.domain.menu.presentation.dto.request.RecommendWeatherMenuRequest;
import com.project.dm.domain.menu.presentation.dto.response.RecommendMenuResponse;

public interface MenuService {

    RecommendMenuResponse recommendMenu(RecommendWeatherMenuRequest request);


}

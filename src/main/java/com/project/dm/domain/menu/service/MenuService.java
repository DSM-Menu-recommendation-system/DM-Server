package com.project.dm.domain.menu.service;

import com.project.dm.domain.menu.presentation.dto.request.RecommendMenuRequest;
import com.project.dm.domain.menu.presentation.dto.response.RecommendMenuResponse;

public interface MenuService {

    RecommendMenuResponse recommendMenu(RecommendMenuRequest request);

}

package com.project.dm.domain.menu.service;

import com.project.dm.domain.menu.domain.Menu;
import com.project.dm.domain.menu.domain.type.MoodType;
import com.project.dm.domain.menu.domain.type.WeatherType;
import com.project.dm.domain.menu.facade.MenuFacade;
import com.project.dm.domain.menu.presentation.dto.request.RecommendMoodMenuRequest;
import com.project.dm.domain.menu.presentation.dto.request.RecommendWeatherMenuRequest;
import com.project.dm.domain.menu.presentation.dto.response.RecommendMenuResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class RecommendMenuServiceImpl implements MenuService {

    private final MenuFacade menuFacade;

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(RecommendWeatherMenuRequest request) {

        WeatherType weatherType = request.getWeatherType();
        Menu menu = menuFacade.getMenuByWeatherType(weatherType);

        return new RecommendMenuResponse(menu.getFood());
    }

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(RecommendMoodMenuRequest request) {

        MoodType moodType = request.getMoodType();
        Menu menu = menuFacade.getMenuByMoodType(moodType);

        return new RecommendMenuResponse(menu.getFood());
    }

}

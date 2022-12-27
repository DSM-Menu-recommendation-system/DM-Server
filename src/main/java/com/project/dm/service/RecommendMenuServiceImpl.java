package com.project.dm.service;

import com.project.dm.entity.Menu;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
import com.project.dm.facade.MenuFacade;
import com.project.dm.dto.response.RecommendMenuResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class RecommendMenuServiceImpl implements MenuService {

    private final MenuFacade menuFacade;

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(WeatherType weatherType) {

//        System.out.println("menuId = " + menuId);
        Menu menu = menuFacade.getMenuByWeatherNum(weatherType);


        return new RecommendMenuResponse(menu.getFood(), menu.getMenuImageUrl());
    }

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(MoodType moodType) {

//        System.out.println("menuId = " + menuId);
        Menu menu = menuFacade.getMenuByMoodNum(moodType);

        return new RecommendMenuResponse(menu.getFood(), menu.getMenuImageUrl());
    }

}

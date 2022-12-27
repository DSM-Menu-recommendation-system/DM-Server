package com.project.dm.service;

import com.project.dm.entity.Menu;
import com.project.dm.entity.repository.MenuRepository;
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
    private final MenuRepository menuRepository;

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(WeatherType weatherType) {

        //Long menuCount = menuRepository.countAllByWeatherType(weatherType);
        //Integer menuId = random.nextInt(7);
        Integer menuId = (int)(Math.random() * 7 + 1 - 1) + 1;
        System.out.println("menuId = " + menuId);
        Menu menu = menuFacade.getMenuByWeatherNum(weatherType, menuId);

        return new RecommendMenuResponse(menu.getFood(), menu.getMenuImageUrl());
    }

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(MoodType moodType) {

        //Long menuCount = menuRepository.countAllByMoodType(moodType);
        Integer menuId = (int)(Math.random() * 7 + 1 - 1) + 1;
        System.out.println("menuId = " + menuId);
        Menu menu = menuFacade.getMenuByMoodNum(moodType, menuId);

        return new RecommendMenuResponse(menu.getFood(), menu.getMenuImageUrl());
    }

}

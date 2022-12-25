package com.project.dm.service;

import com.project.dm.entity.Menu;
import com.project.dm.entity.repository.MenuRepository;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
import com.project.dm.facade.MenuFacade;
import com.project.dm.dto.request.RecommendMoodMenuRequest;
import com.project.dm.dto.request.RecommendWeatherMenuRequest;
import com.project.dm.dto.response.RecommendMenuResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@RequiredArgsConstructor
@Service
public class RecommendMenuServiceImpl implements MenuService {

    private final MenuFacade menuFacade;
    private final MenuRepository menuRepository;
    Random random = new Random();

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(RecommendWeatherMenuRequest request) {

        WeatherType weatherType = request.getWeatherType();

        Long menuCount = menuRepository.countAllByWeatherType(weatherType);
        Integer menuId = random.nextInt(7);
        System.out.println("menuId = " + menuId);
        Menu menu = menuFacade.getMenuByWeatherNum(menuId);

        return new RecommendMenuResponse(menu.getFood(), menu.getMenuImageUrl());
    }

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(RecommendMoodMenuRequest request) {

        MoodType moodType = request.getMoodType();

        Long menuCount = menuRepository.countAllByMoodType(moodType);
        Integer menuId = random.nextInt(7);
        System.out.println("menuId = " + menuId);
        Menu menu = menuFacade.getMenuByMoodNum(menuId);

        return new RecommendMenuResponse(menu.getFood(), menu.getMenuImageUrl());
    }

}

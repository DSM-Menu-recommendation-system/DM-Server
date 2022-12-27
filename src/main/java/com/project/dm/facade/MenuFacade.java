package com.project.dm.facade;

import com.project.dm.entity.Menu;
import com.project.dm.entity.repository.MenuRepository;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
import com.project.dm.exception.MenuNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MenuFacade {

    private final MenuRepository menuRepository;

    public Menu getMenuByMoodNum(MoodType moodType, Integer menuId) {
        return menuRepository.findByMoodTypeAndCheckMoodNum(moodType, menuId)
                .orElseThrow(() -> MenuNotFoundException.EXCEPTION);
    }

    public Menu getMenuByWeatherNum(WeatherType weatherType, Integer menuId) {
        return menuRepository.findByWeatherTypeAndCheckWeatherNum(weatherType, menuId)
                .orElseThrow(() -> MenuNotFoundException.EXCEPTION);
    }

}

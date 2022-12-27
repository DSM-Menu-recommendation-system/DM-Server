package com.project.dm.facade;

import com.project.dm.entity.Menu;
import com.project.dm.entity.repository.MenuRepository;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
import com.project.dm.exception.MenuNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

@RequiredArgsConstructor
@Component
public class MenuFacade {

    private final MenuRepository menuRepository;

    public Menu getMenuByMoodNum(MoodType moodType) {
        Random rand = new Random();
        var menuList = menuRepository.findAllByMoodType(moodType);
        return menuList.get(rand.nextInt(menuList.size()));
    }

    public Menu getMenuByWeatherNum(WeatherType weatherType) {
        Random rand = new Random();
        var menuList = menuRepository.findAllByWeatherType(weatherType);
        return menuList.get(rand.nextInt(menuList.size()));
    }

}

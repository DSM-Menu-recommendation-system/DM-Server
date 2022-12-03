package com.project.dm.domain.menu.facade;

import com.project.dm.domain.menu.domain.Menu;
import com.project.dm.domain.menu.domain.repository.MenuRepository;
import com.project.dm.domain.menu.domain.type.MoodType;
import com.project.dm.domain.menu.domain.type.WeatherType;
import com.project.dm.domain.menu.exception.MenuNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MenuFacade {

    private final MenuRepository menuRepository;

    public Menu getMenuByWeatherType(WeatherType weatherType) {
        return menuRepository.findByWeatherType(weatherType)
                .orElseThrow(() -> MenuNotFoundException.EXCEPTION);
    }

    public Menu getMenuByMoodType(MoodType moodType) {
        return menuRepository.findByMoodType(moodType)
                .orElseThrow(() -> MenuNotFoundException.EXCEPTION);
    }

}

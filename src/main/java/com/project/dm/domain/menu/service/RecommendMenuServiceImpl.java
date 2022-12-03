package com.project.dm.domain.menu.service;

import com.project.dm.domain.menu.domain.Menu;
import com.project.dm.domain.menu.domain.repository.MenuRepository;
import com.project.dm.domain.menu.domain.type.WeatherType;
import com.project.dm.domain.menu.exception.MenuNotFoundException;
import com.project.dm.domain.menu.presentation.dto.request.RecommendWeatherMenuRequest;
import com.project.dm.domain.menu.presentation.dto.response.RecommendMenuResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class RecommendMenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    @Override
    @Transactional(readOnly = true)
    public RecommendMenuResponse recommendMenu(RecommendWeatherMenuRequest request) {

        WeatherType weatherType = request.getWeatherType();

        Menu menu = menuRepository.findByWeatherType(weatherType)
                .orElseThrow(() -> MenuNotFoundException.EXCEPTION);

        return new RecommendMenuResponse(menu.getFood());
    }

}

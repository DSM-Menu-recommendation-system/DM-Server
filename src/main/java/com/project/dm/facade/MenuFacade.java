package com.project.dm.facade;

import com.project.dm.entity.Menu;
import com.project.dm.entity.repository.MenuRepository;
import com.project.dm.exception.MenuNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MenuFacade {

    private final MenuRepository menuRepository;

    public Menu getMenuByMoodNum(Integer menuId) {
        return menuRepository.findByCheckMoodNum(menuId)
                .orElseThrow(() -> MenuNotFoundException.EXCEPTION);
    }

    public Menu getMenuByWeatherNum(Integer menuId) {
        return menuRepository.findByCheckWeatherNum(menuId)
                .orElseThrow(() -> MenuNotFoundException.EXCEPTION);
    }

}

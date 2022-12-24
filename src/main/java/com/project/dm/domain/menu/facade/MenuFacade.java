package com.project.dm.domain.menu.facade;

import com.project.dm.domain.menu.domain.Menu;
import com.project.dm.domain.menu.domain.repository.MenuRepository;
import com.project.dm.domain.menu.exception.MenuNotFoundException;
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

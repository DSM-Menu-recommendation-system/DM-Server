package com.project.dm.controller;

import com.project.dm.dto.response.RecommendMenuResponse;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
import com.project.dm.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/menus")
@RestController
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/weather")
    public RecommendMenuResponse recommendMenu(@RequestParam(value = "weather_type")WeatherType weatherType) {
        return menuService.recommendMenu(weatherType);
    }

    @GetMapping("/mood")
    public RecommendMenuResponse recommendMenu(@RequestParam(value = "mood_type")MoodType moodType) {
        return menuService.recommendMenu(moodType);
    }

}

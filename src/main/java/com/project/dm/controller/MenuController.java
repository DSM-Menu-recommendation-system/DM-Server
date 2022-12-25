package com.project.dm.controller;

import com.project.dm.dto.request.RecommendMoodMenuRequest;
import com.project.dm.dto.request.RecommendWeatherMenuRequest;
import com.project.dm.dto.response.RecommendMenuResponse;
import com.project.dm.service.RecommendMenuServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/menus")
@RestController
public class MenuController {

    private final RecommendMenuServiceImpl recommendMenuService;

    @GetMapping("/weather")
    public RecommendMenuResponse recommendMenu(@RequestBody @Valid  RecommendWeatherMenuRequest request) {
        return recommendMenuService.recommendMenu(request);
    }

    @GetMapping("/mood")
    public RecommendMenuResponse recommendMenu(@RequestBody @Valid  RecommendMoodMenuRequest request) {
        return recommendMenuService.recommendMenu(request);
    }

}

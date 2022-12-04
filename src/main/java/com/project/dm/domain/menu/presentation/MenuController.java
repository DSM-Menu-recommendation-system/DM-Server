package com.project.dm.domain.menu.presentation;

import com.project.dm.domain.menu.presentation.dto.request.RecommendMoodMenuRequest;
import com.project.dm.domain.menu.presentation.dto.request.RecommendWeatherMenuRequest;
import com.project.dm.domain.menu.presentation.dto.response.RecommendMenuResponse;
import com.project.dm.domain.menu.service.RecommendMenuServiceImpl;
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

package com.project.dm.domain.menu.presentation;

import com.project.dm.domain.menu.presentation.dto.request.RecommendMoodMenuRequest;
import com.project.dm.domain.menu.presentation.dto.request.RecommendWeatherMenuRequest;
import com.project.dm.domain.menu.presentation.dto.response.RecommendMenuResponse;
import com.project.dm.domain.menu.service.RecommendMenuServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/menus")
@RestController
public class MenuController {

    private final RecommendMenuServiceImpl recommendMenuService;

    @GetMapping("/weather")
    public RecommendMenuResponse recommendMenu(@RequestBody RecommendWeatherMenuRequest request) {
        return recommendMenuService.recommendMenu(request);
    }

}

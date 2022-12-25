package com.project.dm.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RecommendMenuResponse {

    private final String menu;

    private final String menu_image_url;

}

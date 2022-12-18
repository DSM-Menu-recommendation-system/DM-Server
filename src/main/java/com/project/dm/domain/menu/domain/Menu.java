package com.project.dm.domain.menu.domain;

import com.project.dm.domain.menu.domain.type.MoodType;
import com.project.dm.domain.menu.domain.type.WeatherType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 15, nullable = false)
    private String food;

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private MoodType moodType;

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private WeatherType weatherType;

    @Builder
    public Menu(String food, MoodType moodType, WeatherType weatherType) {
        this.food = food;
        this.moodType = moodType;
        this.weatherType =weatherType;
    }

}

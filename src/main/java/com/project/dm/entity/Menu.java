package com.project.dm.entity;

import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
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
    @Column(length = 10)
    private MoodType moodType;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private WeatherType weatherType;

    @Column(nullable = false)
    private String menuImageUrl;

    @Builder
    public Menu(String food, MoodType moodType, WeatherType weatherType) {
        this.food = food;
        this.moodType = moodType;
        this.weatherType =weatherType;
    }

}

package com.project.dm.domain.menu;

import com.project.dm.domain.menu.type.FoodType;
import com.project.dm.domain.menu.type.MoodType;
import com.project.dm.domain.menu.type.WeatherType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false)
    private String food;

    @Enumerated(EnumType.STRING)
    @Column(length = 15, nullable = false)
    private FoodType foodType;

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private MoodType moodType;

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private WeatherType weatherType;

    @Builder
    public Menu(String food, FoodType foodType, MoodType moodType, WeatherType weatherType) {
        this.food = food;
        this.foodType =foodType;
        this.moodType = moodType;
        this.weatherType =weatherType;
    }

}

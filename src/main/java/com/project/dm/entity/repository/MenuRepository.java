package com.project.dm.entity.repository;

import com.project.dm.entity.Menu;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

    Optional<Menu> findByWeatherTypeAndCheckWeatherNum(WeatherType weatherType, Integer menuId);

    Optional<Menu> findByMoodTypeAndCheckMoodNum(MoodType moodType, Integer menuId);

    Long countAllByWeatherType(WeatherType weatherType);

    Long countAllByMoodType(MoodType moodType);

    List<Menu> findAllByWeatherType(WeatherType weatherType);
    List<Menu> findAllByMoodType(MoodType moodType);

}

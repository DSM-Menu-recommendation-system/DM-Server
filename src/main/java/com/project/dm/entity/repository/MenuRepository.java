package com.project.dm.entity.repository;

import com.project.dm.entity.Menu;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

    Optional<Menu> findById(Integer menuId);

    Optional<Menu> findByCheckWeatherNum(Integer menuId);

    Optional<Menu> findByCheckMoodNum(Integer menuId);

    Long countAllByWeatherType(WeatherType weatherType);

    Long countAllByMoodType(MoodType moodType);

}

package com.project.dm.domain.menu.domain.repository;

import com.project.dm.domain.menu.domain.Menu;
import com.project.dm.domain.menu.domain.type.MoodType;
import com.project.dm.domain.menu.domain.type.WeatherType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

    Optional<Menu> findById(Integer menuId);

    Long countAllByWeatherType(WeatherType weatherType);

    Long countAllByMoodType(MoodType moodType);

}

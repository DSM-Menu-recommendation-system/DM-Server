package com.project.dm.entity.repository;

import com.project.dm.entity.Menu;
import com.project.dm.entity.type.MoodType;
import com.project.dm.entity.type.WeatherType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

    List<Menu> findAllByWeatherType(WeatherType weatherType);

    List<Menu> findAllByMoodType(MoodType moodType);

}

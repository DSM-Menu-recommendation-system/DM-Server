package com.project.dm.domain.menu.domain.repository;

import com.project.dm.domain.menu.domain.Menu;
import com.project.dm.domain.menu.domain.type.WeatherType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MenuRepository extends CrudRepository<Menu, Long> {

    Optional<Menu> findByWeatherType(WeatherType weatherType);

}

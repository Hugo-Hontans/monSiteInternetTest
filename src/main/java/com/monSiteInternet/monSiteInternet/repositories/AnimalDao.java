package com.monSiteInternet.monSiteInternet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.monSiteInternet.monSiteInternet.entities.Animal;

@Repository
public interface AnimalDao extends JpaRepository<Animal, Long> {

}

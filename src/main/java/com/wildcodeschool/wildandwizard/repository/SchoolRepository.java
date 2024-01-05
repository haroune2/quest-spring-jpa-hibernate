package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;

import org.springframework.data.jpa.repository.JpaRepository;

//La classe SchoolRepository implémente bien JpaRepository.


public interface SchoolRepository extends JpaRepository <School, Long> {
}

 
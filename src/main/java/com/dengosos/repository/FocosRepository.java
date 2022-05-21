package com.dengosos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dengosos.data.entity.Focos;

@Repository
public interface FocosRepository extends JpaRepository<Focos, Integer> {

}

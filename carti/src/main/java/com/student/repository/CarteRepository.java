package com.student.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.student.entity.Carte;

public interface CarteRepository extends JpaRepository<Carte, Integer>{}

package com.example.tprest.repositories;

import org.springframework.data.jpa.repository. JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.tprest.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> { }
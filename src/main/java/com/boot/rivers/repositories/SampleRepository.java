package com.boot.rivers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.rivers.models.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long>{
}

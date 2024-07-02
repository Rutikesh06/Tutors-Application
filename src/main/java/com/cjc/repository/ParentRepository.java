package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Parent;

public interface ParentRepository extends JpaRepository<Parent, Integer> {

}

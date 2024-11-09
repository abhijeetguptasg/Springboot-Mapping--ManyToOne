package com.mto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mto.dto.Book;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}

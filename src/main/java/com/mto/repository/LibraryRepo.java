package com.mto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mto.dto.Library;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Integer> {

}

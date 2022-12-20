package com.cleyton.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleyton.os.model.OS;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer>{

}

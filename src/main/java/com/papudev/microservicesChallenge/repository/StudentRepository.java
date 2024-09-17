package com.papudev.microservicesChallenge.repository;

import com.papudev.microservicesChallenge.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

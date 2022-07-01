package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

// Declare interface that extends Spring Data JPA's JpaRepository
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
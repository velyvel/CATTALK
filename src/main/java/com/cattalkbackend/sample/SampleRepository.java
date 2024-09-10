package com.cattalkbackend.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface SampleRepository extends
    JpaRepository<Sample, Long>,
    QuerydslPredicateExecutor<Sample>, SampleRepositoryCustom{

}

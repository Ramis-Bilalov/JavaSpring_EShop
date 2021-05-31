package com.bilalov.java_spring_eshop.dao;

import com.bilalov.java_spring_eshop.domain.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
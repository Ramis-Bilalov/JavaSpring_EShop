package com.bilalov.java_spring_eshop.service;

import com.bilalov.java_spring_eshop.domain.Bucket;
import com.bilalov.java_spring_eshop.domain.User;
import com.bilalov.java_spring_eshop.dto.BucketDTO;
import com.bilalov.java_spring_eshop.dto.ProductDTO;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);

    void addProducts(Bucket bucket, List<Long> productIds);

    BucketDTO getBucketByUser(String name);

    List<BucketDTO> getAll();
}
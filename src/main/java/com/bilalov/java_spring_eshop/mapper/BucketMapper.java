package com.bilalov.java_spring_eshop.mapper;

import com.bilalov.java_spring_eshop.domain.Bucket;
import com.bilalov.java_spring_eshop.dto.BucketDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BucketMapper {
    BucketMapper MAPPER = Mappers.getMapper(BucketMapper.class);

    Bucket toBucket(BucketDTO dto);

    @InheritInverseConfiguration
    BucketDTO fromBucket(Bucket bucket);

    List<Bucket> toProductList(List<BucketDTO> productDTOS);

    List<BucketDTO> fromBucketList(List<Bucket> products);
}
package com.bilalov.java_spring_eshop.endpoint;

import com.bilalov.java_spring_eshop.dto.BucketDTO;
import com.bilalov.java_spring_eshop.service.BucketService;
import com.bilalov.java_spring_eshop.ws.bucket.BucketWS;
import com.bilalov.java_spring_eshop.ws.bucket.GetBucketRequest;
import com.bilalov.java_spring_eshop.ws.bucket.GetBucketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BucketEndpoint {

    public static final String NAMESPACE_URL = "http://bilalov.com/java_spring_eshop/ws/bucket";

    private BucketService bucketService;

    @Autowired
    public BucketEndpoint(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getBucketRequest")
    @ResponsePayload
    public GetBucketResponse getBucketWS(@RequestPayload GetBucketRequest request) {
        GetBucketResponse response = new GetBucketResponse();
        bucketService.getAll()
                .forEach(dto -> response.getBucket().add(createBucketWs(dto)));
        return response;
    }

    private BucketWS createBucketWs(BucketDTO dto) {
        BucketWS ws = new BucketWS();
        ws.setSum(Double.parseDouble(dto.getSum().toString()));
        ws.setProductAmount(dto.getAmountProducts());
        return ws;
    }
}
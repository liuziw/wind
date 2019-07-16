package com.lzw.wind.service;


import com.lzw.wind.common.ServerResponse;

public interface TestService {

    ServerResponse testIdempotence();

    ServerResponse accessLimit();

}

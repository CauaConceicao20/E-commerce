package com.compass.e_commerce.controller;

import com.compass.e_commerce.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @PostMapping
    public void clear(@RequestParam("cacheName") String cacheName) {
        cacheService.evictAllCacheValues(cacheName);
    }
}
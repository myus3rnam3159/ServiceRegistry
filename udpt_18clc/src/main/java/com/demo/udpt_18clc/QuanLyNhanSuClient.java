package com.demo.udpt_18clc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SPRING-CLOUD-EUREKA-CLIENT")
public interface QuanLyNhanSuClient {
    @GetMapping(value = "/employee")
    String LayThongTinNhanVien();

    @RequestMapping(value = "/add")
    void ThemNhanVien();
}

package com.demo.quanlynhansu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface QuanLyNhanVien {

    //Đánh đấu phương thức xử lý GET REQUEST tới url được đề cập
    @GetMapping(value = "/employee")
    String LayThongTinNhanVien();

    //Đánh dấu phương thức xử lý  mọi http request tới url được đề cập 
    @RequestMapping(value = "/add")
    void ThemNhanVien();
}

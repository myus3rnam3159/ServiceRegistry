package com.demo.quanlynhansu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QuanlynhansuApplication implements QuanLyNhanVien {

	public static void main(String[] args) {
		SpringApplication.run(QuanlynhansuApplication.class, args);
	}

	@Override
	public String LayThongTinNhanVien() {
		String str = "This is emplolyee information";
		return str;
	}

	@Override
	public void ThemNhanVien() {
	}

}

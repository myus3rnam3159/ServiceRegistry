//Xác định package của lớp, package: tổ chức mã nguồn thành các nhóm logic để dễ quán lý và sử dụng
package com.demo.quanlynhansu; 
//Một lớp trong SpringBoot giúp khởi động ứng dụng
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // đánh dấu lơp dưới là một SpringBoot App
@RestController // đánh dấu lớp dưới là Controller
public class QuanlynhansuApplication implements QuanLyNhanVien {

	public static void main(String[] args) {
		SpringApplication.run(QuanlynhansuApplication.class, args);
	}

	@Override // đánh dấu phương thức ghi đè tên nó trong interface
	public String LayThongTinNhanVien() {
		String str = "This is emplolyee information";
		return str;
	}

	@Override
	public void ThemNhanVien() {
	}

}

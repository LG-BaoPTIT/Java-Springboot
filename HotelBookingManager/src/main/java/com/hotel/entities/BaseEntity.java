package com.hotel.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;


@Data
@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String creatBy;
	@Column
	private Date creatDate;
	@Column
	private String modifyBy;
	@Column
	private Date modifiDate;
	
	
}

/*
 * @MappedSuperclass cho phép các thực thể kế thừa các thuộc tính
 * 
 * @Id khai báo xác định xem đâu là thuộc tí primary của entity tương ứng, 
 * mỗi entity bắt buộc phải có thuộc tính này nếu không chạy sẽ bị lỗi 
 * 
 * @Column thêm tên cột vào bảng của một cơ sở MySQL cụ thể
 * 
 *cú pháp : @Column(name = "DESC", nullable = false, length = 512)
 *chuỗi trên mô tả: name - tên cột , nullable - cho phép cột chứa giá trị null, length chiều dài cột
 * */


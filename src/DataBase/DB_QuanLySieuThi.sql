CREATE DATABASE QUAN_LY_SIEU_THI_G5
GO

USE QUAN_LY_SIEU_THI_G5
GO

CREATE TABLE NHANVIEN(
	MANV VARCHAR(10) PRIMARY KEY NOT NULL,
	MATKHAU VARCHAR(50) NOT NULL,
	HOTEN NVARCHAR(50) NOT NULL,
	GIOITINH BIT DEFAULT 0,
	NGAYSINH DATE NOT NULL,
	VAITRO BIT DEFAULT 0
)

CREATE TABLE KHACHHANG(
	MAKH VARCHAR(10) PRIMARY KEY NOT NULL,
	MATKHAU VARCHAR(50) NOT NULL,
	TENKH NVARCHAR(50) NOT NULL,
	GIOITINH BIT DEFAULT 0,
	NGAYSINH DATE NOT NULL,
	NGAYDANGKI DATE NOT NULL
)

CREATE TABLE CHUNGLOAI(
	MACL VARCHAR(10) PRIMARY KEY NOT NULL,
	TENCL NVARCHAR(50) NOT NULL,
	MIEUTA NVARCHAR(100) NOT NULL,
)

CREATE TABLE SANPHAM(
	MASP VARCHAR(10) PRIMARY KEY NOT NULL,
	TENSP NVARCHAR(50) NOT NULL,
	SOLUONG INT NOT NULL,
	GIATHANH FLOAT NOT NULL,
	MACL VARCHAR(10) NOT NULL,
	FOREIGN KEY (MACL) REFERENCES CHUNGLOAI(MACL)
)

CREATE TABLE HOADON(
    SODEMHD INT IDENTITY NOT NULL,
    MAHD AS 'HD' + RIGHT('000' + CAST(SODEMHD AS VARCHAR(3)),3) PERSISTED PRIMARY KEY,
	/*MAHD VARCHAR(10) PRIMARY KEY NOT NULL,*/
	NGAYLAPHD DATE NOT NULL,
	MANV VARCHAR(10) NOT NULL,
	FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV)
)
CREATE TABLE CHITIETHOADON(
	SOLUONG INT NOT NULL,
	THANHTIEN FLOAT NOT NULL,
	MASP VARCHAR(10) NOT NULL,
	MAHD VARCHAR(5) NOT NULL
	FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP),
	FOREIGN KEY (MAHD) REFERENCES HOADON(MAHD)
)

CREATE TABLE DONHANG(
    SODEMDH INT IDENTITY NOT NULL,
    MADH AS 'DH' + RIGHT('000' + CAST(SODEMDH AS VARCHAR(3)),3) PERSISTED PRIMARY KEY,
	/*MADH VARCHAR(10) PRIMARY KEY NOT NULL,*/
	NGAYDATHANG DATE NOT NULL,
	MAKH VARCHAR(10) NOT NULL
	FOREIGN KEY (MAKH) REFERENCES KHACHHANG(MAKH)
)

CREATE TABLE CHITIETDONHANG(
	SOLUONG INT NOT NULL,
	THANHTIEN FLOAT NOT NULL,
	MASP VARCHAR(10) NOT NULL,
	MADH VARCHAR(5) NOT NULL
	FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP),
	FOREIGN KEY (MADH) REFERENCES DONHANG(MADH)
)
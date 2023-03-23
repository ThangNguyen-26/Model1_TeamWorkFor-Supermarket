USE QUAN_LY_SIEU_THI_G5
GO

INSERT INTO NHANVIEN VALUES
('nv1','matkhau1', N'Trần Văn Nhân', 0, '2003-12-16', 0)
,('nv2','matkhau2', N'Nguyễn Lê Hoàng Thắng', 1, '2003-10-01', 0)
,('nv3','matkhau1', N'Trịnh Duy Bảo', 0, '2003-02-06', 0)
,('nv4','matkhau4', N'Nguyễn Văn Kim Hoàng', 0, '2003-02-19', 0)
,('admin1','admin1', N'Admin', 1, '2003-08-07', 1)

INSERT INTO KHACHHANG VALUES
('kh1', 'matkhau1', 'Trần Văn Nhân', 0, '2003-12-16', '2023-03-10')
,('kh2', 'matkhau2', 'Trần Văn Nghĩa', 1, '2003-12-30', '2023-03-15')
,('kh3', 'matkhau3', 'Nguyễn Lê Hoàng Thắng', 0, '2003-06-10', '2023-02-17')
,('kh4', 'matkhau4', 'Nguyễn Văn Kim Hoàng', 1, '2003-09-09', '2023-01-09')
,('kh5', 'matkhau5', 'Trịnh Duy Bảo', 0, '2003-09-30', '2022-09-12')

INSERT INTO CHUNGLOAI VALUES
('cl1', N'Sữa', N'Các Sản Phẩm Làm Từ Sữa Tươi Và Sữa Bột')
,('cl2', N'Gạo', N'Sản Phẩm Chứa Nhiều Tinh Bột Được Sản Xuất Tại ĐBSCL')
,('cl3', N'Rau', N'Các Sản Phẩm Nông Nghiệp Chứa Nhiều Vitamin')
,('cl4', N'Trứng', N'Các Sản Phẩm Từ Các Loại Gia Cầm')
,('cl5', N'Trái Cây', N'Các Sản Phẩm Nông Nghiệp Chứa Nhiều Vitamin')

INSERT INTO SANPHAM VALUES
('sp1', 'Milo', 80, 15, 'cl1')
,('sp2', 'Vinamilk', 180, 10, 'cl1')
,('sp3', 'THtruemilk', 50, 12, 'cl1')
,('sp4', N'Gạo Dẻo', 100, 15, 'cl2')
,('sp5', N'Gạo Dẻo Vừa', 50, 13, 'cl2')
,('sp6', N'Gạo Xốp', 200, 10, 'cl2')
,('sp7', N'Xà Lách', 50, 20, 'cl3')
,('sp8', N'Tần Ô', 10, 30, 'cl3')
,('sp9', N'Diếp Cá', 20, 45, 'cl3')
,('sp10', N'Trứng Gà', 300, 5, 'cl4')
,('sp11', N'Trứng Vịt', 500, 3.5, 'cl4')
,('sp12', N'Trứng Cút', 1000, 2.3, 'cl4')
,('sp13', N'Táo Mỹ', 50, 50, 'cl5')
,('sp14', N'Xoài', 38, 22, 'cl5')
,('sp15', N'Lê', 100, 30, 'cl5')

INSERT INTO HOADON VALUES
('hd1', '2023-02-10', 'nv1')
,('hd2', '2023-01-30', 'nv2')
,('hd3', '2023-03-22', 'nv3')

INSERT INTO CHITIETHOADON VALUES
(2, 60, 'sp15', 'hd1')
,(1, 22, 'sp14', 'hd1')
,(4, 20, 'sp10', 'hd2')
,(3, 90, 'sp8', 'hd2')
,(1, 30, 'sp13', 'hd3')
,(1, 10, 'sp2', 'hd3')

INSERT INTO DONHANG VALUES
('dh1', '2023-02-10', 'kh1')
,('dh2', '2023-01-30', 'kh2')
,('dh3', '2023-03-22', 'kh3')

INSERT INTO CHITIETDONHANG VALUES
(2, 60, 'sp15', 'dh1')
,(1, 22, 'sp14', 'dh1')
,(4, 20, 'sp10', 'dh2')
,(3, 90, 'sp8', 'dh2')
,(1, 30, 'sp13', 'dh3')
,(1, 10, 'sp2', 'dh3')

USE [GroSys]
GO
/****** Object:  Table [dbo].[ChiTietHopDong]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHopDong](
	[MaNPP] [nvarchar](50) NOT NULL,
	[MaSP] [nvarchar](50) NOT NULL,
	[MaNSX] [nvarchar](50) NULL,
	[TenSP] [nvarchar](50) NOT NULL,
	[NgayNhap] [date] NOT NULL,
	[GiaNhap] [float] NOT NULL,
 CONSTRAINT [PK_HD_NPP] PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [nvarchar](50) NOT NULL,
	[NgayLHD] [date] NULL,
	[SoTien] [float] NOT NULL,
	[MaNV] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[MaHDCT] [int] IDENTITY(1,1) NOT NULL,
	[MaHD] [nvarchar](50) NOT NULL,
	[MaSanPham] [nvarchar](50) NOT NULL,
	[SoLuong] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHDCT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoiVien]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoiVien](
	[MaHV] [nvarchar](50) NOT NULL,
	[TenHV] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[SDT] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLSP] [nvarchar](50) NOT NULL,
	[TenLSP] [nvarchar](50) NOT NULL,
	[GhiChu] [nvarchar](250) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nvarchar](50) NOT NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
	[Ten] [nvarchar](50) NOT NULL,
	[SoDienThoai] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[Anh] [nvarchar](50) NULL,
	[VaiTro] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhaPhanPhoi]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaPhanPhoi](
	[MaNPP] [nvarchar](50) NOT NULL,
	[TenNPP] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[NamHopTac] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNPP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhaSanXuat]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaSanXuat](
	[MaNSX] [nvarchar](50) NOT NULL,
	[TenNSX] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[MaNPP] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNSX] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuGiamGia]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuGiamGia](
	[MaHV] [nvarchar](50) NOT NULL,
	[MaSP] [nvarchar](50) NOT NULL,
	[HanSD] [date] NULL,
	[MaNV] [nvarchar](50) NULL,
	[GiaTri] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHV] ASC,
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [nvarchar](50) NOT NULL,
	[TenSP] [nvarchar](50) NOT NULL,
	[MaLSP] [nvarchar](50) NOT NULL,
	[GiaBan] [float] NOT NULL,
	[HanSuDung] [date] NOT NULL,
	[DonViTinh] [nvarchar](20) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[Anh] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[ChiTietHopDong]  WITH CHECK ADD FOREIGN KEY([MaNPP])
REFERENCES [dbo].[NhaPhanPhoi] ([MaNPP])
GO
ALTER TABLE [dbo].[ChiTietHopDong]  WITH CHECK ADD FOREIGN KEY([MaNPP])
REFERENCES [dbo].[NhaPhanPhoi] ([MaNPP])
GO
ALTER TABLE [dbo].[ChiTietHopDong]  WITH CHECK ADD  CONSTRAINT [FK_HD_NSX] FOREIGN KEY([MaNSX])
REFERENCES [dbo].[NhaSanXuat] ([MaNSX])
GO
ALTER TABLE [dbo].[ChiTietHopDong] CHECK CONSTRAINT [FK_HD_NSX]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD FOREIGN KEY([MaSanPham])
REFERENCES [dbo].[SanPham] ([MaSP])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[NhaSanXuat]  WITH CHECK ADD  CONSTRAINT [FK_NSX_NPP] FOREIGN KEY([MaNPP])
REFERENCES [dbo].[NhaPhanPhoi] ([MaNPP])
GO
ALTER TABLE [dbo].[NhaSanXuat] CHECK CONSTRAINT [FK_NSX_NPP]
GO
ALTER TABLE [dbo].[PhieuGiamGia]  WITH CHECK ADD FOREIGN KEY([MaHV])
REFERENCES [dbo].[HoiVien] ([MaHV])
GO
ALTER TABLE [dbo].[PhieuGiamGia]  WITH CHECK ADD FOREIGN KEY([MaHV])
REFERENCES [dbo].[HoiVien] ([MaHV])
GO
ALTER TABLE [dbo].[PhieuGiamGia]  WITH CHECK ADD FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[PhieuGiamGia]  WITH CHECK ADD FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[PhieuGiamGia]  WITH CHECK ADD  CONSTRAINT [FK_PGG_NV] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[PhieuGiamGia] CHECK CONSTRAINT [FK_PGG_NV]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([MaLSP])
REFERENCES [dbo].[LoaiSanPham] ([MaLSP])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SP_HDCT] FOREIGN KEY([MaSP])
REFERENCES [dbo].[ChiTietHopDong] ([MaSP])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SP_HDCT]
GO
/****** Object:  StoredProcedure [dbo].[sp_ChiTieuTheoThang]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_ChiTieuTheoThang] @Thang INT
AS
BEGIN 
	SELECT SUM(GiaNhap) AS GiaNhap
	FROM ChiTietHopDong
	WHERE YEAR(NgayNhap) = YEAR(GETDATE()) AND MONTH(NgayNhap) = @Thang
	GROUP BY MONTH(NgayNhap)
END
GO
/****** Object:  StoredProcedure [dbo].[sp_doanhThuTheoThang]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_doanhThuTheoThang] 
AS BEGIN 
	SELECT SUM(SoTien) AS SoTien, MONTH(NgayLHD) AS Thang
	FROM HoaDon 
	WHERE YEAR(NgayLHD) = YEAR(GETDATE())
	GROUP BY MONTH(NgayLHD) 
END
GO
/****** Object:  StoredProcedure [dbo].[sp_doanhThuTheoThangNV]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_doanhThuTheoThangNV] @thang INT 
AS 
BEGIN 
	SELECT SUM(SoTien) AS DoanhThu
	FROM HoaDon
	WHERE MONTH(NgayLHD) = @thang AND YEAR(NgayLHD) = YEAR(GETDATE())
END 
GO
/****** Object:  StoredProcedure [dbo].[sp_doanhThuTheoTungSP]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_doanhThuTheoTungSP]
AS 
BEGIN
	SELECT SUM(SanPham.GiaBan *HoaDonChiTiet.SoLuong) AS DoanhThu, SanPham.MaSP
	FROM SanPham JOIN HoaDonChiTiet ON SanPham.MaSP = HoaDonChiTiet.MaSanPham
	GROUP BY SanPham.MaSP
END
GO
/****** Object:  StoredProcedure [dbo].[sp_GiaoDich]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_GiaoDich] @MaSP NVARCHAR(50), @SoLuong INT
AS
BEGIN 
	DECLARE @SoLuongHienTai INT
	SELECT @SoLuongHienTai = SoLuong FROM SanPham WHERE MaSP = @MaSP
	UPDATE SanPham SET SoLuong = @SoLuongHienTai - @SoLuong WHERE MaSP = @MaSP
	
END

GO
/****** Object:  StoredProcedure [dbo].[sp_LoadSanPham]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_LoadSanPham] 
AS 
BEGIN 
	SELECT sp.MaSP, sp.TenSP, sp.MaLSP, lsp.TenLSP, ct.GiaNhap, sp.GiaBan, 
			sp.HanSuDung, sp.DonViTinh, sp.SoLuong, sp.Anh, nsx.MaNSX,nsx.TenNSX, ct.MaNPP
	FROM SanPham sp JOIN ChiTietHopDong ct ON sp.MaSP = ct.MaSP
					JOIN NhaSanXuat nsx ON ct.MaNSX = nsx.MaNSX
					JOIN LoaiSanPham lsp ON sp.MaLSP = lsp.MaLSP
					
END
GO
/****** Object:  StoredProcedure [dbo].[sp_LoadSanPhamTheoID]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_LoadSanPhamTheoID] @MaSP NVARCHAR(50)
AS 
BEGIN 
	SELECT sp.MaSP, sp.TenSP, sp.MaLSP, lsp.TenLSP AS 'TenLSP', ct.GiaNhap, sp.GiaBan,
			sp.HanSuDung, sp.DonViTinh, sp.SoLuong, sp.Anh, nsx.MaNSX,nsx.TenNSX, ct.MaNPP
	FROM SanPham sp JOIN ChiTietHopDong ct ON sp.MaSP = ct.MaSP
					JOIN NhaSanXuat nsx ON ct.MaNSX = nsx.MaNSX
					JOIN LoaiSanPham lsp ON sp.MaLSP = lsp.MaLSP
					Where sp.MaSP=@MaSP
					
END
GO
/****** Object:  StoredProcedure [dbo].[sp_LoadSanPhamTheoIdLSP]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_LoadSanPhamTheoIdLSP] @MaLSP NVARCHAR(50)
AS 
BEGIN 
	SELECT sp.MaSP, sp.TenSP, sp.MaLSP, lsp.TenLSP AS 'TenLSP', ct.GiaNhap, sp.GiaBan,
			sp.HanSuDung, sp.DonViTinh, sp.SoLuong, sp.Anh, nsx.MaNSX,nsx.TenNSX, ct.MaNPP
	FROM SanPham sp JOIN ChiTietHopDong ct ON sp.MaSP = ct.MaSP
					JOIN NhaSanXuat nsx ON ct.MaNSX = nsx.MaNSX
					JOIN LoaiSanPham lsp ON sp.MaLSP = lsp.MaLSP
					Where sp.MaLSP = @MaLSP
END
GO
/****** Object:  StoredProcedure [dbo].[sp_LoadSanPhamTheoIdNSX]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_LoadSanPhamTheoIdNSX] @MaNSX NVARCHAR(50)
AS 
BEGIN 
	SELECT sp.MaSP, sp.TenSP, sp.MaLSP, lsp.TenLSP AS 'TenLSP', ct.GiaNhap, sp.GiaBan,
			sp.HanSuDung, sp.DonViTinh, sp.SoLuong, sp.Anh, nsx.MaNSX,nsx.TenNSX, ct.MaNPP
	FROM SanPham sp JOIN ChiTietHopDong ct ON sp.MaSP = ct.MaSP
					JOIN NhaSanXuat nsx ON ct.MaNSX = nsx.MaNSX
					JOIN LoaiSanPham lsp ON sp.MaLSP = lsp.MaLSP
					Where ct.MaNSX=@MaNSX
					
END
GO
/****** Object:  StoredProcedure [dbo].[sp_soLuongHD]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_soLuongHD] 
AS
BEGIN  
	SELECT COUNT(*)
	FROM HoaDon
END
GO
/****** Object:  StoredProcedure [dbo].[sp_SoLuotMuaTheoThang]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_SoLuotMuaTheoThang] @thang INT
AS
BEGIN 
	SELECT COUNT(MaHD) AS SoLuotMua
	FROM HoaDon
	WHERE MONTH(NgayLHD) = @thang AND YEAR(NgayLHD) = YEAR(GetDATE())
	GROUP BY MONTH(NgayLHD) 
END 
GO
/****** Object:  StoredProcedure [dbo].[sp_Them_SanPham]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_Them_SanPham] @MaNPP NVARCHAR(50), @MaNSX NVARCHAR(50), @MaSP NVARCHAR(50), @TenSP NVARCHAR(50), @GiaNhap FLOAT,
							@MaLSP NVARCHAR(50), @GiaBan FLOAT, @HanSuDung DATE, @DonViTInh NVARCHAR(20), @SoLuong INT, @Anh NVARCHAR(50)
AS
BEGIN 
	BEGIN TRY
		BEGIN TRAN 
			INSERT INTO ChiTietHopDong VALUES (@MaNPP, @MaSP, @MaNSX, @TenSP, CONVERT(DATE, GETDATE()), @GiaNhap)

			INSERT INTO SanPham VALUES (@MaSP, @TenSP, @MaLSP, @GiaBan, @HanSuDung, @DonViTInh, @SoLuong, @Anh)
		COMMIT TRAN
	END TRY
	BEGIN CATCH
		RAISERROR (N'không được cập nhật được',16,1)
		ROLLBACK TRAN
	END CATCH
END
GO
/****** Object:  StoredProcedure [dbo].[sp_thongKeDoanhThuTheoLSP]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_thongKeDoanhThuTheoLSP] @MaLSP NVARCHAR(50)
AS
BEGIN 
	SELECT SUM(sp.GiaBan*hdct.SoLuong) AS ThongKe, lsp.MaLSP
	FROM LoaiSanPham lsp JOIN SanPham sp ON lsp.MaLSP = sp.MaLSP
						 JOIN HoaDonChiTiet hdct ON sp.MaSP = hdct.MaSanPham 
	WHERE lsp.MaLSP = @MalSP
	GROUP BY lsp.MaLSP
END
GO
/****** Object:  StoredProcedure [dbo].[sp_topDoanhThu]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_topDoanhThu]
AS 
BEGIN
	SELECT TOP 3 SUM(SanPham.GiaBan *HoaDonChiTiet.SoLuong) AS DoanhThu, SanPham.MaSP
	FROM SanPham JOIN HoaDonChiTiet ON SanPham.MaSP = HoaDonChiTiet.MaSanPham
	GROUP BY SanPham.MaSP
	ORDER BY DoanhThu DESC
END
GO
/****** Object:  StoredProcedure [dbo].[sp_vonBoRaTheoThang]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_vonBoRaTheoThang]
AS BEGIN 
	SELECT SUM(GiaNhap) AS GiaNhap, MONTH(NgayNhap) AS Thang
	FROM ChiTietHopDong
	WHERE YEAR(NgayNhap) = YEAR(GETDATE())
	GROUP BY MONTH(NgayNhap) 
END
GO
/****** Object:  StoredProcedure [dbo].[sp_Xoa_SanPham]    Script Date: 12/9/2021 10:11:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_Xoa_SanPham]  @MaSP NVARCHAR(50)
							
AS
BEGIN 
	BEGIN TRY
		BEGIN TRAN 
			DELETE FROM SanPham 
			Where MaSP=@MaSP
			DELETE FROM ChiTietHopDong 
			Where MaSP=@MaSP
		COMMIT TRAN
	END TRY
	BEGIN CATCH
		RAISERROR (N'không thể xóa được',16,1)
		ROLLBACK TRAN
	END CATCH
END
GO

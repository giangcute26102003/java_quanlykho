-- --------------------------------------------------------
-- Máy chủ:                      127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Phiên bản:           12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for kho
DROP DATABASE IF EXISTS `kho`;
CREATE DATABASE IF NOT EXISTS `kho` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `kho`;

-- Dumping structure for table kho.nha_san_xuat
DROP TABLE IF EXISTS `nha_san_xuat`;
CREATE TABLE IF NOT EXISTS `nha_san_xuat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `address` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table kho.nha_san_xuat: ~5 rows (approximately)
INSERT INTO `nha_san_xuat` (`id`, `name`, `address`, `phone`) VALUES
	(1, 'apple1', 'usa', '113'),
	(2, 'samsung', 'korea', '112'),
	(3, 'xiaomi', 'china', '119'),
	(4, 'oppo', 'taiwan', '110'),
	(6, 'Vinsmart', 'Vietnam', '116');

-- Dumping structure for table kho.san_pham
DROP TABLE IF EXISTS `san_pham`;
CREATE TABLE IF NOT EXISTS `san_pham` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `desc` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `photo` text COLLATE utf8mb4_unicode_ci,
  `id_nsx` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `id_nsx` (`id_nsx`),
  CONSTRAINT `san_pham_ibfk_1` FOREIGN KEY (`id_nsx`) REFERENCES `nha_san_xuat` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table kho.san_pham: ~9 rows (approximately)
INSERT INTO `san_pham` (`id`, `name`, `desc`, `photo`, `id_nsx`) VALUES
	(2, 'iphone 15', 'iPhone 15 256 GB trở thành tâm điểm đáng chú ý tại sự kiện ra mắt thường niên của Apple vào tháng 09/2023', 'https://cdn.tgdd.vn/Products/Images/42/281570/iphone-15-130923-014953.jpg', 1),
	(3, 'redmi12', '1212', NULL, 3),
	(4, 'oppo reno 3x', '3x', NULL, 4),
	(5, 'samsung s23ultra', 'ultra', NULL, 2),
	(6, 'vinsmart live ', 'live 3', NULL, 6),
	(7, 'iphone13', 'ip13', '', 1),
	(8, 'iphone 14', 'ip14', '', 1),
	(9, 'iphone 16', 'ip16', '', 1),
	(10, 'samsung a31', 'a31', 'null', 2);

-- Dumping structure for table kho.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pass_words` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `level` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table kho.user: ~0 rows (approximately)
INSERT INTO `user` (`id`, `name`, `user_name`, `pass_words`, `level`) VALUES
	(1, 'giangcute', 'giang', '123', 1);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

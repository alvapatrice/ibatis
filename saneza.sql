-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 15, 2018 at 08:35 AM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `saneza`
--

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
CREATE TABLE IF NOT EXISTS `clients` (
  `client_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'user id, primary key',
  `location_id` int(11) NOT NULL COMMENT 'client loction id',
  `street_name` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'street address',
  `phone_number` varchar(20) COLLATE utf8_bin NOT NULL COMMENT 'user phone number',
  `username` varchar(10) COLLATE utf8_bin NOT NULL COMMENT 'username(unique 10 long character)',
  `first_name` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'user first name',
  `last_name` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'user last name',
  `birthday` date DEFAULT NULL COMMENT 'user birthday ',
  `sex` int(11) NOT NULL DEFAULT '0' COMMENT '0-not defined, 1-male, 2-female',
  `password` varchar(255) COLLATE utf8_bin NOT NULL COMMENT 'user password(encrypted)',
  `email` varchar(50) COLLATE utf8_bin NOT NULL COMMENT 'user email address',
  `profile_image` varchar(255) COLLATE utf8_bin NOT NULL COMMENT 'user profile image',
  `credit` int(11) NOT NULL DEFAULT '5' COMMENT 'user credits',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'user created time',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'User last updated time',
  PRIMARY KEY (`client_id`),
  UNIQUE KEY `phone_number` (`phone_number`),
  UNIQUE KEY `username` (`username`),
  KEY `location_id` (`location_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`client_id`, `location_id`, `street_name`, `phone_number`, `username`, `first_name`, `last_name`, `birthday`, `sex`, `password`, `email`, `profile_image`, `credit`, `create_time`, `update_time`) VALUES
(1, 1, 'Kacyiru Virunga Street', '+250787666666', 'pnostalgie', 'Patrice', 'Nostalgie', NULL, 1, '123456', 'nalpvapatrice@outlook.com', 'img.png', 5, '2018-10-14 17:28:29', '2018-10-14 17:28:29'),
(2, 1, 'Virunga Street', '+2507877777777', 'pe', 'Kalisa', 'John', NULL, 2, '123456', 'nalpvapatrice@outlook.com', 'img.png', 5, '2018-10-14 17:49:33', '2018-10-14 17:49:33'),
(3, 1, 'Virunga Street', '+25078777890809', 'pejhkshfk', 'Kalisa', 'John', NULL, 2, '123456', 'nalpvapatrice@outlook.com', 'img.png', 5, '2018-10-15 10:22:47', '2018-10-15 10:22:47');

-- --------------------------------------------------------

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
CREATE TABLE IF NOT EXISTS `locations` (
  `location_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'location id',
  `province` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'province',
  `district` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'district',
  `sector` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'sector',
  `cell` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'cell',
  PRIMARY KEY (`location_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `product_id` int(11) NOT NULL COMMENT 'product id',
  `shop_id` int(11) NOT NULL COMMENT 'product shop id',
  `product_name` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'product name',
  `category` int(11) NOT NULL COMMENT 'product category ',
  `brand` int(11) NOT NULL COMMENT 'product brand',
  `image` varchar(255) COLLATE utf8_bin NOT NULL COMMENT 'product image',
  `price` double DEFAULT '0' COMMENT 'product price',
  `special_price` double NOT NULL DEFAULT '0' COMMENT 'product special price',
  `stock` int(11) NOT NULL DEFAULT '1' COMMENT 'available stock',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT 'product status 1-available, 0-blocked, -99 deleted'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
CREATE TABLE IF NOT EXISTS `services` (
  `service_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'service id',
  `shop_id` int(11) NOT NULL COMMENT 'shop id',
  `category_id` int(11) NOT NULL,
  `service_name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT 'service name',
  `duration` double NOT NULL DEFAULT '0' COMMENT 'service duration',
  `price` double NOT NULL DEFAULT '0' COMMENT 'service price',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '1-available, 0-blocked, -99 deleted',
  PRIMARY KEY (`service_id`),
  KEY `category_id` (`category_id`),
  KEY `shop_id` (`shop_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `shops`
--

DROP TABLE IF EXISTS `shops`;
CREATE TABLE IF NOT EXISTS `shops` (
  `shop_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'shop_id',
  `ower_id` int(11) NOT NULL,
  `shop_name` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'shop name',
  `description` text COLLATE utf8_bin NOT NULL COMMENT 'shop description',
  `shop_type` int(11) NOT NULL DEFAULT '1' COMMENT '1-for salon, 2-for carwash',
  `status` int(11) NOT NULL COMMENT 'shop status 1-available, 0-blocked, -99 deleted',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'shop create time',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'shop update time',
  PRIMARY KEY (`shop_id`),
  KEY `ower_id` (`ower_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `shop_branches`
--

DROP TABLE IF EXISTS `shop_branches`;
CREATE TABLE IF NOT EXISTS `shop_branches` (
  `branch_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'branch id',
  `branch_name` int(11) NOT NULL COMMENT 'branch name ',
  `location_id` int(11) NOT NULL COMMENT 'connecting to the location of the shop',
  `street_name` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'Shop branch street name',
  `shop_id` int(11) NOT NULL COMMENT 'branch main shop id',
  `latitude` double NOT NULL COMMENT 'shop position latitude',
  `longitude` double NOT NULL COMMENT 'shop position longitude',
  `open_from` time NOT NULL COMMENT 'daily open time',
  `close_at` time NOT NULL COMMENT 'daily closing time',
  `open_days` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'opening days like (1,2,3,4,5,6,7,)',
  `status` int(11) NOT NULL COMMENT 'branch status 1-available, 0-closed, -99 closed',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'branch create time',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'branch last update time',
  PRIMARY KEY (`branch_id`),
  KEY `location_id` (`location_id`),
  KEY `shop_id` (`shop_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
CREATE TABLE IF NOT EXISTS `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `test_content` varchar(200) COLLATE utf8_bin NOT NULL,
  `test_title` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`id`, `test_content`, `test_title`) VALUES
(1, 'Hello test is running now from all sources', 'Hello test');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

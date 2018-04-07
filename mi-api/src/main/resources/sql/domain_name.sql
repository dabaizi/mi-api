/*
 Navicat MySQL Data Transfer

 Source Server         : first_mysql
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : uis

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 04/07/2018 22:03:06 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `domain_name`
-- ----------------------------
DROP TABLE IF EXISTS `domain_name`;
CREATE TABLE `domain_name` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `postfixId` int(11) NOT NULL,
  `postfix` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT '0',
  `link` varchar(255) DEFAULT NULL,
  `recommendType` int(255) DEFAULT '0',
  `category1` int(255) DEFAULT '0',
  `category2` int(255) DEFAULT '0',
  `category3` int(255) DEFAULT '0',
  `state` int(255) DEFAULT '0',
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;

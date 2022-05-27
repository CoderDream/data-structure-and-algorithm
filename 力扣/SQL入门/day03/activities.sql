/*
 Navicat Premium Data Transfer

 Source Server         : mysql-localhost
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : leetcode

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 15/05/2022 07:53:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for activities
-- ----------------------------
DROP TABLE IF EXISTS `activities`;
CREATE TABLE `activities`  (
  `sell_date` date NULL DEFAULT NULL,
  `product` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of activities
-- ----------------------------
INSERT INTO `activities` VALUES ('2020-05-30', 'Headphone');
INSERT INTO `activities` VALUES ('2020-06-01', 'Pencil');
INSERT INTO `activities` VALUES ('2020-06-02', 'Mask');
INSERT INTO `activities` VALUES ('2020-05-30', 'Basketball');
INSERT INTO `activities` VALUES ('2020-06-01', 'Bible');
INSERT INTO `activities` VALUES ('2020-06-02', 'Mask');
INSERT INTO `activities` VALUES ('2020-05-30', 'T-Shirt');

SET FOREIGN_KEY_CHECKS = 1;

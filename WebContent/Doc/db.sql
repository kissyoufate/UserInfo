/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : wanggang

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2017-06-14 23:36:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uid` int(10) NOT NULL,
  `pname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '1', '??');
INSERT INTO `product` VALUES ('2', '1', '??');
INSERT INTO `product` VALUES ('3', '1', '??');
INSERT INTO `product` VALUES ('4', '1', '哈哈');
INSERT INTO `product` VALUES ('5', '1', '哈哈');
INSERT INTO `product` VALUES ('6', '1', '哈哈');
INSERT INTO `product` VALUES ('7', '1', '哈哈');
INSERT INTO `product` VALUES ('8', '1', '哈哈');
INSERT INTO `product` VALUES ('9', '1', '哈哈');
INSERT INTO `product` VALUES ('10', '1', '哈哈');
INSERT INTO `product` VALUES ('11', '1', '哈哈');
INSERT INTO `product` VALUES ('12', '1', '哈哈');
INSERT INTO `product` VALUES ('13', '1', '哈哈');
INSERT INTO `product` VALUES ('14', '1', '哈哈');
INSERT INTO `product` VALUES ('15', '1', '哈哈');
INSERT INTO `product` VALUES ('16', '1', '??');
INSERT INTO `product` VALUES ('17', '1', '??');
INSERT INTO `product` VALUES ('18', '1', '哈哈哈');
INSERT INTO `product` VALUES ('19', '1', '哈哈哈');
INSERT INTO `product` VALUES ('20', '1', '哈哈哈');
INSERT INTO `product` VALUES ('21', '1', '哈哈哈');
INSERT INTO `product` VALUES ('22', '1', '哈哈哈');
INSERT INTO `product` VALUES ('23', '1', '哈哈哈');
INSERT INTO `product` VALUES ('24', '1', 'å¸¦æçç¾¤');
INSERT INTO `product` VALUES ('25', '1', 'å');
INSERT INTO `product` VALUES ('26', '1', 'A ???');
INSERT INTO `product` VALUES ('27', '1', 'å');
INSERT INTO `product` VALUES ('28', '1', 'å');
INSERT INTO `product` VALUES ('29', '1', '');
INSERT INTO `product` VALUES ('30', '1', 'ç­å»å¤å°æ ç¾¤');
INSERT INTO `product` VALUES ('31', '1', 'å»å¤å°');
INSERT INTO `product` VALUES ('32', '1', 'é½è¯·æ');
INSERT INTO `product` VALUES ('33', '1', 'DAæä¸å');
INSERT INTO `product` VALUES ('34', '1', 'è¾å¤§åå¤');
INSERT INTO `product` VALUES ('35', '1', 'ç­?å?»å¤?å?°');
INSERT INTO `product` VALUES ('36', '1', 'å¤§ç¥?');
INSERT INTO `product` VALUES ('37', '1', '?');
INSERT INTO `product` VALUES ('38', '1', '??');
INSERT INTO `product` VALUES ('39', '1', '1大神');
INSERT INTO `product` VALUES ('40', '1', '发发');
INSERT INTO `product` VALUES ('41', '1', '活动爱好');
INSERT INTO `product` VALUES ('42', '1', 'æ¬§è¨');
INSERT INTO `product` VALUES ('43', '1', '????');
INSERT INTO `product` VALUES ('44', '1', '哈佛爱的积分哦');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王刚', '123456');

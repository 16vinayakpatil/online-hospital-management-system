/*
SQLyog Community v9.30 
MySQL - 5.6.25-log : Database - hospital_mgt_sys
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hospital_mgt_sys` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `hospital_mgt_sys`;

/*Table structure for table `Appointment` */

DROP TABLE IF EXISTS `Appointment`;

CREATE TABLE `Appointment` (
  `ID` bigint(20) NOT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATETIME` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATETIME` datetime DEFAULT NULL,
  `CNP` varchar(225) DEFAULT NULL,
  `APP_DATE` datetime DEFAULT NULL,
  `DOCTOR_NAME` varchar(225) DEFAULT NULL,
  `First_Name` varchar(225) DEFAULT NULL,
  `LAST_NAME` varchar(225) DEFAULT NULL,
  `PHONE_NO` varchar(225) DEFAULT NULL,
  `APP_TIME` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `Appointment` */

insert  into `Appointment`(`ID`,`CREATED_BY`,`CREATED_DATETIME`,`MODIFIED_BY`,`MODIFIED_DATETIME`,`CNP`,`APP_DATE`,`DOCTOR_NAME`,`First_Name`,`LAST_NAME`,`PHONE_NO`,`APP_TIME`) values (1,NULL,NULL,NULL,NULL,NULL,'2019-10-10 00:00:00','Martin Tango','Happy','Don','8695869956','10: 00AM');

/*Table structure for table `Patient` */

DROP TABLE IF EXISTS `Patient`;

CREATE TABLE `Patient` (
  `ID` bigint(20) NOT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATETIME` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATETIME` datetime DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `DOB` datetime DEFAULT NULL,
  `FIRST_NAME` varchar(225) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `LAST_NAME` varchar(225) DEFAULT NULL,
  `PHONE_NO` varchar(50) DEFAULT NULL,
  `CNP` varchar(225) DEFAULT NULL,
  `address` varchar(225) DEFAULT NULL,
  `city` varchar(225) DEFAULT NULL,
  `email_id` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `Patient` */

insert  into `Patient`(`ID`,`CREATED_BY`,`CREATED_DATETIME`,`MODIFIED_BY`,`MODIFIED_DATETIME`,`age`,`DOB`,`FIRST_NAME`,`gender`,`LAST_NAME`,`PHONE_NO`,`CNP`,`address`,`city`,`email_id`) values (1,NULL,NULL,NULL,NULL,'26','1994-10-23 00:00:00','Lamar','Male','Vaughan','9568456845','8565856585666','Iste labore voluptat','Dolore','kyhacoh@mailinator.com');

/*Table structure for table `ROLE` */

DROP TABLE IF EXISTS `ROLE`;

CREATE TABLE `ROLE` (
  `ID` bigint(20) NOT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATETIME` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATETIME` datetime DEFAULT NULL,
  `ROLE_DESCRIPTION` varchar(70) DEFAULT NULL,
  `ROLE_NAME` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ROLE` */

insert  into `ROLE`(`ID`,`CREATED_BY`,`CREATED_DATETIME`,`MODIFIED_BY`,`MODIFIED_DATETIME`,`ROLE_DESCRIPTION`,`ROLE_NAME`) values (1,NULL,'2019-12-16 14:44:57',NULL,'2019-12-16 14:45:00','Adminisration','Admin'),(2,NULL,'2019-12-16 14:45:47',NULL,'2019-12-16 14:45:50','Doctor','Doctor'),(3,NULL,'2019-12-16 14:46:04',NULL,'2019-12-16 14:46:06','Receptionist','Receptionist');

/*Table structure for table `USER` */

DROP TABLE IF EXISTS `USER`;

CREATE TABLE `USER` (
  `ID` bigint(20) NOT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATETIME` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATETIME` datetime DEFAULT NULL,
  `CNP` varchar(225) DEFAULT NULL,
  `qualification` varchar(225) DEFAULT NULL,
  `address` varchar(225) DEFAULT NULL,
  `AGE` varchar(10) DEFAULT NULL,
  `blood_Group` varchar(225) DEFAULT NULL,
  `city` varchar(225) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `email_id` varchar(225) DEFAULT NULL,
  `FIRST_NAME` varchar(50) DEFAULT NULL,
  `GENDER` varchar(10) DEFAULT NULL,
  `joining_Date` datetime DEFAULT NULL,
  `LAST_NAME` varchar(50) DEFAULT NULL,
  `maritial_Status` varchar(225) DEFAULT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `PHONE_NO` varchar(15) DEFAULT NULL,
  `ROLE_ID` bigint(20) DEFAULT NULL,
  `spcialization` varchar(225) DEFAULT NULL,
  `USER_NAME` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `USER` */

insert  into `USER`(`ID`,`CREATED_BY`,`CREATED_DATETIME`,`MODIFIED_BY`,`MODIFIED_DATETIME`,`CNP`,`qualification`,`address`,`AGE`,`blood_Group`,`city`,`DOB`,`email_id`,`FIRST_NAME`,`GENDER`,`joining_Date`,`LAST_NAME`,`maritial_Status`,`PASSWORD`,`PHONE_NO`,`ROLE_ID`,`spcialization`,`USER_NAME`) values (1,'root','2019-12-16 14:41:49','root','2019-12-16 14:41:56',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-18',NULL,'Mariana','Male',NULL,'Mariana',NULL,'Admin@321','8695865544',1,NULL,'Admin123'),(2,NULL,NULL,NULL,NULL,'154565856545565','Cardiologie','dvs',NULL,NULL,'Cicago','1997-06-10','Martin@gmail.com','Martin','Male',NULL,'Tango',NULL,'Doc@123','8695865595',2,'dvswvw','Doctor123'),(3,NULL,NULL,NULL,NULL,'75654885658566',NULL,'bdzfbfsdberdb',NULL,NULL,'Honkong','1996-12-21','Joy@gmail.com','Joy','Male',NULL,'Mia',NULL,'Rep@123','9656856655',3,NULL,'Receptionist123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

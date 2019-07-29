-- Update session expiration options list
-- --
-- -- author Karen Margaryan (karenm@energizeglobal.com)
-- --
-- -- Database: `doocat_session`
-- --

DELETE
FROM  `doocat_session`.`stoken`;

DELETE
FROM  `doocat_session`.`session_type_lcp`;

INSERT
INTO `doocat_session`.`session_type_lcp`
VALUES
  (0,-1,'No expiration'),
  (1,60000,'Expires after 1 minutes'),
  (2,180000,'Expires after 3 minutes'),
  (3,300000,'Expires after 5 minutes'),
  (4,600000,'Expires after 10 minutes'),
  (5,900000,'Expires after 15 minutes'),
  (6,1200000,'Expires after 20 minutes'),
  (7,1800000,'Expires after 30 minutes'),
  (8,2700000,'Expires after 45 minutes'),
  (9,3600000,'Expires after a hour'),
  (10,10800000,'Expires after 3 hours'),
  (11,21600000,'Expires after 6 hours');

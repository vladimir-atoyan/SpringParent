-- Renames the column `last_accessed_time` to `last_access_time` in the table `stoken`.
--
-- author Gennady Abakyan (gennadya@energizeglobal.com)

ALTER TABLE `stoken` CHANGE `last_accessed_time` `last_access_time` bigint(20) unsigned NOT NULL;

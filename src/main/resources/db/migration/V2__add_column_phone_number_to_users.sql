ALTER TABLE `shop`.`users`
    ADD COLUMN `phone_number` VARCHAR(45) NOT NULL AFTER `password`;
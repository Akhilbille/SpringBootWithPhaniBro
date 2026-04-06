CREATE TABLE `shop`.`addresses` (
        `id` INT NOT NULL,
        `street` VARCHAR(255) NOT NULL,
        `city` VARCHAR(255) NOT NULL,
        `zip` VARCHAR(45) NOT NULL,
        `user_id` BIGINT NOT NULL,
        PRIMARY KEY (`id`),
        INDEX `fk_addresses_users_idx` (`user_id` ASC) VISIBLE,
        CONSTRAINT `fk_addresses_users`
            FOREIGN KEY (`user_id`)
                REFERENCES `shop`.`users` (`id`)
                ON DELETE NO ACTION
                ON UPDATE NO ACTION
    );
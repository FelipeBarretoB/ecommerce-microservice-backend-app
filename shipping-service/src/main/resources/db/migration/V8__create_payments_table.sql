CREATE TABLE payments (
    payment_id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    order_id INT(11),
    is_payed BOOLEAN,
    payment_status VARCHAR(255),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NULL
);
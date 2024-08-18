CREATE TABLE product
(
    id           UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    product_name VARCHAR(255) NOT NULL,
    in_stock     boolean default false
);
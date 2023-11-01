CREATE TABLE audit_department (
    product_revision_number TEXT NOT NULL,
    product_type TEXT NOT NULL,
    location_adress TEXT NOT NULL
);

INSERT INTO audit_department
(product_revision_number, product_type, location_adress)
VALUES
('Xg_5124', 'Компьютер', 'Общага');

INSERT INTO audit_department
(product_revision_number, product_type, location_adress)
VALUES
('DESKTOP-48EF3VL', 'ноутбук', 'квартира')
INSERT INTO Customers VALUES (1, 'Ravi', 'Hyderabad');
INSERT INTO Customers VALUES (2, 'Priya', 'Chennai');
INSERT INTO Customers VALUES (3, 'Amit', 'Delhi');

INSERT INTO Products VALUES (101, 'Laptop', 'Electronics', 50000);
INSERT INTO Products VALUES (102, 'Phone', 'Electronics', 20000);
INSERT INTO Products VALUES (103, 'Shoes', 'Fashion', 3000);

INSERT INTO Orders VALUES (1001, 1, TO_DATE('2024-01-10','YYYY-MM-DD'));
INSERT INTO Orders VALUES (1002, 2, TO_DATE('2024-02-15','YYYY-MM-DD'));
INSERT INTO Orders VALUES (1003, 1, TO_DATE('2024-03-05','YYYY-MM-DD'));

INSERT INTO Order_Items VALUES (1001, 101, 1);
INSERT INTO Order_Items VALUES (1001, 103, 2);
INSERT INTO Order_Items VALUES (1002, 102, 1);
INSERT INTO Order_Items VALUES (1003, 101, 1);

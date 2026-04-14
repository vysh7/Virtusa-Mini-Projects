
INSERT INTO Customers VALUES
(1, 'Ravi', 'Hyderabad'),
(2, 'Priya', 'Chennai'),
(3, 'Amit', 'Delhi'),
(4, 'Sneha', 'Mumbai'),
(5, 'Arjun', 'Bangalore'),
(6, 'Neha', 'Pune'),
(7, 'Kiran', 'Hyderabad'),
(8, 'Meera', 'Chennai'),
(9, 'Rahul', 'Delhi'),
(10, 'Anjali', 'Mumbai');


INSERT INTO Categories VALUES
(1, 'Electronics'),
(2, 'Fashion'),
(3, 'Home'),
(4, 'Sports');


INSERT INTO Products VALUES
(101, 'Laptop', 1, 50000),
(102, 'Phone', 1, 20000),
(103, 'Shoes', 2, 3000),
(104, 'T-shirt', 2, 1000),
(105, 'Mixer', 3, 4000),
(106, 'TV', 1, 60000),
(107, 'Sofa', 3, 25000),
(108, 'Cricket Bat', 4, 2000),
(109, 'Headphones', 1, 3000),
(110, 'Jacket', 2, 5000);


INSERT INTO Orders VALUES
(1001, 1, '2024-01-10'),
(1002, 2, '2024-01-15'),
(1003, 3, '2024-02-05'),
(1004, 4, '2024-02-20'),
(1005, 5, '2024-03-01'),
(1006, 6, '2024-03-10'),
(1007, 7, '2024-03-25'),
(1008, 8, '2024-04-05'),
(1009, 9, '2024-04-15'),
(1010, 1, '2024-04-20');


INSERT INTO Order_Items VALUES
(1001, 101, 1),
(1001, 103, 2),
(1002, 102, 1),
(1003, 104, 3),
(1004, 105, 1),
(1005, 106, 1),
(1006, 107, 1),
(1007, 108, 2),
(1008, 109, 2),
(1009, 110, 1),
(1010, 101, 1),
(1010, 109, 1);

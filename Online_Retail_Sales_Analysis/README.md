
# Online Retail Sales Analysis (SQL Project)

## Overview

This project focuses on designing and analyzing an **online retail database system** using SQL.
It demonstrates how structured data can be used to extract meaningful business insights such as sales trends, customer behavior, and product performance.

---

## Objectives

* Design a relational database for an online retail system
* Store and manage customer, product, and order data
* Perform SQL queries to analyze business performance

---

## Database Schema

The project consists of the following tables:

* **Customers** (customer_id, name, city)
* **Products** (product_id, name, category, price)
* **Orders** (order_id, customer_id, order_date)
* **Order_Items** (order_id, product_id, quantity)

---

## Key Features

* Structured relational database design
* Use of primary and foreign keys
* Data analysis using SQL queries
* Business-oriented insights generation

---

## SQL Queries Implemented

### 1. Top-Selling Products

Identifies products with the highest total quantity sold.

### 2. Most Valuable Customers

Finds customers who have spent the most on purchases.

### 3. Monthly Revenue Analysis

Calculates revenue generated each month.

### 4. Category-wise Sales

Analyzes total sales for each product category.

### 5. Inactive Customers

Detects customers who have not placed any orders.

---

## Tools & Technologies

* Oracle SQL / MySQL
* SQL Developer / Oracle APEX
* GitHub for version control

---

## Database Normalization

This project follows normalization principles to ensure efficient data organization and reduce redundancy.

* **First Normal Form (1NF):** Ensures that all table fields contain atomic values and each record is unique.
* **Second Normal Form (2NF):** Eliminates partial dependencies by ensuring that non-key attributes depend on the entire primary key.
* **Third Normal Form (3NF):** Removes transitive dependencies so that non-key attributes depend only on the primary key.

By applying normalization, the database maintains data integrity, minimizes duplication, and improves query performance.

---

## Output

The queries generate insights such as:

* Best-selling products
* Revenue trends
* Customer spending patterns



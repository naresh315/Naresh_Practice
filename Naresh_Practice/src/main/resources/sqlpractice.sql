select h.buyer_id,sum(p.price) as  TOTAL_WORTH from house h left join price p
on h.house_id=p.house_id  group by h.buyer_id having count(h.buyer_id)>1 and sum(p.price) > 100


SELECT Shippers.ShipperName,COUNT(Orders.OrderID) AS NumberOfOrders FROM Orders
LEFT JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID
GROUP BY ShipperName;

select buyer_id,total_worth from house,price where 

select h.buyer_id,sum(p.price) as  TOTAL_WORTH from house h left join price p
on h.house_id=p.house_id  group by buyer_id 
having (count(h.buyer_id)>1 and sum(p.price) > 100)


SELECT Shippers.ShipperName,COUNT(Orders.OrderID) AS NumberOfOrders FROM Orders
LEFT JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID
GROUP BY ShipperName;

select country,count(customerID) as numofcustomers from  Customers
group by country
having count(customerID) >5
order by count(customerID) desc 
select  e.LastName,count(o.orderID) from Employees e left join Orders o on o.EmployeeID=e.EmployeeID
group by FirstName,LastName
having count(o.orderID)>10

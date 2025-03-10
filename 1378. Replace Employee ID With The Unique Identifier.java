# Write your MySQL query statement below
select EmployeeUNI.unique_id , Employees.name from Employees left join EmployeeUNI on Employees.id=EmployeeUNI.id 
# LEFT JOIN ka matlab hota hai:
# put careffuly left table name , right table name before left join 
-- Left Table → Sab rows include hongi
-- Right Table → Sirf matching rows aayengi, warna NULL

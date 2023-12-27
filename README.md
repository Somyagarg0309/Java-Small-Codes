# Java-Small-Codes

<------------Enrollment Generating System---------->

I created a Menu driven Enrollment Generator System with the following features: -
1. Generate Enrollment Number of Students:
This option could lead to a section where you input the necessary details (such as course, department, 
etc.) and generate unique enrollment numbers for students.
It generates a 11-digit Unique Code where first 3 digit represent the roll number as per sequence,
Next two digit is the course code taken by the student i.e 01 for Btech, 02 for Mtech and so on, Next 
two digit represent the department code of the student i.e 01 for CSE,02 for IT and so on, Last 4 digits 
represent the year of newly admitted students.
2. Add Course:
This tab would allow you to add new courses and the code to that course will be automatically 
assigned by the system.
3. Add Department:
Similar to adding a course, this section would enable you to add new departments to the system. 
4. Search Student Details by using Enrollment number:
This functionality would allow you to search for a specific student's details using their enrollment 
number. The system would retrieve the stored information related to that enrollment number by 
using file Handling. Information will be retrieved from “Data.txt” file based on enrollment number.
5. Exit:
This option would terminate the program, allowing you to gracefully exit the enrollment generating 
system

<------------Inventory Management System---------->

I created a Menu driven Inventory Management System with the following features: -
1. Issue Inventory Items:
This option could lead to a section where you issue inventory items to various departments. You would 
input the necessary details such as the department, the no of units of inventory items (server, desktop, 
laptop, etc.), the item's condition. This also generate a unique code for each issued item and all the data 
get saved in the file named “Data22.txt”.
 Unique Code is Alphanumeric and is of 8 digits where first 3 digit are the code of Inventory item, Next 
 three digits are the sequence number as per the different departments and the last two digits is the
 department code.
2. Track Inventory Item using Unique code:
This functionality would allow you to track a specific inventory item using its unique code. You'd input 
the code and the system would retrieve the details from the File and display information about it.
3. Details of Total Inventory issued to Department:
This tab would provide an overview of the inventory items issued to a specific department. You could 
input the department name, and the system would display a list of items issued to that department.
4. Total Inventory Number Issued till Now by the University:
This option could display statistics about the total number of inventory items issued by the university. It 
shows the counts of different types of items (servers, laptops, etc.) 
5. Complain Regarding Item:
This functionality would allow users to register complaints regarding inventory items. You'd input the 
unique code of the item and details about the complaint. The system stores these complaints for further 
action in the file name “Complain.txt”.
6. Exit:
This option would allow you to gracefully exit the inventory management system.

# partner-Management-System
The project is implemented using Swing GUI widget toolkit and MYSQL database. There are Cloud-based Partner management software saves time spent on manual updates
The System provides the access:-
(i) Add Partner details, to easilty add partner information.
(ii) Manage Partners to view and select a record to update, delete records & view all records,
(iii) Search Partners partners using filters.
(iv) Print to print Partner Information .
(v) Send Email to share the partner information to the respected parties.

Technology Used:- JAVA, AWT & Swing
Tools Used:- Apache Net-Beans for Coding
JDBC for database Connectivity
Database:- MYSQL for Storing Transaction history





# Easy to open applicatin and use 
# Loading Page
![Screenshot 2022-07-30 170235](screen-shots\loadingpage.png)

# Login page

![Screenshot 2022-07-30 170323](screen-shots\loadingpage.png)

# Registration Page

![Screenshot 2022-07-30 171125](screen-shots\signuppage.png)

# Forgot Passwprd Page

![Screenshot 2022-07-30 171206](screen-shots\forgotpassword.png)


# Home Page

![Screenshot 2022-07-31 182337](screen-shots\homepage.png)

# Partners Manage 

![Screenshot 2022-07-31 182357](screen-shots\managepartners.png)

# Add Partners 

![Screenshot 2022-07-31 182419](screen-shots\addpartners.png)

# Partners Print

![Screenshot 2022-07-31 182440](screen-shots\sendemail.png)





CREATE TABLE partner (
    partnerid INT AUTO_INCREMENT PRIMARY KEY,
    org_type varchar(255),
    org_name varchar(255),
    full_name varchar(255),
    email varchar(40),
    mobile varchar(40),
    resources varchar(5000),
    address varchar(255),    
    state varchar(255),
    city varchar(255),
    postcode varchar(6)
);

select * from partner;

# update partner set full_name=?, org_type=?, org_name=?, email=?, mobile=?, resources =?, address= ?, state= ?, city=?, postcode=? where partnerid=?)");

drop table partner;
-- nameprefix,first_name,last_name,org_type,org_name,email,mobile,resources,
-- address1,address2,state,city,postcode)"

ALTER TABLE partner
ADD COLUMN partnerid INT AUTO_INCREMENT PRIMARY KEY;

CREATE TABLE SIGNUP (
    name varchar(255),
    email varchar(255),
    password varchar(255),
    sq varchar(255),
    answer varchar(255),
    status varchar(255)
);

select * from signup;
Select * from partner;
Select * from partner where org_type="" AND org_name like "%rob%"


select * from partner;

insert into partner(nameprefix,first_name,last_name,org_type,org_name,
email,mobile,resources,address1,address2,state,city,postcode)
values('Mr','kmk','kandra','business','wood bridge','woodb@gmail.com','1234123412',
'house trainer','wood bridge','','alpharetta','GA','30005')
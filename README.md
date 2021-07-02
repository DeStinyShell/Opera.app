## **_Description_**

Movie shop is an application to buy tickets on a movie. In this app user can choose an available session for a movie, purchase tickets, make an order. Also, this app has a realization of authentication and authorization, and so app manages access of user to its functional.

## **Roles and available functional**  
At this moment there is a few roles: admin, user and guest.

Guest can register, login, get information about available movies, movie sessions, cinema halls.  

User can have the same access as guest plus get info about his shopping cart, order, buy a tickets and complete his order.  

Admin has all the privileges of user and in addition can get info about user and manage movies, cinema halls, movie sessions, 

## **_Setting_**

To start an app you need to configure file src/main/resources/db.properties fields:

db.driver=YOUR_DRIVER  
db.url=YOUR_URL  
db.username=YOUR_USERNAME  
db.password=YOUR_PASSWORD

## **_Used Technologies:_**

- Spring  
  - MySQL  
  - Hibernate  
  - Apache Maven  
  - Tomcat  
  - JSON  
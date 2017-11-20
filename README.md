## This is the SpringMVCCrud README

This aim of this project was to create a functional CRUD (Create, Retrieve, Update, Destroy) website using Spring MVC and Gradle. In addition to the Spring Framework and Toolsuite and Gradle, I also used HTML and CSS, with limited Bootstrap links/framework for styling.

The challenges of this project included making sure all xml configuration files were properly configured to display the website.  Also, it was challenging moving back and forth between the jsp display files and the controller to make sure what type of data was being passed, stored, checked for error, data type, etc.

Site instructions and intro:

The Shoebox App is a shoe management system for shoe collectors. Collectors can browse their inventory of shoes, adding, and deleting shoes as necessary. Collectors can filter on shoe based on resale price and brand.

Future goals:

Interactive resale price retreival from a retail collector shop like Flightclub or possibly scan Ebay for prices.

Possibly turn it into a type of Social Network site where collectors can have profiles and browse each other's collections, maybe make bids and offers for shoes.

### 11/17/17 Update

We were tasked with updating the project to include a MySQL backend, instead of using a preset list of maps/data in memory.  I began by creating a simple database with one table utilizing mysql workbench.  The table basically mirrored the map from the previous implementation, with each shoe taking an id, brand, style, color, purchase price, resale price, and image url. one "feature" i discovered was that "index" is a reserved word in MySQL, that is, you cannot/should not name a column "index."  It took me about 30 minutes to discover and troubleshoot the problem.  

All the functions from the previous implementation now function with a mysql backend, which was primarily accomplished by swapping out the DAOImpl with a new one based on a database. I also had to make a few changes to the JSP pages.    

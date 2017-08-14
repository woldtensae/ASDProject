We have the following abstract and concrete domain classes

1. ACategory : represents the category of a product in our specific case category represents the name 
	of the class that extends the AProduct class

2. ACredential : is an object that contains the username, password and role of a user, it is created at the time
	of user object creation 
	
3. AProduct : is the super class for all the products if the developer chooses to extend this abstract class all its 
			 fields and methods will be reusable. and for the dynamically created class an object will be created dynamically   			  

4. ARent : represents a transaction by using this abstract class we will have all the functionality a rent object can have like 
			all the CRUD operations and also other queries
			
 	i.e If a developer required to use all the power of the framework, it provides concrete classes with all their
 	implementations 			  
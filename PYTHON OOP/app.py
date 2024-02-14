#Creating class in python
class App:

    #Class Variables
    classVariable = 23
    name = "Vithusan"

    #Creating Constructor
    def __init__(self):
        print("Iam Constructor!")

        #Instance/Object Variables
        self.id = 6089
        self.nic = "123456789"

    """    
    #Print Object Deatils
    def __str__(self):
        return "This is an App object"
    """

    """
        Methods --> Class Methods / Instance Method
    """

    #Class method
    @classmethod
    def classMethod(cls):
        print("This is a class method")
        print(f"Class Variable Value : {cls.classVariable}")

    def instanceMethod(self):
        print("This is a instance method")
        print(f"instance Variable Value : {self.id}")

#Creating Objects to App class
object1 = App()

# print(object1)

#Access instance Variables
print("The value of ID : ", object1.id)

#Access class variables
print("The Value of age is : ", App.classVariable) 

#Call the class Method
App.classMethod()

#Class the instance Method
object1.instanceMethod()
#Creating class in python
class App:

    #Class Variables
    age = 23
    name = "Vithusan"

    #Creating Constructor
    def __init__(self, id, nic):
        #instance Variables
        self.id = id
        self.nic = nic

#Creating Objects to App class
object = App(89, 123456789)
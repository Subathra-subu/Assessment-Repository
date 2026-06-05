class Person: #Base class
    def __init__(self,name,age,email):
        self.name = name
        self.age = age
        self.email = email
    
    def display(self):
        print("Name: ",self.name,"\nAge: ",self.age,"\nEmail: ",self.email)

class Trainee(Person):
    def __init__(self, name, age, email,batch_id,marks,num_projects,num_publications):
        super().__init__(name, age, email)
        self.batch_id = batch_id
        self.marks= marks
        self.num_projects = num_projects
        self.num_publications = num_publications
        self.avg = sum(marks)/len(marks)

    def display(self):
        super().display()
        print("Batch id:",self.batch_id,"\nMarks: ",self.marks,"\nNumber of projects: ",self.num_projects,"\nNUmber of Publications: ",self.num_publications,"\nAverage: ",self.avg)

class SDETTrainee(Trainee):
    def __init__(self, name, age, email, batch_id, marks, num_projects, num_publications,tool_proficiency):
        super().__init__(name, age, email, batch_id, marks, num_projects, num_publications)
        self.tool = tool_proficiency
    
    def compute_aggregate(self):
        print("Aggregate score: ",(self.avg * 0.6) + (self.num_projects * 5) + (self.num_publications * 3))

    def display(self):
        super().display()

name = input("Enter the name of the user:")
age = int(input("Enter your age:"))
email = input("Enter your email:")
batch_id = input("Enter your batch id:")
marks=[]
print("Enter 5 subjects marks:")
for i in range(0,5):
    marks.append(int(input()))
num_projects = int(input("Enter the number of projects you did:"))
num_publications = int(input("Enter the number of publications you completed:"))
tool = input("Enter the tool in which you are proficient:")

sdet = SDETTrainee(name, age, email,batch_id,marks,num_projects,num_publications,tool)
sdet.display()
sdet.compute_aggregate()
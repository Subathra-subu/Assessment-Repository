def max_min(d):

    max_value = max(d.values())
    min_value = min(d.values())
    for i in d:
        if d[i]==max_value:
            print("Maximum:",max_value," ",i)
        elif d[i]==min_value:
            print("Minimum:",min_value," ",i)


def display_count(d):

    sum=0
    dist=[]
    merit=[]
    clear=[]
    fail=[]
    
    for i in d:
        sum+=d[i]
        if d[i] >= 86:
           dist.append(i)
        elif d[i] >= 76:
            merit.append(i)
        elif d[i] >= 60:
            clear.append(i)
        else:
            fail.append(i)

    print("Distinction:",len(dist),dist)
    print("Merit:",len(merit),merit)
    print("Pass:",len(clear),clear)
    print("Fail:",len(fail),fail)

    return dist,sum/len(d)

def average_students(dict,average):
    avg=[]
    for i in dict:
        if(dict[i] < average):
            avg.append(i)
    return avg
            

n = int(input("Enter the number of students:"))

d = {}

for i in range(0,n):
    num = input("Enter the id:")
    mark = int(input("Enter the mark:"))
    d[num]=mark

max_min(d)
dist,average = display_count(d)
print("Class Average:",average)
print("Below Average:",average_students(d,average))
print("-"*3,"Leader Board","-"*3)
print(dist)



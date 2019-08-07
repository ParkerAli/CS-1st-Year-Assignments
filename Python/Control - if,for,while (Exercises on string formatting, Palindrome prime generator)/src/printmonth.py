month=input("Enter the month ('January', ..., 'December'): ")
day = input("Enter the start day ('Monday', ..., 'Sunday'): ")
finish = 31
    
if day == "Monday":
    space =0 
elif day == "Tuesday":
    space =1
elif day == "Wednesday":
    space =2
elif day == "Thursday":
    space =3
elif day == "Friday":
    space =4    
elif day == "Saturday":
    space =5    
elif day == "Sunday":
    space =6    
        
print("{0:>2}".format (month))
print("{0:>2}".format ("Mo Tu We Th Fr Sa Su"))

carry=7-space

if day!="Monday":
    print("{0:>2}".format (space*"   "),end="")
    

for d in range(1,8-space):
    print("{0:>2}".format (d), end=" ")
print()
    
    
        
for i in range (carry+1,finish+1,7):
    for k in range (i, i+7):
        if k > 28 and month== "February":
            break
        elif k>30 and (month== "April" or month == "June" or month == "September" or month == "November"):
            break
        elif k>31 and (month == "January" or month == "December"):
            break        
       
        else:
            print("{0:>2}".format (k), end=" ")
        

    print()

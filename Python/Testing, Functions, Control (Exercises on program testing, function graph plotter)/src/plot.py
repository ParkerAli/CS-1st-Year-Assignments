import math
function = input("Enter a function f(x):\n")
y=11
while y>-10:
    y-=1
    
    x=-11
    while x<10:
        x+=1
        
        if round(eval(function)) == y:
            
            print ("*", end="")
            
        elif x==0 and y==0:
            
            print ("+", end="")
            
        elif y==0:
            
            print ("-", end="")
            
        elif x==0:
            
            print ("|", end="")
            
        else:
            
            print (" ", end="")
            
    print ("")
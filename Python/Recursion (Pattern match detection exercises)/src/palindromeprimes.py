
import sys
sys.setrecursionlimit (30000)

def palindrome(integer):
        integer=str(integer)
        if len(integer) < 2: return True
        if integer[0] != integer[-1]: return False
        return palindrome(integer[1:-1])    
                
def prime(integer,checker=2):
        
        if integer==2:
                return True
        elif integer>2:
                if checker==integer:
                        return True
                else:
                        if integer%checker==0:
                                return False
                        else:
                                return (prime(integer,checker+1))
        else:
                return False
    

    
n= int(input("Enter the starting point N:\n"))
m= int(input("Enter the ending point M:\n"))

print("The palindromic primes are:")

#k=0
#for k in range(n,m):
    #if palindrome(k) and prime(k):
        #print(k)
 
def program(n,m):
        
    if palindrome(n) and prime(n):
        print(n)
    if n!=m:
        return(program((n+1),m))
    else:
        pass
    
    
program(n,m)

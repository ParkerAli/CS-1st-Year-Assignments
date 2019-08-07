def is_prime (number):
    if number==2:
        return True
    
    for i in range(2, number):
        if number%i==0:
            return False
    else:
        return True

def is_palindrome(string):
    if len(string) <= 1:
        return True
    elif string[0] != string[-1]:
        return False
    else:
        return is_palindrome(string[1:-1])
start= eval(input("Enter the start point N:\n"))
stop= eval(input("Enter the end point M:\n"))
palindrome_primes=[]
print("The palindromic primes are:")

for i in range (start+1,stop):
    if is_prime(i)==True and is_palindrome(str(i))==True:
        palindrome_primes.append(i)

for k in range(len(palindrome_primes)):
    print(palindrome_primes[k])


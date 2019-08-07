
import sys
sys.setrecursionlimit (30000)

string= input("Enter a string:\n")
#string=string.split(' 
def palindrome(string):
        if len(string) < 2:
                return True
        if string[0] != string[-1]:
                return False
        return palindrome(string[1:-1])    
 
if palindrome(string):        
        print("Palindrome!")
else: print ("Not a palindrome!")
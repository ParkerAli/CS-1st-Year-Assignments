

a = input('Enter vector A:\n')
b = input('Enter vector B:\n')

A=a.split()
B=b.split()

for i in range (len(A)):
    A[i]=int(A[i])

for i in range (len(B)):
    B[i]=int(B[i])
    
def addition(A,B):
    C= [A[0]+B[0], A[1]+B[1],A[2]+B[2]]
    print("A+B =",C)

def dot_product(A,B):
    C= (A[0]*B[0] + A[1]*B[1] + A[2]*B[2])
    print("A.B =",C)

def norm_a(A):
    c= round((((A[0])**2 + (A[1])**2 + (A[2])**2)**(1/2)),2)
    if c==0:
        print('|','A','|', ' = ','0.00',sep="")  
    else:
        print('|','A','|', ' = ',c,sep="")
    
def norm_b(A):
    C= round((((A[0])**2 + (A[1])**2 + (A[2])**2)**(1/2)),2)
    if C==0:
        print('|','B','|', ' = ','0.00',sep="")  
    else:
        print('|','B','|', ' = ',C,sep="")    


addition(A,B)
dot_product(A,B)
norm_a(A)
norm_b(B)


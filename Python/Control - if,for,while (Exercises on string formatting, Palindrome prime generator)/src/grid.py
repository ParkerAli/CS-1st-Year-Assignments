start =eval(input("Enter the start number: "))

for i in range (start,start+41,7):
    for k in range (i, i+7):
        print("{0:>2}".format (k), end=" ")

    print()


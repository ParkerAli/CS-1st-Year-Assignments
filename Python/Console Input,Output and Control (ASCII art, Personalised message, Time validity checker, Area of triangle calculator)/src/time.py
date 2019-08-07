hours=eval(input("Enter the hours: "))
minutes=eval(input("Enter the minutes: "))
seconds=eval(input("Enter the seconds: "))

if 0<=hours<=23 and 0<=minutes<=59 and 0<=seconds<=59:
    print ("Your time is valid.")
else:
    print("Your time is invalid.")
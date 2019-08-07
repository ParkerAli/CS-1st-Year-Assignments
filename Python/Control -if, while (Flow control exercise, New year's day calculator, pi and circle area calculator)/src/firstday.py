first_year = eval(input("Enter the first year:\n"))

second_year = eval(input("Enter the second year:\n"))

def first_day(year):
    day= (1+5*((year-1)%4) + 4*((year-1)%100) + 6*((year-1)%400) )%7
    if day == 1:
        print("The 1st of January", year,"falls on a Monday.")
    elif day == 2:
        print("The 1st of January", year,"falls on a Tuesday.")
    elif day == 3:
        print("The 1st of January", year,"falls on a Wednesday.")
    elif day == 4:
        print("The 1st of January", year,"falls on a Thursday.")
    elif day == 5:
        print("The 1st of January", year,"falls on a Friday.")
    elif day == 6:
        print("The 1st of January", year,"falls on a Saturday.")
    else:
        print("The 1st of January", year,"falls on a Sunday.")
    
for i in range(first_year,second_year+1):
    first_day(i)
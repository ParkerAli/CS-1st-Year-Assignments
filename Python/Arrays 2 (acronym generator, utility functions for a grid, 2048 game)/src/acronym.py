ignore = (input("Enter words to be ignored separated by commas:\n"))
ignore_fix = ignore.split(", ")

title=(input("Enter a title to generate its acronym:\n"))

title_fix= title.split(" ")
final = ''
n=0

while n<(len(ignore_fix)):
     ignore_fix[n] = ignore_fix[n].lower()
     n+=1

if title_fix == []:
     
     title.replace(ignore_fix, '')
     final = title.upper()

else:
     
     for k in title_fix:
          if k.lower() in ignore_fix:  
               pass
          else: 
               final += k[0].upper()

print('The acronym is:', final)


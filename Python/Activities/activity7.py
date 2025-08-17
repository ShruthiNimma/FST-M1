
#2.Method 2:Enter list of numbers and then sum

numberlist = (input("enter a sequence of numbers seperated by comma:").split(","))

sum =0
for number in numberlist:
    sum += int(number)
#print the sum of the numberlist
print("sum of the list is:" ,sum)


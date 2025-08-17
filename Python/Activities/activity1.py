name = input("what is your name?")
age = int(input("what is your age?"))

#turning_100 = 2025+(100-age)

#Method 1:
#print("You are turning 100 years old in "+ str(turning_100))

#Method 2:
#print("You are turning 100 years old in {}".format(turning_100))

#Method 3:
turning_100 = str(2025+(100-age))
print(name + " will turn 100 years old in "+turning_100)


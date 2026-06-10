from random import randint as rand

# if i have 10 people in a room, what is the likelihood
# that at least two of them share a bday?

# LOOP
#   1. generate 10 birthdays (def generate_birthdays(10)...)
#   1.1: ...
#   1.2: ...

#   2. check if anybody shares a birthday

#   3. count how many times there is a match

# (end loop) 

# do some math to calculate the probability

def generate_birthdays(people: int=1):
    listOfBirthdays: list = []
    
    for i in range(0, people+1):
        month: int = rand(1, 12)
        day: int
        birthday: list = []
        
        match month:
            case 1 | 3 | 5 | 7 | 8 | 10 | 12: # January, March, May, July, August, October, December
                day = rand(1, 31)
            case 2: # February
                day = rand(1, 28)
            case 4 | 6 | 9 | 11: # April, June, September, November
                day = rand(1, 30)
        
        birthday.append(month)
        birthday.append(day)
        
        listOfBirthdays.append(birthday)
    
    return listOfBirthdays
    
def duplicate_birthday_checker(listOfBirthdays: list=[]):
    tempMonth: int
    tempDay: int
    duplicateCount: int = 0
    
    for i in range(0, len(listOfBirthdays)):
        tempMonth = listOfBirthdays[i][0]
        tempDay = listOfBirthdays[i][1]
        
        for i in range(i+1, (len(listOfBirthdays))):
            if (listOfBirthdays[i][0] == tempMonth) and (listOfBirthdays[i][1] == tempDay):
                duplicateCount+=1
    
    return duplicateCount
            

def main():
    continueLoop: bool = True
    validation: int = 1 # 0 is true, 1 is false
    
    while continueLoop:
        validation = 1
        birthdayList: list = generate_birthdays(10)
        duplicateBirthdays: int = duplicate_birthday_checker(birthdayList)
    
        print(birthdayList)
        print(f"Duplicate birthdays count: {duplicateBirthdays} birthdays are duplicates")
        while validation == 1:
            checker: str = input("Would you like to loop again? (y/n)\n> ")
            checker.lower()
        
            if (checker == "y"):
                validation = 0
                continueLoop = True
            elif (checker == "n"):
                validation = 0
                continueLoop = False
            else:
                print("Not a valid input.")
                validation = 1
    return
        
main()


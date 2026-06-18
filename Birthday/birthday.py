from random import randint as rand
import matplotlib.pyplot as pypl

def generate_birthdays(people: int=1) -> list:
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
    
def duplicate_birthday_checker(listOfBirthdays: list=[]) -> int:
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
            
def run(people: int=2, trials: int=1) -> float:
    matches: int = 0

    for i in range(trials):
        birthdays = generate_birthdays(people)

        if (duplicate_birthday_checker(birthdays) != 0):
            matches += 1

    return matches / trials

def create_y_points(results: float=1, points: list=[]) -> list:
    points.append(results)

    return points

def generate_graph(x_points: list=[], y_points: list=[]) -> None:
    pypl.plot(x_points, y_points)

    return pypl.show()

def main() -> None:
    groups_of_people: list = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
    results: list = []

    for i in groups_of_people:
        simulationResults: float = run(i, 1000)
        create_y_points(simulationResults, results)
        
    generate_graph(groups_of_people, results)

    return

main()

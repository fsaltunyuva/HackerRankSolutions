if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())

    listOfLists = []

    for i in range(z + 1):
        for j in range(y + 1):
            for t in range(x + 1):
                temp = [t, j, i]
                listOfLists.append(temp)

    summation = 0
    result = []

    for i in listOfLists:
        for b in i:
            summation += b
        if summation != n:
            result.append(i)
        summation = 0
        stringSum = ""

sorted_list = sorted(result)

print(sorted_list)

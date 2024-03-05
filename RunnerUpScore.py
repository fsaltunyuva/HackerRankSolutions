if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

newlist = list(arr)

newlist.sort()

maxvalue = max(newlist)

index = -2

if maxvalue != newlist[index]:
    print(newlist[index])
else:
    while newlist[index] == maxvalue:
        index -= 1
    print(newlist[index])

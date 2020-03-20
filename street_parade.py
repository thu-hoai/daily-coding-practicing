
MAX = 1005
stack = [0] * MAX
# The first solution
while True:
    n = int(input())
    if n == 0:
        break
    cars = list(map(int, input().split()))

    k = 0
    check = 1
    start = 1

    for i in range(n):
        while (k > 0 and stack[k - 1] == start):
            k -= 1
            start += 1

        if cars[i] == start :
            start += 1
        elif k > 0 and stack[k - 1] < cars[i]:
            check = 0
            break
        else:
            stack[k] = cars[i]
            k += 1
    if check == 1:
        print("yes")
    else:
        print("no")

stack = []
while True:
    n = int(input())
    if n == 0:
        break
    cars = list(map(int, input().split()))

    count = 1
    k = -1
    flag = 1

    for i in range(n):
        if cars[i] == count:
            count += 1
        # elif k > 0 and len(stack) > 1 and stack[k] > stack[k-1]:
        elif k > 0 and len(stack) > 1 and stack[k] < cars[i]:
            flag = 0
            break
        else:
            if k > 0:
                while stack[k] == count:
                    stack.pop()
                    count += 1
                    k -= 1
            stack.append(cars[i])
            k += 1

    if flag == 0:
        print("no")
    else:
        print("yes")
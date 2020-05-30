
# https://codeforces.com/problemset/problem/6/C
# Time complexity O(n)
if __name__ == "__main__":
    n = int(input())
    bars = list(map(int, input().split()))

    a_index = 0
    b_index = n - 1
    a_duration = 0
    b_duration = 0

    while a_index <= b_index:
        if a_duration + bars[a_index] <= b_duration + bars[b_index]:
            a_duration += bars[a_index]
            a_index += 1
        else:
            b_duration += bars[b_index]
            b_index -= 1

    print(a_index, n - a_index)

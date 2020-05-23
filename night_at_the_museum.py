#!/usr/bin/env python
# https://codeforces.com/problemset/problem/731/A

def calculate_rotations_number(string):
    string = 'a' + string
    total = 0
    for i in range(len(string)-1):
        num = abs(ord(string[i+1]) - ord(string[i]))
        if num < 13:
            total += num
        else:
            total += (26 - num)
    return total

if __name__ == "__main__":
    string = input()
    print(calculate_rotations_number(string))
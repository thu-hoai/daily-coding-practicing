#!/usr/bin/env python3
# https://codeforces.com/contest/721/problem/B
# Time complexity: O(n + len(n))
if __name__ == "__main__":
    n, k = map(int, input().split())
    password_list = [input() for i in range(n)]
    correct_password = input()

    count1 = 0
    count2 = 0
    for password in password_list:
        if len(password) < len(correct_password):
            count1 += 1
        if len(password) <= len(correct_password):
            count2 += 1
    best_case = count1 + (count1//k)*5 + 1
    worst_case = count2 + ((count2-1)//k)*5

    print(best_case, worst_case)

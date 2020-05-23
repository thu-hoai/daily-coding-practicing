#!/usr/bin/env python3
# https://codeforces.com/problemset/problem/691/A
# Complexity: O(n)


def is_fastened_right_way(button_list):
    len_list = len(button_list)
    if len_list == 1:
        if button_list[0]:
            return True
        else:
            return False
    else:
        count = 0
        for button in button_list:
            if button == 0:
                count += 1
            if count > 1:
                return False
        else:
            if count == 0:
                return False
            return True


if __name__ == "__main__":
    n = int(input())
    button_list = list(map(int, input().split()))
    if is_fastened_right_way(button_list):
        print("YES")
    else:
        print("NO")

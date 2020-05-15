#!/usr/bin/env python3

# https://codeforces.com/problemset/problem/381/A

# Time complexity: O(n) (n is the number of cards on the table)


def calculate_points(cards_list):
    sereja_points = 0
    dima_points = 0

    # 2 pointers representing to Sereja and Dima
    i = 0
    j = len(cards_list) - 1

    index = 0
    while i <= j:
        index += 1
        if index % 2 == 1:
            if cards_list[i] >= cards_list[j]:
                sereja_points += cards_list[i]
                i += 1

            else:
                sereja_points += cards_list[j]
                j -= 1

        else:
            if cards_list[i] >= cards_list[j]:
                dima_points += cards_list[i]
                i += 1
            else:
                dima_points += cards_list[j]

                j -= 1

    return sereja_points, dima_points


if __name__ == "__main__":
    # Handle input
    cards_total = int(input())
    cards_list = list(map(int, input().split()))
    per1, per2 = calculate_points(cards_list)
    print(per1, per2)

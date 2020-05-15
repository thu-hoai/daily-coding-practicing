#!/usr/bin/env python3

# https://codeforces.com/problemset/problem/381/A

# Time complexity: O(n) (n is the number of cards on the table)


def calculate_points(cards_list):
    # Initialize a list of points of 2 players
    points = [0, 0]

    # 2 pointers representing to the index leftmost card in a row,
    # or the rightmost.
    i = 0
    j = len(cards_list) - 1

    # The player takes turns
    player = 0

    while i <= j:
        if cards_list[i] >= cards_list[j]:
            points[player] += cards_list[i]
            i += 1
        else:
            points[player] += cards_list[j]
            j -= 1

        player = 1 - player

    return points[0], points[1]


if __name__ == "__main__":
    # Handle input
    cards_total = int(input())
    cards_list = list(map(int, input().split()))
    player1, player2 = calculate_points(cards_list)
    print(player1, player2)

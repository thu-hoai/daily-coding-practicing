#!/usr/bin/env python3
# https://codeforces.com/problemset/problem/242/B
# Time complexity: O(3*n)

def calculate_number_cover_segments(segments):
    second_elements = [segments[i][1] for i in range(len(segments))]
    first_elements = [segments[i][0] for i in range(len(segments))]

    max_ = max(second_elements)
    min_ = min(first_elements)

    result = [
        i + 1 for i in range(len(segments)) if second_elements[i] == max_
        and first_elements[i] == min_]
    return result[0] if result else -1


if __name__ == "__main__":
    n = int(input())
    segments = [list(map(int, input().split())) for _ in range(n)]
    print(calculate_number_cover_segments(segments))

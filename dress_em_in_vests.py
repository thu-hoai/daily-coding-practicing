#!/usr/bin/env python3

# https://codeforces.com/problemset/problem/161/A
def find_fit_sizes(desired_sizes, available_sizes):
    k = 0
    j, i = 0, 0
    pair_list = []
    while j < len(available_sizes) and i < len(desired_sizes):
        available_size = available_sizes[j]
        desired_size = desired_sizes[i]
        if desired_size - a <= available_size <= desired_size + b:
            i += 1
            j += 1
            k += 1
            pair_list.append((i, j))
        elif available_size < desired_size - a:
            j += 1
        elif available_size > desired_size + b:
            i += 1
    return k, pair_list

if __name__ == "__main__":
    # Handle input
    m, n, a, b = map(int, input().split())
    desired_sizes = list(map(int, input().split()))
    available_sizes = list(map(int, input().split()))
    k, pair_list = find_fit_sizes(desired_sizes, available_sizes)
    print(k)
    for pair in pair_list:
        print(pair[0], pair[1])

#!/usr/bin/env python3

# https://codeforces.com/problemset/problem/161/A
# Time complexity:  O(max(n, m))


def find_fit_sizes(desired_sizes, available_sizes):
    # the maximum number of soldiers equipped with bulletproof vests
    soliders_count = 0
    j, i = 0, 0
    # store index (i, j) where the solider fits the available vest
    pair_list = []
    while j < len(available_sizes) and i < len(desired_sizes):
        available_size = available_sizes[j]
        desired_size = desired_sizes[i]
        if desired_size - a <= available_size <= desired_size + b:
            i += 1
            j += 1
            soliders_count += 1
            pair_list.append((i, j))
        elif available_size < desired_size - a:
            j += 1
        elif available_size > desired_size + b:
            i += 1
    return soliders_count, pair_list


if __name__ == "__main__":
    # Handle input
    # m, n, a, b: the number of soldiers, the number of vests
    # and two numbers that specify the soldiers' unpretentiousness, correspondingly.
    m, n, a, b = map(int, input().split())
    desired_sizes = list(map(int, input().split()))
    available_sizes = list(map(int, input().split()))
    soliders_count, pair_list = find_fit_sizes(desired_sizes, available_sizes)
    # Print output
    print(soliders_count)
    for pair in pair_list:
        print(pair[0], pair[1])

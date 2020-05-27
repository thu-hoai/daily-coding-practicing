#!/usr/bin/env python3
# https://codeforces.com/problemset/problem/572/A

def is_listA_less_than_listB(listA, listB, k, m):
    if listA[k-1] < listB[len(listB)-m]:
        return 'YES'
    return 'NO'

if __name__ == "__main__":
    na, nb = map(int, input().split())
    k, m = map(int, input().split())
    listA = list(map(int, input().split()))
    listB = list(map(int, input().split()))
    print(is_listA_less_than_listB(listA, listB, k, m))



#!/usr/bin/env python3
# https://codeforces.com/problemset/problem/439/B
# Complexity: O(n)

def calculate_learning_time(n, x, subjects):
    subjects.sort()
    total = 0
    for subject in subjects:
        total += subject*x
        if x - 1 > 0:
            x -= 1
    return total


if __name__ == '__main__':
    n, x = map(int, input().split())
    subjects = list(map(int, input().split()))
    print(calculate_learning_time(n, x, subjects))

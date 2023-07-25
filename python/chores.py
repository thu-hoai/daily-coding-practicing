
# http://209.97.167.211/cfp.jsp?id=R169A


def find_suitable_complexity(n, a, b, chore_complexity):
    chore_complexity.sort(reverse=True)
    if chore_complexity[a - 1] > chore_complexity[a]:
        return chore_complexity[a - 1] - chore_complexity[a]
    else:
        return 0


if __name__ == '__main__':
    n, a, b = map(int, input().split())
    chore_complexity = list(map(int, input().split()))
    print(find_suitable_complexity(n, a, b, chore_complexity))

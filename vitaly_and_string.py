#!/usr/bin/env python3

# https://codeforces.com/problemset/problem/518/A
# A. Vitaly and Strings


def find_lexicographically_string(str1, str2):
    i = len(str1)
    flexicographical_than_str1 = ''
    while i > 0:
        i -= 1
        if str1[i] == 'z':
            char = 'a'
            flexicographical_than_str1 += char
        else:
            char = chr(ord(str1[i]) + 1)
            flexicographical_than_str1 += char
            break

    result = str1[:i] + flexicographical_than_str1[::-1]
    if result == str2:
        return "No such string"
    return result


if __name__ == "__main__":
    string1 = input()
    string2 = input()
    print(find_lexicographically_string(string1, string2))

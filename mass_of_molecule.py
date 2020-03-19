# # Mass of Molecule
# https://www.spoj.com/problems/MMASS/

# Method 1
formula = list(input())
mass_of_atom = {"C": 12, "O": 16, "H": 1}

stack = []

for ele in formula:
    if ele == "(":
        stack.append(-1)
    elif ele in mass_of_atom:
        stack.append(mass_of_atom[ele])
    elif ele.isnumeric():
        x = stack[-1] * int(ele)
        stack.pop()
        stack.append(x)
    elif ele == ")":
        temp_sum = 0
        while True:
            if stack[-1] == -1:
                stack.pop()
                stack.append(temp_sum)
                break
            else:
                temp_sum += stack[-1]
                stack.pop()
    else:
        raise ValueError()
print(sum(stack))

# Method 2
import re

atomic_mass = {"C": 12, "O": 16, "H": 1}
formula = "CH(CO2H)3"
tokens = re.findall(r'[A-Z][a-z]*|\d+|\(|\)', formula)

tokens = list(formula)

def find_closing_paren(tokens):
    count = 0
    for index, tok in enumerate(tokens):
        if tok == ')':
            count -= 1
            if count == 0:
                return index
        elif tok == '(':
            count += 1
    raise ValueError('unmatched parentheses')

def parse(tokens, stack):
    if len(tokens) == 0:
        return sum(stack)

    tok = tokens[0]

    if tok == '(':
        end = find_closing_paren(tokens)
        stack.append(parse(tokens[1:end], []))
        return parse(tokens[end + 1:], stack)

    elif tok.isdigit():
        stack[-1] *= int(tok)

    else:
        stack.append(atomic_mass[tok])
    return parse(tokens[1:], stack)

print(parse(tokens, []))
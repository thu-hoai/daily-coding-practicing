# Daily Coding Practicing

Self-Improving my Algorithmic coding skills.


- Mar 19: [Day 2: Mass of Molecule](##Day-2:-Mass-of-Molecule)
- Mar 18: [Day 1: Transform the Expression](##Day-1:-Transform-the-Expression)


## Day 2: Mass of Molecule

_[Stack and Queue ](https://www.spoj.com/problems/MMASS/)_

A molecule can be defined as a sequence of atoms and represented by a chemical formula consisting of letters denoting these atoms. E.g. letter H denotes atom of hydrogen, C denotes atom of carbon, O denotes atom of oxygen, formula COOH represents molecule consisting of one atom of carbon, two atoms of oxygen and one atom of hydrogen.

To write some formulas efficiently, we use the following rules. Letters denoting some atoms can be grouped by enclosing in parentheses, e.g. formula CH(OH) contains group OH. Groups can be nested – a group can also contain other groups. To simplify a formula, consecutive occurrences of the same letter can be replaced with that letter followed by a number of these occurrences. E.g. formula COOHHH can be written as CO2H3 and it represents a molecule consisting of one atom of carbon, two atoms of oxygen and three atoms of hydrogen. Furthermore, consecutive occurrences of the same group can be replaced with that group followed by a number of these occurrences. E.g. formula CH (CO2H) (CO2H) (CO2H) can be written as CH(CO2H)3 and molecule represented by both those formulas consists of four atoms of carbon, four atoms of hydrogen and six atoms of oxygen. A number written after a letter or a group is always greater than or equal to 2 and less than or equal to 9. A mass of a molecule is a sum of masses of all its atoms. One atom of hydrogen has mass 1, one atom of carbon has mass 12 and one atom of oxygen has mass 16.

Write a program that will calculate a mass of a molecule.

Input
```
The first and only line of input file contains a formula of a molecule whose mass needs to be determined. A formula of a molecule will consist of characters H, C, O, (, ) , 2, 3, ..., 9 only. Its length will be less or equal to 100 characters.
```

Output
```
The first and only line of output file should contain a mass of a molecule represented with a given formula. The result will always be less than or equal to 10,000.
```

For Example
```
COOH --> 45
CH(CO2H)3 --> 148
((CH)2(OH2H)(C(H))O)3 --> 222

```


## Day 1: Transform the Expression

[_Stack and Queue_](https://www.spoj.com/problems/ONP/)

Transform the algebraic expression with brackets into RPN form (Reverse Polish Notation). Two-argument operators: +, -, *, /, ^  (priority from the lowest to the highest), brackets ().
Operands: only letters: a,b,...,z. Assume that there is only one RPN form (no expressions like a*b*c).

Input
```
t [the number of expressions <= 100]
expression [length <= 400]
[other expressions]
```
Text grouped in [ ] does not appear in the input file.

Output
```
The expressions in RPN form, one per line.
```

Example
```
Input:
3
(a+(b*c))
((a+b)*(z+x))
((a+t)*((b+(a+c))^(c+d)))

Output:
abc*+
ab+zx+*
at+bac++cd+^*
```


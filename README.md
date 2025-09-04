# FishAppMenu
An App instance

Goal

Create one menu-driven console app that performs these tasks:

Profile check (Strings): initial, uppercase full name, length
Gross pay (with overtime)
Checkout (sales tax 7%)
Sphere calculator (volume using Math.PI/Math.pow)
MPG with divide-by-zero guard
Program Specification

Complete all modules below in one run of the same program.

1) App header & constants

Top-of-file comment: /** Lab01 – Campus Utilities Suite (author, date) */
Define constants: TAX_RATE = 0.07; BOILING_F = 212; SCORE1 = 100; SCORE2 = 95; NUMBER = 2
Use constants.
2) Main Menu (loop until Exit)

== CS358 Utilities ==

1) Profile (Strings)

2) Gross Pay (overtime)

3) Checkout (Sales Tax 7%)

4) Sphere Calculator (volume)

5) MPG (guard gallons==0)

0) Exit

Choose: _

3) Profile (Strings + constants)

Prompt: first name (line), last name (line).
Output: Initial, FULL NAME, and length.
Compute & print:
average of SCORE1 & SCORE2 (expect 97.5)
BOILING_F → °C as 100 (rounded).
4) Gross Pay (with overtime)

Input: hours (double), rate (double).
Rule: ≤40 → hours×rate; else 40×rate + (hours−40)×1.5×rate.
Output: You earned $<pay> with two decimals.
5) Checkout (Sales Tax)

Input: item name (line), price (double).
Compute: tax = price × 0.07; total = price + tax.
Output both with two decimals (labels required).
6) Sphere Calculator (volume)

Input: diameter (double). Compute radius = diameter / 2.0.
V = (4.0/3.0) × π × r^3 via Math.PI & Math.pow.
Print raw result and a formatted line with %.5f.
7) MPG (guard clause)

Input: miles (double), gallons (double).
If gallons == 0: print friendly error; do not divide.
Else: print MPG, formatted to two decimals.
General Requirements

Use Scanner; when mixing nextDouble() and nextLine(), consume the newline.
Label outputs; for money/precision, prefer printf.
Guard invalid states (e.g., zero gallons).
Acceptance & Grading

Menu loops until 0; invalid choices handled gracefully.
Strings: initial, uppercase full name, length correct; avg = 97.5; celsius = 100.
Gross Pay: 40@10 → 400.00, 30@10 → 300.00, 45@10 → 475.00.
Sales Tax: 100.00 → tax = 0.07, total = 107.00 (two decimals).
Sphere: d = 2 → ~4.18879; d = 25.4 → ~8580.24665.
MPG: 100/0 triggers friendly error; 241.5/10 → 24.15 (two decimals).
Clean output and reasonable naming.
What to Submit: In a .txt file

Repo name: RepoName
Tag: Week3-Lab1.

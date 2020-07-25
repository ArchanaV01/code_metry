# nthPowerfulNumber(n) [20 pts]
# Write the function nthPowerfulNumber(n). See here for details. So nthPowerfulNumber(0) returns
# 1, and nthPowerfulNumber(10) returns 64.
# A number n is said to be Powerful Number if for every prime factor p of it, p2 also divides it.
# For example:- 36 is a powerful number. It is divisible by both 3 and square of 3 i.e, 9.
import math
pow_numbs = []


def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True


def is_powerful_number(n):
    i = 2
    while n > 0 and i <= n:
        # print(n, i, end='  ')
        if isPrime(i) and n % i == 0:
            if n % (i**2) == 0:
                n //= (i**2)
                i = 2
            else:
                return False
        else:
            i += 1
    return True


def nthpowerfulnumber(n):
        # Your code goes here
    print(pow_numbs)
    if (n < len(pow_numbs)):
        return pow_numbs[n]
    numb = 1
    counter = 0
    while True:
        if is_powerful_number(numb):
            pow_numbs.append(numb)
            if counter == n:
                return numb
            counter += 1
        numb += 1

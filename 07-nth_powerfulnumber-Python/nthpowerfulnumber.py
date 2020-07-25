# nthPowerfulNumber(n) [20 pts]
# Write the function nthPowerfulNumber(n). See here for details. So nthPowerfulNumber(0) returns
# 1, and nthPowerfulNumber(10) returns 64.
# A number n is said to be Powerful Number if for every prime factor p of it, p2 also divides it.
# For example:- 36 is a powerful number. It is divisible by both 3 and square of 3 i.e, 9.


def is_powerful_number(n):
    i = 2
    prev = -1
    while n > 0:
        if n % i == 0:
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
    numb = 1
    counter = 0
    while True:
        if is_powerful_number(numb):
            if counter == n:
                return numb
            counter += 1
        numb += 1

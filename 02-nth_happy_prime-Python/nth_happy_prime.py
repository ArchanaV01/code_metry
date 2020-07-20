# A happy prime is a number that is both happy and prime.
# Write the function nthHappyPrime(n) which takes a non-negative integer
# and returns the nth happy prime number (where the 0th happy prime number is 7).
import math
numbs = []


def ishappynumber(n):
    global numbs
    if n < 1:
        return False
    elif n == 1:
        numbs = []
        return True
    else:
        sumDigits = 0
        while (n > 0):
            sumDigits += (n % 10)**2
            n //= 10
        if sumDigits in numbs:
            numbs = []
            return False
        else:
            numbs.append(sumDigits)
            return ishappynumber(sumDigits)


def isPrime(n):
    for i in range(2, int(math.sqrt(n))):
        if n % i == 0:
            return False
    return True


def fun_nth_happy_prime(n):
    counter = 0
    numb = 1
    happy_numb = 0
    while counter <= n:
        if ishappynumber(numb) and isPrime(numb):
            counter += 1
            happy_numb = numb
        numb += 1
    return happy_numb

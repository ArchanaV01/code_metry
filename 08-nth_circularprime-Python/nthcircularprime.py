# nthCircularPrime(n) [20 pts]
# Write the function nthCircularPrime that takes a non-negative int n and returns the nth
# Circular prime, which is a prime number that does not contain any 0's and such that all the
# numbers resulting from rotating its digits are also prime. The first Circular primes are 2, 3,
# 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131, 197... To see why 197 is a Circular prime,
# note that 197 is prime, as is 971 (rotated left), as is 719 (rotated left again).
import math


def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True


def formNumb(lis, lis2):
    numb = 0
    for each in lis:
        numb = numb*10 + each
    for each in lis2:
        numb = numb*10 + each
    return numb


def circularNumbers(n):
    cir_numb = []
    numb = n
    digits = []
    while numb > 0:
        digits.append(numb % 10)
        if numb % 10 == 0:
            return None
        numb //= 10
    # print(n, digits, end=' ')
    for i in range(0, len(digits)):
        cir_numb.append(formNumb(digits[i:], digits[:i]))
    # print(cir_numb)
    return cir_numb


def isCircularPrime(n):

    rotated_numbs = circularNumbers(n)
    if not rotated_numbs:
        return False
    else:
        for each in rotated_numbs:
            if not isPrime(each):
                return False
        return True


def nthcircularprime(n):
    # Your code goes here
    if n == 1:
        return 2
    numb = 3
    counter = 2
    while True:
        if isCircularPrime(numb):
            print((counter, numb), end=", ")
            if counter == n:
                return numb
            counter += 1
        numb += 2

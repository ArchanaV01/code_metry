# Write the function hasnoprimes(L) that takes a 2d list L of integers,
# and returns True if L does not contain any primes, and False otherwise.
import math


def isPrime(n):
    if n <= 1:
        return False
    else:
        for each in range(2, math.sqrt(n) + 1):
            if not each % n:
                return False
        return True


def fun_hasnoprimes(l):
    for each in l:
        for each1 in each:
            if isPrime(each1):
                return False
    return True

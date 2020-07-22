# Write the function fun_nth_additive_prime(n) that takes a non-negative int n
# and returns the nth Additive Prime, which is a prime number such that
# the sum of its digits is also prime. For example, 113 is prime and 1+1+3==5 and 5
# is also prime, so 113 is an Additive Prime. fun_nth_additive_prime(0) returns 2
import math


def isPrime(n):
    for i in range(2, int(math.sqrt(n))):
        if n % i == 0:
            return False
    return True


def isAdditivePrime(n):
    if not isPrime(n):
        return False
    else:
        sumDig = 0
        while n > 0:
            sumDig += n % 10
            n //= 10
        print(n, sumDig)
        if isPrime(sumDig):
            return True
        else:
            return False


def fun_nth_additive_prime(n):
    if n == 0:
        return 2
    counter = 1
    numb = 3
    while counter < n:
        if isAdditivePrime(numb):
            counter += 1
            numb += 2
    return numb

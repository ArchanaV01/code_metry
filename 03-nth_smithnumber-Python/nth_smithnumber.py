# Write the function nthSmithNumber that takes a non-negative int n
# and returns the nth Smith number, where a Smith number is a composite (non-prime)
# the sum of whose digits are the sum of the digits of its prime factors (excluding 1).
# Note that if a prime number divides the Smith number multiple times, its digit sum
# is counted that many times. For example, 4 equals 2**2, so the prime factor 2 is
# counted twice, thus making 4 a Smith Number.
# so fun_nthsmithnumber(0) should return 4
# so fun_nthsmithnumber(1) should return 22
import math


def isPrime(n):
    if n == 2:
        return True
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True


def find_sum(n):
    val = 0
    while n > 0:
        val += n % 10
        n //= 10
    return val


def isSchmidt(n):
    if isPrime(n):
        return False
    else:
        # print(n)
        sum_digits = find_sum(n)
        sum_factors_digits = 0
        for i in range(2, math.sqrt(n) + 1):
            if n % i == 0 and isPrime(i):
                sum_factors_digits += find_sum(i) + find_sum(n/i)
        print(n, sum_factors_digits)
        if sum_digits != sum_factors_digits:
            return False
        else:
            return True


def fun_nth_smithnumber(n):
    counter = 0
    numb = 4
    while True:
        if isSchmidt(numb):
            print(numb)
            if counter >= n:
                return numb
            counter += 1
        numb += 1

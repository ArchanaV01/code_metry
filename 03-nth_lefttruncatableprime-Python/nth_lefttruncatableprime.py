# Write the function nthLeftTruncatablePrime(n).
# A Left-truncatable prime is a prime which in a given base (say 10) does not contain 0
# and which remains prime when the leading (left) digit is successively removed.
# For example, 317 is left-truncatable prime since 317, 17 and 7 are all prime.
# There are total 4260 left-truncatable primes.
# So nthLeftTruncatablePrime(0) retunearestKaprekarNumber(n)rns 2, and
# nthLeftTruncatablePrime(10) returns 53.
import math


def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True


def form_numb(lis):
    numb = 0
    for each in lis:
        numb = numb*10 + each
    return numb


def isltp(n):
    digits = []
    length = 0
    while n > 0:
        length += 1
        digits.append(n % 10)
        n //= 10
    digits = digits[::-1]
    for i in range(length):
        if form_numb(digits[i:]) != 0:
            sum_numb = form_numb(digits[:i]) + form_numb(digits[i:])
            if sum_numb == n:
                print(form_numb(digits[:i]), form_numb(digits[i:]))
                print(digits)
                return True
    return False


def fun_nth_kaprekarnumber(n):
    numb = 1
    counter = 0
    while True:
        if isKaprekar(numb):
            print(numb)
            if counter == n:
                return numb
            counter += 1
        numb += 1


def fun_nth_lefttruncatableprime(n):
    return 1

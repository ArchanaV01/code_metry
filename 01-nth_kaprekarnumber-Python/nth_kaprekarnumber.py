# Background: a Kaprekar number is a non-negative integer, the representation of whose square
# can be split into two possibly-different-length parts (where the right part is not zero)
# that add up to the original number again. For instance, 45 is a Kaprekar number, because
# 45**2 = 2025 and 20+25 = 45. You can read more about Kaprekar numbers here. The first several
# Kaprekar numbers are: 1, 9, 45, 55, 99, 297, 703, 999 , 2223, 2728,...
# With this in mind, write the function nthKaprekarNumber(n) that takes a non-negative int n
# and returns the nth Kaprekar number, where as usual we start counting at n==0.
import math


def form_numb(lis):
    numb = 0
    for each in lis:
        numb = numb*10 + each
    return numb


def isKaprekar(n):
    sqr = n**2
    digits = []
    length = 0
    while sqr > 0:
        length += 1
        digits.append(sqr % 10)
        sqr //= 10
    # print(n, end='  ')
    for i in range(length):
        sum_numb = form_numb(digits[:i]) + form_numb(digits[i:])
        if sum_numb == n:
            print(form_numb(digits[:i]), form_numb(digits[i:]))
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

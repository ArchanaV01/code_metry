# nthLychrelNumber(n) [20 pts]
# A Lychrel number is a natural number that cannot form a palindrome through the iterative process of
# repeatedly reversing its digits and adding the resulting numbers. This process is sometimes called the
# 196-algorithm, after the most famous number associated with the process.
# The first few Lychrel numbers are 196, 295, 394, 493, 592, 689, 691, 788, 790, 879, 887….
MAX_ITERATIONS = 40


def reverse(numb):
    rev = 0
    while numb > 0:
        rev = rev*10 + numb % 10
        numb //= 10
    return rev


def isPalindrome(n):
    digits = []
    length = 0
    while n > 0:
        digits.append(n % 10)
        n //= 10
        length += 1
    i = 0
    while i < length//2:
        if digits[i] == digits[length - i - 1]:
            i += 1
        else:
            return False
    return True


def is_lychrel_number(n):
    if n < 1:
        return False
    for i in range(MAX_ITERATIONS):
        n = n + reverse(n)
        if isPalindrome(n):
            return False
    return True


def nthlychrelnumbers(n):
    numb = 196
    counter = 1
    while True:
        if is_lychrel_number(numb):
            if counter == n:
                return numb
            counter += 1
        numb += 1

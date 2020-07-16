# hasConsecutiveDigits(n)  [10pts]
# Write the function hasConsecutiveDigits(n) that takes a possibly negative int value n and returns True if that
# number contains two consecutive digits that are the same, and False otherwise.


def hasconsecutivedigits(n):
    if n < 0:
        n *= -1
    prev = -1
    while (n > 0):
        if (abs(prev - n % 10) == 1):
            return True
        prev = n % 10
        n //= 10
    return False

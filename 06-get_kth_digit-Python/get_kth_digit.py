# Write the function getKthDigit(n, k) that takes
# a possibly-negative int n and a non-negative int k,
# and returns the kth digit of n, starting from 0, counting from the right.
# if the kth digit is not present return 0


def fun_get_kth_digit(digit, k):
    counter = 0
    if (digit < 0):
        digit *= -1
    while (digit > 0):
        if counter == k:
            return digit % 10
        digit //= 10
        counter += 1
    return 0

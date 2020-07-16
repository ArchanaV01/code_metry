# mostFrequentDigit(n) [10pts]
# Write the function mostFrequentDigit(n), that takes a non-negative integer n and returns the digit from 0 to 9
# that occurs most frequently in it, with ties going to the smaller digit.


def mostfrequentdigit(n):
    # your code goes here
    if n == 0:
        return 0
    digitCount = {}
    while n > 0:
        digit = n % 10
        if digit in digitCount:
            digitCount[digit] = digitCount[digit] + 1
        else:
            digitCount[digit] = 1
        n //= 10
    maxCount = 0
    maxDigit = []
    for each in digitCount:
        if digitCount[each] > maxCount:
            maxDigit = [each]
            maxCount = digitCount[each]
        elif digitCount[each] == maxCount:
            maxDigit.append(each)
    return min(maxDigit)

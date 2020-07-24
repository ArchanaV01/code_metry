# Note: please do not start this problem prior to completing previous problem.
# Bearing in mind the definition of Kaprekar Number from above problem, write the function
# nearestKaprekarNumber(n) that takes an int value n and returns the Kaprekar number
# closest to n, with ties going to smaller value. For example, nearestKaprekarNumber(49) returns 45,
# and nearestKaprekarNumber(51) returns 55. And since ties go to the smaller number,
# nearestKaprekarNumber(50) returns 45.
# Note: as you probably guessed, this also cannot be solved by counting up from 0,
# as that will not be efficient enough to get past the autograder.
# Hint: one way to solve this is to start at n and grow in each direction until you find a Kaprekar number.


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
    digits = digits[::-1]
    for i in range(length):
        if form_numb(digits[i:]) != 0:
            sum_numb = form_numb(digits[:i]) + form_numb(digits[i:])
            if sum_numb == n:
                print(form_numb(digits[:i]), form_numb(digits[i:]))
                print(digits)
                return True
    return False


def fun_nearestkaprekarnumber(n):
    numb = n
    diff = 1
    while True:
        if isKaprekar(numb):
            return numb
        elif isKaprekar(numb - diff):
            return numb - diff
        elif isKaprekar(numb + diff):
            return numb + diff
        else:
            diff += 1

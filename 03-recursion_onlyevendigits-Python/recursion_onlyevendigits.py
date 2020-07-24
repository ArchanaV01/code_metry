# Without using iteration and without using strings,
# write the recursive function onlyEvenDigits(L),
# that takes a list L of non-negative integers
# (you may assume that), and returns a new list of
# the same numbers only without their odd digits
# (if that leaves no digits, then replace the number with 0).
# So: onlyEvenDigits([43, 23265, 17, 58344]) returns [4, 226, 0, 844].
# Also the function returns the empty list if the original list is empty.
# Remember to not use strings. You may not use loops/iteration in this problem.


def onlyEvenDigits(n):
    if n < 10 and not n % 2:
        return 0
    else:
        digit = n % 10
        if digit % 10:
            return onlyEvenDigits(n//10)
        else:
            return onlyEvenDigits(n//10) * 10 + digit


def fun_recursion_onlyevendigits(l):
    new_list = []
    for each in l:
        new_list.append(onlyEvenDigits(each))
    return new_list

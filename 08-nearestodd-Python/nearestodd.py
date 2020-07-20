# Write the function nearestOdd(n) that takes an float n,
# and returns as an int value the nearest odd number to n.
# In the case of a tie, return the smaller odd value.
# Note that the result must be an int, so nearestOdd(13.0) is the int 13, and not the float 13.0.


def fun_nearestodd(n):
    intN = int(n)
    intNp1 = int(n+1)
    if n - intN == 0 and n % 2 == 0:
        return intN
    elif n - intN == 0:
        return intN - 1
    elif n - intN > intNp1 - n and intNp1 % 2 == 0:
        return intNp1
    elif n - intN > intNp1 - n:
        return intN
    else:
        return intN

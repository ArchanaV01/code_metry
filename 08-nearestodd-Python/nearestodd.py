# Write the function nearestOdd(n) that takes an float n,
# and returns as an int value the nearest odd number to n.
# In the case of a tie, return the smaller odd value.
# Note that the result must be an int, so nearestOdd(13.0) is the int 13, and not the float 13.0.


def fun_nearestodd(n):
    intN = int(n)
    intNp1 = int(n+1)
    if intN % 2 == 0:
        intNm1 = int(n-1)
        if n - intN == 0 or n - intNm1 <= intNp1 - n:
            return intN-1
        else:
            return intNp1
    else:
        return intN

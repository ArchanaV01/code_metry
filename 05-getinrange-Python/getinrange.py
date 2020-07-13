# Write the function getInRange(x, bound1, bound2) which takes 3 int values
# x, bound1, and bound2, where bound1 is not necessarily less than bound2.
# If x is between the two bounds, just return it unmodified. Otherwise,
# if x is less than the lower bound, return the lower bound,
# or if x is greater than the upper bound, return the upper bound.


def fun_getinrange(x, bound1, bound2):
    # your code goes here
    if bound1 < bound2:
        small = bound1
        big = bound2
    else:
        small = bound2
        big = bound1
    if small <= x and x <= big:
        return x
    elif x <= big:
        return small
    else:
        return big

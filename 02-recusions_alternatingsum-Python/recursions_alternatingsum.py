# Write the function alternatingSum(L) that takes a possibly-empty list of numbers,
# and returns the alternating sum of the list, where every other value is subtracted
# rather than added. For example: alternatingSum([1,2,3,4,5]) returns 1-2+3-4+5
# (that is, 3). If L is empty, return 0. You may not use loops/iteration in this problem.


def fun_recursions_alternatingsum(l):
    length = len(l)
    if not length:
        return 0
    elif length < 2:
        return l[0]
    else:
        return l[0] - l[1] + fun_recursions_alternatingsum[2:]

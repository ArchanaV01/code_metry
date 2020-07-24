# Recursion-Only powersOf3ToN(n) [15 pts]
# Write the function powersOf3ToN(n) that takes a possibly-negative float or int n, and returns a list of the
# positive powers of 3 up to and including n. As an example, powersOf3ToN(10.5) returns [1, 3, 9]. If no such powers
# of 3 exist, you should return the empty list. You may not use loops/iteration in this problem.
lis = []


def powersof3_helper(lis, n):
    if n < 3:
        return 0
    else:
        numb = 1 + powersof3_helper(lis, n//3)
        lis.append(3**numb)


def recursion_powersof3ton(n):
        # Your code goes here
    powersof3_helper([], n)
    return lis

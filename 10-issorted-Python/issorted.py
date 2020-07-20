# isSorted(a) (10 Pts)
# Write the function isSorted(a) that takes a list of numbers and returns True if the list
# is sorted (either smallest-first or largest-first) and False otherwise. Your function
# must only consider each value in the list once (so, in terms of big-oh, which we will
# learn soon, it runs in O(n) time, where n=len(a)), and so in particular you may not sort
# the list.


def issorted(a):
    # your code goes here
    if len(a) <= 1:
        return True
    asc = False
    desc = False
    for i in range(1, len(a)-1):
        if asc and desc:
            return False
        if a[i] > a[i+1]:
            asc = True
        elif a[i] < a[i+1]:
            desc = True
    return True

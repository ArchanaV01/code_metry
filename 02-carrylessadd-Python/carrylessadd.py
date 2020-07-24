# carry less addition means a  normal addition with the carry from each column ignored.
# So, for example, if we carryless-ly add 8+7, we get 5 (ignore the carry). And if we add
# 18+27, we get 35 (still ignore the carry). With this in mind, write the function
# fun_carrylessadd(x, y) that takes two non-negative integers x and y and returns their
# carryless sum. As the paper demonstrates, fun_carrylessadd(785, 376) returns 51.


def fun_carrylessadd(x, y):
    if x == 0:
        return y
    if y == 0:
        return x
    lo = min(x, y)
    hi = max(x, y)
    add = lo % 10 + hi % 10
    if add >= 10:
        add -= 10
    lo //= 10
    hi //= 10
    cl_sum = add
    while hi > 0:
        add = lo % 10 + hi % 10
        if add >= 10:
            add -= 10
        cl_sum = add*10 + cl_sum
        print(lo % 10, hi % 10, add, cl_sum)
        lo //= 10
        hi //= 10
    print(cl_sum)
    return cl_sum

# Background: The Fibonacci numbers are defined by F(n) = F(n-1) + F(n-2).
# There are different conventions on whether 0 is a Fibonacci number,
# and whether counting starts at n=0 or at n=1. Here, we will assume that
# 0 is not a Fibonacci number, and that counting starts at n=0,
# so F(0)=F(1)=1, and F(2)=2. With this in mind, write the function
# nthfibonaccinumber(n) that takes a non-negative int n and returns the nth Fibonacci number.


def fun_nthfibonaccinumber(n):
        # your code goes Here
    if n < 1:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return fun_nthfibonaccinumber(n-1) + fun_nthfibonaccinumber(n-2)

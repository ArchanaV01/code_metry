# nthPronicNumber(n) [20 pts]
# Write the function nthPronicNumber that takes a non-negative int n and returns the nth Pronic
# Number. Pronic number is a number which is the product of two consecutive integers, that is, a
# number n is a product of x and (x+1).
# import math
# def is_pronic_number(n):
#     lower = int(math.sqrt(n))
#     if lower*(lower+1) == n:
#         return True
#     else:
#         return False


def nthpronicnumber(n):
    return n*(n+1)

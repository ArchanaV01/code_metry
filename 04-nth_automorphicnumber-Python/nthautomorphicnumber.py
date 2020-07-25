# nthAutomorphicNumbers(n) [20 pts]
# In mathematics, an automorphic number is a number whose square "ends" in the same digits as the
# number itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625, so 5, 6,
# 76 and 890625 are all automorphic numbers.


def is_automorphic(n):
    sqr = (n**2)
    while n > 0:
        if n % 10 != sqr % 10:
            return False
        n //= 10
        sqr //= 10
    return True


def nthautomorphicnumbers(n):
    # Your code goes here
    numb = 0
    counter = 1
    while True:
        if is_automorphic(numb):
            if counter == n:
                return numb
            counter += 1
        numb += 1

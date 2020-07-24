# nthWithProperty309(n) [20 pts]
# We will say that a number n has "Property309" if its 5th power contains every
# digit (from 0 to 9) at least once. 309 is the smallest number with this property.
# Write the function nthWithProperty309 that takes a non-negative int n and returns
# the nth number with Property309.


def iswithproperty309(n):
    fifth_pow = n**5
    digits = {}
    while fifth_pow > 0:
        if fifth_pow % 10 not in digits:
            digits[fifth_pow % 10] = True
        fifth_pow //= 10
    print(fifth_pow, digits)
    if len(digits) == 10:
        return True
    else:
        return False


def nthwithproperty309(n):
        # Your code goes here
    numb = 309
    counter = 0
    while True:
        if iswithproperty309(numb):
            counter += 1
            if counter == n:
                return numb
        numb += 1

# Write the function nthTidyNumber that takes a non-negative int n and returns the nth Tidy Number.
# A tidy number is a number whose digits are in non-decreasing order.
# fun_nth_tidynumber(0) = 1
# fun_nth_tidynumber(1) = 2
# fun_nth_tidynumber(5) = 6
# fun_nth_tidynumber(15) = 17
# fun_nth_tidynumber(35) = 46


def is_tidy_number(n):
    digits = []
    prev = 10
    while n > 0:
        digit = n % 10
        if digit > prev:
            return False
        prev = digit
        n = n//10


def fun_nth_tidynumber(n):
    numb = 1
    counter = 0
    while True:
        if is_tidy_number(numb):
            if counter == n:
                return numb
            counter += 1
        numb += 1

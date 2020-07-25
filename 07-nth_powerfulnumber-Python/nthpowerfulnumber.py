import math


def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True


def is_powerful_number(n):
    i = 2
    while n > 0 and i <= n:
        print(n, i, end='  ')
        if isPrime(i) and n % i == 0:
            if n % (i**2) == 0:
                n //= (i**2)
                i = 2
            else:
                return False
        else:
            i += 1
    return True


def nthpowerfulnumber(n):
        # Your code goes here
    numb = 1
    counter = 0
    while True:
        if is_powerful_number(numb):
            if counter == n:
                return numb
            counter += 1
        numb += 1

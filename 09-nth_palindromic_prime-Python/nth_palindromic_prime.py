# Write the function fun_nth_palindromic_prime(n) that takes a non-negative int n
# and returns the nth palindromic Prime, which is a palidrome number such that
# it is also a prime. For example, 313 is a palindrome and it is prime
# so 313 is an palindrome Prime. fun_nth_palindrome_prime(0) returns 2


def isPrime(n):
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            # print(n, "not prime")
            return False
    # print(n, "prime")
    return True


def isPalindrome(n):
    digits = []
    while n > 0:
        digits.append(n % 10)
        n //= 10
    while len(digits) > 1:
        if digits[0] == digits[-1]:
            digits = digits[1:-1]
        else:
            return False
    return True


def fun_nth_palindromic_prime(n):
    if n == 0:
        return 2
    counter = 1
    numb = 3
    while True:
        if isPrime(numb) and isPalindrome(numb):
            if counter == n:
                return numb
            counter += 1
        numb += 2

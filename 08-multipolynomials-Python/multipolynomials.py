# Background: we can represent a polynomial as a list of its coefficients. For example, [2, 3, 0, 4] could represent
# the polynomial 2x3 + 3x2 + 4. With this in mind, write the function multiplyPolynomials(p1, p2) which takes two
# lists representing polynomials as just described, and returns a third list representing the polynomial which is
# the product of the two. For example, multiplyPolynomials([2,0,3], [4,5]) represents the problem (2x**2 + 3)(4x +
# 5), and:    (2x**2 + 3)(4x + 5) = 8x**3 + 10x**2 + 12x + 15
# And so this returns the list [8, 10, 12, 15].


def multipolynomials(p1, p2):
    # Your code goes here
    len1 = len(p1)
    len2 = len(p2)
    # 4x^3 + 7x^2 + 2 => (4,7,0,2)
    # 6x^2 + 4x + 9 => (6,4,9)
    coeff = [0]*(len1 - 1)*(len2 - 1)
    for i in range(len1):
        for j in range(len2):
            coeff[i+j] += p1[i]*p2[j]
    return [a for a in coeff if a != 0]

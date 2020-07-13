# trianglearea(s1, s2, s3)[5pts]
# Write the function trianglearea(s1, s2, s3) that takes 3 floats/ints and returns the area of the
# triangle that has those lengths of its side. If no such triangle exists, return 0. Hint: you
# will probably wish to use Heron's Formula.
import math


def trianglearea(s1, s2, s3):
    # your code goes here
    sides = sorted([s1, s2, s3])
    if sides[0] + sides[1] <= sides[2]:
        return 0
    half_peri = (s1 + s2 + s3)/2
    return math.sqrt(half_peri * (half_peri-s1) * (half_peri - s2) * (half_peri - s3))

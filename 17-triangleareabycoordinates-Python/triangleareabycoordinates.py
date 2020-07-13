# triangleareabycoordinates(x1, y1, x2, y2, x3, y3)[5pts]
# Write the function triangleareabycoordinates(x1, y1, x2, y2, x3, y3) that takes 6 int or float
# values that represent the three points (x1,y1), (x2,y2), and (x3,y3), and returns as a float the
# area of the triangle formed by those three points. Hint: you should make constructive use of
# the triangleArea function you just wrote above.
import math


def triangleareabycoordinates(x1, y1, x2, y2, x3, y3):
    # your code goes here
    dist1 = math.sqrt(abs(x1-x2)**2 + abs(y1-y2)**2)
    dist2 = math.sqrt(abs(x3-x2)**2 + abs(y3-y2)**2)
    dist3 = math.sqrt(abs(x1-x3)**2 + abs(y1-y3)**2)
    return

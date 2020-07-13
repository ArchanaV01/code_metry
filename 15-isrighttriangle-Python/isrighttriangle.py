# isrighttriangle(x1, y1, x2, y2, x3, y3)[5pts]
# Write the function isrighttriangle(x1, y1, x2, y2, x3, y3) that takes 6 int or float values that
# represent the vertices (x1,y1), (x2,y2), and (x3,y3) of a triangle, and returns True if that is
# a right triangle and False otherwise. You may wish to write a helper function,
# distance(x1, y1, x2, y2), which you might call several times. Also, remember to use
# almostEqual (instead of ==) when comparing floats.
import math


def isrighttriangle(x1, y1, x2, y2, x3, y3):
    # your code goes here
    dist1 = math.sqrt(abs(x1-x2)**2 + abs(y1-y2)**2)
    dist2 = math.sqrt(abs(x3-x2)**2 + abs(y3-y2)**2)
    dist3 = math.sqrt(abs(x1-x3)**2 + abs(y1-y3)**2)
    distances = sorted([dist1, dist2, dist3])
    return distances[0] + distances[1] > distances[2] and math.isclose(distances[0]**2 + distances[1]**2, distances[2]**2, abs_tol=0.01)

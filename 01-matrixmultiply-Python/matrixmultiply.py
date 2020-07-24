# Write the function matrixMultiply(m1, m2) that takes two 2d lists
# (that we will consider to be matrices) and returns a new 2d list that
# is the result of multiplying the two matrices. Return None if the
# two matrices cannot be multiplied for any reason.


def fun_matrixmultiply(m1, m2):
    row1 = len(m1)
    row2 = len(m2)
    col1 = len(m1[0])
    col2 = len(m2[0])
    for each in m1:
        if len(each) != col1:
            return None
    for each in m2:
        if len(each) != col2:
            return None
    if col1 != row2:
        return None
    sum_matrix = [[]*row1]
    print(sum_matrix)
    for i in range(row1):
        sum_mult = 0
        for j in range(col2):
            sum_matrix[i].append(m1[i][j] * m2[j][i])
            print(sum_matrix)
    return sum_matrix

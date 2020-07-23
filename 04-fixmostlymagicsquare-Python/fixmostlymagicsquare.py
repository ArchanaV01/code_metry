# fixMostlyMagicSquare(L) [15 pts]
# In this week's writing session, we wrote isMostlyMagicSquare(L). Here, say we have a mostly magic square L, but
# then we modify L by changing exactly one value in L so that it no longer is a mostly magic square. For this
# exercise, we assume we have just such a list L, and your task is to find and fix that change. So, given the list
# L, return a new list M such that M is the same as L, only with exactly one value changed, and M is a mostly magic
# square.


def fixmostlymagicsquare(L):
    rows = len(L)
    sumVal1 = sum(L[0])
    sumVal2 = 0
    sum1 = []
    sum2 = []
    f_d = []
    s_d = []
    first_diag = 0
    second_diag = 0
    for i in range(rows):
        lis = []
        lis2 = []
        row_sum = 0
        col_sum = 0
        for j in range(rows):
            row_sum += L[i][j]
            col_sum += L[j][i]
            lis.append((i, j))
            lis2.append((j, i))
        if sumVal1 == row_sum:
            sum1.append(lis)
        else:
            sumVal2 = row_sum
            sum2.append(lis)
        if sumVal1 == col_sum:
            sum1.append(lis2)
        else:
            sumVal2 = col_sum
            sum2.append(lis2)
        first_diag += L[i][i]
        f_d.append((i, i))
        second_diag += L[i][rows - i - 1]
        s_d.append((i, rows - i - 1))
    if first_diag == sumVal1:
        sum1.append(f_d)
    else:
        sum2.append(f_d)
    if second_diag == sumVal1:
        sum1.append(s_d)
    else:
        sum2.append(s_d)
    # done with finding sums and seggregation
    length1 = len(sum1)
    length2 = len(sum2)
    freq = {}
    if length1 > length2:
        for each in sum2:
            for each1 in each:
                if each1 in freq:
                    freq[each1] += 1
                else:
                    freq[each1] = 1
        print(freq)
        maxi = -1
        maxi_coord = ()
        for each in freq:
            if freq[each] > maxi:
                maxi_coord = each
        print(maxi, maxi_coord)
        diff = sumVal2 - sumVal1
        L[maxi_coord[0]][maxi_coord[1]] -= diff
        return L
    else:
        for each in sum1:
            for each1 in each:
                if each1 in freq:
                    freq[each1] += 1
                else:
                    freq[each1] = 1
        print(freq)
        maxi = -1
        maxi_coord = ()
        for each in freq:
            if freq[each] > maxi:
                maxi_coord = each
        print(maxi, maxi_coord)
        diff = sumVal1 - sumVal1
        L[maxi_coord[0]][maxi_coord[1]] -= diff
        return L

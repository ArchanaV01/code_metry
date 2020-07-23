# Given a string str and an integer K, the task is to find the K-th most
# frequent character in the string. If there are multiple characters that
# can account as K-th the most frequent character then, print any one of them.


def fun_kth_occurrences(s, n):
    freq = {}
    for each in s:
        if each in freq:
            freq[each] += 1
        else:
            freq[each] = 1
    print(freq)
    sortedFreq = sorted(freq.items(), key=lambda item: (
        item[1]), reverse=True)
    return sortedFreq[n-1][0]

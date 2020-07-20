# Write the function interleave(s1, s2) that takes two strings, s1 and s2,
# and interleaves their characters starting with the first character in s1.
# For example, interleave('pto', 'yhn') would return the string "python".
# If one string is longer than the other, concatenate the rest of the remaining
# string onto the end of the new string. For example ('a#', 'cD!f2') would return
# the string "ac#D!f2". Assume that both s1 and s2 will always be strings.


def fun_interleave(s1, s2):
    mini = min(len(s1), len(s2))
    strBuff = ''
    for i in range(mini):
        strBuff += s1[i] + s2[i]
    strBuff += s1[mini:] + s2[mini:]
    return strBuff

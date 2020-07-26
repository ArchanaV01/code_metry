# leastFrequentLetters(s) [20 pts]
# Write the function leastFrequentLetters(s), that takes a string s, and ignoring case (so "A" and "a" are treated
# the same), returns a lowercase string containing the least-frequent alphabetic letters that occur in s, each
# included only once in the result and then in alphabetic order. So:
# leastFrequentLetters("aDq efQ? FB'daf!!!")
# returns "be". Note that digits, punctuation, and whitespace are not letters! Also note that seeing as we have not
# yet covered lists, sets, maps, or efficiency, you are not expected to write the most efficient solution. Finally,
# if s does not contain any alphabetic characters, the result should be the empty string ("")


def leastfrequentletters(s):
        # Your code goes here
    if s == "":
        return ""
    s = s.lower()
    chars = {}
    #  = len(s)
    minChars = []
    for each in s:
        print(minChars, chars)
        if each >= 'a' and each <= 'z':
            if each in chars:
                chars[each] += 1
            else:
                chars[each] = 1
        # if chars[each] < min_freq:
        #     min_freq = chars[each]
        #     minChars.clear()
        #     minChars.append(each)
        # elif chars[each] == min_freq:
        #     minChars.append(each)
    min_freq = min(chars.values())
    for each in chars:
        if chars[each] == min_freq:
            minChars.append(each)
    return "".join(sorted(minChars))

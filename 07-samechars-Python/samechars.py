# sameChars(s1, s2) [20 pts]
# Write the function sameChars(s1, s2) that takes two strings and returns True if the two strings are composed of
# the same characters (though perhaps in different numbers and in different orders) -- that is, if every character
# that is in the first string, is in the second, and vice versa -- and False otherwise. This test is
# case-sensitive, so "ABC" and "abc" do not contain the same characters. The function returns False if either
# parameter is not a string, but returns True if both strings are empty (why?).


def samechars(s1, s2):
        # Your code goes here
    len1 = len(s1)
    len2 = len(s2)
    index = 0
    sh_chars, ln_chars = {}, {}
    if len1 < len2:
        sh = s1
        sh_len = len1
        lng = s2
        lng_len = len2
    else:
        sh = s2
        sh_len = len2
        lng = s1
        lng_len = len1
    while index < lng_len:
        if index < sh_len:
            ch = sh[index]
            if ch in sh_chars:
                sh_chars[ch] += 1
            else:
                sh_chars[ch] = 1
        ch = lng[index]
        if ch in ln_chars:
            ln_chars[ch] += 1
        else:
            ln_chars[ch] = 1
    if ln_chars.keys() == sh_chars.keys():
        return True
    else:
        return False

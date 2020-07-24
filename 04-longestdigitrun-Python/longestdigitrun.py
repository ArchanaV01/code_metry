# longestDigitRun(n) [20 pts]
# Write the function longestDigitRun(n) that takes a possibly-negative int value n and returns
# the digit that has the longest consecutive
# run, or the smallest such digit if there is a tie. So, longestDigitRun(117773732) returns 7 (
# because there is a run of 3 consecutive 7's),
# as does longestDigitRun(-677886).


def longestdigitrun(n):
    # Your code goes here
    if n < 0:
        n *= -1
    freq = {}
    while n > 0:
        digit = n % 10
        counter = 0
        while n % 10 == digit:
            counter += 1
            n //= 10
        if digit in freq:
            if freq[digit] < counter:
                freq[digit] = counter
        else:
            freq[digit] = counter
    print(freq)
    maxi = -1
    maxi_dig = 9
    for each in freq:
        if freq[each] > maxi:
            maxi_dig = each
        elif freq[each] == maxi:
            if each < maxi_dig:
                maxi_dig = each
    return maxi_dig

# First, you can read about look-and-say numbers here. Then, write the function lookAndSay(a) that takes a list of
# numbers and returns a list of numbers that results from "reading off" the initial list using the look-and-say
# method, using tuples for each (count, value) pair. For example:
# lookAndSay([]) == []
# lookAndSay([1,1,1]) == [(3,1)]
# lookAndSay([-1,2,7]) == [(1,-1),(1,2),(1,7)]
# lookAndSay([3,3,8,-10,-10,-10]) == [(2,3),(1,8),(3,-10)]
# lookAndSay([3,3,8,3,3,3,3]) == [(2,3),(1,8),(4,3)]


def lookandsay(a):
        # Your code goes here
    ls = []
    ind = 0
    length = len(a)
    while ind < length:
        element = a[ind]
        counter = 0
        print(element, end=" ")
        while ind < length and a[ind] == element:
            counter += 1
            ind += 1
        ls.append((counter, element))
        print(counter)
    return ls

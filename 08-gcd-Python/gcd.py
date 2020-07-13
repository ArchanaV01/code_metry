# gcd(m, n) [10pts]  
# [Note: to receive any credit, you must solve this problem using Euclid's algorithm, and by no other means. In particular, do not just loop through all integers less than min(m,n) and find the common factors that way -- it is much too slow!]
# According to Euclid, the greatest common divisor, or gcd, can be found like so: 
#        gcd(x,y) == gcd(y, x%y) 
# We can use that to quickly find gcd's. For example: 
#         gcd(270,250) == gcd(250, 20) # 270 % 250 == 20 
#                  == gcd(20, 10) # 250 % 20 == 10 
#                  == gcd(10, 0) # 20 % 10 == 0 
# When we get to gcd(x,0), the answer is x. So gcd(270, 250) is 10. With this in mind, write the function gcd(x,y) that takes two positive integers x and y and returns their gcd using Euclid's gcd algorithm.

def gcd(m, n):
	# your code goes here
	pass
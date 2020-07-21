"""Write a HashTable class that stores strings
in a hash table, where keys are calculated
using the first two letters of the string."""


class HashTable(object):
    def __init__(self):
        self.table = [None]*10000

    def calculate_hash_value(self, string):
        """Helper function to calulate a
        hash value from a string."""
        # Your code goes here
        return ord(string[0])*100 + ord(string[1])

    def store(self, string):
        """Input a string that's stored in 
        the table."""
        # Hash Value = (ASCII Value of First Letter * 100) + ASCII Value of Second Letter
        # Your code goes here
        hashVal = self.calculate_hash_value(string)
        while hashVal < 10000 and self.table[hashVal]:
            hashVal += 1
        if hashVal >= 10000:
            hashVal = 0
            while self.table[hashVal]:
                hashVal += 1
        if not self.table[hashVal]:
            print(hashVal)
            self.table[hashVal] = string

    def lookup(self, string):
        """Return the hash value if the
        string is already in the table.
        Return -1 otherwise."""
        # Your code goes here
        hashVal = self.calculate_hash_value(string)
        while hashVal < 10000 and self.table[hashVal] != string:
            hashVal += 1
        if hashVal >= 10000:
            hashVal = 0
            while self.table[hashVal] != string:
                hashVal += 1
        if self.table[hashVal] == string:
            return hashVal
        else:
            return -1

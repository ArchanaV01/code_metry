"""The LinkedList code from before is provided below.
Add three functions to the LinkedList.
"get_position" returns the element at a certain position.
The "insert" function will add an element to a particular
spot in the list.
"delete" will delete the first element with that
particular value.
Then, use "Test Run" and "Submit" to run the test cases
at the bottom."""


class Element(object):
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList(object):
    def __init__(self, head=None):
        self.head = head

    def append(self, new_element):
        # Your code goes here
        temp = self.head
        while temp != None:
            print(temp.value)
            temp = temp.next
        temp = Element(new_element)

    def get_position(self, position):
        """Get an element from a particular position.
        Assume the first position is "1".
        Return "None" if position is not in the list."""
        # Your code goes here
        counter = 1
        temp = self.head

        while counter < position and temp != None:
            print(temp.value)
            temp = temp.next
            counter += 1
        return temp

    def insert(self, new_element, position):
        """Insert a new node at the given position.
        Assume the first position is "1".
        Inserting at position 3 means between
        the 2nd and 3rd elements."""
        counter = 1
        temp = self.head
        while counter < position - 1 and temp != None:
            temp = temp.next
            counter += 1
        if counter == position - 1:
            # temp = prev of reqd position
            newEle = Element(new_element)
            newEle.next = temp.next.next
            temp.next = newEle

    def delete(self, value):
        """Delete the first node with a given value."""
        # Your code goes here
        temp = self.head
        while temp != None and temp.value != value:
            temp = temp.next
        if temp != None:
            if temp.next != None:
                temp.value = temp.next.value
                temp.next = temp.next.next
            else:
                temp = None

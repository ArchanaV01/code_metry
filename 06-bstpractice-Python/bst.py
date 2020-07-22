class Node(object):
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


class BST(object):
    def __init__(self, root):
        self.root = Node(root)

    def insert(self, new_val):
        # Your code goes here
        temp = self.root
        while temp:
            if new_val < temp.value:
                temp = temp.left
            elif new_val > temp.value:
                temp = temp.right
            else:
                break
        temp = Node(new_val)

    def traversal(self, node, nodes):
        if node:
            nodes.append(node.value)
            nodes = self.traversal(temp.left, nodes)
            nodes = self.traversal(temp.right, nodes)
        return nodes

    def printSelf(self):
        # Your code goes here
        nodes = self.traversal(self.root, [])
        for each in nodes:
            print(each, end=' ')

    def search(self, find_val):
        # Your code goes here
        temp = self.root
        print("desired val", find_val)
        if type(find_val).__name__ != type(temp.value).__name__:
            return False
        while temp:
            print(temp.value, end=' ')
            if temp.value == find_val:
                return True
            elif find_val < temp.value:
                temp = temp.left
            else:
                temp = temp.right
        return False

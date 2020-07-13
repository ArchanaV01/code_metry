// """Add a couple methods to our LinkedList class,
// and use that to implement a Stack.
// You have 4 functions below to fill in:
// insert_first, delete_first, push, and pop.
// Think about this while you're implementing:
// why is it easier to add an "insert_first"
// function than just use "append"?"""

class Element{
	int value;
	Element next;
	public Element(int value){
		this.value = value;
		this.next = null;
	}
}

class LinkedList{
	Element head;
	public LinkedList(Element head){
		this.head = head;
	}

	public void append(Element new_element){
		Element current = this.head;
        if (this.head != null) {
            while(current.next != null){
                current = current.next;
            }
            current.next = new_element;
        }
        else{
            this.head = new_element;
        }
	}

	public void insert_first(Element new_element){
		 // "Insert new element as the head of the LinkedList"
	}

	public Element delete_first(){
		return this.head;
	   // "Delete the first (head) element in the LinkedList as return it"
	}
}


public class stacks{
	LinkedList ll;
	public stacks(Element top){
		ll = new LinkedList(top);
	}

	public void push(Element e){
		 // "Push (add) a new element onto the top of the stack"
	}

	public Element pop(){
		return new Element(5);
	}
}

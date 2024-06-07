package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 1);
        singleLinkedList.traverseLinkedList();
        singleLinkedList.searchNode(4);
    }
}


//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
    // why when inserting a value at a position that is already occupied, it throws a null pointer exception.

// Changed the insertInLinkedList method from Node nextNode = node; node.next = nextNode; to the following:
// Node nextNode = tempNode.next; tempNode.next = node; node.next = nextNode;
// nextNode was set to the created node itself, then node.next is set to nextNode causing incorrect link.
// Changed so that nextNode sets to tempNode.next which is the node currently at the target location, then tempNode.next
// is set to the new node, and then the new nextNode. Inserts new node between tempNode and nextNode.
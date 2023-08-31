package linkedlist;

public class LinkedList {
    public Node head ;
    public Node tail ;

    public LinkedList() {

    }

    public LinkedList(Node head) {
        this.head = head;
        this.tail = tail;
    }

    public void insert(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    public void insertToTail(int x) {
        Node newNode = new Node(x);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public void insertBefore(int x, int y) {
        Node newNode = new Node(y);
        Node bfrNode = null;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            while (temp.value != x) {
                bfrNode = temp;
                temp = temp.next;
            }
            newNode.next = bfrNode.next;
            bfrNode.next = newNode;
        }

    }

    public void insertAfter(int x, int y) {

        Node newNode = new Node(y);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            while (temp.value != x) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }


    public boolean includes(int x) {
        Node newNode = head;
        while (newNode != null) {
            if (newNode.value == x)
                return true;
            newNode = newNode.next;
        }
        return false;
    }

    //    public void reverse() {
//        Node prev = null;
//        Node curr = head;
//        Node next = null;
//
//        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//
//        }
//        head = prev;
//
//
//    }
    public LinkedList reverse() {
        LinkedList reversedList = new LinkedList();

        Node current = head;
        while (current != null) {
            reversedList.insert(current.value);
            current = current.next;
        }

        return reversedList;
    }
    public int kthValue(int x) {
        try {
            if (x < 0) {
                throw new IllegalArgumentException("Value must be non-negative");
            }
            reverse();
            Node temp = new Node();
            temp = head;
            int valueOfK; //if the value isn't there return exception not 0
            int counter=0;
            while (temp != null && counter != x) {
                temp = temp.next;
                counter++;
            }

            if (temp == null) {
                throw new IndexOutOfBoundsException("Index not found");
            }
            valueOfK= temp.value;
            return valueOfK;
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
            return -1;
        }
    }

    public LinkedList zipLists(LinkedList list1,LinkedList list2){

        LinkedList resultList = new LinkedList();

        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while (temp1 != null && temp2 != null) {
            resultList.insertToTail(temp1.value);
            resultList.insertToTail(temp2.value);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while (temp1 != null) {
            resultList.insertToTail(temp1.value);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            resultList.insertToTail(temp2.value);
            temp2 = temp2.next;
        }

        return resultList;
    }


    public boolean isPalindorme(LinkedList list1){
        if(list1.head == null) {
            return false;
        }

        LinkedList list2 = list1.reverse();

        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while(temp1 != null && temp2 != null && temp1 != temp2){
            if(temp1.value != temp2.value){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }


    @Override
    public String toString() {
        String values = "";
        Node newNode= head;
        while(newNode != null){
            values+="{" + newNode.value + "}" + "->";
            newNode=newNode.next;
        }
        values+="Null";
        return values;
    }


    public void delete(){
        head=head.next;
    }
}

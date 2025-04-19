public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
        head = null;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.getNext();
        }
        holder = temp != null ? temp.getNext() : null;
        Node newNode = new Node(element);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        }else {
            temp.setNext(newNode);
            newNode.setNext(holder);
        }
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.setNext(temp);
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        if(temp == null) {
            addFirst(element);
            return;
        }
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new Node(element));
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        if(index == 0) {
            head = head.getNext();
        }else{
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        numNodes--;
        return (E)temp.getData();
    }

    public boolean remove(Object e){
        Node temp = head;
        Node prev = null;

        while(temp != null) {
            if(temp.getData().equals(e)) {
                if(prev == null) {
                    head = temp.getNext();
                }else {
                    prev.setNext(temp.getNext());
                }
                numNodes--;
                return true;
            }
            prev = temp;
            temp = temp.getNext();
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public Object clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node temp = head;

        while(temp != null) {
            newList.addLast((E)temp.getData());
            temp = temp.getNext();
        }
        return newList;
    }

    public boolean contains(E o) {
        Node temp = head;
        while(temp != null) {
            if(temp.getData().equals(o)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;

        while(temp != null) {
            if(temp.getData().equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E get(int i) {
        if(i < 0 || i > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for(int j = 0; j < i; j++) {
            temp = temp.getNext();
        }
        return (E)temp.getData();
    }

    public E getFirst() {
        if(head == null) {
            throw new IndexOutOfBoundsException("The list is empty");
        }
        return (E)head.getData();
    }

    public E getLast() {
        if(head == null) {
            throw new IndexOutOfBoundsException("The list is empty");
        }
        Node temp = head;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        return (E)temp.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
}

class OrderedLinkedList implements List {
    ListObject Head, iterator;

    OrderedLinkedList() {
        Head = null;
    }

    public Integer getElementAt(Integer position) {
        return null;
    }

    public void add(Integer element) {
        ListObject obj = new ListObject(element);
        if (Head == null) {
            Head = obj;
        } else {
            iterator = Head;
            ListObject previous = new ListObject();
            previous.next = Head;
            while (iterator != null) {
                if (iterator.data > element) {
                    previous.next = obj;
                    obj.next = iterator;                    
                    return;
                }
                iterator = iterator.next;
                previous = previous.next;
            }
            previous.next = obj;
        }
        traverse();
    }

    public void traverse() {
        iterator = Head;
        System.out.print("DataStructure cotains: ");
        while (iterator != null) {
            System.out.print(iterator.data + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }

    public Boolean isEmpty() {
        return getSize() == 0;
    }

    public void search(Integer element) {
        iterator = Head;
        boolean found = false;
        Integer index = 0;
        while (iterator != null) {
            if (iterator.data == element) {
                System.out.println("Element " + element + " found at position " + index);
                found = true;
                break;
            }
            index++;
            iterator = iterator.next;
        }
        if (found == false)
            System.out.println("Element " + element + " not found!");
    }

    public Integer getSize() {
        Integer size = 0;
        iterator = Head;
        while (iterator != null) {
            size++;
            iterator = iterator.next;
        }
        return size;
    }

}
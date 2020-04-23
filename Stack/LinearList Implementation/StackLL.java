class StackLL implements LinkedList {
    ListObject Head, temp;

    StackLL() {
        Head = null;
        temp = null;
    }

    public void push(Integer element) {
        if (Head == null) {
            Head = new ListObject(element);
        } else {
            temp = new ListObject(element);
            temp.next = Head;
            Head = temp;
        }
        traverse();
    }

    public Integer pop() {
        try {
            if (Head == null)
                throw new BoundsException();
        } catch (BoundsException error) {
            error.Error();
        }
        temp = Head;
        Head = Head.next;
        return temp.data;
    }

    public void traverse() {
        temp = Head;
        System.out.print("DataStructure contet: ");
        while (temp != null) {
            System.out.print(temp.data + "<-");
            temp = temp.next;
        }
        System.out.println("Head");
    }

    public Integer getSize() {
        Integer index = 0;
        temp = Head;
        while (temp != null) {
            temp = temp.next;
            index++;
        }
        return index;
    }

    public Boolean isEmpty() {
        return getSize() == 0 ? true : false;
    }

}
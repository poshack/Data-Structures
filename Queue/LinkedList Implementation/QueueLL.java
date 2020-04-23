class QueueLL implements Queue {
    ListObject Head, iterator;

    QueueLL() {
        Head = null;
        iterator = null;
    }

    public void enqueue(Integer element) {
        if (Head == null) {
            Head = new ListObject(element);
        } else {
            ListObject obj = new ListObject(element);
            iterator = Head;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = obj;
        }
        traverse();
    }

    public Integer dequeue() {
        Integer popped;
        try {
            if (Head == null) {
                throw new BoundsException();
            }
        } catch (BoundsException error) {
            error.Error();
        }
        popped = Head.data;
        Head = Head.next;
        return popped;
    }

    public void traverse() {
        iterator = Head;
        System.out.print("Data Structure contains: Head<-");
        while (iterator != null) {
            System.out.print(iterator.data + "<-");
            iterator = iterator.next;
        }
        System.out.println("Tail");
    }

    public Integer getSize() {
        iterator = Head;
        Integer size = 0;
        while (iterator != null) {
            size++;
            iterator = iterator.next;
        }
        return size;
    }

    public Boolean isEmpty() {
        return getSize() == 0;
    }

}
class LinearList implements List {
    ListObject Head, iterator;

    LinearList() {
        Head = null;
    }

    public void add(Integer element) {
        ListObject obj = new ListObject(element);
        if (Head == null) {
            Head = obj;
        } else {
            iterator = Head;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = obj;
        }
        traverse();
    }

    public void add(Integer element, Integer position) {
        iterator = Head;
        Integer index = 0;
        ListObject obj = new ListObject(element);
        ListObject temp = new ListObject();
        try {
            if (position < 0 || position > size())
                throw new BoundsException();
        } catch (BoundsException error) {
            error.Error();
        }
        while (iterator != null) {
            if (position == 0) {
                obj.next = Head;
                Head = obj;
                break;
            } else if (index++ == position - 1) {
                temp = iterator.next;
                iterator.next = obj;
                obj.next = temp;
            }
            iterator = iterator.next;
        }

        traverse();
    }

    public void traverse() {
        iterator = Head;
        System.out.print("Data Structure contains: ");
        while (iterator != null) {
            System.out.print(iterator.data + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }

    public void search(Integer element) {
        Integer index = 0;
        iterator = Head;
        while (iterator != null) {
            if (iterator.data == element) {
                System.out.println("Element " + element + " found at index " + index);
                return;
            }
            iterator = iterator.next;
            index++;
        }
        System.out.println("Element " + element + " not found");
    }

    public void remove(Integer element) {
        iterator = Head;
        ListObject previous = new ListObject();
        previous = null;
        while (iterator != null) {
            if (iterator.data == element) {
                if (iterator == Head) {
                    Head = iterator.next;
                    break;
                }
                previous.next = iterator.next;
                break;
            }
            previous = iterator;
            iterator = iterator.next;
        }
        traverse();
    }

    public void reverse() {
        ListObject current, previous, next;
        current = next = Head;
        previous = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        Head = previous;
    }

    // public Integer getElementAt(Integer position) {
    // iterator = Head;
    // Integer index;
    // try {
    // if (position < 0 || position >= size())
    // throw new BoundsException();
    // } catch (BoundsException error) {
    // error.Error();
    // }
    // for (index = 0; index < position; index++) {
    // iterator = iterator.next;
    // System.out.println("looping through iterator " + index);
    // }
    // return iterator.data;
    // }

    public Integer getElementAt(Integer position) {
        Integer index = 0;
        try {
            if (position < 0 || position >= size())
                throw new BoundsException();
        } catch (BoundsException error) {
            error.Error();
        }
        iterator = Head;
        while (iterator != null) {
            if (index == position) {
                return iterator.data;
            }
            iterator = iterator.next;
            index++;
        }
        return iterator.data;
    }

    public Integer size() {
        Integer size = 0;
        iterator = Head;
        while (iterator != null) {
            iterator = iterator.next;
            size++;
        }
        return size;
    }

    public Boolean isEmpty() {
        return Head == null ? true : false;
    }

}
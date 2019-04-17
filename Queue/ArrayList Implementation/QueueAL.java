class QueueAL implements List {
    Integer arr[], size, initialSize;

    QueueAL() {
        size = 0;
        initialSize = 5;
        arr = new Integer[initialSize];
    }

    public void enqueue(Integer element) {
        if (size == initialSize) {
            Integer temp[] = new Integer[initialSize *= 2];
            for (Integer i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size++] = element;
        traverse();
    }

    public Integer dequeue() {
        Integer popped;
        try {
            if (size == 0) {
                throw new BoundsException();
            }
        } catch (BoundsException error) {
            error.Error();
        }
        popped = arr[0];
        for (Integer i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return popped;
    }

    public void traverse() {
        System.out.print("DataStructure content: Head<-");
        for (Integer i = 0; i < size; i++) {
            System.out.print(arr[i] + "<-");
        }
        System.out.println("Tail");
    }

    public Integer getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
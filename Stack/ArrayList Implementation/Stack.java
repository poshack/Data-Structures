class Stack implements List {
    Integer arr[], size, initialSize;

    Stack() {
        size = 0;
        initialSize = 5;
        arr = new Integer[initialSize];

    }

    public void push(Integer element) {
        if (size == initialSize) {
            Integer tempArr[] = new Integer[initialSize *= 2];
            for (Integer i = 0; i < size; i++)
                tempArr[i] = arr[i];
            arr = tempArr;
        }
        arr[size++] = element;
        traverse();
    }

    public Integer pop() {
        try {
            if (size == 0)
                throw new BoundsException();
        } catch (BoundsException error) {
            error.Error();
        }
        return arr[(size--) - 1];
    }

    public void traverse() {
        System.out.print("Data Structure contains: ");
        for (Integer i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public Integer getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

}
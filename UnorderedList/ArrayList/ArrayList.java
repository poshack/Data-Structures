public class ArrayList implements List {

    Integer size, initialSize, arr[];

    ArrayList() {
        initialSize = 5;
        size = 0;
        arr = new Integer[initialSize];
    }

    public void add(Integer element) {
        if (size == initialSize) {
            Integer tempArray[] = new Integer[initialSize *= 2];
            for (int i = 0; i < size; i++)
                tempArray[i] = arr[i];
            arr = tempArray;
        }
        arr[size] = element;
        size++;
        traverse();
    }

    public Boolean search(Integer element) {
        for (Integer i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println("Element " + element + " found at index " + i);
                return true;
            }
        }
        return false;
    }

    public Integer getElementAt(Integer position) {
        try {
            if (position < 0 || position >= size)
                throw new BoundsException();
        } catch (BoundsException e) {
            e.Error();
        }
        return arr[position];
    }

    public void traverse() {
        System.out.print("DataStructure content: ");
        for (Integer i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public Boolean isEmpty() {
        return size > 0 ? false : true;
    }
}
public class OrderedList implements List {
    Integer arr[], size, initialSize;

    OrderedList() {
        initialSize = 5;
        size = 0;
        arr = new Integer[initialSize];
    }

    public void add(Integer element) {
        if (size == initialSize) {
            Integer tempArr[] = new Integer[initialSize *= 2];
            for (int i = 0; i < size; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
        if (size == 0) {
            arr[size] = element;
        } else {
            for (int i = size; i >= 0; i--) {
                if (arr[i - 1] > element) {
                    arr[i] = arr[i - 1];
                    if (i - 2 < 0) {
                        arr[i - 1] = element;
                        break;
                    }
                } else {
                    arr[i] = element;
                    break;
                }
            }
        }
        size++;
        traverse();
    }

    public Boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public void traverse() {
        System.out.print("Datastructure contents: ");
        for (Integer i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public Boolean search(Integer element) {
        Integer low = 0, high = size - 1, mid;
        Boolean elementFound = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == element) {
                System.out.println("Found " + element + " at index " + mid);
                elementFound = true;
                break;
            } else if (arr[mid] > element) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return elementFound;
    }

    public Integer getElementAt(Integer position) {
        try {
            if (position >= size || position < 0)
                throw new BoundsException();
        } catch (BoundsException exception) {
            exception.Error();
        }
        return arr[position];
    }

    public Integer getSize() {
        return size;
    }

}
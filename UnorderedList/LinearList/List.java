interface List {
    void add(Integer element);

    void add(Integer element, Integer position);

    void search(Integer element);

    void traverse();

    void remove(Integer element);

    void reverse();

    Integer getElementAt(Integer position);

    Integer size();

    Boolean isEmpty();
}
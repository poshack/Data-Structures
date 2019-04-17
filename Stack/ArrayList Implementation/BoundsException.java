class BoundsException extends Exception {
    private static final long serialVersionUID = 1L;

    void Error() {
        printStackTrace();
        System.out.println("Out of bounds Exception occured!");
    }
}
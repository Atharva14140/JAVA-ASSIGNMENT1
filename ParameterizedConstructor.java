class ParameterizedConstructor {
    int x;

    ParameterizedConstructor(int x) {
        this.x = x;
        System.out.println("Parameterized constructor called with value: " + x);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10);
    }
}

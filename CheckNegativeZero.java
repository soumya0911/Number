class CheckNegativeZero {
    int num2, num3;

    public CheckNegativeZero(int num2, int num3) {
        this.num2 = num2;
        this.num3 = num3;
    }

    public String checkNegativeOrZero() {
        if (num2 < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
    public static void main(String[] args) {
        CheckNegativeZero cnz = new CheckNegativeZero(-20, 0);
        System.out.println(cnz.checkNegativeOrZero());
    }
}

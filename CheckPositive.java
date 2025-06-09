class CheckPositive {
    int num1;

    public CheckPositive(int num1) {
        this.num1 = num1;
    }
    
    public String isPositive() {
        if (num1 > 0) {
            return "Positive";
        } else {
            return "Not Positive";
        }
    }

    public static void main(String[] args) {
        CheckPositive p = new CheckPositive(12);
        System.out.println(p.isPositive());
    }
}

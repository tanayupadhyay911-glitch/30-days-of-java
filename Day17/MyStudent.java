class MyStudent {
    private int age;
    private String name;
    private int yr;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getYr() {
        return yr;
    }

    public void setYr(int s) {
        yr = s;
    }

    public static void main(String args[]) {
    MyStudent Tanay = new MyStudent();

    Tanay.setName("Tanay Upadhyay");
    Tanay.setAge(18);
    Tanay.setYr(1);

    System.out.println(Tanay.getName());
    System.out.println(Tanay.getAge());
    System.out.println(Tanay.getYr() + " Year");
     }

}
		
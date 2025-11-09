public class StaticKeywords {
    public static void main(String[] args) {
        Childrens s1 = new Childrens();
        s1.name = "Pratyush Mishra";
        System.out.println(s1.getName());



    }
}
class Childrens {
    String name;
    int roll;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}
 
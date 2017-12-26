package java_tutorials;

enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;
    Fruit(String color) {
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
}

enum Company {
    GOOGLE, APPLE, ORACLE;
}

public class Constant_Enum {

    public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit type = Fruit.APPLE;

        switch(type) {
            case APPLE:
                System.out.println(57+" kcal, "+Fruit.APPLE.color);
                break;
            case PEACH:
                System.out.println(34+" kcal"+Fruit.PEACH.color);
                break;
            case BANANA:
                System.out.println(93+" kcal"+Fruit.BANANA.color);
                break;
        }
    }

}

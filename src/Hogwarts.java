public class Hogwarts {

    private String name;
    // Сила магии
    private int magicPower;

    // Расстояние трансгрессии
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public static void comparison (Hogwarts person1, Hogwarts person2) {
        int sum1;
        int sum2;
        sum1 = person1.getMagicPower() + person1.getTransgressionDistance();
        sum2 = person2.getMagicPower() + person2.getTransgressionDistance();

        if (sum1 > sum2) {
            System.out.println(person1.getName()+" с суммой баллов "+sum1+" обладает большей мощностью магии, чем "+person2.getName()+" с суммой балов "+sum2);
        } else if (sum1 == sum2) {
            System.out.println(person1.getName() + " с суммой баллов " + sum1 + " равен " + person2.getName() + " с суммой балов " + sum2);
        } else {
            System.out.println(person2.getName()+" с суммой баллов "+sum2+" обладает большей мощностью магии, чем "+person1.getName()+" с суммой балов "+sum1);
        }

    }

}



public class Puffendui extends Hogwarts {
    //  трудолюбие
    private int industriousness;

    //  верность
    private int loyalty;

    //  честность
    private int honesty;

    public Puffendui(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return  getName() +
                ", Hogwarts{" +
                "magicPower=" + getMagicPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "}, " +
                "Puffendui{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
    public static void comparison (Puffendui person1, Puffendui person2) {
        int sum1;
        int sum2;
        sum1 = person1.getIndustriousness() + person1.getLoyalty() + person1.getHonesty();
        sum2 = person2.getIndustriousness() + person2.getLoyalty() + person2.getHonesty();

        if (sum1 > sum2) {
            System.out.println(person1.getName()+" с суммой баллов "+sum1+" лучше, чем "+person2.getName()+" с суммой балов "+sum2);
        } else if (sum1 == sum2) {
            System.out.println(person1.getName() + " с суммой баллов " + sum1 + " равен " + person2.getName() + " с суммой балов " + sum2);
        } else {
            System.out.println(person2.getName()+" с суммой баллов "+sum2+" лучше, чем "+person1.getName()+" с суммой балов "+sum1);
        }

    }
}

public class Griffindor extends Hogwarts {
    // благородство
    private int nobility;

    //честь
    private int honor;

    //храбрость
    private int bravery;


    public Griffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  getName() +
                ", Hogwarts{" +
                "magicPower=" + getMagicPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "}, " +
                "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public static void comparison (Griffindor person1, Griffindor person2) {
        int sum1;
        int sum2;
        sum1 = person1.getNobility() + person1.getHonor() + person1.getBravery();
        sum2 = person2.getNobility() + person2.getHonor() + person2.getBravery();

        if (sum1 > sum2) {
            System.out.println(person1.getName()+" с суммой баллов "+sum1+" лучше, чем "+person2.getName()+" с суммой балов "+sum2);
        } else if (sum1 == sum2) {
            System.out.println(person1.getName() + " с суммой баллов " + sum1 + " равен " + person2.getName() + " с суммой балов " + sum2);
        } else {
            System.out.println(person2.getName()+" с суммой баллов "+sum2+" лучше, чем "+person1.getName()+" с суммой балов "+sum1);
        }

    }
}


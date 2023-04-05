public class Kogtevran extends Hogwarts {
    // ум
    private int intelligence;

    // мудрость
    private int wisdom;

    // остроумие
    private int wit;

    // полнота творчества
    private int fullnessOfCreativity;

    public Kogtevran(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int fullnessOfCreativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullnessOfCreativity = fullnessOfCreativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getFullnessOfCreativity() {
        return fullnessOfCreativity;
    }

    public void setFullnessOfCreativity(int fullnessOfCreativity) {
        this.fullnessOfCreativity = fullnessOfCreativity;
    }

    @Override
    public String toString() {
        return  getName()+
                ", Hogwarts{" +
                "magicPower=" + getMagicPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "}, " +
                "Kogtevran{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", fullnessOfCreativity=" + fullnessOfCreativity +
                '}';
    }
    public static void comparison (Kogtevran person1, Kogtevran person2) {
        int sum1;
        int sum2;
        sum1 = person1.getIntelligence() + person1.getWisdom() + person1.getWit() + person1.getFullnessOfCreativity();
        sum2 = person2.getIntelligence() + person2.getWisdom() + person2.getWit() + person2.getFullnessOfCreativity();

        if (sum1 > sum2) {
            System.out.println(person1.getName()+" с суммой баллов "+sum1+" лучше, чем "+person2.getName()+" с суммой балов "+sum2);
        } else if (sum1 == sum2) {
            System.out.println(person1.getName() + " с суммой баллов " + sum1 + " равен " + person2.getName() + " с суммой балов " + sum2);
        } else {
            System.out.println(person2.getName()+" с суммой баллов "+sum2+" лучше, чем "+person1.getName()+" с суммой балов "+sum1);
        }

    }
}

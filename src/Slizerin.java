public class Slizerin extends Hogwarts{
    //хитрость
    private int cunning;

    //решительность
    private int determination;

    // амбициозность
    private int ambition;

    // находчивость
    private int resourcefulness;

    // жажда власти
    private int lustForPower;

    public Slizerin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return  getName() +
                ", Hogwarts{" +
                "magicPower=" + getMagicPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "}, " +
                "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
    public static void comparison (Slizerin person1, Slizerin person2) {
        int sum1;
        int sum2;
        sum1 = person1.getCunning() + person1.getDetermination() + person1.getAmbition() + person1.getResourcefulness()+person1.getLustForPower();
        sum2 = person2.getCunning() + person2.getDetermination() + person2.getAmbition() + person2.getResourcefulness()+person2.getLustForPower();

        if (sum1 > sum2) {
            System.out.println(person1.getName()+" с суммой баллов "+sum1+" лучше, чем "+person2.getName()+" с суммой балов "+sum2);
        } else if (sum1 == sum2) {
            System.out.println(person1.getName() + " с суммой баллов " + sum1 + " равен " + person2.getName() + " с суммой балов " + sum2);
        } else {
            System.out.println(person2.getName()+" с суммой баллов "+sum2+" лучше, чем "+person1.getName()+" с суммой балов "+sum1);
        }

    }
}

public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Гарри Поттер",90, 50, 95, 80, 70);
        Griffindor hermioneGranger = new Griffindor("Гермиона Грейнджер",80, 60, 20, 30, 20);
        Griffindor ronWeasley = new Griffindor("Рон Уизли",75, 65, 60, 50,30);

        Slizerin dracoMalfoy = new Slizerin("Драко Малфой",45, 56, 25, 35, 54, 78, 15);
        Slizerin grahamMontagu = new Slizerin("Грэхэм Монтегю",51, 26, 48, 15, 16, 25, 26);
        Slizerin gregoryGoyle = new Slizerin("Грегори Гойл",21, 36, 52, 62, 15, 24, 35);

        Puffendui zachariasSmith = new Puffendui("Захария Смит",36, 15, 23, 45, 58);
        Puffendui cedricDiggory = new Puffendui("Седрик Диггори",65, 45, 52, 15, 66);
        Puffendui justinFinchFletchley = new Puffendui("Джастин Финч-Флетчли",23, 25, 15, 34, 12);

        Kogtevran zhouChang = new Kogtevran("Чжоу Чанг",26, 15, 45, 48, 32, 45);
        Kogtevran padmaPatil = new Kogtevran("Падма Патил",26, 36, 45, 12, 62, 47);
        Kogtevran marcusBelby = new Kogtevran("Маркус Белби",45, 63, 21, 15, 45, 78);


        System.out.println(harryPotter);
        System.out.println(zhouChang);

        Griffindor.comparison(harryPotter,ronWeasley);
        Kogtevran.comparison(padmaPatil,zhouChang);

        Hogwarts.comparison(dracoMalfoy,zachariasSmith);

    }
}
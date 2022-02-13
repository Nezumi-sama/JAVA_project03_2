public class Main {
    public static void main(String[] ards) {
        BmiService bmi = new BmiService();
        int weightt = 80;
        float heightt = 1.6f;
// расчет ИМТ - данные их переменных
        System.out.println(bmi.calculate(weightt, heightt));
//расчет ИМТ - данные в методе
        System.out.println(bmi.calculate(110, 1.96f));
        System.out.println(bmi.calculate(50, 1.55f));
        System.out.println(bmi.calculate(96, 1.7f));
        System.out.println(bmi.calculate(75, 1.65f));
        System.out.println(bmi.calculate(90, 1.8f));
    }
}

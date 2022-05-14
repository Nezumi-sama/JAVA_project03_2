public class Main {
    public static void main(String[] ards) {
        BmiService bmi = new BmiService();
        int weightt = 80;
        float heightt = 1.6f;
        float resultIMT = 0;
// расчет ИМТ - данные из переменных
        resultIMT = bmi.calculate(weightt, heightt);
        System.out.println(resultIMT);
//расчет ИМТ - данные в методе
        resultIMT = bmi.calculate(130, 1.96f);
        System.out.println(resultIMT);
        resultIMT = bmi.calculate(110, 1.96f);
        System.out.println(resultIMT);
        resultIMT = bmi.calculate(50, 1.55f);
        System.out.println(resultIMT);
        resultIMT = bmi.calculate(96, 1.7f);
        System.out.println(resultIMT);
        resultIMT = bmi.calculate(75, 1.65f);
        System.out.println(resultIMT);
        resultIMT = bmi.calculate(90, 1.8f);
        System.out.println(resultIMT);
    }
}

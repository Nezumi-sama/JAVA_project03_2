public class BmiService {
    public float calculate(int weight, float height) {
        float imt;
//расчет ИМТ
        imt = weight / (height * height);
        return imt;
    }
}
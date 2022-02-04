public class BmiService {
    public float calculate (int weight, float height){
        System.out.println();
        System.out.println("weight = " + weight);
        System.out.println("height = " + height);

        return weight/(height * height);
    }
}

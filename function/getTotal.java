package function;

public class getTotal {
    public int sum(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        getTotal gt = new getTotal();

        int Total=gt.sum(10,11);
        System.out.println(Total);
    }
}

public class Poly {
    public int AddNumbers(int a,int b){
        return a+b;
    }

    public int AddNumbers(int a,int b,int c){//polymorphism
        return a+b+c;
    }


    public static void main(String[] args) {
        Poly p=new Poly();
        int result1 = p.AddNumbers(23,45);
        int result2 = p.AddNumbers(12,34,56);
        System.out.println(result1);
        System.out.println(result2);
    }


}

import java.util.Random;

public class add {
   public static  add a =new add();
    public static void main(String[] args) {

        System.out.println(a.show("aaa"));
    }


    public int addNum(int a,int b){

        return a+b;

    }


    public String show(String str){
        Random rd = new Random();
        String num = String.valueOf(rd.nextInt(10));
        str= str +" "+ num + " Karol Słoma";

        return str;
    }






}

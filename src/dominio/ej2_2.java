package dominio;

public class ej2_2 {


    public static int fac(int n) {
        if(n<=1) {
            return 1;
        }else {
            return n*fac(n-1);
        }
    }

}


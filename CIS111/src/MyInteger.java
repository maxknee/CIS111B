public class MyInteger {
    private int value;
    
    public MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    
    public boolean isEven(){
        return isEven();
    }
    
    public boolean isOdd(){
        return isOdd();
    }
    
    public boolean isPrime(){
        return isPrime();
    }
    
    public static boolean isEven(int a){
        if (a % 2 == 0){
            return true;
        }
        else {return false;}
    }
    
    public static boolean isOdd(int a){
        if (!isEven(a)){
            return true;
        }
        else {return false;}
        
    }
    
    public static boolean isPrime(int a){
        for (int i = 2; i < a / 2; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isEven(MyInteger a){
        return a.isEven();
    }
    
    public static boolean isOdd(MyInteger a){
        return a.isOdd();
    }
    
    public static boolean isPrime(MyInteger a){
        return a.isPrime();
    }
    
    public boolean equals(int a){
        if (value == a){
            return true;
        }
        else {return false;}
    }
    
    public boolean equals(MyInteger a){
        return equals(a.getValue());
    }
    
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
    
    public static int parseInt(char[] c){
        return parseInt(new String(c));
    }
}

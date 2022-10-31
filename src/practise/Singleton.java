package practise;

public class Singleton {
    private Singleton (){

    }
    private static Singleton singleton = null;
    public static Singleton getSingleton (){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

}

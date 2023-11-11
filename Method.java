public class Method {

    public static void main(String[] args) {
        String name = "Yuri";
        int age = 16;

        hello(name, age);
        

        
        int x = 3;
        int y = 5;

        System.out.print(add(x,y));
        

        System.out.printf("\n%d This is a format string", 123);

        
        boolean TF = true;
        char mychar = '@';
        int myint = 666;
        
        

        System.out.printf("\n%b", TF);
        System.out.printf("\n%c", mychar);
        System.out.printf("\n%d", myint);
        
        

        }
         
        

    
    static void hello(String name, int age) {
        System.out.println("hello: "+name+"\nwith age: "+age);
    }

    
    static int add(int x, int y) {
        int sum = x+y;
        
        return sum;
    }


    
    


}

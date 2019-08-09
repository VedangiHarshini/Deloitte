
class BCC {
    public void Print() {
        System.out.println("Base");
    }         
}

class DCC extends BCC {    
    public void Print() {
        System.out.println("Derived");
    }
}

class Mains{
    public static void DoPrint( BCC o ) {
        o.Print();   
    }
    public static void main(String[] args) {
 BCC b = new BCC();
 DCC c = new DCC();
 DCC d = new DCC();
 DoPrint(b);
 DoPrint(c);
 DoPrint(d);
 
    }
}
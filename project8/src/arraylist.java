class BC {
    public void Print() {
        System.out.println("Base");
    }         
}

class DC extends BC {    
    public void Print() {
        System.out.println("Derived");
    }
}

class Main{
    public static void DoPrint( BC o ) {
        o.Print();   
    }
    public static void main(String[] args) {
 BC b = new BC();
 DC c = new DC();
 DC d = new DC();
 DoPrint(b);
 DoPrint(c);
 DoPrint(d);
 
    }
}
/*13020210160*/
/*EKA MULIYANA*/

interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0001 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0160 obj = new Central0160();
        System.out.println("main");
        obj.aaa();
    }
}
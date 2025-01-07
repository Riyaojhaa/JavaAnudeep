class abc {
    private int a = 20;
    protected static int b = 50;
    public void geta(){
        System.out.println(a);
        
    }
    public void seta(int x){
        this.a = x;
    }
}

public class EncapsulationEg extends abc {
    public static void main(String[] args) {
        abc sbc1 = new abc();
        sbc1.geta();
        sbc1.seta(10);
        sbc1.geta();
        System.out.println(b);
        
    }
}
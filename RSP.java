public class RSP {
    int A = (int)(Math.random()*3)+1;
    int B = (int)(Math.random()*3)+1;
    void display(){
        if (A==1 && B==2){
            System.out.println("B win");
        }
        if (A==1 && B==3){
            System.out.println("A win");
        }
        if (A==2 && B==1){
            System.out.println("A win");
        }
        if (A==2 && B==3){
            System.out.println("B win");
        }
        if (A==3 && B==1){
            System.out.println("B win");
        }
        if (A==3 && B==2){
            System.out.println("A win");
        }
        else if(A==B){
            System.out.println("Draw");
        }
        System.out.println("A = " + A);
        System.out.println("B = " + B);
}
}

class RSPTest{
    public static void main(String[] args) {
        RSP rsp = new RSP();
        System.out.println("1.가위, 2.바위, 3.보");
        rsp.display();
    }
}
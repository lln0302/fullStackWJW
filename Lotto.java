class Lotto{
    int LottoNum[] = new int[6];

    void display(){
    for (int i=0; i<6; i++){
        LottoNum[i] = (int)(Math.random()*45)+1;
        for (int j=0; j<i; j++){
            if (LottoNum[i] == LottoNum[j]){
                i--;
                break;
            }
        }
        System.out.print(LottoNum[i]+" ");
    }
    }    
}

class Lottory{
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.display();
    }
    
}

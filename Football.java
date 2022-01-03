public class Football {
    String HomeAway;
    int a = (int)(Math.random()*100);
    int b = (int)(Math.random()*100);
    void display(){
        System.out.println("Score");
    }
}

class Team extends Football{
    void StrenghofTeam(){
    }
}

class Player extends Team{
    void PlayAbility(){
        if (a>b){
            System.out.println("A win");
        }
        if (a<b){
            System.out.println("B win");
        }
        if (a==b){
            System.out.println("Draw");
        }
    }
}

class Match{
    public static void main(String[] args) {
        System.out.println("진형을 선택하세요.");
        Football fb = new Football();
        fb.display();
    }
}

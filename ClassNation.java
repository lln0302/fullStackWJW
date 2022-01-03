public class ClassNation {
    
    private String nations;
    public int area;
    public int population;

    void nationChange(){}
    void areaChange(){}
    void populationChange(){}
}
    class Korea extends ClassNation{
        int Korarea = 10040000;
        void display(){
            System.out.println(Korarea);                        
        }
    }
    class China extends ClassNation{
        int Chnarea = 960000000;
        void display(){
            System.out.println(Chnarea);
        }
    }
    class Japan extends ClassNation{
        int Jpnarea = 37790000;
        void display(){
            System.out.println(Jpnarea);
        }
    }

    class Planet{
        static String planetname;
    }

class Nation{
    public static void main(String[] args) {
        ClassNation CN = new ClassNation();
        Korea Kor = new Korea();
        China Chn = new China();
        Japan Jpn = new Japan();

        Kor.display();
        Chn.display();
        Jpn.display();
    }
}

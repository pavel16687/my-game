public class Dayclass {
    public static void main(String[] args){
        System.out.println("y menya ne idet rain za oknom");
        Mario mafio=new Mario("fire mario",50,5);
        mafio.showHero();
        Wario lingulini=new Wario("fire Wario",51,4);
        lingulini.showHero();
        Battle.start(mafio,lingulini);


    }
}

public class Battle {
    public static void start(Mario first,Wario second){
        int round=1;
        while (first.isAlive() && second.isAlive()){
            System.out.println("=== Раунд " + round + " ===");
            second.takeDamage(first.getDamage());
            if (second.isAlive()){
                first.takeDamage(second.getDamage());
            }
            round++;

        }
        if (first.isAlive()){
            System.out.println(first.getForm()+" win ");
        }else{
            System.out.println(second.getForm()+" pobezdaet ");
        }
    }
}

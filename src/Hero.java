public class Hero {
    String form;
    int health;
    int damage;

    public Hero(String form,int health,int damage){
        this.form=form;
        this.health=health;
        this.damage=damage;
    }

    public void showHero(){
        System.out.println();
        System.out.printf("our hero have: %s form, have this %d health, have this %d damage",
                this.form,
                this.health,
                this.damage);
        System.out.println();
    }
}

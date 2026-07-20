public class Hero {
    protected String form;
    protected int health;
    protected int damage;

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
    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getForm() {
        return form;
    }

    public boolean isAlive(){
        return health>0;
    }
    public void takeDamage(int damage){
        health=getHealth()-damage;
        if (getHealth()<0){
            health=0;
        }
        System.out.println("y "+getForm()+" ostalos "+getHealth());
    }
}

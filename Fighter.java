package LabManul;

public class Fighter {
    String name;
    int health;
    int attackPower;


    public Fighter(String nme, int heallth, int attackPwer) {
        this.name = nme;
        this.health = heallth;
        this.attackPower = attackPwer;
    }

    public void attack(Fighter oponent) {
        oponent.health -= this.attackPower;
        System.out.println("Attacker name  " + name + "  opponent name  " + oponent.name + " for " + attackPower);
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] agrs) {
        Fighter f1=new Fighter("Ali",17,14);
        Fighter f2=new Fighter("Aisha",13,40);
        f1.attack(f2);
        if (f2.isAlive()){
            System.out.println("f2 is defeated the f1");
        }
        else{
            System.out.println("f1 is defeated the f2");
        }
        System.out.println(f2.health);
        f2.attack(f1);
        if (f2.isAlive()){
            System.out.println("f2 succefully attack on f1");
        }
        else{
            System.out.println("next time kha pi ka larna ");
        }

    }
}





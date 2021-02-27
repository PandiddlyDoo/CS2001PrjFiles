import javax.swing.text.Utilities;

public class ApocalypseSimulator {

    private String text;
    private int currentZombies, bullet, bat, killCounter, deathChance, instakill, survivors;
    ZombieFrame view = new ZombieFrame();
    ZombieControl control = new ZombieControl(view, this);

    public void inputText(String s){
        text=s;
    }

    public String outputText(String s){
        return s+text;
    }

    public void runSimulation(){
        control.startOfGame(Constants.DAYS,Constants.MIN_ZOMBIES,Constants.MAX_ZOMBIES,Constants.FOOD, Constants.PEOPLE);
    }

    //Sleep method to spawn zombies, initiate combat anc check for Win/loss conditions.
    public void sleep(){

        if(Constants.DAYS>0 && Constants.PEOPLE>0 && Constants.FOOD>0){
            currentZombies=generateRandomInRange(Constants.MIN_ZOMBIES, Constants.MAX_ZOMBIES);
        }
        while(currentZombies>0&&Constants.PEOPLE>0){
            zombieCombat();
        }
        Constants.DAYS--;
        Constants.FOOD= Constants.FOOD-Constants.PEOPLE;

        if(Constants.DAYS>0 && Constants.PEOPLE>0 && Constants.FOOD>0){
            control.survivalMessage();
        }

        //win/loss conditions
        if (Constants.DAYS==0){
            control.winMessage();
        }

        if (Constants.PEOPLE==0){
            control.peopleLossMessage();
        }

        if (Constants.FOOD==0){
            control.foodLossMessage();
        }
        //Debugging and balancing
        /*System.out.println("Days: "+Constants.DAYS);
        System.out.println("People: "+Constants.PEOPLE);
        System.out.println("Food: "+Constants.FOOD);
        System.out.println("Ammo: "+Constants.AMMO);*/
    }

    public void zombieCombat(){
        //Gun
        if (Constants.AMMO>0){
            bullet=generateRandomInRange(1, Constants.GUN_HIT);
            Constants.AMMO--;
            //Chance to hit
            if (bullet==Constants.GUN_HIT){
                instakill=generateRandomInRange(1,Constants.GUN_CRIT);
                //Chance to crit
                if (instakill==Constants.GUN_CRIT){
                    currentZombies--;
                    control.critMessage();
                //2 hits of crit fails
                }if(killCounter==0){
                    control.killMessage();
                    killCounter=Constants.GUN_HP;
                }else {
                    killCounter--;
                }

            //Player death chance if gun misses
            }else{
            deathChance=generateRandomInRange(1, Constants.GUN_PLAYER_X);

                if(deathChance==2){
                Constants.PEOPLE--;
                control.deathMessage();
                }
            }

         //Blunt object
        }else{
            bat=generateRandomInRange(1, Constants.BLUNT_HIT);
            //Blunt hit chance
            if (bat==Constants.BLUNT_HIT){
                instakill=generateRandomInRange(1,Constants.BLUNT_CRIT);
                //Chance to crit
                if (instakill==Constants.BLUNT_CRIT) {
                    currentZombies--;
                    control.critMessage();
                 //3 hits if crit fails
                }if(killCounter==Constants.BLUNT_HP){
                    control.killMessage();
                    killCounter=Constants.BLUNT_HP;
                }else {
                    killCounter--;
                }
            }else{
                //death
                Constants.PEOPLE--;
                control.deathMessage();
            }
        }
    }

    public void venture(){
        //Sacrifice 1-2 people for Ammo and Food
        Constants.AMMO=Constants.AMMO+generateRandomInRange(1, 150);
        Constants.FOOD=Constants.FOOD+generateRandomInRange(1, 30);
        Constants.PEOPLE=Constants.PEOPLE-generateRandomInRange(1,2);

        //A way for more people to join your party potentially offsetting the risk of a venture
        survivors=generateRandomInRange(1,Constants.SURVIVOR_CHANCE);
        if (survivors==Constants.SURVIVOR_CHANCE){
            Constants.PEOPLE=Constants.PEOPLE+generateRandomInRange(1,5);
        }
        //Immediately starts next night so venture cant be used repetitively
        control.ventureMessage();
        sleep();
    }

    //random number generator
    public static int generateRandomInRange(int min, int max){
        return min + (int)(Math.random()*((max - min)+1));
    }


}

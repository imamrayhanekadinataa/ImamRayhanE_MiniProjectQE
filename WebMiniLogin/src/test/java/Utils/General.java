package Utils;


import java.util.Random;



    public class General {
        static Random rand = new Random();

        public String randomUsername(){
            return "rayhan" + + rand.nextInt(1000);
        }

        public static String randomEmail(){
            return "imamrayhanekadinataa" + + rand.nextInt(1000) + "@gmail.com";}

        public String randomPassword() {return "rayhan" + + rand.nextInt(1000);}
    }

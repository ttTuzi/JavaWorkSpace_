package week1;
import java.io.*;
import java.util.Locale;

public class Question1 {
    public static void main(String[] args) {
        String x = "#ATL\n" +
                "#Atl\n" +
                "WELCOME to the Atlanta BeltLine!!\n" +
                "#AtlantaArt\n" +
                "ATLANTA 2021\n" +
                "WELCOME TO ATLANTA\n" +
                "WELCOME TO ATL\n" +
                "ATL\n" +
                "Atl\n" +
                "atl\n" +
                "ATL\n" +
                "Atl\n" +
                "atl\n" +
                "ATL\n" +
                "Atl\n" +
                "Atlanta, GA\n" +
                "WELCOME TO MIDTOWN ATL.\n" +
                "<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3\n" +
                "ATLANTA IS THE PLACE TO BE\n" +
                "ATL 2020\n" +
                "I HEART ATL.\n" +
                "I HEART ATLANTA.\n" +
                "I <3 Atlanta!!!!\n" +
                "Turn left on Peachtree St.\n" +
                "ATL _____ Atl _____ atl _____ ATL _____ atl\n" +
                "Atlanta, GA\n" +
                "WELCOME TO ATL\n" +
                "ATL RULES!!\n" +
                "ATLANTA, GA\n" +
                "welcome to atlanta\n" +
                "I HEART ATLANTA. IT IS THE BEST PLACE TO BE.\n" +
                "WELCOME TO ATLANTA\n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "AtLAnTa \n" +
                "Atlanta\n" +
                "Atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "WELCOME TO ATL\n" +
                "ATL FOREVER!\n" +
                "ATLANTA 2001\n" +
                "WELCOME TO ATLANTA\n" +
                "Did someone say \"Atl\" ?!?!?\n" +
                "ATL _____ Atl _____ atl _____ ATL _____ atl\n" +
                "WELCOME TO ATL\n" +
                "ATLANTA BELTLINE, WHERE ATLANTA COMES TOGETHER\n" +
                "Atlanta forever!\n" +
                "Take a stop in Inman park.\n" +
                "ATLANTA BELTLINE, WHERE ATLANTA COMES TOGETHER\n" +
                "I heart Atl.\n" +
                "Welcome to Atlanta\n" +
                "HHHHHEEEEEEEELLLLLLLLLOOOOOOOOOO WWWWWOOOOORRRRRLLLLLDDDD\n" +
                "Welcome to Atl\n" +
                "We are so happy you are here.\n" +
                "Everyone say 'ATL'\n" +
                "<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3\n" +
                "BEST PLACE TO BE\n" +
                "ATL 2020\n" +
                "I HEART ATL.\n" +
                "I HEART ATLANTA.\n" +
                "#ATL\n" +
                "WELCOME to the Atlanta BeltLine!!\n" +
                "#ATLALLDAY\n" +
                "#Atl\n" +
                "ATLANTA 2021\n" +
                "WELCOME TO ATLANTA \n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "ATL _____ Atl _____ atl _____ ATL _____ atl\n" +
                "AtLAnTa\n" +
                "Atlanta\n" +
                "Atl\n" +
                "ATL _____ Atl _____ atl _____ ATL _____ atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "WELCOME TO ATL \n" +
                "Call 678-555-5555\n" +
                "ATL _____ Atl _____ atl _____ ATL _____ atl\n" +
                "Hello Atl\n" +
                "atlanta\n" +
                "atl\n" +
                "HOME OF THE WORLD'S BUSIEST AIRPORT\n" +
                "AWESOME ATL!!\n" +
                ":-)\n" +
                "atl forever!\n" +
                "welcome to atlanta\n" +
                "Krog st. mkt -->>\n" +
                "WELCOME TO ATL. WELCOME TO ATL. AWELCOME TO ATL.\n" +
                "STOP AT PONCE CITY MARKET.\n" +
                "At!anta!\n" +
                "Did you find this one?\n" +
                "1996 SUMMER OLYMPICS - ATL, GA\n" +
                "ATLANTA IS THE CAPITOL OF GEORGIA\n" +
                "ATL RULES!!\n" +
                "WELCOME TO ATLANTA\n" +
                "ATL _____ Atl _____ atl _____ ATL _____ atl\n" +
                "No the other Peachtree St.\n" +
                "At!anta!\n" +
                "42\n" +
                "#ATL\n" +
                "WELCOME to the Atlanta BeltLine!!\n" +
                "#ATLALLDAY\n" +
                "#Atl\n" +
                "ATLANTA 2021\n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "AtLAnTa\n" +
                "Atlanta\n" +
                "ATL _____ Atl _____ atl _____ ATL _____ atl\n" +
                "Atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "WELCOME TO ATLANTA\n" +
                "HAVE YOU SEEN A SQUIRREL?\n" +
                "WELCOME TO ATL\n" +
                "HOME OF THE WORLD'S BUSIEST AIRPORT\n" +
                "ATL RULES!!\n" +
                "ATLANTA 2021\n" +
                "WeLcOME To Atlanta\n" +
                "Let's go Atl!!\n" +
                "Atl allllll dddaaaaayyyyyyy\n" +
                "HeLLo SunSHine!!!\n" +
                "Yup, you're still walking along the BeltLine.\n" +
                "#ATL\n" +
                "WELCOME to the Atlanta BeltLine!!\n" +
                "#ATLALLDAY\n" +
                "#Atl\n" +
                "ATLANTA 2021\n" +
                "WELCOME TO ATLANTA\n" +
                "WELCOME TO ATL\n" +
                "KROG STREET MARKET THIS WAY\n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "AtLAnTa \n" +
                "Atlanta\n" +
                "Atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "ATL IS HUMID RIGHT NOW.\n" +
                "Atlanta, GA\n" +
                "Welcome to Atl\n" +
                "No the other Peachtree St.\n" +
                "We are so happy you are here.\n" +
                "Everyone say 'ATL'\n" +
                "Did someone say \"Atl\" ?!?!?\n" +
                "Hello Atl\n" +
                "atlanta\n" +
                "atl\n" +
                "No the other Peachtree St.\n" +
                "HOME OF THE WORLD'S BUSIEST AIRPORT\n" +
                "ATL _____ Atl _____ atl _____ ATL _____ atl\n" +
                "AWESOME ATL!!\n" +
                "atl forever!\n" +
                "Atlanta, GA\n" +
                "WELCOME TO ATL\n" +
                "ATL RULES!!\n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "AtLAnTa\n" +
                "Atlanta\n" +
                "Atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "ATLANTA, GA\n" +
                "welcome to atlanta\n" +
                "!!!!!HHHHHEEEEEEEELLLLLLLLLOOOOOOOOOO!!!!!\n" +
                "Call 404-555-5555\n" +
                "ATLANTA 2021\n" +
                "WELCOME TO ATLANTA\n" +
                "WELCOME TO ATL\n" +
                "Hello Atl\n" +
                "atlanta\n" +
                "!!!!!!!!!!!!!!ATL!!!!!!!!!!!!!!!!\n" +
                "ATL\n" +
                "#ATLALLDAY\n" +
                "#Atl\n" +
                "ATLANTA 2021\n" +
                "WELCOME TO ATLANTA\n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "AtLAnTa \n" +
                "Atlanta\n" +
                "Atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "WELCOME TO ATL\n" +
                "WeLcOME To Atlanta\n" +
                "Let's go Atl!!\n" +
                "No the other Peachtree St.\n" +
                "Atl allllll dddaaaaayyyyyyy\n" +
                "Did someone say \"Atl\" ?!?!?\n" +
                "WELCOME TO ATL\n" +
                "ATLANTA BELTLINE, WHERE ATLANTA COMES TOGETHER\n" +
                "#ATL\n" +
                "WELCOME to the Atlanta BeltLine!!\n" +
                "!!!!!!!ATL!!!!!!!ATL!!!!!!!Atl!!!!!!!ATL!!Atl!!atl\n" +
                "#ATLALLDAY\n" +
                "#Atl\n" +
                "ATLANTA 2021\n" +
                "WELCOME TO ATLANTA\n" +
                "WELCOME TO ATL\n" +
                "<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3\n" +
                "WELCOME to the Atlanta BeltLine!!\n" +
                "#ATLALLDAY\n" +
                "#Atl\n" +
                "ATLANTA 2021\n" +
                "WELCOME TO ATL. WELCOME TO ATL. WELCOME TO ATL.\n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "AtLAnTa\n" +
                "Atlanta\n" +
                "Atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "WELCOME TO ATL\n" +
                "KROG STREET MARKET THIS WAY\n" +
                "#ATLALLDAY #Atl\n" +
                "#AtlantaArt\n" +
                "#Atlanta\n" +
                "#ATL\n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "AtLAnTa\n" +
                "Atlanta\n" +
                "Atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "No the other Peachtree St.\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "WHY ARE ALL THE STREETS CALLED PEACHTREE?\n" +
                "WELCOME TO ATL\n" +
                "Hello Atl\n" +
                "atlanta\n" +
                "!!!!!!!!!!!!!!ATL!!!!!!!!!!!!!!!!\n" +
                "#ATLALLDAY\n" +
                "#Atl\n" +
                "ATLANTA 2021\n" +
                "WELCOME TO ATLANTA\n" +
                "WELCOME TO ATL\n" +
                "WeLcOME To Atlanta\n" +
                "WELCOME TO ATL. WELCOME TO ATL. WELCOME TO ATL.\n" +
                "atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "AtLAnTa\n" +
                "Atlanta\n" +
                "Atl\n" +
                "atl\n" +
                "ATLANTA\n" +
                "ATL atlanta Atlanta ATLANTA aTLanta Atlanta ATLANTA atlanta\n" +
                "atlANTA Atlanta ATLANTA atlAnta\n" +
                "Yup, you're still on the BeltLine.";
        int count = 0;
        x=x.toLowerCase();
        for (int i = 0; i < x.length(); i++) {
            while (x.charAt(i)=='a'&&x.charAt(i+1)=='t'&&x.charAt(i+2)=='l') {
                count++;
                i += 2;
            }
        }
        int count2=0;
        for(int i=0;i<x.length()-7;i++){
            if(x.substring(i,i+7).equals("atlanta")){
                count2++;
            }
        }
        System.out.println(count2);
        System.out.println(count);
        System.out.println(count-count2);
    }
}

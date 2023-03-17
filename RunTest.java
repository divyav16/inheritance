package inheritance;

public class RunTest {
    public static void main(String[] args) {

        System.out.println("Parent class Phone");

        Phone p = new Phone();
        p.openphone();
        p.startphone();
        p.unlockphone();
        p.datetimeandweatheronscreen();
        p.Lockphone();
        p.modelnumber();
        p.colour();
        p.GB();

        System.out.println("Child class googlepixel");

        googlepixel g=new googlepixel();
        g.openphone();
        g.startphone();
        g.unlockphone();
        g.datetimeandweatheronscreen();
        g.Lockphone();
        g.modelnumber();
        g.colour();
        g.GB();

        System.out.println("Child class huiwai");

        huiwai h= new huiwai();
        h.openphone();
        h.startphone();
        h.unlockphone();
        h.datetimeandweatheronscreen();
        h.Lockphone();
        h.modelnumber();
        h.colour();
        h.GB();

        System.out.println("Child class iphone");

        iphone i=new iphone();
        i.openphone();
        i.startphone();
        i.unlockphone();
        i.datetimeandweatheronscreen();
        i.Lockphone();
        i.modelnumber();
        i.colour();
        i.GB();

        System.out.println("Child class samsung");

        samsung s=new samsung ();
        s.openphone();
        s.startphone();
        s.unlockphone();
        s.datetimeandweatheronscreen();
        s.Lockphone();
        s.modelnumber();
        s.colour();
        s.GB();

        System.out.println("Child class computer");

        computer c=new computer();
        c.modelnumber();
        c.colour();
        c.GB();


    }
}
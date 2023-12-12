package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TrawlerApp {
    public static void main(String[] args) {
      Trawler t1=new Trawler("nametest","12345678910","Stern");
        t1.setName("nametest");
        t1.setId("12345678910");
        t1.setType("Stern");
      System.out.println(t1.toString());

        Trawler t2=new Trawler("nametester","12345678910","Srotny");
        t2.setName("nametester");
        t2.setId("12345678910");
        t2.setType("Stern");
        System.out.println(t2.toString());

        Trawler t3=new Trawler("Longname","123456780","Freezer");
        t3.setName("Longname");
        t3.setId("12345678910");
        t3.setType("Stern");
        System.out.println(t3.toString());


        Trawler t4=new Trawler("Luke","12345678910","Freezer");
        t4.setName("testname");
        t4.setId("12345678910");
        t4.setType("Outrigger");
        System.out.println(t4.toString());




    }
}
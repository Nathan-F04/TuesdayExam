package ie.atu;

import java.util.InputMismatchException;

public class Trawler {

    private String name,id,type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        try{
        if(name.length()<7||name.length()>24){
            throw new IllegalArgumentException("Error invalid name given.\nName must be greater than 7 characters and less than 20");
        }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

        try {

            if (id.length() !=11) {
                throw new IllegalArgumentException("Error Invalid transponder id.\nTransponder id must be exactly 11 digits");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        try {
            if (type.equals("Freezer") || type.equals("Outrigger") || type.equals("Stern")) {

            }

        else{
                throw new IllegalArgumentException("Only three allowable types of Shipping vessel:\n \tStern\n\tFreezer\n\tOutrigger");

        }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public Trawler() {
        name="";
        id="";
        type="";
    }

    public Trawler(String name, String id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;

        try{
            if(name.length()<7||name.length()>24){
                throw new IllegalArgumentException("Error invalid name given.\nName must be greater than 7 characters and less than 20");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {

            if (id.length() < 11 || id.length() > 11) {
                throw new IllegalArgumentException("Error Invalid transponder id.\nTransponder id must be exactly 11 digits");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            if (type.equals("Freezer") || type.equals("Outrigger") || type.equals("Stern")) {

            }

            else{
                throw new InputMismatchException("Only three allowable types of Shipping vessel:\n \tStern\n\tFreezer\n\tOutrigger");

            }
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
    public String toString(){
        return "Name:" + getName()+"\nID:"+getId()+"\nType:"+getType();
    }
}

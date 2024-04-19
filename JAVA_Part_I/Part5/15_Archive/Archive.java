
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier(){
        return identifier;
    }
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Archive)){
            return false;
        }

        Archive toCompare = (Archive) compared;

        if(this.identifier.equals(toCompare.identifier) &&
        this.name.equals(toCompare.name)){
            return true;
        }

        return false;
    }

    public String toString(){
        return identifier + ": " + name;
    }
}

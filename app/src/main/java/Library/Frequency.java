package Library;

public enum Frequency {
    DAILY ("Langage JAVA", "Eclipse"),
    WEEKLY ("Lanage C", "Code Block"),
    MONTHLY ("Langage C++", "Visual studio"),
    YEARLY ("Langage PHP", "PS Pad");

    private String name = "";
    private String editor = "";

    //Constructeur
    Langage(String name, String editor){
        this.name = name;
        this.editor = editor;
    }

    public void getEditor(){
        System.out.println("Editeur : " + editor);
    }

    public String toString(){
        return name;
    }
}

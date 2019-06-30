package Model;


public class FlashCard {

    private int mId;
    private String mRectoContent;
    private String mVersoContent;
    private Boolean mIsRectoNext;
    //TODO enum freq

    public FlashCard(int id, String rectoContent, String versoContent, Boolean isRectoNext) {
        this.mId = id;
        this.mRectoContent = rectoContent;
        this.mVersoContent = versoContent;
        this.mIsRectoNext = isRectoNext;
        //TODO enum freq
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getRectoContent() {
        return mRectoContent;
    }

    public void setRectoContent(String rectoContent) {
        this.mRectoContent = rectoContent;
    }

    public String getVersoContent() {
        return mVersoContent;
    }

    public void setVersoContent(String versoContent) {
        this.mVersoContent = versoContent;
    }

    public Boolean getRectoNext() {
        return mIsRectoNext;
    }

    public void setRectoNext(Boolean rectoNext) { mIsRectoNext = rectoNext; }

}

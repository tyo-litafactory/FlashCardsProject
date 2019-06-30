package Library;

import android.content.Context;

import com.example.flashcardproject.R;

public enum Frequency {
    DAILY ( "daily", 1),
    WEEKLY ( "weekly", 7),
    MONTHLY ( "monthly", 30),
    YEARLY ( "yearly", 365);

    private String freq_str;
    private int freq_num;

    //Constructeur
    Frequency(String freq_str, int freq_num){
        this.freq_str = freq_str;
        this.freq_num = freq_num;
    }

    public String getFreqStr(Context context){
        String freq = "";

        switch(freq_str)
        {
            case "daily":
                freq = context.getResources().getString(R.string.daily);
                break;
            case "weekly":
                freq = context.getResources().getString(R.string.weekly);
                break;
            case "monthly":
                freq = context.getResources().getString(R.string.monthly);
                break;
            case "yearly":
                freq = context.getResources().getString(R.string.yearly);
                break;
            default:
                break;
        }
        return freq;
    }

    public int getFreqNum(){ return freq_num; }
}

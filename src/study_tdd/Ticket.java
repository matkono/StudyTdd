package study_tdd;

public class Ticket {

    public Ticket(String code, String date, int value) {
        this.Code = code;
        this.Date = date;
        this.Value = value;
    }
    
    private final String Code;
    private final String Date;
    private int Value;
    
    public String getCode(){
        return this.Code;
    }
    
    public String getDate(){
        return this.Date;
    }
    
    public int getValue(){
        return this.Value;
    }
}

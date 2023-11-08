package class_Practice_Thursday.class6_1.test5;

public class SMS {
    private String SenderPhoneNumber;
    private String ReceiverPhoneNumber;
    private String Time;
    private String Msgtext;

    public SMS(String senderPhoneNumber, String receiverPhoneNumber, String time, String msgtext) {
        SenderPhoneNumber = senderPhoneNumber;
        ReceiverPhoneNumber = receiverPhoneNumber;
        Time = time;
        Msgtext = msgtext;
    }
    public SMS(String senderPhoneNumber,String receiverPhoneNumber){
        this(senderPhoneNumber,receiverPhoneNumber,"","");
    }
    public SMS(){
        this("","","","");
    }
    public void print(){
        System.out.println("송신자 : "+this.SenderPhoneNumber);
        System.out.println("시  각 : "+this.Time);
        System.out.println("메시지 : "+this.Msgtext);
    }

    public String getSenderPhoneNumber() {
        return SenderPhoneNumber;
    }

    public void setSenderPhoneNumber(String senderPhoneNumber) {
        SenderPhoneNumber = senderPhoneNumber;
    }

    public String getReceiverPhoneNumber() {
        return ReceiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        ReceiverPhoneNumber = receiverPhoneNumber;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getMsgtext() {
        return Msgtext;
    }

    public void setMsgtext(String msgtext) {
        Msgtext = msgtext;
    }
}

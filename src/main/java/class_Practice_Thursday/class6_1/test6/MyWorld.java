package class_Practice_Thursday.class6_1.test6;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MyWorld {
    private String UserName;
    private List<String> BestFriendName=new ArrayList<>();
    private List<MyWorldDTO> myworld=new ArrayList<>();
    private int popularity;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public List<String> getBestFriendName() {
        return BestFriendName;
    }

    public void setMyworld(MyWorld myworld) {
        MyWorldDTO myWorldDTO = new MyWorldDTO(myworld.getUserName(),myworld.getBestFriendName(),myworld.getPopularity());
        this.myworld.add(myWorldDTO);
        this.BestFriendName.add(myworld.getUserName());
        myworld.popularity++;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public MyWorld(String userName) {
        this.UserName=userName;
        this.popularity=0;
    }

    public MyWorld(String userName, List<String> bestFriendName, int popularity) {
        UserName = userName;
        BestFriendName = bestFriendName;
        this.popularity = popularity;
    }

    public MyWorld(){
        this.UserName="";
        this.popularity=0;
    }

    public void print(){
        System.out.println("==============================================================");
        System.out.println("이름 : "+this.UserName);
        if(BestFriendName.isEmpty()){
            System.out.println("절친 : 없음");
        }else{
            System.out.print("절친 : ");
            for(String name: this.BestFriendName){
                System.out.print(name+", ");
            }
            System.out.println("\b\b");
        }
        System.out.println("인기도 : "+this.popularity);
        System.out.println("==============================================================");
    }
}

package class_Practice_Thursday.class6_1.test6_professor;

import class_Practice_Thursday.class6_1.test6.MyWorld;
import class_Practice_Thursday.class6_1.test6.MyWorldDTO;

import java.util.ArrayList;
import java.util.List;

public class MyWorld2 {
    private String name;
    private MyWorld2 bestFriend;
    private int lovePoint;


    public MyWorld2(){
        this ("",null,0);
    }
    public MyWorld2(String name){
        this(name, null, 0);
    }
    public MyWorld2(String name, MyWorld2 bestFriend, int lovePoint) {
        this.name = name;
        this.bestFriend = bestFriend;
        this.lovePoint = lovePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyWorld2 getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(MyWorld2 bestFriend) {
        this.bestFriend = bestFriend;
    }

    public int getLovePoint() {
        return lovePoint;
    }

    public void setLovePoint(int lovePoint) {
        this.lovePoint = lovePoint;
    }

    public void incLovePoint(){
        lovePoint++;
    }


    public void print(){
        System.out.println("============================");
        System.out.println("이름 : " + name);
        if(bestFriend == null){
            System.out.println("베프 : 없음");
        }else{
            System.out.println("베프 : " + bestFriend.getName());
        }
        System.out.println("인기도 : " + lovePoint);
        System.out.println("============================");
    }
}

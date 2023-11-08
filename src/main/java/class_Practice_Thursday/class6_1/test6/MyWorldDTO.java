package class_Practice_Thursday.class6_1.test6;

import java.util.ArrayList;
import java.util.List;

public class MyWorldDTO {
    private String UserName;
    private List<String> BestFriendName;
    private int popularity;

    public MyWorldDTO(String userName, List<String> bestFriendName, int popularity) {
        UserName = userName;
        BestFriendName = bestFriendName;
        this.popularity = popularity;
    }

}

package com.kodilla.stream.forumuser;
import java.util.ArrayList;
import java.util.List;

public final class Forum {  //zwraca kolekcje uzytkownika

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1,"Jan Kowalski",
                'M',1998,12,12,5));
        forumUserList.add(new ForumUser(2,"Jan Nowak",
                'M',2005,8,15,10));
        forumUserList.add(new ForumUser(3,"Anna Nowak",
                'F',1998,1,10,1));
        forumUserList.add(new ForumUser(4,"Adam Stank",
                'M',1990,11,5,0));
        forumUserList.add(new ForumUser(5,"Jan Nowak",
                'F',1981,5,26,10));
        forumUserList.add(new ForumUser(6,"Beata Wisniewska",
                'F',1956,9,15,5));
        forumUserList.add(new ForumUser(7,"Jan Nowak",
                'F',2000,12,20,13));
        forumUserList.add(new ForumUser(7,"Jan Nowak",
                'M',1986,5,20,1));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}

package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main (String[] args){

        Forum forum = new Forum();

        Map<Integer,ForumUser> filtratedForumUserList = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getBirthDate().getYear()<=1998)
                .filter(forumUser -> forumUser.getPost()>=1)
                .collect(Collectors.toMap(forumUser->forumUser.getUserId(),forumUser->forumUser));

                filtratedForumUserList.entrySet().stream()
                        .map(entry->entry.getKey()+":"+entry.getValue())
                        .forEach(System.out::println);
    }
}

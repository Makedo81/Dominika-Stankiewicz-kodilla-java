package com.kodilla.testing.forum.statistics;
import java.util.ArrayList;


public class StatisticEstimate  {

    Statistics statistics;
    int postsCount;
    int commentsCount;
    int usersNames;
    int averagePostPerUser;
    int averageCommentsPerUser;
    int averageCommentsPerPost;

    public StatisticEstimate(Statistics statistics) {

        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        usersNames = statistics.userNames().size();
        averagePostPerUser = statistics.postsCount()/statistics.userNames().size();
        averageCommentsPerUser = statistics.commentsCount()/statistics.userNames().size();
        averageCommentsPerPost = statistics.commentsCount()/statistics.postsCount();

    }
}

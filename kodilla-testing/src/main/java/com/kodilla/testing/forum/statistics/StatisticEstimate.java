package com.kodilla.testing.forum.statistics;


public class StatisticEstimate {

    Statistics statistics;
    int forumUserscount=statistics.userNames().size();
    int forumPostCount=statistics.postsCount().size();
    int forumCommentsCount=statistics.commentsCount().size();
    int averagePostsPerUser;
    int averageCommentsPerUser;
    int averageCommentsPerPost;

    public StatisticEstimate(Statistics statistics) {
        this.statistics =statistics;
        this.averagePostsPerUser;
        this.averageCommentsPerUser;
        this.averageCommentsPerPost;
    }


    public double calculateAdvStatistics(Statistics statistics) {

    }
}*/

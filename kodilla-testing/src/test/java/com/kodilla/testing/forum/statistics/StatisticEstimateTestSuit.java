package com.kodilla.testing.forum.statistics; /*
import org.junit.Test;
import java.util.List;

public class StatisticEstimateTestSuit {
    @Test
    public void testCalculateAdvStatisticsForCommentsNumberLessThanPostNumber() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUsersNames = new List<>();
        forumUsersNames.add("user1");
        forumUsersNames.add("user2");
        forumUsersNames.add("user3");
        When(statisticsMock.usersNames()).thenReturn(usersNames);

        List<Integer> postsNumber = new List<Integer>();
        postsNumber.add(1);
        postsNumber.add(2);
        postsNumber.add(3);
        When(statisticsMock.postsCount()).thenReturn(postsNumber).size();

        List<Integer>commentsNumber = new List<>();
        commentsNumber.add(1);
        When(statisticsMock.commentsCount()).thenReturn(commentsNumber).size();

        StatisticEstimate estimator = new StatisticEstimate(StatisticsMock);
        //when
        int postNumbers = estimator.calculateAdvStatistics(statistics.postCount().size());
        int commentsNumber =estimator.calculateAdvStatistics(statistics.commentsCount.size());
        double averageCommentsPerPost = estimator.calculateAdvStatistics
                (statistics.commentsCount(),statistics.postsCount());

        //then
        assertEquals((1/3),averageCommentsPerPost);
    }
}*/

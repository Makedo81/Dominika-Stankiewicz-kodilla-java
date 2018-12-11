package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticEstimateTestSuit {
    @Test
    public void testCalculateAdvStatisticsForPostNumberEqualsZero() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticEstimate estimator = new StatisticEstimate(statisticsMock);

        int postsNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        //when
        estimator.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals((10),estimator.postsCount());
    }
    @Test
    public void testCalculateAdvStatisticsForPostNumberEquals100() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticEstimate estimator = new StatisticEstimate(statisticsMock);

        int postsNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        //when
        estimator.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(1000,estimator.postsCount());
    }
    @Test
    public void testCalculateAdvStatisticsForCommentsNumberLessThanPostNumber() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticEstimate estimator = new StatisticEstimate(statisticsMock);
        ArrayList<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        when(statisticsMock.userNames()).thenReturn(users);

        int postsNumber = 30;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        int commentsNumber = 15;
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        //when
        estimator.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals((10),estimator.averagePostPerUser);
    }
    @Test
    public void testCalculateAdvStatisticsForCommentsNumberMoreThanPostNumber() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticEstimate estimator = new StatisticEstimate(statisticsMock);
        int postsNumber = 30;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        int commentsNumber = 60;
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        //when
        estimator.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals((10),estimator.averagePostPerUser);
    }
}

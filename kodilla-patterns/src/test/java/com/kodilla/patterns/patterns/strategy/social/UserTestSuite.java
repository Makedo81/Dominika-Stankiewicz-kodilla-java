package com.kodilla.patterns.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User m = new Millenials("M");
        User y = new YGeneration("Y");
        User z = new ZGeneration("Z");

        //When
        String mShare = m.sharePost();
        System.out.println("M ");
        String yShare = y.sharePost();
        System.out.println("Y  ");
        String zShare = z.sharePost();
        System.out.println("Z "+zShare);

        //Then
        Assert.assertEquals("Sharing by Twitter",zShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User z = new ZGeneration("Z");

        //When
        String zShare = z.sharePost();
        System.out.println("Z  "+zShare);
        z.setSharePost(new SnapchatPublisher());
        zShare = z.sharePost();
        System.out.println("Z now "+zShare);

        //Then
        Assert.assertEquals("Sharing post by Snapchat",zShare);

    }
}

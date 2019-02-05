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
        System.out.println("M "+ mShare);
        String yShare = y.sharePost();
        System.out.println("Y "+ yShare);
        String zShare = z.sharePost();
        System.out.println("Z "+ zShare);

        //Then
        Assert.assertEquals("sharing post by Twitter",zShare);
        Assert.assertEquals("sharing post by Snapchat",mShare);
        Assert.assertEquals("sharing post by Facebook",yShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User z = new ZGeneration("Z");
        User m = new ZGeneration("M");
        User y = new ZGeneration("Y");

        //When
        String zShare = z.sharePost();
        System.out.println("Z  "+ zShare);
        z.setSharePost(new SnapchatPublisher());
        zShare = z.sharePost();
        System.out.println("Z now "+ zShare);

        String mShare = m.sharePost();
        System.out.println("M  "+ mShare);
        m.setSharePost(new TwitterPublisher());
        mShare = m.sharePost();
        System.out.println("M now "+ mShare);

        String yShare = y.sharePost();
        System.out.println("Y  "+ mShare);
        y.setSharePost(new FacebookPublisher());
        yShare = y.sharePost();
        System.out.println("M now "+yShare);

        //Then
        Assert.assertEquals("sharing post by Snapchat",zShare);
        Assert.assertEquals("sharing post by Twitter",mShare);
        Assert.assertEquals("sharing post by Facebook",yShare);
    }
}

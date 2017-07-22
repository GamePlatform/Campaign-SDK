package com.adviser.campaign.model

import org.junit.Assert
import org.junit.Test

/**
 * Created by youmin-Kim on 2017-07-15.
 */
class HttpRequestAgentTest {
    @Test
    fun getCampaignListTest(){
        val ci = HttpRequestAgent()
        val ci1 = CampaignInfo("1", "https://cdn.pixabay.com/photo/2016/04/13/21/32/lamb-1327753_960_720.jpg",1)
        val ci2 = CampaignInfo("2", "http://livedoor.blogimg.jp/daynew/imgs/1/4/14ed705b.jpg",1)
        val array = ArrayList<CampaignInfo>()
        array.add(ci1)
        array.add(ci2)
        Assert.assertEquals(array,ci.getCampaignList("location_id"))
    }

    @Test
    fun GETTest(){
        val ci = HttpRequestAgent()
        Assert.assertEquals("",ci.GET("http://211.253.28.194:30022/api/campaign/locations/"))
    }
}

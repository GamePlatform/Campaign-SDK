package com.adviser.campaign.model

import org.junit.Assert
import org.junit.Test

/**
 * Created by youmin-Kim on 2017-07-15.
 */
class CampaignInfoManagerTest {
    @Test
    fun loadCampaignTest(){
        val ci = CampaignInfoManager()
        val ci2 = HttpRequestAgent()
        ci.loadCampaign("location_id")
        Assert.assertEquals(ci.locationId,"location_id")
        Assert.assertEquals(ci.list,ci2.getCampaignList("location_id"))
    }

    @Test
    fun getNextCampaignTest(){
        val ci = CampaignInfoManager()
        ci.loadCampaign("location_id")
        val ci2 = CampaignInfo("1","https://cdn.pixabay.com/photo/2016/04/13/21/32/lamb-1327753_960_720.jpg",1)
        Assert.assertEquals(ci2,ci.getNextCampaign())
    }

    @Test
    fun getCampaignTest(){
        val ci = CampaignInfoManager()
        ci.loadCampaign("location_id")
        Assert.assertEquals(ci.getCampaign(0).id,"1")
    }

    @Test
    fun getCampaignCountTest(){
        val ci = CampaignInfoManager()
        val ci2 = CampaignInfo("id","url",1)
        Assert.assertEquals(ci.list.size,0)
    }
}
package com.adviser.campaign.model

import org.junit.Assert
import org.junit.Test

/**
 * Created by vaio on 2017-07-10.
 */
class CampaignInfoTest {
    @Test
    fun constructorTest(){
        val ci = CampaignInfo("id", "url", 1)
        Assert.assertEquals(ci.id, "id")
        Assert.assertEquals(ci.url, "url")
        Assert.assertEquals(ci.template, 1)
    }

    @Test
    fun equalsTest() {
        val ci = CampaignInfo("id", "url", 1)
        Assert.assertTrue(ci.equals(ci))
    }

    @Test
    fun hashCodeTest(){
        val ci = CampaignInfo("id", "url", 1)
        val test = ci.hashCode()
        Assert.assertEquals(test,ci.hashCode())
    }

    @Test
    fun toStringTest(){
        val ci = CampaignInfo("id", "url", 1)
        Assert.assertEquals("CampaignInfo(id='id', url='url', temp_num='1')",ci.toString())
    }

}
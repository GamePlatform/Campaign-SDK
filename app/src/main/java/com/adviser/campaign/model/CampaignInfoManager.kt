package com.adviser.campaign.model

import android.util.Log

/**
 * Created by Kairos on 2017. 6. 11..
 */
//데이터 계산 및 처리
class CampaignInfoManager {

  //UnitTest를 위해 변수들 private 속성 지움
  var agent = HttpRequestAgent()
  var locationId: String = ""
  var list = arrayListOf<CampaignInfo>()
  var cur: Int = 0

  fun loadCampaign(locationId: String) {
    Log.d("cl/CampaignInfoManager", "loadCampaign/Start")
    this.locationId = locationId
    this.list = agent.getCampaignList(locationId)
    Log.d("cl/CampaignInfoManager", "loadCampaign/Complete")
  }

  fun getNextCampaign(): CampaignInfo? {
    val ci: CampaignInfo? = list[cur++]
    Log.d("cl/CampaignInfoManager", "getNextCampaign/next: $ci")
    return ci
  }

  fun getCampaign(idx: Int): CampaignInfo {
    val campaign = list[idx]
    Log.d("cl/CampaignInfoManager", "getCampaign/idx: $idx, campaign: $campaign")
    return campaign
  }

  fun getCampaignCount(): Int {
    val size = list.size
    Log.d("cl/CampaignInfoManager", "getCampaignCount/next: $size")
    return size
  }

}
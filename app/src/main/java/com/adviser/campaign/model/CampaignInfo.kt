package com.adviser.campaign.model

/**
 * Created by Kairos on 2017. 6. 1..
 */

class CampaignInfo {
  val id: String
  val url: String // 이미지 url
  val template: Int //템플릿 변수

  constructor(id: String, url: String, template_num: Int) {
    this.id = id
    this.url = url
    this.template = template_num
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other?.javaClass != javaClass) return false

    other as CampaignInfo

    if (id != other.id) return false
    if (url != other.url) return false
    if (template != other.template) return false

    return true
  }

  override fun hashCode(): Int {
    var result = id.hashCode()
    result = 31 * result + url.hashCode()
    return result
  }

  override fun toString(): String {
    return "CampaignInfo(id='$id', url='$url', temp_num='$template')"
  }
}
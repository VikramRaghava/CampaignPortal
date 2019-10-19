/**
 * 
 */
package com.portal.service;

import java.util.List;

import com.portal.vo.CampaignVO;

/**
 * @author Vikram
 *
 */
public interface CampaignService {

	/**
	 * @param campaignObj
	 * @return 
	 */
	List<CampaignVO> getCampaignDetails(CampaignVO campaignObj);

}

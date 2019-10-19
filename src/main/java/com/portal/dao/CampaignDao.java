/**
 * 
 */
package com.portal.dao;

import java.util.List;

import com.portal.vo.CampaignVO;

/**
 * @author Vikram
 *
 */
public interface CampaignDao {

	/**
	 * @param campaignObj
	 * @return 
	 */
	List<CampaignVO> getCampaignDetails(CampaignVO campaignObj);

}

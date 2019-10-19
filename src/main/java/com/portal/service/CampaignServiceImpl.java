/**
 * 
 */
package com.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.dao.CampaignDao;
import com.portal.vo.CampaignVO;

/**
 * Class to implement business logic and other data validations.
 * This class can also be used to modify the data retrieved from DAO and 
 * amend it as per requirement and return it to controller.
 * 
 * @author Vikram
 *
 */
@Service
public class CampaignServiceImpl implements CampaignService {

	@Autowired
	CampaignDao campaignDao;

	@Override
	public List<CampaignVO> getCampaignDetails(CampaignVO campaignObj) {
		/**
		 * Any user validations and business logic validations can be performed
		 * here; final data to be queried to be prepared here.
		 */
		return campaignDao.getCampaignDetails(campaignObj);
	}

}

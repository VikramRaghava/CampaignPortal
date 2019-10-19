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
 * @author Vikram
 *
 */
@Service
public class CampaignServiceImpl implements CampaignService {
	
	@Autowired
	CampaignDao campaignDao;

	@Override
	public List<CampaignVO> getCampaignDetails(CampaignVO campaignObj) {
		return campaignDao.getCampaignDetails(campaignObj);
	}

}

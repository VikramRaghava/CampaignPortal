/**
 * 
 */
package com.portal.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.portal.vo.CampaignVO;

/**
 * Class to test the CampaignDAOImpl
 * 
 * @author Vikram
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CampaignDaoImplTest {
	
	CampaignDaoImpl campaignDao;
	
	CampaignVO campaignObj;
	
	@Before
	public void setUp() {
		campaignDao = new CampaignDaoImpl();
		campaignObj = new CampaignVO();
		populateCampaignObj();
	}
	
	private void populateCampaignObj() {
		campaignObj.setDepartment("Department A");
		campaignObj.setSection("SECTION B");
	}

	@Test
	public void getCampaignDetailsTest() {
		List<CampaignVO> campaignDetailsList = campaignDao.getCampaignDetails(campaignObj);
		Assert.assertNotNull(campaignDetailsList);
		Assert.assertTrue(campaignDetailsList.size() == 161);
	}

}

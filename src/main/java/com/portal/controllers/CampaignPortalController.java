/**
 * 
 */
package com.portal.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.portal.constants.CampaignConstants;
import com.portal.service.CampaignService;
import com.portal.vo.CampaignVO;

/**
 * This class contains all the API calls we will build to 
 * interact with the campaign data.
 * 
 * @author Vikram
 *
 */
@RestController
public class CampaignPortalController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CampaignPortalController.class);
	
	@Autowired
	CampaignService campaignService;

	/**
	 * API to get the campaign details.
	 * 
	 * @param campaignObj - the input data obtained
	 * @return list of campaignVO objects
	 * 
	 */
	@GetMapping(value = "/getCampaignDetails")
	public String getCampaignDetails(CampaignVO campaignObj) {
		LOGGER.info("Entering the logic of getCampaignDetails");
		String jsonResponse = CampaignConstants.EMPTY_STRING;
		ObjectMapper mapper = new ObjectMapper();
		try {
			jsonResponse = mapper.writeValueAsString(campaignService.getCampaignDetails(campaignObj));
		} catch (JsonProcessingException jsonException) {
			LOGGER.error("jsonException occured:: ", jsonException);
		}
		return jsonResponse;
	}
}

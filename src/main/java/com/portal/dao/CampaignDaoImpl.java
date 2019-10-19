/**
 * 
 */
package com.portal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.portal.exceptions.PortalException;
import com.portal.utility.PortalHelper;
import com.portal.vo.CampaignVO;

/**
 * @author Vikram
 *
 */
@Repository
@Transactional
public class CampaignDaoImpl implements CampaignDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(CampaignDaoImpl.class);

	private static final String GET_CAMPAIGN_DETAILS = "SELECT "
			+ "CAMPAIGN_NAME,CAMPAIGN_TYPE,CAMPAIGN_DATE,DEPARTMENT_CAT,SECTION_CAT,FAMILY_CAT,SUBFAMILY_CAT,"
			+ "PRODUCT_ID,PRODUCT_DESC,INCR_SALES,INCR_SALES_PER,INCR_MARGIN,INCR_TRAFFIC,INCR_BASKET,INCR_TSE,"
			+ "IPROMO_DEPTH,TOTAL_SALES,VOLUME_SOLD,PROMO_PRICE,SLASH_PRICE,COST_PRICE,INCR_TRAFFIC_PER,"
			+ "INCR_BASKET_PER,INCR_TSE_PER,PROMO_MECHANIC,SUPPLIER_ID FROM MAF_CAMPAIGN_HISTORY "
			+ "WHERE 1 = 1 ";

	@Autowired
	JdbcTemplate jdbcTemplate;

	protected Connection getConnection() throws SQLException {
		return jdbcTemplate.getDataSource().getConnection();
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<CampaignVO> getCampaignDetails(CampaignVO campaignObj) {
		LOGGER.debug("Quering DB for campaign details...");
		List<CampaignVO> campaignDetailsList = new ArrayList<CampaignVO>();
		Connection connection = null;
		PreparedStatement prepStatement = null;
		ResultSet resultSet = null;
		CampaignVO detailsVo = null;
		int index = 1;
		StringBuffer detailsQuery = new StringBuffer();
		detailsQuery.setLength(0);
		detailsQuery.append(GET_CAMPAIGN_DETAILS);
		if (null != campaignObj) {
			if (null != campaignObj.getDepartment() && !campaignObj.getDepartment().isEmpty()) {
				detailsQuery.append(" AND DEPARTMENT_CAT = ? ");
			}
			if (null != campaignObj.getSection() && !campaignObj.getSection().isEmpty()) {
				detailsQuery.append(" AND SECTION_CAT = ? ");
			}
			if (null != campaignObj.getFamily() && !campaignObj.getFamily().isEmpty()) {
				detailsQuery.append(" AND FAMILY_CAT IN ( ");
				for (int i = 0; i < campaignObj.getFamilyList().size(); i++) {
					detailsQuery.append("'?', ");
				}
				detailsQuery.substring(0, detailsQuery.length() - 1);
				detailsQuery.append(" ) ");
			}
			if (null != campaignObj.getSubCategory() && !campaignObj.getSubCategory().isEmpty()) {
				detailsQuery.append(" AND SUBFAMILY_CAT = ? ");
			}
		}

		try {
			connection = getConnection();
			prepStatement = connection.prepareStatement(detailsQuery.toString());
			if (null != campaignObj) {
				if (null != campaignObj.getDepartment() && !campaignObj.getDepartment().isEmpty()) {
					prepStatement.setString(index++, campaignObj.getDepartment());
				}
				if (null != campaignObj.getSection() && !campaignObj.getSection().isEmpty()) {
					prepStatement.setString(index++, campaignObj.getSection());
				}
				if (null != campaignObj.getFamily() && !campaignObj.getFamily().isEmpty()) {
					for (String familyName : campaignObj.getFamilyList()) {
						prepStatement.setString(index++, familyName);
					}
				}
				if (null != campaignObj.getSubCategory() && !campaignObj.getSubCategory().isEmpty()) {
					prepStatement.setString(index++, campaignObj.getSubCategory());
				}
			}

			resultSet = prepStatement.executeQuery();
			while (resultSet.next()) {
				detailsVo = new CampaignVO();
				detailsVo.setCampaignName(resultSet.getString("CAMPAIGN_NAME"));
				detailsVo.setCampaignType(resultSet.getString("CAMPAIGN_TYPE"));
				detailsVo.setCampaignDate(resultSet.getDate("CAMPAIGN_DATE"));
				detailsVo.setDepartment(resultSet.getString("DEPARTMENT_CAT"));
				detailsVo.setSection(resultSet.getString("SECTION_CAT"));
				detailsVo.setFamilyCategory(resultSet.getString("FAMILY_CAT"));
				detailsVo.setSubFamilyCategory(resultSet.getString("SUBFAMILY_CAT"));
				detailsVo.setProductId(resultSet.getLong("PRODUCT_ID"));
				detailsVo.setProductDesc(resultSet.getString("PRODUCT_DESC"));
				detailsVo.setIncrSales(resultSet.getDouble("INCR_SALES"));
				detailsVo.setIncrSalesPercent(resultSet.getDouble("INCR_SALES_PER"));
				detailsVo.setIncrMargin(resultSet.getDouble("INCR_MARGIN"));
				detailsVo.setIncrTraffic(resultSet.getDouble("INCR_TRAFFIC"));
				detailsVo.setIncrBasket(resultSet.getDouble("INCR_BASKET"));
				detailsVo.setIncrTse(resultSet.getDouble("INCR_TSE"));
				detailsVo.setIpromoDepth(resultSet.getDouble("IPROMO_DEPTH"));
				detailsVo.setTotalSales(resultSet.getDouble("TOTAL_SALES"));
				detailsVo.setVolumeSold(resultSet.getDouble("VOLUME_SOLD"));
				detailsVo.setPromoPrice(resultSet.getDouble("PROMO_PRICE"));
				detailsVo.setSlashPrice(resultSet.getDouble("SLASH_PRICE"));
				detailsVo.setCostPrice(resultSet.getDouble("COST_PRICE"));
				detailsVo.setIncrTrafficPercent(resultSet.getDouble("INCR_TRAFFIC_PER"));
				detailsVo.setIncrBasketPercent(resultSet.getDouble("INCR_BASKET_PER"));
				detailsVo.setIncrTsePercent(resultSet.getDouble("INCR_TSE_PER"));
				detailsVo.setPromoMechanic(resultSet.getString("PROMO_MECHANIC"));
				detailsVo.setSupplierId(resultSet.getLong("SUPPLIER_ID"));
				
				campaignDetailsList.add(detailsVo);
			}
			
		} catch (SQLException sqlException) {
			LOGGER.error("Exception while fetching data for campaign :: ", sqlException);
			throw new PortalException("Exception while fetching data for campaign!");
		} finally {
			PortalHelper.releaseResources(connection, prepStatement, resultSet);
		}
		return campaignDetailsList;
	}

}

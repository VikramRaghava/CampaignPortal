/**
 * 
 */
package com.portal.vo;

import java.sql.Date;
import java.util.List;

import com.portal.constants.CampaignConstants;

/**
 * @author Vikram
 *
 */
public class CampaignVO {

	private String department;

	private String section;

	private String family = CampaignConstants.EMPTY_STRING;

	private List<String> familyList = null;
	
	private String subCategory;
	
	private String campaignName;
	private String campaignType;
	private Date campaignDate;
	private String familyCategory;
	private String subFamilyCategory;
	private long productId;
	private String productDesc;
	private double incrSales;
	private double incrSalesPercent;
	private double incrMargin;
	private double incrTraffic;
	private double incrBasket;
	private double incrTse;
	private double ipromoDepth;
	private double totalSales;
	private double volumeSold;
	private double promoPrice;
	private double slashPrice;
	private double costPrice;
	private double incrTrafficPercent;
	private double incrBasketPercent;
	private double incrTsePercent;
	private String promoMechanic;
	private long supplierId;

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section
	 *            the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * @return the family
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * @param family
	 *            the family to set
	 */
	public void setFamily(String family) {
		this.family = family;
	}

	/**
	 * @return the familyList
	 */
	public List<String> getFamilyList() {
		return familyList;
	}

	/**
	 * @param familyList
	 *            the familyList to set
	 */
	public void setFamilyList(List<String> familyList) {
		this.familyList = familyList;
	}

	/**
	 * @return the subCategory
	 */
	public String getSubCategory() {
		return subCategory;
	}

	/**
	 * @param subCategory the subCategory to set
	 */
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	/**
	 * @return the campaignName
	 */
	public String getCampaignName() {
		return campaignName;
	}

	/**
	 * @param campaignName the campaignName to set
	 */
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	/**
	 * @return the campaignType
	 */
	public String getCampaignType() {
		return campaignType;
	}

	/**
	 * @param campaignType the campaignType to set
	 */
	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

	/**
	 * @return the campaignDate
	 */
	public Date getCampaignDate() {
		return campaignDate;
	}

	/**
	 * @param campaignDate the campaignDate to set
	 */
	public void setCampaignDate(Date campaignDate) {
		this.campaignDate = campaignDate;
	}

	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}

	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	/**
	 * @return the incrSales
	 */
	public double getIncrSales() {
		return incrSales;
	}

	/**
	 * @param incrSales the incrSales to set
	 */
	public void setIncrSales(double incrSales) {
		this.incrSales = incrSales;
	}

	/**
	 * @return the incrSalesPercent
	 */
	public double getIncrSalesPercent() {
		return incrSalesPercent;
	}

	/**
	 * @param incrSalesPercent the incrSalesPercent to set
	 */
	public void setIncrSalesPercent(double incrSalesPercent) {
		this.incrSalesPercent = incrSalesPercent;
	}

	/**
	 * @return the incrMargin
	 */
	public double getIncrMargin() {
		return incrMargin;
	}

	/**
	 * @param incrMargin the incrMargin to set
	 */
	public void setIncrMargin(double incrMargin) {
		this.incrMargin = incrMargin;
	}

	/**
	 * @return the incrTraffic
	 */
	public double getIncrTraffic() {
		return incrTraffic;
	}

	/**
	 * @param incrTraffic the incrTraffic to set
	 */
	public void setIncrTraffic(double incrTraffic) {
		this.incrTraffic = incrTraffic;
	}

	/**
	 * @return the incrBasket
	 */
	public double getIncrBasket() {
		return incrBasket;
	}

	/**
	 * @param incrBasket the incrBasket to set
	 */
	public void setIncrBasket(double incrBasket) {
		this.incrBasket = incrBasket;
	}

	/**
	 * @return the incrTse
	 */
	public double getIncrTse() {
		return incrTse;
	}

	/**
	 * @param incrTse the incrTse to set
	 */
	public void setIncrTse(double incrTse) {
		this.incrTse = incrTse;
	}

	/**
	 * @return the ipromoDepth
	 */
	public double getIpromoDepth() {
		return ipromoDepth;
	}

	/**
	 * @param ipromoDepth the ipromoDepth to set
	 */
	public void setIpromoDepth(double ipromoDepth) {
		this.ipromoDepth = ipromoDepth;
	}

	/**
	 * @return the totalSales
	 */
	public double getTotalSales() {
		return totalSales;
	}

	/**
	 * @param totalSales the totalSales to set
	 */
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	/**
	 * @return the volumeSold
	 */
	public double getVolumeSold() {
		return volumeSold;
	}

	/**
	 * @param volumeSold the volumeSold to set
	 */
	public void setVolumeSold(double volumeSold) {
		this.volumeSold = volumeSold;
	}

	/**
	 * @return the promoPrice
	 */
	public double getPromoPrice() {
		return promoPrice;
	}

	/**
	 * @param promoPrice the promoPrice to set
	 */
	public void setPromoPrice(double promoPrice) {
		this.promoPrice = promoPrice;
	}

	/**
	 * @return the slashPrice
	 */
	public double getSlashPrice() {
		return slashPrice;
	}

	/**
	 * @param slashPrice the slashPrice to set
	 */
	public void setSlashPrice(double slashPrice) {
		this.slashPrice = slashPrice;
	}

	/**
	 * @return the costPrice
	 */
	public double getCostPrice() {
		return costPrice;
	}

	/**
	 * @param costPrice the costPrice to set
	 */
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	/**
	 * @return the incrTrafficPercent
	 */
	public double getIncrTrafficPercent() {
		return incrTrafficPercent;
	}

	/**
	 * @param incrTrafficPercent the incrTrafficPercent to set
	 */
	public void setIncrTrafficPercent(double incrTrafficPercent) {
		this.incrTrafficPercent = incrTrafficPercent;
	}

	/**
	 * @return the incrBasketPercent
	 */
	public double getIncrBasketPercent() {
		return incrBasketPercent;
	}

	/**
	 * @param incrBasketPercent the incrBasketPercent to set
	 */
	public void setIncrBasketPercent(double incrBasketPercent) {
		this.incrBasketPercent = incrBasketPercent;
	}

	/**
	 * @return the incrTsePercent
	 */
	public double getIncrTsePercent() {
		return incrTsePercent;
	}

	/**
	 * @param incrTsePercent the incrTsePercent to set
	 */
	public void setIncrTsePercent(double incrTsePercent) {
		this.incrTsePercent = incrTsePercent;
	}

	/**
	 * @return the promoMechanic
	 */
	public String getPromoMechanic() {
		return promoMechanic;
	}

	/**
	 * @param promoMechanic the promoMechanic to set
	 */
	public void setPromoMechanic(String promoMechanic) {
		this.promoMechanic = promoMechanic;
	}

	/**
	 * @return the supplierId
	 */
	public long getSupplierId() {
		return supplierId;
	}

	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * @return the familyCategory
	 */
	public String getFamilyCategory() {
		return familyCategory;
	}

	/**
	 * @param familyCategory the familyCategory to set
	 */
	public void setFamilyCategory(String familyCategory) {
		this.familyCategory = familyCategory;
	}

	/**
	 * @return the subFamilyCategory
	 */
	public String getSubFamilyCategory() {
		return subFamilyCategory;
	}

	/**
	 * @param subFamilyCategory the subFamilyCategory to set
	 */
	public void setSubFamilyCategory(String subFamilyCategory) {
		this.subFamilyCategory = subFamilyCategory;
	}

	@Override
	public String toString() {
		return "CampaignVO [department=" + department + ", section=" + section + ", family=" + family + ", familyList="
				+ familyList + ", subCategory=" + subCategory + ", campaignName=" + campaignName + ", campaignType="
				+ campaignType + ", campaignDate=" + campaignDate + ", familyCategory=" + familyCategory
				+ ", subFamilyCategory=" + subFamilyCategory + ", productId=" + productId + ", productDesc="
				+ productDesc + ", incrSales=" + incrSales + ", incrSalesPercent=" + incrSalesPercent + ", incrMargin="
				+ incrMargin + ", incrTraffic=" + incrTraffic + ", incrBasket=" + incrBasket + ", incrTse=" + incrTse
				+ ", ipromoDepth=" + ipromoDepth + ", totalSales=" + totalSales + ", volumeSold=" + volumeSold
				+ ", promoPrice=" + promoPrice + ", slashPrice=" + slashPrice + ", costPrice=" + costPrice
				+ ", incrTrafficPercent=" + incrTrafficPercent + ", incrBasketPercent=" + incrBasketPercent
				+ ", incrTsePercent=" + incrTsePercent + ", promoMechanic=" + promoMechanic + ", supplierId="
				+ supplierId + "]";
	}

}

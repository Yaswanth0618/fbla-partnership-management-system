package com.yash.pms.model;

import java.util.Objects;

public class Partner {
	
	String partnerId;
	String orgType;
	String orgName;
	String fullName;
	String email;
	String mobile;
	@Override
	public String toString() {
		return "Partner [partnerId=" + partnerId + ", orgType=" + orgType + ", orgName=" + orgName + ", fullName="
				+ fullName + ", email=" + email + ", mobile=" + mobile + ", resources=" + resources + ", address="
				+ address + ", state=" + state + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, city, email, fullName, mobile, orgName, orgType, partnerId, resources, state,
				zipCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partner other = (Partner) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(email, other.email) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(orgName, other.orgName)
				&& Objects.equals(orgType, other.orgType) && partnerId == other.partnerId
				&& Objects.equals(resources, other.resources) && Objects.equals(state, other.state)
				&& Objects.equals(zipCode, other.zipCode);
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getResources() {
		return resources;
	}
	public void setResources(String resources) {
		this.resources = resources;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	String resources;
	String address;
	String state;
	String city;
	String zipCode;

}

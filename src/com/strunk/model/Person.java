package com.strunk.model;

import java.util.Date;

public class Person {
	
	private String name ;
	private String sex ;
	private Date brith ;
	private String mediaIds ;
	private String mediaTypes ;
	private String mediaUrls ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBrith() {
		return brith;
	}
	public void setBrith(Date brith) {
		this.brith = brith;
	}
	public String getMediaIds() {
		return mediaIds;
	}
	public void setMediaIds(String mediaIds) {
		this.mediaIds = mediaIds;
	}
	public String getMediaTypes() {
		return mediaTypes;
	}
	public void setMediaTypes(String mediaTypes) {
		this.mediaTypes = mediaTypes;
	}
	public String getMediaUrls() {
		return mediaUrls;
	}
	public void setMediaUrls(String mediaUrls) {
		this.mediaUrls = mediaUrls;
	}
	
	
	
}

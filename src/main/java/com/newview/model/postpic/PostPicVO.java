package com.newview.model.postpic;

import java.util.Arrays;

public class PostPicVO implements java.io.Serializable{
	
	private Integer postPicID;
	private Integer postID;
	private byte[] postPic;
	
	
	public PostPicVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PostPicVO(Integer postPicID, Integer postID, byte[] postPic) {
		super();
		this.postPicID = postPicID;
		this.postID = postID;
		this.postPic = postPic;
	}

	public Integer getPostPicID() {
		return postPicID;
	}
	public void setPostPicID(Integer postPicID) {
		this.postPicID = postPicID;
	}
	public Integer getPostID() {
		return postID;
	}
	public void setPostID(Integer postID) {
		this.postID = postID;
	}
	public byte[] getPostPic() {
		return postPic;
	}
	public void setPostPic(byte[] postPic) {
		this.postPic = postPic;
	}
	
	
	@Override
	public String toString() {
		return "PostPicVO [postPicID=" + postPicID + ", postID=" + postID + ", postPic=" + Arrays.toString(postPic)
				+ "]";
	}
	
	
	

}

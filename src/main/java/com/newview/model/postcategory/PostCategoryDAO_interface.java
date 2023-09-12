package com.newview.model.postcategory;

import java.util.List;



public interface PostCategoryDAO_interface {
	public void insert(PostCategoryVO postCategoryVO);
	public void update(PostCategoryVO PostCategoryVO);
	public PostCategoryVO findByPrimaryKey(Integer PostCategoryID);
	public List<PostCategoryVO> getAll();
}

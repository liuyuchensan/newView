package com.newview.model.compic;

import java.util.List;


public interface ComPicDAO_Interface {
	public void insert(ComPicVO comPicVO);
    public void delete(Integer comPicID);
   
    public ComPicVO findByPrimaryKey(Integer comPicID);
    public List<ComPicVO> getAll();
}

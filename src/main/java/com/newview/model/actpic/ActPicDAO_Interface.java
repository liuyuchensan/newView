package com.newview.model.actpic;

import java.util.List;

public interface ActPicDAO_Interface {
	public void insert(ActPicVO actPicVO);
    
    public void delete(Integer actPicID);
    public ActPicVO findByPrimaryKey(Integer actPicID);
    public List<ActPicVO> getAll();
}

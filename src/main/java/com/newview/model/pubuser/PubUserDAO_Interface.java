package com.newview.model.pubuser;

import java.util.List;

public interface PubUserDAO_Interface {
	public void insert(PubUserVO pubUserVO);
	public void update(PubUserVO pubUserVO);
	public void delete(Integer pubUserID);
	PubUserVO findByPK(Integer pubUserID);
	List<PubUserVO> getAll();
}

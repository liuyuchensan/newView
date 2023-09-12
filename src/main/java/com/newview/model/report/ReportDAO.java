package com.newview.model.report;

import java.util.List;


public interface ReportDAO {
	public void insert(ReportVO reportVO);
	public void update(ReportVO reportVO);
	public void delete(Integer reportID);
	public ReportVO findeByPrimaryKey(Integer reportID);
	public List<ReportVO> getAll();
//	 萬用複合查詢(傳入參數型態Map)(回傳List)
//	public List<ReportVO> getAll(Map<String, String[]> map);

}

/**  
* @Title: PagingUtil.java
* @Package com.nevile.rts.java.utils
* @Description: TODO
* @author Nevile  
* @date 2018年5月26日 下午8:56:39
* @version V1.0  
*/
package com.nevile.rts.java.utils;

/**
* @author Nevile QQ1102739617
* @version 创建时间：2018年5月26日 下午8:56:39
* 
*/
/**
 * ClassName: PagingUtil
 * 
 * @Description: 分页类
 */
public class PagingUtil {

	private Integer totalRows = 0;
	private Integer size = 15;
	private Integer pageNum = 1;
	private Integer totalPages;

	// 初始化数据量
	public PagingUtil(Integer totalRows) {
		this.totalRows = totalRows;
		totalPages = totalRows / size + 1;
	}
	
	// 初始化数据量
	public PagingUtil(Integer totalRows,Integer size) {
		this.size = size;
		this.totalRows = totalRows;
		totalPages = totalRows / size + 1;
	}


	// 上一页
	public Integer getPrevious() {
		pageNum = (pageNum <= 1) ? 1 : pageNum - 1;
		return pageNum;
	}

	// 下一页
	public Integer getNext() {
		pageNum = (pageNum >= totalPages) ? totalPages : pageNum + 1;
		return pageNum;
	}
	//当前起始行数
	public Integer startRow() {
		return (pageNum-1)*size;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	
	

}

/**
 * 
 */
package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * @Description为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 * @author zych1108
 * @version
 * @date 2021年6月2日下午3:05:34
 */
public class CustomerList {
	private Customer[] customers;//用来保存客户对象的数组
	private int total = 0;//记录已保存客户对象的数量
    
	/**
	 * 用途：构造器，用来初始化customers数组
	 * @param totalCustomer:指定数组的长度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * @Description 用途：将参数customer添加到数组中最后一个客户对象记录之后
	 * @param customer
	 * @return 返回：添加成功返回true；false表示数组已满，无法添加
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length) {
			return false;
		}else{
			customers[total++] = customer;
		    return true;
		}	
	}
	
	/** 
	 * @Description用途：用参数customer替换数组中由index指定的对象
	 * @param index
	 * @param cust
	 * @return 替换成功返回true；false表示索引无效，无法替换
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}else {
			customers[index] = cust;
			return true;
		}
	}
	
	/**
	 * @Description用途：从数组中删除参数index指定索引位置的客户对象记录
	 * @param index指定所删除对象在数组中的索引位置，从0开始
	 * @return 删除成功返回true；false表示索引无效，无法删除
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}else {
			for(int i = index;i < total - 1;i++) {
				customers[i] = customers[i + 1];
			}   //这个表示从index位置开始，数组后一个元素向前移。
//			customers[total-1] = null;//最后一个值为null
//			total--;//删除了一个元素，应当总数-1.
			
			customers[--total] = null;//体会。
			return true;
		}
		
	}
	
	/**
	 * @Description用途：返回数组中记录的所有客户对象
	 * @return返回： Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
	 */
	public Customer[] getAllCustomers() {
//		return customers;//不能直接返回customers，因为它里面有null值
		Customer[] custs = new Customer[total];//total记录的是customers中客户的个数，因此它代表里面实际有多少客户
		for(int i = 0;i<total;i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	
	/**
	 * @Description用途：返回参数index指定索引位置的客户对象记录
	 * @param index 参数： index指定所要获取的客户在数组中的索引位置，从0开始
	 * @return 返回：封装了客户信息的Customer对象
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	
	/**
	 * @Description 获取存储的客户的数量
	 */
	public int getTotal() {
		return total;
	}

}

package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface Itemdao {
	
	public Item saveItem(int mid,Item item);
	
	public Item getItemId(int iid);
	
	public boolean deletItemId(int iid);
	
	public Item updateItemId(int iid,Item item);
	
	public List<Item> getAllItems();

}

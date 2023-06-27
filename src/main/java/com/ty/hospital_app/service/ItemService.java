package com.ty.hospital_app.service;

import java.util.List;

import com.ks.hospital_app.dao.imp.ItemdaoImp;
import com.ty.hospital_app.dao.Itemdao;
import com.ty.hospital_app.dto.Item;

public class ItemService {
	public void saveItem(int mid, Item item) {
		ItemdaoImp itemdaoImp=new ItemdaoImp();
		Item item2=itemdaoImp.saveItem(mid, item);
		if(item2!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("data not saved");
		}
	}
	public Item getItemId(int iid) {
		ItemdaoImp itemdaoImp=new ItemdaoImp();
		Item item=itemdaoImp.getItemId(iid);
		if(item!=null) {
			return item;
		}
		else {
			return null;
		}
	}
	public void deletItemId(int iid) {
		ItemdaoImp itemdaoImp=new ItemdaoImp();
		boolean flag=itemdaoImp.deletItemId(iid);
		if(flag) {
			System.out.println("data deleated");
		}
		else {
			System.out.println("not deleated");
		}
	}
	public Item updateItemId(int iid, Item item) {
		ItemdaoImp itemdaoImp2=new ItemdaoImp();
		Item item2=itemdaoImp2.updateItemId(iid, item);
		if(item2!=null) {
			return item2;
		}
		else {
			return null;
		}
	}


}


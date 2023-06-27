package com.ty.hospital_app.service;

import com.ks.hospital_app.dao.imp.AddressdaoImp;
import com.ty.hospital_app.dto.Address;

public class AddressService {
	public void saveAddress(int bid, Address adress) {
		AddressdaoImp addressdaoImp=new AddressdaoImp();
		Address address=addressdaoImp.saveAddress(bid, adress);
		if(adress!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfirtunatly data not saved");
		}
	}
	public Address getAddressId(int aid) {
		AddressdaoImp addressdaoImp=new AddressdaoImp();
		Address address=addressdaoImp.getAddressId(aid);
		if(address!=null) {
			return address;
		}
		else {
			return null;
		}
	}
	public void deletadressId(int aid) {
		AddressdaoImp addressdaoImp=new AddressdaoImp();
		boolean flag=addressdaoImp.deletadressId(aid);
		if(flag) {
			System.out.println("deleated");
		}
		else {
			System.out.println("not deleated");
		}
	}
	public Address updateAdress(int aid, Address adress) {
		AddressdaoImp addressdaoImp=new AddressdaoImp();
		Address address=addressdaoImp.updateAdress(aid, adress);
		if(address!=null) {
			return address;
		}
		else {
			return null;
		}
	}


}

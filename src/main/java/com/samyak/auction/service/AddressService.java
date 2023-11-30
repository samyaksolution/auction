package com.samyak.auction.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.samyak.auction.repository.AddressRepository;

public class AddressService implements IAddress
{

			@Autowired
			private AddressRepository addressRepository;

			public void service()
			{
					

			}
}

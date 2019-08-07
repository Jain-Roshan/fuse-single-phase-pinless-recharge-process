package com.telkom.singlephase.utility;

import java.util.ArrayList;
import java.util.List;

import com.telkom.singlephase.balanceadjustment.Amount;
import com.telkom.singlephase.balanceadjustment.PostBalanceAdjustment;
import com.telkom.singlephase.balanceadjustment.Product;
import com.telkom.singlephase.balancetopup.BalanceTopUp;
import com.telkom.singlephase.productorder.Characteristic;
import com.telkom.singlephase.productorder.OrderItem;
import com.telkom.singlephase.productorder.PostProductOrder;
import com.telkom.singlephase.productorder.ProductOffering;

public class Mapper {
	
	public static PostBalanceAdjustment mapFromBalanceTopUpToBalanceAdjustment(BalanceTopUp balanceTopUp)
	{
		PostBalanceAdjustment balanceAdjustment = new PostBalanceAdjustment();
		Product product = new Product();
		Amount amount = new Amount();
		List<com.telkom.singlephase.balanceadjustment.Characteristic> characteristicList = new ArrayList<>();
		com.telkom.singlephase.balanceadjustment.Characteristic characteristic = new com.telkom.singlephase.balanceadjustment.Characteristic();
		if(null != balanceTopUp)
		{
			balanceAdjustment.setType(balanceTopUp.getType());
			if(null != balanceTopUp.getProduct())
				product.setId(balanceTopUp.getProduct().getId());
			if(null != balanceTopUp.getAmount())
				amount.setAmount(balanceTopUp.getAmount().getAmount());
			if(null != balanceTopUp.getChannel())
			{
				characteristic.setValue(balanceTopUp.getChannel().getId());
				characteristic.setName("requestorid");
				characteristicList.add(characteristic);
			}
			
		}

		balanceAdjustment.setProduct(product);
		balanceAdjustment.setAmount(amount);
		balanceAdjustment.setCharacteristic(characteristicList);
		
		return balanceAdjustment;
	}
	
	public static PostProductOrder mapFromBalanceTopUpToProductOrder(BalanceTopUp balanceTopUp)
	{
		PostProductOrder productOrder = new PostProductOrder();
		OrderItem orderItem = new OrderItem();
		List<OrderItem> orderItems = new ArrayList<>();
		com.telkom.singlephase.productorder.Product product = new com.telkom.singlephase.productorder.Product();
		List<Characteristic> characteristicList = new ArrayList<>();
		ProductOffering productOffering = new ProductOffering();
		
		String isRatePlan = "True";//System.property.isRatePlan = True
		String isValidNextBillCycle = "False";//System.property.isValidNextBillCycle = False
		String action = "add"; //System.property.action = add
		String notifyCustomer = "True"; //System.property.notifyCustomer = True
		
		if(null != balanceTopUp)
		{
			if(isRatePlan.equalsIgnoreCase("True"))
			{
				Characteristic characteristic = new Characteristic();
				characteristic.setValue("True"); 
				characteristic.setName("isChangeRatePlan");
				characteristicList.add(characteristic);
			}
			if(isValidNextBillCycle.equalsIgnoreCase("False"))
			{
				Characteristic characteristic = new Characteristic();
				characteristic.setValue("False"); 
				characteristic.setName("isValidNextBillCycle");
				characteristicList.add(characteristic);
			}
			/*if(notifyCustomer.equalsIgnoreCase("True"))
			{
				Characteristic characteristic = new Characteristic();
				characteristic.setValue("True"); 
				characteristic.setName("notifyCustomer");
				characteristicList.add(characteristic);
			}*/
			for(com.telkom.singlephase.balancetopup.Characteristic balanceTopUpChar : balanceTopUp.getCharacteristic())
			{
				if(balanceTopUpChar.getName().equalsIgnoreCase("ServicePackCode"))
				{
					productOffering.setId(balanceTopUpChar.getValue());
				}
			}
			if(action.equalsIgnoreCase("add"))
				orderItem.setAction("add");
			
			
		}
		
		product.setCharacteristic(characteristicList);
		orderItem.setProduct(product);
		orderItem.setProductOffering(productOffering);
		orderItems.add(orderItem);
		productOrder.setOrderItem(orderItems);
		return productOrder;
	}

}

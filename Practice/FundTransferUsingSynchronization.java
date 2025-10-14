package com.rahul.synchronization;

public class FundTransferUsingSynchronization {

	public static void main(String[] args) {
		FundTransfer ft = new FundTransfer();
		
		FundTransferThread ftt = new FundTransferThread(ft);
		ftt.amount=800;
		
		FundTransferThread ftt1 = new FundTransferThread(ft);
		ftt1.amount=400;
		
		ftt.start();
		ftt1.start();
		

	}

}

package com.rahul.synchronization;

public class FundTransferThread extends Thread {

	FundTransfer ft;

	int amount;

	public FundTransferThread(FundTransfer ft) {
		this.ft = ft;
	}

	@Override
	public void run() {
		ft.fundTransfers(amount);
	}

}

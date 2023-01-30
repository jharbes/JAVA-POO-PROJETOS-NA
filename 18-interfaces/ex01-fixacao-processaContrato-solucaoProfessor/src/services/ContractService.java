package services;

import entities.Contract;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		super();
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {

	}

	public OnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}

	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

}

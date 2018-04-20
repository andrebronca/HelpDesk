package com.andrebronca.helpdesk.api.enums;

public enum StatusEnum {
	
	New,
	Assigned,
	Resolved,
	Approved,
	Disaproved,
	Close;
	
	public static StatusEnum getStatus(String status) {
		switch (status) {
			case "New": return New;
			case "Resolved": return Resolved;
			case "Assigned": return Assigned;
			case "Approved": return Approved;
			case "Disaproved": return Disaproved;
			case "Close": return Close;
			default: return New;
		}
	}
	
}

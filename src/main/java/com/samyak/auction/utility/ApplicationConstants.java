package com.samyak.auction.utility;

public final class ApplicationConstants {
	
	public enum RecordStatus{
		
		YES("Y"), NO("N");
		
		private final String status ;
		
		private RecordStatus(String recordStatus) {
			this.status=recordStatus ;
		}
		
		public String getRecordStatus() {
			return status ;
		}
	}

}

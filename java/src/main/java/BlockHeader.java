import java.util.Date;

public class BlockHeader {

	private String payload_hash;
	private Date timestamp;
	private String prev_hash;
	private int total_transactions;
	
	public String getPayload_hash() {
		return payload_hash;
	}
	public void setPayload_hash(String payload_hash) {
		this.payload_hash = payload_hash;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getPrev_hash() {
		return prev_hash;
	}
	public void setPrev_hash(String prev_hash) {
		this.prev_hash = prev_hash;
	}
	public int getTotal_transactions() {
		return total_transactions;
	}
	public void setTotal_transactions(int total_transactions) {
		this.total_transactions = total_transactions;
	}
	
	@Override
	public String toString(){
		return payload_hash + timestamp.toString()+ prev_hash + total_transactions;
		
	}
}

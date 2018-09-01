import java.util.*;

class RecordList{
	ArrayList<Record> records = new ArrayList<Record>();
	Record firstRecord;

	public static void main(String[] args){

		RecordList newRecordList = new RecordList();
		newRecordList.run();
	}

	void run(){

		firstRecord = new Record();
		records.add(firstRecord);
		firstRecord.createGenesisNode("30");
	}
}

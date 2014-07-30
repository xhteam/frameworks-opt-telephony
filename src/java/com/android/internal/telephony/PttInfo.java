package com.android.internal.telephony;

import android.os.Parcel;

public class PttInfo{
	static final String LOG_TAG = "PttInfo";
	public final static int PTT_BIZSTATE_GID_VALID = 0x01;
	public final static int PTT_BIZSTATE_GPRIORITY_VALID = 0x02;
	public final static int PTT_BIZSTATE_GDEMANDIND_VALID = 0x04;
	public final static int PTT_BIZSTATE_GGRANTSTATUS_VALID = 0x08;
	public final static int PTT_BIZSTATE_GSPKNUM_VALID = 0x10;
	public final static int PTT_BIZSTATE_GSPKNAME_VALID = 0x20;
	public final static int PTT_BIZSTATE_GOWNERIND_VALID = 0x40;


	public final static int PTT_BIZSTATE_CIPRIORITY_VALID = 0x01;
	public final static int PTT_BIZSTATE_CICALLEEID_VALID = 0x02;
	public final static int PTT_BIZSTATE_CICALLERID_VALID = 0x04;

	public int pttstate=-1;

	public int givalid=-1;
	public int gid=-1;
	public int gpriority=-1;
	public int gdemandindicator=-1;
	public int ggrantstatus=-1;
	public String gspeakernum="-1";
	public String gspeakername="-1";
	public int gownerindicator=-1;
	
	public int civalid=-1;
	public int cpriority=-1;
	public String ccalleeid="-1";
	public String ccallerid="-1";

	public void readGroupInfo(Parcel p){
		int valid = givalid;    
		if(0 != (valid & PTT_BIZSTATE_GID_VALID))
			this.gid = p.readInt();
		if(0 != (valid&PTT_BIZSTATE_GPRIORITY_VALID))
			this.gpriority = p.readInt();
		if(0 != (valid&PTT_BIZSTATE_GDEMANDIND_VALID))
			this.gdemandindicator = p.readInt();
		if(0 != (valid&PTT_BIZSTATE_GGRANTSTATUS_VALID))
			this.ggrantstatus = p.readInt();
		if(0 != (valid&PTT_BIZSTATE_GSPKNUM_VALID))
			this.gspeakernum = p.readString();
		if(0 != (valid&PTT_BIZSTATE_GSPKNAME_VALID))
			this.gspeakername = p.readString();
		if(0 != (valid&PTT_BIZSTATE_GOWNERIND_VALID))
			this.gownerindicator = p.readInt();
	}
	
	public void readPersonCallInfo(Parcel p){
		int valid = this.civalid;    
		if(0 != (valid&PTT_BIZSTATE_CIPRIORITY_VALID))
			this.cpriority = p.readInt();
		if(0 != (valid&PTT_BIZSTATE_CICALLEEID_VALID))
			this.ccalleeid = p.readString();
		if(0 != (valid&PTT_BIZSTATE_CICALLERID_VALID))
			this.ccallerid = p.readString();
	}

	public String toString(){
		String str = "pttstate: "+pttstate+" givalid: "+givalid+ " gid: "+gid+
		" gpriority: "+gpriority+
		" gdemandindicator: "+gdemandindicator+
		" ggrantstatus: "+ggrantstatus+
		" gspeakernum: "+gspeakernum+
		" gspeakername: "+gspeakername+
		" gownerindicator: "+gownerindicator+
		" civalid: "+civalid+
		" cpriority: "+cpriority+
		" ccalleeid: "+ccalleeid+
		" ccallerid: "+ccallerid;
		return str;		
	}
	
}

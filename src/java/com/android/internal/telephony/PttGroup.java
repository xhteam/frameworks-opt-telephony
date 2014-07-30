package com.android.internal.telephony;

import com.android.internal.telephony.GroupInfo;

import java.util.ArrayList;
import java.util.List;


public class PttGroup {
    static final String LOG_TAG = "RILB";
	public int groups_number;
	public int dyn_groups_number;
    public String tun;
	public List<GroupInfo>  ginfoList;
	
	public PttGroup(){
		ginfoList = new ArrayList<GroupInfo>();
	}

	public void addGroupInfo(GroupInfo groupInfo){
		ginfoList.add(groupInfo);
	}
}

	

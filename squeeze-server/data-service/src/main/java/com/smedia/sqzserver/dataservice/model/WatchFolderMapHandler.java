package com.smedia.sqzserver.dataservice.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

import com.smedia.sqzserver.dataservice.model.base.WatchFolderAttr;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderPlugin;

public class WatchFolderMapHandler implements ResultHandler {

	public Map<String, String> attrMap = new HashMap<String, String>();
	public Map<String, String> pluginMap = new HashMap<String, String>();

	@Override
	public void handleResult(ResultContext context) {
		Object o = context.getResultObject();
		if(o instanceof WatchFolderPlugin) {
			WatchFolderPlugin p = (WatchFolderPlugin)o;
			pluginMap.put(p.getPhaseType(), p.getPluginType());
		} else if ( o instanceof WatchFolderAttr) {
			WatchFolderAttr a = (WatchFolderAttr)o;
			attrMap.put(a.getName(), a.getValue());
		}
		

	}

}

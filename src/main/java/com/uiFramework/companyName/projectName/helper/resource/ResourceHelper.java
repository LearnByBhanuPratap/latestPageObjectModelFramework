package com.uiFramework.companyName.projectName.helper.resource;

public class ResourceHelper {

	public static String getResourcePath(String path) {
		System.out.println(path);
        String basePath = System.getProperty("user.dir");
        System.out.println(basePath +"/"+ path);
		return basePath +"/"+ path;
	}
}

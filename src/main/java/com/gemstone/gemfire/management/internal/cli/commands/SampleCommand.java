package com.gemstone.gemfire.management.internal.cli.commands;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;

import com.gemstone.gemfire.management.internal.cli.annotation.CliMetaData;

public class SampleCommand implements CommandMarker{
	
	private static ApplicationContext apctx = null;
	
	@CliCommand(value={"spring-sample"}, help="Bootstap my application context")
	@CliMetaData(shellOnly=true)
	public String startSample(){
		//apctx = new ClassPathXmlApplicationContext("app-context.xml");
		return "hello world";
	}
}

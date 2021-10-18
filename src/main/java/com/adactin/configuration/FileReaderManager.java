package com.adactin.configuration;

public class FileReaderManager 
{
	private FileReaderManager() 
	{
		//Empty
		//private constructor ---> Further Object cannot be created.
	}
	
	public ConfigurationReader getInstanceCR() throws Throwable 
	{
		ConfigurationReader config = new ConfigurationReader();
		return config;
	}
	
	public static FileReaderManager getInstanceFileReaderManager() 
	{
		FileReaderManager reader = new FileReaderManager();
		return reader;
	}
}

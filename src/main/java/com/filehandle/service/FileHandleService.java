package com.filehandle.service;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * The Class FileHandleService.
 * 
 * @author Gokulan
 */
@Service
public class FileHandleService {
	

    /** The resource loader. */
    @Autowired
    ResourceLoader resourceLoader;
    
    
	/**
	 * Gets the file.
	 *
	 * @param fileName the file name
	 * @return the file
	 * @throws FileNotFoundException the file not found exception
	 */
	public Resource getFile(String fileName) throws FileNotFoundException {
		String attachmentPath = "/excel/" + fileName;
		Resource resource = resourceLoader.getResource("file:" + attachmentPath);

		if (resource.exists()) {
		    return resource;
		} else {
		    throw new FileNotFoundException("No file present.." + fileName);
		}
	}
}

package com.filehandle.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.filehandle.service.FileHandleService;

/**
 * The Class FileHandleController.
 * 
 * @author Gokulan
 */
@Controller
@RequestMapping("fileHandler")
public class FileHandleController {

    /** The file handle service. */
    @Autowired
    FileHandleService fileHandleService;

    /**
     * Process file.
     *
     * @param fileName the file name
     * @return the response entity
     * @throws FileNotFoundException the file not found exception
     */
    @GetMapping("getFile")
    @ResponseBody
    public ResponseEntity<Resource> processFile(@RequestParam(value = "source", required = true) final String fileName)
	    throws FileNotFoundException {
	String fileContentType = "";

	if (fileName.contains("xlsx")) {
	    fileContentType = "application/vnd.ms-excel";
	}

	return ResponseEntity.ok().contentType(MediaType.parseMediaType(fileContentType))
		.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName).body(fileHandleService.getFile(fileName));
    }
}
package com.cache;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;

public class DuplicateFiles {
public static void main(String[] args) throws IOException {
	File nfFile = new File("C:\\backup-elitebook");
	HashSet<String> uniqueFiles = new HashSet();
	Files.walk(nfFile.toPath())
	.filter(path -> !Files.isDirectory(path))
	.filter(path ->   uniqueFiles.add(path+""))
    .forEach(path -> System.out.println(path));
}
}

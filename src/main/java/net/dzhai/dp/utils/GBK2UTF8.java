package net.dzhai.dp.utils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class GBK2UTF8 {

	public static void main(String[] args) throws IOException {
		// GBK
		String srcDirPath = "E:\\GitProjectHome\\design-pattern\\src\\main\\java\\net\\dzhai\\dp\\creational\\simplefactory";
		// utf-8
		String utf8DirPath = "E:\\GitProjectHome\\design-pattern\\src\\main\\java\\net\\dzhai\\dp\\creational\\simplefactory";

		@SuppressWarnings("unchecked")
		Collection<File> javaGbkFileCol = FileUtils.listFiles(new File(srcDirPath), new String[] { "java" }, true);

		for (File javaGbkFile : javaGbkFileCol) {

			String utf8FilePath = utf8DirPath + javaGbkFile.getAbsolutePath().substring(srcDirPath.length());

			FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));
		}
	}
}

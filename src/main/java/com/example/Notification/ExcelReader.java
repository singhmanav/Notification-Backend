package com.example.Notification;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static List<FCMNotificationData> readExcelData(String fileName) {
        List<FCMNotificationData> notificationDataList = new ArrayList<FCMNotificationData>();

        try {
            FileInputStream fis = new FileInputStream(fileName);
            Workbook workbook = null;
            if(fileName.toLowerCase().endsWith("xlsx")){
                workbook = new XSSFWorkbook(fis);
            }else if(fileName.toLowerCase().endsWith("xls")){
                workbook = new HSSFWorkbook(fis);
            }

            int numberOfSheets = workbook.getNumberOfSheets();

            for(int i=0; i < numberOfSheets; i++){

                Sheet sheet = workbook.getSheetAt(i);

                Iterator<Row> rowIterator = sheet.iterator();
                while (rowIterator.hasNext())
                {
                    Row row = rowIterator.next();

                    String notificationCat = row.getCell(1).getStringCellValue();
                    String notificationText = row.getCell(1).getStringCellValue();
                    String notificationDetail = row.getCell(1).getStringCellValue();
                    String notificationDetailUrl = row.getCell(1).getStringCellValue();
                    String imageUrl = row.getCell(1).getStringCellValue();
                    String callToAction = row.getCell(1).getStringCellValue();
                    Long id = Math.round(row.getCell(1).getNumericCellValue());

                    FCMNotificationData c = new FCMNotificationData(notificationCat,notificationText,notificationDetail,notificationDetailUrl,imageUrl,callToAction,id);
                    notificationDataList.add(c);
                }


            }
            workbook.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return notificationDataList;
    }

}

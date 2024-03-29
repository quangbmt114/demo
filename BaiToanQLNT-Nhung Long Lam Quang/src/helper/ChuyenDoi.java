/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cuong
 */
public class ChuyenDoi {
    //Chuyển đổi kiểu Date <-> String
    //Tạo định dạng ngày tháng
    static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //Hàm chuyển Date -> String
    public static String LayNgayString(Date date){
        return dateFormat.format(date);
    }
    
    //Hàm chuyển String -> Date
    public static Date LayNgayDate(String ngay){
        try {
            return dateFormat.parse(ngay);
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển ngày");
            return null;
        }
    }
    
    //Chuyển đổi số Double <-> String 10.000.000
    //Hàm chuyển Double -> String
    public static String SoString(double so){
        return NumberFormat.getNumberInstance().format(so);
    }
    
    //Hàm chuyển String -> Double
    public static double SoDouble(String so){
        try {
            return NumberFormat.getNumberInstance().parse(so).doubleValue();
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển số");
            return 0;
        }
    }
}

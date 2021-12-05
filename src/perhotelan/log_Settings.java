/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perhotelan;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class log_Settings {
    
    String log_UserAccess, log_RoleAccess, log_KeteranganAccess;
    
    public log_Settings(String log_UserAcess, String log_RoleAccess, String log_KeteranganAccess){
        this.log_UserAccess = log_UserAcess;
        this.log_RoleAccess = log_RoleAccess;
        this.log_KeteranganAccess = log_KeteranganAccess;
    }
    
    public String get_Log_UserName(){
        return log_UserAccess;
    }
    
    public void set_Log_UserName(String log_UserAccess){
        this.log_UserAccess = log_UserAccess;
    }
    
    public String get_Log_UserRole(){
        return log_RoleAccess;
    }
    
    public void set_Log_UserRole(String log_RoleAccess){
        this.log_RoleAccess = log_RoleAccess;
    }
    
    public String get_Log_UserKeterangan(){
        return log_KeteranganAccess;
    }
    
    public void set_Log_UserKeterangan(String log_KeteranganAccess){
        this.log_KeteranganAccess = log_KeteranganAccess;
    }
    
    public void toLogging(String log_UserAccess, String log_RoleAccess, String log_KeteranganAccess){
        
        String logging = "INSERT INTO tbl_logactivity VALUES (NULL, NULL, '"+ log_UserAccess +"', '"+ log_RoleAccess +"', '"+ log_KeteranganAccess +"')";
        
        try {
            Connection con = new dbConnect().databaseConnect();
            Statement stat_LoggingActivity = con.createStatement();
            stat_LoggingActivity.execute(logging);
        } catch (Exception e) {
        }
    
    }
    
}

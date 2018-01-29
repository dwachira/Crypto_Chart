/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_chart;
 /*************************************************************************
 *                                                                        *
 *                   Mureithi David Wachira	                          *
 *                                                                        *
 *                   Mobile: +254 (0) 722 413 699                         *
 *                   Email:  davidwachira90@gmail.com                     *
 *                   Website: davidwachira.com                            *
 *                                                                        *
 *                   Date:   Monday 29th January 2018                     *
 *                                                                        *
 *                   Crypto Chart Application                             *
 *                                                                        *
 *************************************************************************/


 /*************************************************************************
 *                                                                        *
 *                   The various imports: Libraries used in this file     *
 *                                                                        *
 *************************************************************************/
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Program_Usage_Statistics 
{
 /*************************************************************************
 *                                                                        *
 *    A variable of the Connection type called 'con'                      *
 *                                                                        *
 *************************************************************************/
private Connection con;
    
    
    
public Connection getDBConnection() 
        {
 /*************************************************************************
 *                                                                        *
 *    Instantiation of the Connection type variable called 'con'          *
 *                                                                        *
 *************************************************************************/
            Connection connection = null;
 /*************************************************************************
 *                                                                        *
 *    A test on the MySQL driver to check if it is installed              *
 *                                                                        *
 *************************************************************************/
   /*  try 
        {    
            testDriver();
        } catch (Exception ex_testDriver) {
            System.out.println("Error in testing if the driver is properly installed: " + ex_testDriver);
        }
   */          
              try 
                {
 /*********************************************************************
 *                                                                    *
 *    The details of the Remote MySQL database :                      *
 *         $server = 'db4free.net';              // MySql server      *
 *         $username = 'sqldb4freekcse';         // MySql Username    *
 *         $password = 'zT2*aW8*zT2SSWW' ;      // MySql Password    *
 *         $database = 'sqldb4freekcse20';         // MySql Database    *
 *         $port = '3306';                       // Port number       *
 *                                                                    *
 **********************************************************************/
//Your account number is: 265547
//
//Your new database is now ready to use.
//
//To connect to your database use these details;
//
//Host: sql12.freesqldatabase.com
//Database name: sql12218363
//Database user: sql12218363
//Database password: 6rPs6qrSE9
//Port number: 3306
                  /*
                  connection = DriverManager.getConnection(
                            "jdbc:mysql://nlss6.a2hosting.com:3306/wachirat_sqldb_crypto_data",
                            "wachirat_usr_sql",
                            "hh(7-)aK=bfxD@<K");
                  */
                  connection = DriverManager.getConnection(
                            "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12218363",
                            "sql12218363",
                            "6rPs6qrSE9");
                  
                  
                            return connection;
                } 

                catch (SQLException ex) 
                {                
 /*************************************************************************
 *                                                                        *
 *         If there is an error in establishing a connection to the       *
 *         remote MySQL database, the SQLException error, SQLState        *
 *         and Vendor error should be printed on the Command Line         *
 *         screen interface.                                              *
 *                                                                        *
 *************************************************************************/
                    System.out.println("SQLException: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("VendorError: " + ex.getErrorCode());
                    

          /* */       
 /*************************************************************************
 *                                                                        *
 *         If there is an error in establishing a connection to the       *
 *         remote MySQL database, the Connection remains as null.         *
 *                                                                        *
 *************************************************************************/
                    return null;
                }//Try catch block closed
        
        }
  public void logAccess(String usage_details)
  {

    try 
       {
           //GetURLContent.d(usage_details);
 /*************************************************************************
 *                                                                        *
 *     The method getDBConnection is called and assigned to variable 'con'*
 *                                                                        *
 *************************************************************************/
            con = getDBConnection();
            if (con == null) 
            {
 /*************************************************************************
 *                                                                        *
 *         If there is an error in establishing a connection to the       *
 *         remote MySQL database and the Connection is null, an error     *
 *         is displayed on the screen                                                               *
 *                                                                        *
 *************************************************************************/ 
                //JOptionPane.showMessageDialog(null, "Error on establishing database connection", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Error on establishing database connection");
                
            }
            else
            {
 /*************************************************************************
 *                                                                        *
 *         If there is success in establishing a connection to the        *
 *         remote MySQL database the following variables are created:     *
 *           - ipAddress (Holds the Internet Protocol 32-bit address)     *
 *           - hostname  (The name of the Computer used)                  *
 *           - todays_datetimeFt (The time and date)                      *
 *                                                                        *
 *************************************************************************/
              InetAddress addr = InetAddress.getLocalHost();
              String ipAddress = addr.getHostAddress();
              String hostname = addr.getHostName();
              SimpleDateFormat todays_datetimeFt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  /*************************************************************************
 *                                                                         *
 *         GRANT SQL statement if the remote MySQL database requires       *
 *         some priviledges before INSERTing data                          *
 *                                                                         *
 **************************************************************************/               
                /*
                String SQL_GRANT_permission = ("GRANT INSERT ON `sql238703`.`KCSE_Program_Statistics` TO sql238703@" + ipAddress + " IDENTIFIED BY 'aW8*zT2*'");
                Statement stmt_GRANT_permission = con.createStatement();
                stmt_GRANT_permission.execute(SQL_GRANT_permission);
                */
 /*************************************************************************
 *                                                                        *
 *    Variables to hold countryCode, CountryName, Region, RegionName,     *
 *    City,Time_Zone,Latitude, Longitude and if the IP can be found       *
 *                                                                        *
 *************************************************************************/
                      String IP_Lookup_countryCode = "";
                      String IP_Lookup_CountryName = "";
                      String IP_Lookup_Region = "";
                      String IP_Lookup_RegionName = "";
                      String IP_Lookup_City = "";
                      String IP_Lookup_Time_Zone = "";
                      String IP_Lookup_Latitude = "";
                      String IP_Lookup_Longitude = "";
                      String Is_IP_Address_Known_and_Can_it_be_Found="";
                      
                try 
                  {
 /*************************************************************************
 *                                                                        *
 *    Query to GEOBYTES.COM on the IP Location. The query returns a       *
 *    long string with all the data jumbled all together                  *
 *                                                                        *
 *************************************************************************/
                        //URL IP_Lookup_link = new URL("http://www.geobytes.com/IpLocator.htm?GetLocation&template=valuepairs.txt&IpAddress="+ipAddress);
                        URL IP_Lookup_link = new URL("http://www.geobytes.com/IpLocator.htm?GetLocation&template=valuepairs.txt&IpAddress=");

                        BufferedReader IP_Lookup_in = new BufferedReader(new InputStreamReader(IP_Lookup_link.openStream()));
                        String IP_Lookup_inputLine = "";
                        String IP_Lookup_outputLine = "";

                        while ((IP_Lookup_inputLine = IP_Lookup_in.readLine()) != null)
                        {
                             IP_Lookup_outputLine = IP_Lookup_outputLine + " "+ IP_Lookup_inputLine + " ";

                        }
                        Is_IP_Address_Known_and_Can_it_be_Found = Extract_Details_from_Long_String(IP_Lookup_outputLine, 6, "known=", " ");
                        //GetURLContent.d(Is_IP_Address_Known_and_Can_it_be_Found);
 /*************************************************************************
 *                                                                        *
 *    If the query to GEOBYTES.COM is returned for a known IP address     *
 *    the substrings are retrieved from the long string                   *
 *                                                                        *
 *************************************************************************/
                        if (Is_IP_Address_Known_and_Can_it_be_Found.equals("1"))
                            {
                                  IP_Lookup_countryCode = Extract_Details_from_Long_String(IP_Lookup_outputLine, 10, "countryid=", " country=") ;
                                  IP_Lookup_CountryName = Extract_Details_from_Long_String(IP_Lookup_outputLine, 8, "country=", " fips104=");
                                  IP_Lookup_Region = Extract_Details_from_Long_String(IP_Lookup_outputLine, 9, "regionid=", " region=");
                                  IP_Lookup_RegionName = Extract_Details_from_Long_String(IP_Lookup_outputLine, 7, "region=", " code=");
                                  IP_Lookup_City = Extract_Details_from_Long_String(IP_Lookup_outputLine, 5, "city=", " latitude=");
                                  IP_Lookup_Time_Zone = Extract_Details_from_Long_String(IP_Lookup_outputLine, 9, "timezone=", " certainty=") ;
                                  IP_Lookup_Latitude = Extract_Details_from_Long_String(IP_Lookup_outputLine, 9, "latitude=", " longitude=");
                                  IP_Lookup_Longitude = Extract_Details_from_Long_String(IP_Lookup_outputLine, 10, "longitude=", " timezone=") ;
                                  
                                  ipAddress = Extract_Details_from_Long_String(IP_Lookup_outputLine, 10, "ipaddress=", " isproxynetwork=") ;
                                  
                                  //GetURLContent.d(IP_Lookup_countryCode + ", " +IP_Lookup_CountryName + ", " +IP_Lookup_Region + ", " +IP_Lookup_RegionName + ", " +IP_Lookup_City + ", " + IP_Lookup_Time_Zone + ", " + IP_Lookup_Latitude + ", " +IP_Lookup_Longitude );
                            }
                        IP_Lookup_in.close(); 
     
                  } catch (Exception ex_lookup) {
 /*************************************************************************
 *                                                                        *
 *         If there is an error, the Exception should be printed          *
 *         on the Command Line screen interface.                          *
 *                                                                        *
 *************************************************************************/
                          System.out.println(" Exception just before SQL Insert ----> " + ex_lookup);
                  }
                            
                  String SQL = "";          
                  if (Is_IP_Address_Known_and_Can_it_be_Found.equals("0"))
                  {
 /*************************************************************************
 *                                                                        *
 *    If the query to GEOBYTES.COM is returned for an unknown IP address  *
 *    the SQL statement should not contain IP Lookup details              *
 *                                                                        *
 *************************************************************************/  
                            SQL = ("INSERT INTO `Crypto_Chart_Program_Statistics` "+"("
                                                        + "`Usage_date_time`,"
                                                        + "`Usage_details_searched`,"
                                                        + "`Usage_host_name`,"
                                                        + "`Usage_ip_address`)"
                            + "VALUES('" + todays_datetimeFt.format(Calendar.getInstance().getTime()) + "','" + "" 
							+ usage_details + "','"
                                                        + hostname + "','" 
							+ ipAddress + "')");
                            
                            //GetURLContent.d(SQL);
                      
                  }   
                  else if (Is_IP_Address_Known_and_Can_it_be_Found.equals("1"))
                  {  
 /*************************************************************************
 *                                                                        *
 *    If the query to GEOBYTES.COM is returned for a known IP address     *
 *    the SQL statement contains IP Lookup details                        *
 *                                                                        *
 *************************************************************************/
                           SQL = ("INSERT INTO `Crypto_Chart_Program_Statistics` "+"("
                                                        + "`Usage_date_time`,"
                                                        + "`Usage_details_searched`,"
                                                        + "`Usage_host_name`,"
                                                        + "`Usage_ip_address`,"
							+ "`Usage_Country_Code`,"
							+ "`Usage_Country_Name`,"
							+ "`Usage_Region`,"
							+ "`Usage_Region_Name`,"
                                                        + "`Usage_City`,"
							+ "`Usage_Time_Zone`,"
							+ "`Usage_Latitude`,"
							+ "`Usage_Longitude`)"
                            + "VALUES('" + todays_datetimeFt.format(Calendar.getInstance().getTime()) + "','" + "" 
							+ usage_details + "','"
                                                        + hostname + "','" 
							+ ipAddress + "','" 
							+ IP_Lookup_countryCode + "','" 
							+ IP_Lookup_CountryName + "','" 
							+ IP_Lookup_Region + "','" 
							+ IP_Lookup_RegionName + "','" 
							+ IP_Lookup_City + "','" 
							+ IP_Lookup_Time_Zone + "','" 
							+ IP_Lookup_Latitude + "','" 
							+ IP_Lookup_Longitude + "')");
                           //GetURLContent.i(SQL);
                  }     
 /*************************************************************************
 *                                                                        *
 *   The SQL statement is printed on the Command Line screen interface.   *
 *                                                                        *
 *************************************************************************/
                System.out.println("SQL Statement : " + SQL);  
 /*************************************************************************
 *                                                                        *
 *                     The SQL statement is executed                      *
 *                                                                        *
 *************************************************************************/ 
                Statement stmt = con.createStatement();
                stmt.execute(SQL);
            }    
                         
       } 
      
         catch (Exception ex_logAccess) 
        {
 /*************************************************************************
 *                                                                        *
 *         If there is an error, the Exception should be printed          *
 *         on the Command Line screen interface.                          *
 *                                                                        *
 *************************************************************************/
    
            System.out.println( "Error inside logAccess : " + ex_logAccess.getMessage());
        }   
	
  }
  

    public String Extract_Details_from_Long_String(String long_string_with_all_the_info, int position_to_skip_before_reading, String what_to_look_for_beforehand, String the_end_of_info_character)
    {
        /**/
 /*************************************************************************
 *                                                                        *
 *   Varible start ---> Index of start of substring                       *
 *   Varible end   ---> Index of end   of substring                       *
 *   This method returns the retrieved substring                          *
 *                                                                        *
 *************************************************************************/
    
        int i = 0;
        int start = 0;
        int end = 0;
          while (true) {
            int found = long_string_with_all_the_info.indexOf( what_to_look_for_beforehand, i);
            if (found == -1) break;
            start = found + position_to_skip_before_reading; 
            end = long_string_with_all_the_info.indexOf(the_end_of_info_character, start);
            i = end + 1;  
          }
        return long_string_with_all_the_info.substring(start, end);
        /**/
    }
/* 
-------------------------------------------------------------------------
    -----------------------------------------------------------------    
    -----------------------------------------------------------------    
-------------------------------------------------------------------------
  public void testDriver() throws Exception 
  { 
    System.out.println("Initializing Server... "); 
    try { 
    Class.forName("org.gjt.mm.mysql.Driver"); 
    System.out.println(" Driver Found."); 
    } catch (ClassNotFoundException e) { 
    System.out.println(" Driver Not Found, exiting.."); 
    throw (e); 
    } 
 }
-------------------------------------------------------------------------
*/  
}

/*
-------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS `Crypto_Chart_Program_Statistics`
(
    PID INT NOT NULL AUTO_INCREMENT, 
    PRIMARY KEY(PID), 
    `Usage_date_time` VARCHAR(32), 
    `Usage_details_searched` VARCHAR(350), 
    `Usage_host_name` VARCHAR(32),  
    `Usage_ip_address` VARCHAR(32), 
    `Usage_Country_Code` VARCHAR(32), 
    `Usage_Country_Name` VARCHAR(32), 
    `Usage_Region` VARCHAR(32), 
    `Usage_Region_Name` VARCHAR(32), 
    `Usage_City` VARCHAR(32), 
    `Usage_Time_Zone` VARCHAR(32), 
    `Usage_Latitude` VARCHAR(32),
    `Usage_Longitude` VARCHAR(32)
); 
-------------------------------------------------------------------------
*/


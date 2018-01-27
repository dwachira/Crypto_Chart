
package crypto_chart;

import org.apache.commons.lang.StringUtils;


public class crypto_data_string_into_substring 
{
    
    //public int counter_x = 0;
    
    
   public String[] split_into_substrings(String crypto_data) 
   {
        String[] crypto_data_2d_array = new String[15];
       
        String crypto_data_string = "" + crypto_data;
        //GetURLContent.d(crypto_data_string);
        //System.out.println("=======================================================");
        
        String crypto_id = StringUtils.substringBetween(crypto_data_string, "id\": \"", "\",         \"name");
        String crypto_name = StringUtils.substringBetween(crypto_data_string, "name\": \"", "\",         \"symbol");
        String crypto_symbol = StringUtils.substringBetween(crypto_data_string, "symbol\": \"", "\",         \"rank");
        String crypto_rank = StringUtils.substringBetween(crypto_data_string, "rank\": \"", "\",         \"price_usd");
        String crypto_price_usd = StringUtils.substringBetween(crypto_data_string, "price_usd\": \"", "\",         \"price_btc");
        String crypto_price_btc = StringUtils.substringBetween(crypto_data_string, "price_btc\": \"", "\",         \"24h_volume_usd");
        String crypto_24h_volume_usd = StringUtils.substringBetween(crypto_data_string, "24h_volume_usd\": \"", "\",         \"market_cap_usd");
        String crypto_market_cap_usd = StringUtils.substringBetween(crypto_data_string, "market_cap_usd\": \"", "\",         \"available_supply");
        String crypto_available_supply = StringUtils.substringBetween(crypto_data_string, "available_supply\": \"", "\",         \"total_supply");
        String crypto_total_supply = StringUtils.substringBetween(crypto_data_string, "total_supply\": \"", "\",         \"max_supply");
        String crypto_max_supply = StringUtils.substringBetween(crypto_data_string, "max_supply\": \"", "\",         \"percent_change_1h");
        String crypto_percent_change_1h = StringUtils.substringBetween(crypto_data_string, "percent_change_1h\": \"", "\",         \"percent_change_24h");
        String crypto_percent_change_24h = StringUtils.substringBetween(crypto_data_string, "percent_change_24h\": \"", "\",         \"percent_change_7d");
        String crypto_percent_change_7d = StringUtils.substringBetween(crypto_data_string, "percent_change_7d\": \"", "\",         \"last_updated");
        String crypto_last_updated = StringUtils.substringBetween(crypto_data_string, "last_updated\": \"", "\"    }]");
        
        
        crypto_data_2d_array[0] = crypto_id;
        crypto_data_2d_array[1] = crypto_name;
        crypto_data_2d_array[2] = crypto_symbol;
        crypto_data_2d_array[3] = crypto_rank;
        crypto_data_2d_array[4] = crypto_price_usd;
        crypto_data_2d_array[5] = crypto_price_btc;
        crypto_data_2d_array[6] = crypto_24h_volume_usd;
        crypto_data_2d_array[7] = crypto_market_cap_usd;
        crypto_data_2d_array[8] = crypto_available_supply;
        crypto_data_2d_array[9] = crypto_total_supply;
        crypto_data_2d_array[10] = crypto_max_supply;
        crypto_data_2d_array[11] = crypto_percent_change_1h;
        crypto_data_2d_array[12] = crypto_percent_change_24h;
        crypto_data_2d_array[13] = crypto_percent_change_7d;
        crypto_data_2d_array[14] = crypto_last_updated;
      /*  
        GetURLContent.i("id = " + crypto_id);
        GetURLContent.i("name = " + crypto_name);
        GetURLContent.i("symbol = " + crypto_symbol);
        GetURLContent.i("rank = " + crypto_rank);
        GetURLContent.i("price_usd = " + crypto_price_usd);
        GetURLContent.i("price_btc = " + crypto_price_btc);
        GetURLContent.i("24h_volume_usd = " + crypto_24h_volume_usd);
        GetURLContent.i("market_cap_usd = " + crypto_market_cap_usd);
        GetURLContent.i("available_supply = " + crypto_available_supply);
        GetURLContent.i("total_supply = " + crypto_total_supply);
        GetURLContent.i("max_supply = " + crypto_max_supply);
        GetURLContent.i("percent_change_1h = " + crypto_percent_change_1h);
        GetURLContent.i("percent_change_24h = " + crypto_percent_change_24h);
        GetURLContent.i("percent_change_7d = " + crypto_percent_change_7d);
        
        GetURLContent.i("last_updated = " + crypto_last_updated);
       */ 
        
        //counter_x++;
        
        
        return crypto_data_2d_array;
   } 
   /*
    public void print_2d_array () 
   {
       for (int i = 0; i < crypto_data_2d_array.length; i++) 
       {
            GetURLContent.d(crypto_data_2d_array[i][0] + ": ");
            for (int j = 1; j < crypto_data_2d_array[i].length; j++) 
            {
              GetURLContent.d(crypto_data_2d_array[i][j] + " ");
            }
       }
   }
    
    */
 
}

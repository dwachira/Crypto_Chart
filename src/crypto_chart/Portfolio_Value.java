
package crypto_chart;

import java.net.URL;

public class Portfolio_Value 
{
    public String portfolio_value_calculation(String BTC_coins, String ETH_coins, String XRP_coins, String ADA_coins, String XLM_coins, String MIOTA_coins, String TRX_coins, String VEN_coins, String OMG_coins, String XVG_coins, String KCS_coins, String UTK_coins, String BRD_coins, String APPC_coins, String SUB_coins, String CV_coins)
    {
      String list_of_calculations = "";
      String[] crypto_portfolio_value = new String[15];
      GetURLContent retrieve_from_API = new GetURLContent();
      double total_value = 0;
      
      try 
      { 
        
        URL url = new URL("https://api.coinmarketcap.com/v1/ticker/bitcoin/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url);
        double price_of_BTC = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Bitcoin value = " + (price_of_BTC*Double.parseDouble(BTC_coins))+ " [" + price_of_BTC +"*" + BTC_coins +"]" + "\n";
        total_value = total_value + (price_of_BTC*Double.parseDouble(BTC_coins));
        
        URL url_crypto_ETH = new URL("https://api.coinmarketcap.com/v1/ticker/ethereum/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_ETH);
        double price_of_ETH = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Ethereum value = " + (price_of_ETH*Double.parseDouble(ETH_coins))+ " [" + price_of_ETH +"*" + ETH_coins +"]" + "\n";
        total_value = total_value + (price_of_ETH*Double.parseDouble(ETH_coins));
        
        URL url_crypto_XRP = new URL("https://api.coinmarketcap.com/v1/ticker/ripple/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_XRP);
        double price_of_XRP = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Ripple value = " + (price_of_XRP*Double.parseDouble(XRP_coins))+ " [" + price_of_XRP +"*" + XRP_coins +"]" + "\n";
        total_value = total_value + (price_of_XRP*Double.parseDouble(XRP_coins));
        
        URL url_crypto_ADA = new URL("https://api.coinmarketcap.com/v1/ticker/cardano/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_ADA);
        double price_of_ADA = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Cardano value = " + (price_of_ADA*Double.parseDouble(ADA_coins))+ " [" + price_of_ADA +"*" + ADA_coins +"]" + "\n";
        total_value = total_value + (price_of_ADA*Double.parseDouble(ADA_coins));
        
        URL url_crypto_XLM = new URL("https://api.coinmarketcap.com/v1/ticker/stellar/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_XLM);
        double price_of_XLM = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Stellar value = " + (price_of_XLM*Double.parseDouble(XLM_coins))+ " [" + price_of_XLM +"*" + XLM_coins +"]" + "\n";
        total_value = total_value + (price_of_XLM*Double.parseDouble(XLM_coins));
        
        URL url_crypto_MIOTA = new URL("https://api.coinmarketcap.com/v1/ticker/iota/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_MIOTA);
        double price_of_MIOTA = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Iota value = " + (price_of_MIOTA*Double.parseDouble(MIOTA_coins))+ " [" + price_of_MIOTA +"*" + MIOTA_coins +"]" + "\n";
        total_value = total_value + (price_of_MIOTA*Double.parseDouble(MIOTA_coins));
        
        URL url_crypto_TRX = new URL("https://api.coinmarketcap.com/v1/ticker/tron/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_TRX);
        double price_of_TRX = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Tron value = " + (price_of_TRX*Double.parseDouble(TRX_coins))+ " [" + price_of_TRX +"*" + TRX_coins +"]" + "\n";
        total_value = total_value + (price_of_TRX*Double.parseDouble(TRX_coins));
        
        URL url_crypto_VEN = new URL("https://api.coinmarketcap.com/v1/ticker/vechain/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_VEN);
        double price_of_VEN = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Vechain value = " + (price_of_VEN*Double.parseDouble(VEN_coins))+ " [" + price_of_VEN +"*" + VEN_coins +"]" + "\n";
        total_value = total_value + (price_of_VEN*Double.parseDouble(VEN_coins));
        
        URL url_crypto_OMG = new URL("https://api.coinmarketcap.com/v1/ticker/omisego/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_OMG);
        double price_of_OMG = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Omisego value = " + (price_of_OMG*Double.parseDouble(OMG_coins))+ " [" + price_of_OMG +"*" + OMG_coins +"]" + "\n";
        total_value = total_value + (price_of_OMG*Double.parseDouble(OMG_coins));
        
        URL url_crypto_XVG = new URL("https://api.coinmarketcap.com/v1/ticker/verge/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_XVG);
        double price_of_XVG = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Verge value = " + (price_of_XVG*Double.parseDouble(XVG_coins))+ " [" + price_of_XVG +"*" + XVG_coins +"]" + "\n";
        total_value = total_value + (price_of_XVG*Double.parseDouble(XVG_coins));
        
        URL url_crypto_KCS = new URL("https://api.coinmarketcap.com/v1/ticker/kucoin-shares/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_KCS);
        double price_of_KCS = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Kucoin-shares value = " + (price_of_KCS*Double.parseDouble(KCS_coins))+ " [" + price_of_KCS +"*" + KCS_coins +"]" + "\n";
        total_value = total_value + (price_of_KCS*Double.parseDouble(KCS_coins));
        
        URL url_crypto_UTK = new URL("https://api.coinmarketcap.com/v1/ticker/utrust/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_UTK);
        double price_of_UTK = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Utrust value = " + (price_of_UTK*Double.parseDouble(UTK_coins))+ " [" + price_of_UTK +"*" + UTK_coins +"]" + "\n";
        total_value = total_value + (price_of_UTK*Double.parseDouble(UTK_coins));
        
        URL url_crypto_BRD = new URL("https://api.coinmarketcap.com/v1/ticker/bread/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_BRD);
        double price_of_BRD = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Bread value = " + (price_of_BRD*Double.parseDouble(BRD_coins))+ " [" + price_of_BRD +"*" + BRD_coins +"]" + "\n";
        total_value = total_value + (price_of_BRD*Double.parseDouble(BRD_coins));
        
        URL url_crypto_APPC = new URL("https://api.coinmarketcap.com/v1/ticker/appcoins/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_APPC);
        double price_of_APPC = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Appcoins value = " + (price_of_APPC*Double.parseDouble(APPC_coins))+ " [" + price_of_APPC +"*" + APPC_coins +"]" + "\n";
        total_value = total_value + (price_of_APPC*Double.parseDouble(APPC_coins));
        
        URL url_crypto_SUB = new URL("https://api.coinmarketcap.com/v1/ticker/substratum/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_SUB);
        double price_of_SUB = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Substratum value = " + (price_of_SUB*Double.parseDouble(SUB_coins))+ " [" + price_of_SUB +"*" + SUB_coins +"]" + "\n";
        total_value = total_value + (price_of_SUB*Double.parseDouble(SUB_coins));
        
        URL url_crypto_CV = new URL("https://api.coinmarketcap.com/v1/ticker/carvertical/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_CV);
        double price_of_CV = Double.parseDouble(crypto_portfolio_value[4].toString());
        list_of_calculations = list_of_calculations + "Carvertical value = " + (price_of_CV*Double.parseDouble(CV_coins))+ " [" + price_of_CV +"*" + CV_coins +"]" + "\n";
        total_value = total_value + (price_of_CV*Double.parseDouble(CV_coins));
        
        list_of_calculations = list_of_calculations + "\nTotal = $" + total_value +"";
      
      
      } 
      catch (Exception ex) 
       {
            System.out.println("Error --> " + ex);
            
       } 
      
        return list_of_calculations;
    }
}

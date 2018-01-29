
package crypto_chart;

import java.awt.Font;
import java.net.URL;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


public class PieChart_Crypto extends ApplicationFrame 
{
        String BTC_held_value = "";
        String ETH_held_value = "";
        String XRP_held_value = "";
        String ADA_held_value = "";
        String XLM_held_value = "";
        String MIOTA_held_value = "";
        String TRX_held_value = "";
        String VEN_held_value = "";
        String OMG_held_value = "";
        String XVG_held_value = "";
        String KCS_held_value = "";
        String UTK_held_value = "";
        String BRD_held_value = "";
        String APPC_held_value = "";
        String SUB_held_value = "";
        String CV_held_value = "";
        
    public PieChart_Crypto(String title, String BTC_coins, String ETH_coins, String XRP_coins, String ADA_coins, String XLM_coins, String MIOTA_coins, String TRX_coins, String VEN_coins, String OMG_coins, String XVG_coins, String KCS_coins, String UTK_coins, String BRD_coins, String APPC_coins, String SUB_coins, String CV_coins)
   
    {
        super(title);
        
        BTC_held_value = BTC_coins;
        ETH_held_value = ETH_coins;
        XRP_held_value = XRP_coins;
        ADA_held_value = ADA_coins;
        XLM_held_value = XLM_coins;
        MIOTA_held_value = MIOTA_coins;
        TRX_held_value = TRX_coins;
        VEN_held_value = VEN_coins;
        OMG_held_value = OMG_coins;
        XVG_held_value = XVG_coins;
        KCS_held_value = KCS_coins;
        UTK_held_value = UTK_coins;
        BRD_held_value = BRD_coins;
        APPC_held_value = APPC_coins;
        SUB_held_value = SUB_coins;
        CV_held_value = CV_coins;
        
        //GetURLContent.d(BTC_coins + ", " + ETH_coins + ", " + XRP_coins + ", " + ADA_coins + ", " + XLM_coins + ", " + MIOTA_coins + ", " + TRX_coins + ", " + VEN_coins + ", " + OMG_coins + ", " + XVG_coins + ", " + KCS_coins + ", " + UTK_coins + ", " + BRD_coins + ", " + APPC_coins + ", " + SUB_coins + ", " + CV_coins);
        
        setContentPane(createDemoPanel());
    }

//   public void Dataset_PieChart(String BTC_coins, String ETH_coins, String XRP_coins, String ADA_coins, String XLM_coins, String MIOTA_coins, String TRX_coins, String VEN_coins, String OMG_coins, String XVG_coins, String KCS_coins, String UTK_coins, String BRD_coins, String APPC_coins, String SUB_coins, String CV_coins)
//    {
//         
//    }
    public PieDataset createDataset_PieChart()
    {
      DefaultPieDataset dataset = new DefaultPieDataset();
      
      String list_of_calculations = "";
      String[] crypto_portfolio_value = new String[15];
      GetURLContent retrieve_from_API = new GetURLContent();
      double total_value = 0;
      
  
     try 
      { 
        //GetURLContent.i(BTC_held_value + ", " + ETH_held_value + ", " + XRP_held_value + ", " + ADA_held_value + ", " + XLM_held_value + ", " + MIOTA_held_value + ", " + TRX_held_value + ", " + VEN_held_value + ", " + OMG_held_value + ", " + XVG_held_value + ", " + KCS_held_value + ", " + UTK_held_value + ", " + BRD_held_value + ", " + APPC_held_value + ", " + SUB_held_value + ", " + CV_held_value);
  
        URL url = new URL("https://api.coinmarketcap.com/v1/ticker/bitcoin/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url);
        double price_of_BTC = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Bitcoin value = " + (price_of_BTC*Double.parseDouble(BTC_held_value))+ " [" + price_of_BTC +"*" + BTC_held_value +"]" + "\n";
//        total_value = total_value + (price_of_BTC*Double.parseDouble(BTC_held_value));
        if (Integer.parseInt(BTC_held_value) != 0)
        { dataset.setValue("Bitcoin", new Double(price_of_BTC*Double.parseDouble(BTC_held_value)));}
        
        
        URL url_crypto_ETH = new URL("https://api.coinmarketcap.com/v1/ticker/ethereum/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_ETH);
        double price_of_ETH = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Ethereum value = " + (price_of_ETH*Double.parseDouble(ETH_held_value))+ " [" + price_of_ETH +"*" + ETH_held_value +"]" + "\n";
//        total_value = total_value + (price_of_ETH*Double.parseDouble(ETH_held_value));
        if (Integer.parseInt(ETH_held_value) != 0)
        { dataset.setValue("Ethereum", new Double(price_of_ETH*Double.parseDouble(ETH_held_value)));}
        
        URL url_crypto_XRP = new URL("https://api.coinmarketcap.com/v1/ticker/ripple/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_XRP);
        double price_of_XRP = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Ripple value = " + (price_of_XRP*Double.parseDouble(XRP_held_value))+ " [" + price_of_XRP +"*" + XRP_held_value +"]" + "\n";
//        total_value = total_value + (price_of_XRP*Double.parseDouble(XRP_held_value));
        if (Integer.parseInt(XRP_held_value) != 0)
        { dataset.setValue("Ripple", new Double(price_of_XRP*Double.parseDouble(XRP_held_value)));}
        
        URL url_crypto_ADA = new URL("https://api.coinmarketcap.com/v1/ticker/cardano/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_ADA);
        double price_of_ADA = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Cardano value = " + (price_of_ADA*Double.parseDouble(ADA_held_value))+ " [" + price_of_ADA +"*" + ADA_held_value +"]" + "\n";
//        total_value = total_value + (price_of_ADA*Double.parseDouble(ADA_held_value));
        if (Integer.parseInt(ADA_held_value) != 0)
        { dataset.setValue("Cardano", new Double(price_of_ADA*Double.parseDouble(ADA_held_value)));}
        
        URL url_crypto_XLM = new URL("https://api.coinmarketcap.com/v1/ticker/stellar/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_XLM);
        double price_of_XLM = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Stellar value = " + (price_of_XLM*Double.parseDouble(XLM_held_value))+ " [" + price_of_XLM +"*" + XLM_held_value +"]" + "\n";
//        total_value = total_value + (price_of_XLM*Double.parseDouble(XLM_held_value));
        if (Integer.parseInt(XLM_held_value) != 0)
        { dataset.setValue("Stellar", new Double(price_of_XLM*Double.parseDouble(XLM_held_value)));}
        
        URL url_crypto_MIOTA = new URL("https://api.coinmarketcap.com/v1/ticker/iota/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_MIOTA);
        double price_of_MIOTA = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Iota value = " + (price_of_MIOTA*Double.parseDouble(MIOTA_held_value))+ " [" + price_of_MIOTA +"*" + MIOTA_held_value +"]" + "\n";
//        total_value = total_value + (price_of_MIOTA*Double.parseDouble(MIOTA_held_value));
        if (Integer.parseInt(MIOTA_held_value) != 0)
        { dataset.setValue("Iota", new Double(price_of_MIOTA*Double.parseDouble(MIOTA_held_value)));}
        
        URL url_crypto_TRX = new URL("https://api.coinmarketcap.com/v1/ticker/tron/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_TRX);
        double price_of_TRX = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Tron value = " + (price_of_TRX*Double.parseDouble(TRX_held_value))+ " [" + price_of_TRX +"*" + TRX_held_value +"]" + "\n";
//        total_value = total_value + (price_of_TRX*Double.parseDouble(TRX_held_value));
        if (Integer.parseInt(TRX_held_value) != 0)
        { dataset.setValue("Tron", new Double(price_of_TRX*Double.parseDouble(TRX_held_value)));}
        
        URL url_crypto_VEN = new URL("https://api.coinmarketcap.com/v1/ticker/vechain/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_VEN);
        double price_of_VEN = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Vechain value = " + (price_of_VEN*Double.parseDouble(VEN_held_value))+ " [" + price_of_VEN +"*" + VEN_held_value +"]" + "\n";
//        total_value = total_value + (price_of_VEN*Double.parseDouble(VEN_held_value));
        if (Integer.parseInt(VEN_held_value) != 0)
        { dataset.setValue("Vechain", new Double(price_of_VEN*Double.parseDouble(VEN_held_value)));}
        
        URL url_crypto_OMG = new URL("https://api.coinmarketcap.com/v1/ticker/omisego/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_OMG);
        double price_of_OMG = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Omisego value = " + (price_of_OMG*Double.parseDouble(OMG_held_value))+ " [" + price_of_OMG +"*" + OMG_held_value +"]" + "\n";
//        total_value = total_value + (price_of_OMG*Double.parseDouble(OMG_held_value));
        if (Integer.parseInt(OMG_held_value) != 0)
        { dataset.setValue("Omisego", new Double(price_of_OMG*Double.parseDouble(OMG_held_value)));}
        
        URL url_crypto_XVG = new URL("https://api.coinmarketcap.com/v1/ticker/verge/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_XVG);
        double price_of_XVG = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Verge value = " + (price_of_XVG*Double.parseDouble(XVG_held_value))+ " [" + price_of_XVG +"*" + XVG_held_value +"]" + "\n";
//        total_value = total_value + (price_of_XVG*Double.parseDouble(XVG_held_value));
        if (Integer.parseInt(XVG_held_value) != 0)
        { dataset.setValue("Verge", new Double(price_of_XVG*Double.parseDouble(XVG_held_value)));}
        
        URL url_crypto_KCS = new URL("https://api.coinmarketcap.com/v1/ticker/kucoin-shares/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_KCS);
        double price_of_KCS = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Kucoin-shares value = " + (price_of_KCS*Double.parseDouble(KCS_held_value))+ " [" + price_of_KCS +"*" + KCS_held_value +"]" + "\n";
//        total_value = total_value + (price_of_KCS*Double.parseDouble(KCS_held_value));
        if (Integer.parseInt(KCS_held_value) != 0)
        { dataset.setValue("Kucoin-shares", new Double(price_of_KCS*Double.parseDouble(KCS_held_value)));}
        
        URL url_crypto_UTK = new URL("https://api.coinmarketcap.com/v1/ticker/utrust/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_UTK);
        double price_of_UTK = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Utrust value = " + (price_of_UTK*Double.parseDouble(UTK_held_value))+ " [" + price_of_UTK +"*" + UTK_held_value +"]" + "\n";
//        total_value = total_value + (price_of_UTK*Double.parseDouble(UTK_held_value));
        if (Integer.parseInt(UTK_held_value) != 0)
        { dataset.setValue("Utrust", new Double(price_of_UTK*Double.parseDouble(UTK_held_value)));}
        
        URL url_crypto_BRD = new URL("https://api.coinmarketcap.com/v1/ticker/bread/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_BRD);
        double price_of_BRD = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Bread value = " + (price_of_BRD*Double.parseDouble(BRD_held_value))+ " [" + price_of_BRD +"*" + BRD_held_value +"]" + "\n";
//        total_value = total_value + (price_of_BRD*Double.parseDouble(BRD_held_value));
        if (Integer.parseInt(BRD_held_value) != 0)
        { dataset.setValue("Bread", new Double(price_of_BRD*Double.parseDouble(BRD_held_value)));}
        
        URL url_crypto_APPC = new URL("https://api.coinmarketcap.com/v1/ticker/appcoins/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_APPC);
        double price_of_APPC = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Appcoins value = " + (price_of_APPC*Double.parseDouble(APPC_held_value))+ " [" + price_of_APPC +"*" + APPC_held_value +"]" + "\n";
//        total_value = total_value + (price_of_APPC*Double.parseDouble(APPC_held_value));
        if (Integer.parseInt(APPC_held_value) != 0)
        { dataset.setValue("Appcoins", new Double(price_of_APPC*Double.parseDouble(APPC_held_value)));}
        
        URL url_crypto_SUB = new URL("https://api.coinmarketcap.com/v1/ticker/substratum/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_SUB);
        double price_of_SUB = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Substratum value = " + (price_of_SUB*Double.parseDouble(SUB_held_value))+ " [" + price_of_SUB +"*" + SUB_held_value +"]" + "\n";
//        total_value = total_value + (price_of_SUB*Double.parseDouble(SUB_held_value));
        if (Integer.parseInt(SUB_held_value) != 0)
        { dataset.setValue("Substratum", new Double(price_of_SUB*Double.parseDouble(SUB_held_value)));}
        
        URL url_crypto_CV = new URL("https://api.coinmarketcap.com/v1/ticker/carvertical/");
        crypto_portfolio_value = retrieve_from_API.GetURLContent(url_crypto_CV);
        double price_of_CV = Double.parseDouble(crypto_portfolio_value[4].toString());
//        list_of_calculations = list_of_calculations + "Carvertical value = " + (price_of_CV*Double.parseDouble(CV_held_value))+ " [" + price_of_CV +"*" + CV_held_value +"]" + "\n";
//        total_value = total_value + (price_of_CV*Double.parseDouble(CV_held_value));
        if (Integer.parseInt(CV_held_value) != 0)
        { dataset.setValue("Carvertical", new Double(price_of_CV*Double.parseDouble(CV_held_value)));}

  
        list_of_calculations = list_of_calculations + "\nTotal = $" + total_value +"";
      
      
        
       } 
      catch (Exception ex) 
       {
            System.out.println("Error --> " + ex);
            
       } 
      
      return dataset;  
    }
//    private static PieDataset createDataset() 
//    {
//        DefaultPieDataset dataset = new DefaultPieDataset();
//        dataset.setValue("One", new Double(43.2));
//        dataset.setValue("Two", new Double(10.0));
//        dataset.setValue("Three", new Double(27.5));
//        dataset.setValue("Four", new Double(17.5));
//        dataset.setValue("Five", new Double(11.0));
//        dataset.setValue("Six", new Double(19.4));
//        return dataset;        
//    }
    
    /**
     * Creates a chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return A chart.
     */
    private static JFreeChart createChart(PieDataset dataset) {
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Pie Chart - Crypto Currency Portfolio",  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        return chart;
        
    }
    
    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     * 
     * @return A panel.
     */
    public JPanel createDemoPanel() 
    {
        JFreeChart chart = createChart(createDataset_PieChart());
        return new ChartPanel(chart);
    }
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
//    public static void main(String[] args) 
//    {
//
////        PieChartDemo1 demo = new PieChartDemo1("Pie Chart - Crypto Currency Portfolio");
////        demo.pack();
////        RefineryUtilities.centerFrameOnScreen(demo);
////        demo.setVisible(true);
//
//    }

}
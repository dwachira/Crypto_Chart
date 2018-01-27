/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_chart;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 * @author ashraf_sarhan
 * 
 */
public class PriceChangeColorRenderer implements TableCellRenderer {

    public static final Color PRICE_DOWN_COLOR = Color.cyan;
    public static final Color PRICE_UP_COLOR = Color.BLUE;
    public static final Color ODD_ROW_COLOR = Color.decode("#F8F8F8");
    public static final Color EVEN_ROW_COLOR = Color.WHITE; 
    public static final Color DEFAULT_FOREGROUND_COLOR = Color.BLACK;
    public static final Color PRICE_UP_ROW_COLOR = Color.GREEN;
    public static final Color PRICE_DOWN_ROW_COLOR = Color.RED;
    
    public static final int percent_change_1h = 11;
    public static final int percent_change_24h =12;
    public static final int percent_change_7d = 13;	
    
    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
    
 
		
        

	public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) 
        {
		Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table,value, isSelected, hasFocus, row, column);
                // Apply zebra style on table rows
		if (row % 2 == 0) 
                {
			c.setBackground(EVEN_ROW_COLOR);
		} else {
			c.setBackground(ODD_ROW_COLOR);
		}
                
		if (column == percent_change_1h) 
                {
			Object priceChangeObj = table.getModel().getValueAt(row,percent_change_1h);
			double priceChange = Double.parseDouble(priceChangeObj.toString());
			Color fg_color, bg_color;
			if (priceChange > 0) 
                        {
				fg_color = PRICE_UP_COLOR;
                                bg_color = PRICE_UP_ROW_COLOR;
                                c.setFont(c.getFont().deriveFont(Font.BOLD));
			} else 
                        {
				fg_color = PRICE_DOWN_COLOR;
                                bg_color = PRICE_DOWN_ROW_COLOR;
			}
			c.setForeground(fg_color);
                        c.setBackground(bg_color);
		} 
                else if (column == percent_change_24h) 
                {
			Object priceChangeObj = table.getModel().getValueAt(row,percent_change_24h);
                        
                        if (priceChangeObj!= null)
                        {   
                            double priceChange = Double.parseDouble(priceChangeObj.toString());
                            Color fg_color_b;
                            if (priceChange > 0) 
                            {
                                    fg_color_b = PRICE_UP_ROW_COLOR;
                                    c.setFont(c.getFont().deriveFont(Font.BOLD));
                            } else 
                            {
                                    fg_color_b = PRICE_DOWN_ROW_COLOR;
                            }
                            
                            c.setForeground(fg_color_b);
                        }
		}  
                else if (column == percent_change_7d) 
                {
			Object priceChangeObj = table.getModel().getValueAt(row,percent_change_7d);
                        
                        if (priceChangeObj!= null)
                        {   
                            double priceChange = Double.parseDouble(priceChangeObj.toString());
                            Color fg_color_b;
                            if (priceChange > 0) 
                            {
                                    fg_color_b = PRICE_UP_ROW_COLOR;
                                    c.setFont(c.getFont().deriveFont(Font.BOLD));
                            } else 
                            {
                                    fg_color_b = PRICE_DOWN_ROW_COLOR;
                            }
                            c.setForeground(fg_color_b);
                        }
		} 
                else 
                {
			c.setForeground(DEFAULT_FOREGROUND_COLOR);
		}
		return c;
	}
        

}

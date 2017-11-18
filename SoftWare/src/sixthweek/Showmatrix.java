package sixthweek;
/*
 * 展示生成数据图
 */
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Showmatrix {
	int[] number;
	int[] MGnumber;
	int num;
	public Showmatrix(int[] number,int[] MGnumber,int num) {
		this.number=number;
		this.MGnumber=MGnumber;
		this.num=num;
	}
	public void showJTable() {
		JFrame f = new JFrame();
	    Object[][] playerInfo = {
	            // 创建表格中的数据
	            { "重点本科段", new Integer(number[0]), new Integer(number[1]), new Integer(number[2]),
	                    	 new Integer(MGnumber[0]) },
	            { "普通本科段", new Integer(number[3]), new Integer(number[4]), new Integer(number[5]),
		                    new Integer(MGnumber[1]) },
	            { "剩余段", new Integer(number[6]), new Integer(number[7]), new Integer(number[8]),
			             new Integer(MGnumber[2]) },
	            { "总计", new Integer(MGnumber[3]), new Integer(MGnumber[4]), new Integer(MGnumber[5]),
				         new Integer(num) },};
	    // 创建表格中的横标题
	    String[] Names = { "中考/高考", "重点本科段", "普通本科段", "剩余段", "总计" };
	    // 以Names和playerInfo为参数，创建一个表格
	    JTable table = new JTable(playerInfo, Names);
	    // 设置此表视图的首选大小
	    table.setPreferredScrollableViewportSize(new Dimension(1100, 100));
	    // 将表格加入到滚动条组件中
	    JScrollPane scrollPane = new JScrollPane(table);
	    f.getContentPane().add(scrollPane, BorderLayout.CENTER);
	    // 再将滚动条组件添加到中间容器中
	    f.setTitle("数据生成表");
	    f.pack();
	    f.setVisible(true);
	}
	/*public void Show() {
		System.out.println("中考/高考"+"  重点本科段"+"  普通本科段"+"  剩余段"+"  合计");
		System.out.print("重点本科段");
		for(int i=0;i<4;i++) {
			System.out.print("  "+firstView[i]+"  ");
		}
		System.out.println(" ");
		System.out.print("普通本科段  ");
		for(int i=4;i<8;i++) {
			System.out.print("  "+firstView[i]+"  ");
		}
		System.out.println(" ");
		System.out.print("   剩余段      ");
		for(int i=8;i<12;i++) {
			System.out.print("  "+firstView[i]+"  ");
		}
		System.out.println(" ");
		System.out.print("    合计      ");
		for(int i=12;i<16;i++) {
			System.out.print("  "+firstView[i]+"  ");
		}
		System.out.println(" ");
	}*/
}

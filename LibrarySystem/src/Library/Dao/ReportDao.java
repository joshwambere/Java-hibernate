/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Dao;

import Library.Model.Report;
import Library.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author solo
 */
public class ReportDao {
    public void MakeReport(Report r){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(r);
        trans.commit();
        sess.close();
    }
//    public void exportData(JTable t, File f) throws IOException{
//	Report b = new Report();
//	TableModel model = b.t.getModel();
//	FileWriter out = new FileWriter(f);
//		BufferWriter bw = new BufferWriter(out){
//		for(int i = 0;i<model.getColumnCount();i++){
//		bw.write(model.getColumnName(i)+"\t");
//	}
//	bw.write("\n");
//	for(int i=0;i<model.getRowcount();i++){
//		for(int j=0;j<model.getColumnCount();i++){
//			b.Write(model.getValueAt(i, j).toString()+"");
//	}
//	bw.newLine();
//   }
//   bw.Close();
//	}
//}

}

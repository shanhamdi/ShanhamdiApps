package shan.com.shanhamdi_apps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"Rumah Sakit Awal Bros","Rumah Sakit Eka Hospital","Rumah Sakit Jiwa Tampan",
                "Rumah Sakit Arifin Achmad","Rumah Sakit Syafira","Rumah Sakit Tabrani","Rumah Sakit Zainab"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listRS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bros")) {
            a = new Intent(this,RumahSakitAwalBros.class);


            } else if (pilihan.equals("Rumah Sakit Eka Hospital")) {
                a = new Intent(this,RumahSakitEkaHospital.class);


            } else  if (pilihan.equals("Rumah Sakit Jiwa Tampan")) {
                a = new Intent(this,RumahSakitJiwaTampan.class);

            } else if (pilihan.equals("Rumah Sakit Arifin Achmad")) {
                a = new Intent(this,RumahSakitArifinAhmad.class);

            } else if (pilihan.equals("Rumah Sakit Syafira")) {
                a = new Intent(this,RumahSakitShafira.class);

            } else if (pilihan.equals("Rumah Sakit Tabrani")) {
                a = new Intent(this, RumahSakitTabrani.class);

            } else if (pilihan.equals("Rumah Sakit Zainab")) {
                a = new Intent(this, RumahSakitZainab.class);

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}

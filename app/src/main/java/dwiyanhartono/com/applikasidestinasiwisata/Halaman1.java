package dwiyanhartono.com.applikasidestinasiwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dwiyanhartono.com.applikasidestinasiwisata.Adapter.Adapter_Array;
import dwiyanhartono.com.applikasidestinasiwisata.Adapter.Adapter_List;
import dwiyanhartono.com.applikasidestinasiwisata.Data.GlobalVariable;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Halaman1 extends AppCompatActivity implements Adapter_List.OnItemClickListener {

    RecyclerView rv1;
    List<Adapter_Array> listData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
        setUp();
        setList();
        setAdapter();

    }

    private void setList() {
        listData.add(new Adapter_Array(getString(R.string.Title),
                getString(R.string.Role1),
                getString(R.string.Desc1),
                getString(R.string.Desc2),
                getString(R.string.Desc3),
                getString(R.string.Desc4),
                getString(R.string.DescBio),
                getString(R.string.Titlesub1),
                getString(R.string.Titlesub1_2),
                getString(R.string.Titlesub1_3),
                getString(R.string.Titlesub1_4),
                R.drawable.baliicon,
                R.drawable.wisatabalitanahlot,
                R.drawable.wisatabalikuta,
                R.drawable.wisatabalidanau,
                R.drawable.makanankhasbali));
        listData.add(new Adapter_Array(getString(R.string.Title2),
                getString(R.string.Role2),
                getString(R.string.Desc2_1),
                getString(R.string.Desc2_2),
                getString(R.string.Desc2_3),
                getString(R.string.Desc2_4),
                getString(R.string.DescBio2),
                getString(R.string.Titlesub2_1),
                getString(R.string.Titlesub2_2),
                getString(R.string.Titlesub2_3),
                getString(R.string.Titlesub2_4),
                R.drawable.bdgicon,
                R.drawable.wisatabdg,
                R.drawable.wisatabdg2,
                R.drawable.wisatabdg3,
                R.drawable.makanankhasbandung));
        listData.add(new Adapter_Array(getString(R.string.Title3),
                getString(R.string.Role3),
                getString(R.string.Desc3_1),
                getString(R.string.Desc3_2),
                getString(R.string.Desc3_3),
                getString(R.string.Desc3_4),
                getString(R.string.DescBio3),
                getString(R.string.Titlesub3_1),
                getString(R.string.Titlesub3_2),
                getString(R.string.Titlesub3_3),
                getString(R.string.Titlesub3_4),
                R.drawable.bogoricon,
                R.drawable.wisatabgr,
                R.drawable.wisatabgr2,
                R.drawable.wisatabgr3,
                R.drawable.makanankhasbogor));
        listData.add(new Adapter_Array(getString(R.string.Title4),
                getString(R.string.Role3),
                getString(R.string.Desc4_1),
                getString(R.string.Desc4_2),
                getString(R.string.Desc4_3),
                getString(R.string.Desc4_4),
                getString(R.string.Bio4),
                getString(R.string.Titlesub4_1),
                getString(R.string.Titlesub4_2),
                getString(R.string.Titlesub4_3),
                getString(R.string.Titlesub4_4),
                R.drawable.kotasemarangicon,
                R.drawable.wisatasmr,
                R.drawable.wisatasmr2,
                R.drawable.wisatasmr3,
                R.drawable.makanankhassemarang));
        listData.add(new Adapter_Array(getString(R.string.Title5),
                getString(R.string.Role3),
                getString(R.string.Desc5_1),
                getString(R.string.Desc5_2),
                getString(R.string.Desc5_3),
                getString(R.string.Desc5_4),
                getString(R.string.DescBio5),
                getString(R.string.Titlesub5_1),
                getString(R.string.Titlesub5_2),
                getString(R.string.Titlesub5_3),
                getString(R.string.Titlesub5_4),
                R.drawable.jogjaicon,
                R.drawable.wisatajgj,
                R.drawable.wisatajgj2,
                R.drawable.wisatajgj3,
                R.drawable.makanankhasjogja));
        listData.add(new Adapter_Array(getString(R.string.Title6),
                getString(R.string.Role3),
                getString(R.string.Desc6_1),
                getString(R.string.Desc6_2),
                getString(R.string.Desc6_3),
                getString(R.string.Desc6_4),
                getString(R.string.DescBio6),
                getString(R.string.Titlesub6_1),
                getString(R.string.Titlesub6_2),
                getString(R.string.Titlesub6_3),
                getString(R.string.Titlesub6_4),
                R.drawable.kotapadangicon,
                R.drawable.wisatapdg,
                R.drawable.wisatapdg2,
                R.drawable.wisatapdg3,
                R.drawable.makanankhaspadang));
        listData.add(new Adapter_Array(getString(R.string.Title7),
                getString(R.string.Role3),
                getString(R.string.Desc7_1),
                getString(R.string.Desc7_2),
                getString(R.string.Desc7_3),
                getString(R.string.Desc7_4),
                getString(R.string.DescBio7),
                getString(R.string.Titlesub7_1),
                getString(R.string.Titlesub7_2),
                getString(R.string.Titlesub7_3),
                getString(R.string.Titlesub7_4),
                R.drawable.sbyicon,
                R.drawable.wisatasby,
                R.drawable.wisatasby2,
                R.drawable.wisatasby3,
                R.drawable.makanankhassurabaya));
        listData.add(new Adapter_Array(getString(R.string.Title8),
                getString(R.string.Role3),
                getString(R.string.Desc8_1),
                getString(R.string.Desc8_2),
                getString(R.string.Desc8_3),
                getString(R.string.Desc8_4),
                getString(R.string.DescBio8),
                getString(R.string.Titlesub8_1),
                getString(R.string.Titlesub8_2),
                getString(R.string.Titlesub8_3),
                getString(R.string.Titlesub8_4),
                R.drawable.kotawisatabatuicon,
                R.drawable.wisatabatu,
                R.drawable.wisatabatu1,
                R.drawable.wisatabatu3,
                R.drawable.makanankhasbatu));
        listData.add(new Adapter_Array(getString(R.string.Title9),
                getString(R.string.Role3),
                getString(R.string.Desc9_1),
                getString(R.string.Desc9_2),
                getString(R.string.Desc9_3),
                getString(R.string.Desc9_4),
                getString(R.string.DescBio9),
                getString(R.string.Titlesub9_1),
                getString(R.string.Titlesub9_2),
                getString(R.string.Titlesub9_3),
                getString(R.string.Titlesub9_4),
                R.drawable.lombokicon,
                R.drawable.wisatalmb,
                R.drawable.wisatalmb2,
                R.drawable.wisatalmb3,
                R.drawable.makanankhaslombok));
        listData.add(new Adapter_Array(getString(R.string.Title10),
                getString(R.string.Role3),
                getString(R.string.Desc10_1),
                getString(R.string.Desc10_2),
                getString(R.string.Desc10_3),
                getString(R.string.Desc10_4),
                getString(R.string.DescBio10),
                getString(R.string.Titlesub10_1),
                getString(R.string.Titlesub10_2),
                getString(R.string.Titlesub10_3),
                getString(R.string.Titlesub10_4),
                R.drawable.iconjakarta,
                R.drawable.wisatajkt,
                R.drawable.wisatajkt2,
                R.drawable.wisatajkt3,
                R.drawable.makanankhasjakarta));
    }

    private void setAdapter() {
        Adapter_List adapter = new Adapter_List(this);
        adapter.setData(listData);
        rv1.setAdapter(adapter);
    }

    private void setUp() {
        rv1 = findViewById(R.id.myrv);
        rv1.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onItemClick(int ResID,
                            String Header,
                            String Role,
                            String Desc1,
                            String Desc2,
                            String Desc3,
                            String Desc4,
                            String Desc5,
                            String Title1,
                            String Title2,
                            String Title3,
                            String Title4,
                            int ResID2,
                            int ResID3,
                            int ResID4,
                            int ResID5
    ) {

        //Toast.makeText(this, Header+" role : "+Role, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, DetailActivity.class);
        i.putExtra(GlobalVariable.EXTRA_HEADER, Header);
        i.putExtra(GlobalVariable.EXTRA_ROLE, Role);
        i.putExtra(GlobalVariable.EXTRA_DESC, Desc1);
        i.putExtra(GlobalVariable.EXTRA_DESC2, Desc2);
        i.putExtra(GlobalVariable.EXTRA_DESC3, Desc3);
        i.putExtra(GlobalVariable.EXTRA_DESC4, Desc4);
        i.putExtra(GlobalVariable.EXTRA_DESC5, Desc5);
        i.putExtra(GlobalVariable.EXTRA_TITLE, Title1);
        i.putExtra(GlobalVariable.EXTRA_TITLE2, Title2);
        i.putExtra(GlobalVariable.EXTRA_TITLE3, Title3);
        i.putExtra(GlobalVariable.EXTRA_TITLE4, Title4);
        i.putExtra(GlobalVariable.EXTRA_GAMBAR, ResID);
        i.putExtra(GlobalVariable.EXTRA_GAMBAR2, ResID2);
        i.putExtra(GlobalVariable.EXTRA_GAMBAR3, ResID3);
        i.putExtra(GlobalVariable.EXTRA_GAMBAR4, ResID4);
        i.putExtra(GlobalVariable.EXTRA_GAMBAR5, ResID5);

        startActivity(i);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menubar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.language) {
            Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(mIntent);
        }
        if (id == R.id.profile) {
            Intent mIntent = new Intent(this, Profile.class);
            startActivity(mIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}
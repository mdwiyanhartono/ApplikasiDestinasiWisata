package dwiyanhartono.com.applikasidestinasiwisata;

import androidx.appcompat.app.AppCompatActivity;
import dwiyanhartono.com.applikasidestinasiwisata.Data.GlobalVariable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity  {

    ImageView img1,img2,img3,img4,img5;
    TextView Title1,Title2,Title3,Title4,Desc1,Desc2,Desc3,Desc4,Desc5,Role,Header,Titlesub1,Titlesub2,Titlesub3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Initial();
        SetUp();
    }

    private void SetUp() {
        Intent intent = getIntent();
        Header.setText(intent.getStringExtra(GlobalVariable.EXTRA_HEADER));
        Role.setText(intent.getStringExtra(GlobalVariable.EXTRA_ROLE));
        Title1.setText(intent.getStringExtra(GlobalVariable.EXTRA_TITLE));
        Title2.setText(intent.getStringExtra(GlobalVariable.EXTRA_TITLE2));
        Title3.setText(intent.getStringExtra(GlobalVariable.EXTRA_TITLE3));
        Title4.setText(intent.getStringExtra(GlobalVariable.EXTRA_TITLE4));
        Titlesub1.setText(intent.getStringExtra(GlobalVariable.EXTRA_TITLE));
        Titlesub2.setText(intent.getStringExtra(GlobalVariable.EXTRA_TITLE2));
        Titlesub3.setText(intent.getStringExtra(GlobalVariable.EXTRA_TITLE3));
        Desc5.setText(intent.getStringExtra(GlobalVariable.EXTRA_DESC4));
        Desc1.setText(intent.getStringExtra(GlobalVariable.EXTRA_DESC));
        Desc2.setText(intent.getStringExtra(GlobalVariable.EXTRA_DESC2));
        Desc3.setText(intent.getStringExtra(GlobalVariable.EXTRA_DESC3));
        Desc4.setText(intent.getStringExtra(GlobalVariable.EXTRA_DESC5));
        img1.setImageResource(intent.getIntExtra(GlobalVariable.EXTRA_GAMBAR,0));
        img2.setImageResource(intent.getIntExtra(GlobalVariable.EXTRA_GAMBAR2,0));
        img3.setImageResource(intent.getIntExtra(GlobalVariable.EXTRA_GAMBAR3,0));
        img4.setImageResource(intent.getIntExtra(GlobalVariable.EXTRA_GAMBAR4,0));
        img5.setImageResource(intent.getIntExtra(GlobalVariable.EXTRA_GAMBAR5,0));
    }

    private void Initial() {
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        Title1 = findViewById(R.id.Title1);
        Title2 = findViewById(R.id.Title2);
        Title3 = findViewById(R.id.Title3);
        Title4 = findViewById(R.id.Title4);
        Titlesub1 = findViewById(R.id.textsub1);
        Titlesub2 = findViewById(R.id.textsub2);
        Titlesub3 = findViewById(R.id.textsub3);
        Desc1 = findViewById(R.id.desc1);
        Desc2 = findViewById(R.id.desc2);
        Desc3 = findViewById(R.id.desc3);
        Desc4 = findViewById(R.id.desc4);
        Desc5 = findViewById(R.id.desc5);
        Role = findViewById(R.id.role);
        Header = findViewById(R.id.Header);

    }
}
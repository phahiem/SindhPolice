package com.example.shah.sindhpolice2;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





}

    public void website(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sindhpolice.gov.pk/"));
        startActivity(browserIntent);
    }

    public void facebook(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pages/category/Government-Organization/Sindh-Police-CPO-1905216799716807/"));
        startActivity(browserIntent);
    }

    public void youtube(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCRsS4qUxeej46Z8KNSNp9fA"));
        startActivity(browserIntent);
    }

    public void Rizwan(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RizwanAlikhanRizz"));
        startActivity(browserIntent);
    }

}

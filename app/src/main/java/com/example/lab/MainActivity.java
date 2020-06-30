package com.example.lab;

import android.content.Intent;
import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;

import com.example.lab.home.BayarActivity;
import com.example.lab.home.HomeActivity;
import com.example.lab.home.PengeluaranActivity;
import com.example.lab.lab.LabActivity;
import com.example.lab.recap.RecapActivity;
import com.example.lab.recap.RecapDataActivity;
import com.example.lab.ui.main.UsulanBelanjaActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new HomeActivity());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.home:
                        fragment = new HomeActivity();
                        break;

                    case R.id.person:
                        fragment = new LabActivity();
                        break;

                    case R.id.notidications:
                        fragment = new RecapActivity();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }

    //Menampilkan halaman Fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public void gotobayar(View view) {
        startActivity(new Intent(MainActivity.this, BayarActivity.class));
    }

    public void goMasukan(View view) {
        startActivity(new Intent(MainActivity.this, PengeluaranActivity.class));
    }

    public void goRecap(View view) {
        startActivity(new Intent(MainActivity.this, RecapDataActivity.class));
    }

    public void goUsulanBelanja(View view) {
        startActivity(new Intent(MainActivity.this, UsulanBelanjaActivity.class));
    }

    public void gotoWA(View view) {
        String number = "6285240986164";
        String url = "https://api.whatsapp.com/send?phone="+number;
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setPackage("com.whatsapp");
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
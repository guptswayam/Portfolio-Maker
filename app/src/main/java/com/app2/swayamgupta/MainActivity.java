package com.app2.swayamgupta;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import adapter.Myadapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    TextView name,prof;
    ImageView imageView;
    static final int REQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tablayout);
        imageView=findViewById(R.id.timage);
        prof=findViewById(R.id.profession);
        viewPager.setAdapter(new Myadapter(getSupportFragmentManager(),getApplicationContext()));
        tabLayout.setupWithViewPager(viewPager);
        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
        name.setText(mydatabase.getName());
        prof.setText(mydatabase.getProfession());
        String add=mydatabase.getAddress();
        if(add.equals("xyz")==false)
        {
            imageView.setImageURI(Uri.parse(add));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menubar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.cname:View v = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_alert,null);
                final EditText et=v.findViewById(R.id.et1);
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Change Name").setView(v).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String cname=et.getText().toString().trim();
                        name.setText(cname);
                        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                        mydatabase.updateName(cname);
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog ad=builder.create();
                ad.show();
                return true;
            case R.id.cimage:Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,REQUEST_CODE);
                return true;
            case R.id.cabout:View v1=LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_alert,null);
                final EditText et1=v1.findViewById(R.id.et1);
                AlertDialog.Builder builder1=new AlertDialog.Builder(MainActivity.this);
                builder1.setTitle("Change About").setView(v1).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String cabout=et1.getText().toString().trim();
                        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                        mydatabase.updateAbout(cabout);
                        viewPager.setAdapter(new Myadapter(getSupportFragmentManager(),getApplicationContext()));
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog ad1=builder1.create();
                ad1.show();
                return true;
            case R.id.cprofession:View v2 = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_alert,null);
                final EditText et2=v2.findViewById(R.id.et1);
                AlertDialog.Builder builder2=new AlertDialog.Builder(MainActivity.this);
                builder2.setTitle("Change Profession").setView(v2).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String cprof=et2.getText().toString().trim();
                        prof.setText(cprof);
                        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                        mydatabase.updateProfession(cprof);
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog ad2=builder2.create();
                ad2.show();
                return true;
            case R.id.cskills:View v3=LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_alert,null);
                final EditText et3=v3.findViewById(R.id.et1);
                AlertDialog.Builder builder3=new AlertDialog.Builder(MainActivity.this);
                builder3.setTitle("Change Skills").setView(v3).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String cskills=et3.getText().toString().trim();
                        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                        mydatabase.updateAbout(cskills);
                        viewPager.setAdapter(new Myadapter(getSupportFragmentManager(),getApplicationContext()));
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog ad3=builder3.create();
                ad3.show();
                return true;
            case R.id.cexp:View v6=LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_alert,null);
                final EditText et6=v6.findViewById(R.id.et1);
                AlertDialog.Builder builder6=new AlertDialog.Builder(MainActivity.this);
                builder6.setTitle("Change Experience").setView(v6).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String cskills=et6.getText().toString().trim();
                        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                        mydatabase.updateAbout(cskills);
                        viewPager.setAdapter(new Myadapter(getSupportFragmentManager(),getApplicationContext()));
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog ad6=builder6.create();
                ad6.show();
                return true;
            case R.id.cinsta:View v4=LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_alert,null);
                final EditText et4=v4.findViewById(R.id.et1);
                AlertDialog.Builder builder4=new AlertDialog.Builder(MainActivity.this);
                builder4.setTitle("Change Instagram Account").setView(v4).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String cinsta=et4.getText().toString().trim();
                        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                        mydatabase.updateInsta(cinsta);
                        viewPager.setAdapter(new Myadapter(getSupportFragmentManager(),getApplicationContext()));
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog ad4=builder4.create();
                ad4.show();
                return true;
            case R.id.cmail:View v5=LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_alert,null);
                final EditText et5=v5.findViewById(R.id.et1);
                AlertDialog.Builder builder5=new AlertDialog.Builder(MainActivity.this);
                builder5.setTitle("Change Mail").setView(v5).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String mail=et5.getText().toString().trim();
                        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                        mydatabase.updateMail(mail);
                        viewPager.setAdapter(new Myadapter(getSupportFragmentManager(),getApplicationContext()));
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog ad5=builder5.create();
                ad5.show();
                return true;
            case R.id.cmob: View v7=LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_alert,null);
                final EditText et7=v7.findViewById(R.id.et1);
                AlertDialog.Builder builder7=new AlertDialog.Builder(MainActivity.this);
                builder7.setTitle("Change Mobile no.").setView(v7).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String mob=et7.getText().toString().trim();
                        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                        if(mob.length()==10)
                            mydatabase.updateMobile(mob);
                        else
                            Toast.makeText(MainActivity.this,"Invalid Phone No.",Toast.LENGTH_SHORT).show();
//                        viewPager.setAdapter(new Myadapter(getSupportFragmentManager(),getApplicationContext()));
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog ad7=builder7.create();
                ad7.show();
                return true;
            default:
                return true;
        }
    }

    public void call(View v)
    {
        Mydatabase mydatabase=new Mydatabase(getApplicationContext());
        String dial="tel:";
        String mob=mydatabase.getMobile();
        dial=dial+mob;
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse(dial));
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==REQUEST_CODE)
        {
            if(data==null)
                Toast.makeText(getApplicationContext(),"Image not Selected",Toast.LENGTH_SHORT).show();
            else {

                Uri uri=data.getData();
                imageView.setImageURI(uri);
                Mydatabase mydatabase=new Mydatabase(getApplicationContext());
                String add= String.valueOf(uri);
                mydatabase.updateImg(add);
            }
        }
    }
}

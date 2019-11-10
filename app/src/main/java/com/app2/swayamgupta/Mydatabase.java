package com.app2.swayamgupta;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Mydatabase extends SQLiteOpenHelper {
    String uid="guptswayam";
    public Mydatabase(Context context){
        super(context,"Person.db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE CUSTOMER(userid text,name text,address BLOB NOT NULL,about text,profession text,skills text,experience text,insta text,mail text,mobile text)");
        db.execSQL("INSERT INTO CUSTOMER(userid,name,address,about,profession,skills,experience,insta,mail,mobile) values('guptswayam','Bibu Gupta','xyz','Hey, I am Swayam Gupta and I am completing BSc (Hons) Computer Science from Keshav Mahavidyalaya, University of Delhi .\nBecause of my personal interest in computer science, I learned many programming languages and have a strong base in Java and C++ .\n\nI also have a keen interest in Android Development .','Java and Android Developer','* Core Java . \n\n* Android Development .\n\n* HTML ,CSS and JavaScript. \n\n* XML . \n\n* C++ .\n\n* JDBC, Servlets and JSP .\n\n* Sass and Bootstrap','No past experience in any company but I worked on various Enterprise and Android Projects .','swayam.gupta','swayamgupta5705367@gmail.com','7895165377')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists customer");
        onCreate(db);
    }
    public String getName()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"name"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
            return  c.getString(0);
        }
        return null;
    }
    public void updateName(String name)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",name);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public void updateImg(String address)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("address",address);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public String getAddress()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"address"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
            return  c.getString(0);
        }
        return null;
    }
    public void updateProfession(String prof)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("profession",prof);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public String getProfession()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"profession"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
            return  c.getString(0);
        }
        return null;
    }
    public void updateAbout(String about)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("about",about);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public String getAbout()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"about"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);

        if(c.getCount()>0)
        {
            c.moveToFirst();
            String a=c.getString(0);
            return a;
        }
        return null;
    }
    public void updateSkills(String skills)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("skills",skills);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public String getSkills()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"skills"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);

        if(c.getCount()>0)
        {
            c.moveToFirst();
            String a=c.getString(0);
            return a;
        }
        return null;
    }
    public void updateExperience(String exp)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("experience",exp);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public String getExperience()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"experience"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);

        if(c.getCount()>0)
        {
            c.moveToFirst();
            String a=c.getString(0);
            return a;
        }
        return null;
    }
    public void updateInsta(String insta)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("insta",insta);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public String getInsta()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"insta"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);

        if(c.getCount()>0)
        {
            c.moveToFirst();
            String a=c.getString(0);
            return a;
        }
        return null;
    }
    public void updateMail(String mail)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("mail",mail);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public String getMail()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"mail"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);

        if(c.getCount()>0)
        {
            c.moveToFirst();
            String a=c.getString(0);
            return a;
        }
        return null;
    }
    public void updateMobile(String mobile)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("mobile",mobile);
        String selection="userid=?";
        String[] args={uid};
        db.update("customer",contentValues,selection,args);
    }
    public String getMobile()
    {
        SQLiteDatabase db=getReadableDatabase();
        String columns[]={"mobile"};
        String selction="userid=?";
        String args[]={uid};
        Cursor c=db.query("customer",columns,selction,args,null,null,null);

        if(c.getCount()>0)
        {
            c.moveToFirst();
            String a=c.getString(0);
            return a;
        }
        return null;
    }
}

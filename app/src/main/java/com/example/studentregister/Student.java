package com.example.studentregister;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class Student extends BaseObservable {

    @PrimaryKey(autoGenerate = true)
    private int studentId;
    private String name;
    private String email;
    private String country;
    private String registeredTime;

    @Ignore
    public Student() {
    }

    public Student(int studentId, String name, String email, String country, String registeredTime) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.country = country;
        this.registeredTime = registeredTime;
    }
    @Bindable
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
        notifyPropertyChanged(com.example.studentregister.BR.studentId);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.example.studentregister.BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.example.studentregister.BR.email);
    }

    @Bindable
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
        notifyPropertyChanged(com.example.studentregister.BR.country);
    }

    @Bindable
    public String getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime;
        notifyPropertyChanged(com.example.studentregister.BR.registeredTime);
    }
}

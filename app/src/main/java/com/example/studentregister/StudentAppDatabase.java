package com.example.studentregister;

import androidx.room.Database;
import androidx.room.RoomDatabase;

// Schema export directory is not provided to the annotation processor so we cannot export the schema. You can either provide `room.schemaLocation` annotation processor argument OR set exportSchema to false.
@Database(entities = {Student.class}, version = 1, exportSchema = false)
public abstract class StudentAppDatabase extends RoomDatabase {

    public abstract StudentDao getStudentDao();

}

package com.example.studentregister;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentregister.databinding.StudentListItemBinding;

import java.util.ArrayList;

public class StudentDataAdapter extends RecyclerView.Adapter<StudentDataAdapter.StudentViewHolder> {

    private ArrayList<Student> students;

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        StudentListItemBinding studentListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.student_list_item, parent, false);
        return new StudentViewHolder(studentListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student currentStudent = students.get(position);
        holder.studentListItemBinding.setStudent(currentStudent);
    }

    @Override
    public int getItemCount() {
        if (students != null) {
            return students.size();
        }
        return 0;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
        notifyDataSetChanged();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        private StudentListItemBinding studentListItemBinding;

        public StudentViewHolder(@NonNull StudentListItemBinding studentListItemBinding) {
            super(studentListItemBinding.getRoot());

            this.studentListItemBinding = studentListItemBinding;

        }
    }
}

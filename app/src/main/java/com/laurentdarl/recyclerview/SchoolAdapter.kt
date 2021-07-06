package com.laurentdarl.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.laurentdarl.recyclerview.databinding.ActivityMainBinding
import com.laurentdarl.recyclerview.databinding.SchoolsBinding

class SchoolAdapter(var schools: List<Student>, var clickListener: OnSchoolListener) :
    RecyclerView.Adapter<SchoolAdapter.StudentViewHolder>() {

    class StudentViewHolder(var binding: SchoolsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(student: Student) {
            binding.profileView.setImageResource(student.profile)
            binding.firstName.text = student.first
            binding.lastName.text = student.last
        }

        fun initialize(student: Student, action: OnSchoolListener) {
            binding.profileView.setImageResource(student.profile)
            binding.firstName.text = student.first
            binding.lastName.text = student.last

            binding.root.setOnClickListener {
                action.onItemClick(student, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = SchoolsBinding.inflate(LayoutInflater.from(parent.context))
        return StudentViewHolder(binding)
    }


    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val school = schools[position]
        holder.bind(school)
        holder.initialize(schools[position], clickListener)
    }

    override fun getItemCount(): Int {
        return schools.size
    }


}

interface OnSchoolListener {
    fun onItemClick(schools: Student, position: Int)
}
package com.laurentdarl.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laurentdarl.recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), OnSchoolListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var schoolAdapter: SchoolAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var maureen = listOf<Student>(
            Student(R.drawable.ic_maureen_face, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans1, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans2, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans3, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans4, "Maureen", "Onosode"),
            Student(R.drawable.ic_woman5, "Maureen", "Onosode"),
            Student(R.drawable.ic_maureen_face, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans1, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans2, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans3, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans4, "Maureen", "Onosode"),
            Student(R.drawable.ic_woman5, "Maureen", "Onosode"),
            Student(R.drawable.ic_maureen_face, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans1, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans2, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans3, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans4, "Maureen", "Onosode"),
            Student(R.drawable.ic_woman5, "Maureen", "Onosode"),
            Student(R.drawable.ic_maureen_face, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans1, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans2, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans3, "Maureen", "Onosode"),
            Student(R.drawable.ic_womans4, "Maureen", "Onosode"),
            Student(R.drawable.ic_woman5, "Maureen", "Onosode")
        )

        schoolAdapter = SchoolAdapter(maureen, this )
        binding.studentRecycler.adapter = schoolAdapter

    }

    override fun onItemClick(student: Student, position: Int) {
        val intent = Intent(this,ProfileActivity::class.java)
        intent.putExtra("ProfileView", student.profile.toString())
        intent.putExtra("firstName", student.first)
        intent.putExtra("lastName", student.last)
        startActivity(intent)
    }

}
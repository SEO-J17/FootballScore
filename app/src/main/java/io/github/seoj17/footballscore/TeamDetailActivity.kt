package io.github.seoj17.footballscore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import io.github.seoj17.footballscore.databinding.TeamDetailActivityBinding

class TeamDetailActivity : AppCompatActivity() {
    private lateinit var binding: TeamDetailActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TeamDetailActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.infoFrame.id, fragment)
            .commit()
    }
}
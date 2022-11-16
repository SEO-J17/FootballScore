package io.github.seoj17.footballscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import io.github.seoj17.footballscore.adapter.FootballListAdapter
import io.github.seoj17.footballscore.databinding.ActivityMainBinding
import io.github.seoj17.footballscore.network.FootballService
import io.github.seoj17.footballscore.utils.QueryUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lifecycleScope.launch {
            with(FootballService.getMatchesInfo()) {
                binding.recyclerView.adapter = FootballListAdapter(QueryUtils.extractData(this))
            }
            withContext(Dispatchers.Main) {
                binding.loadingBar.visibility = View.GONE
            }
        }
    }
}
package io.github.seoj17.footballscore.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.seoj17.footballscore.databinding.FragmentTeamInfoBinding

class TeamInfoFragment : Fragment() {
    private lateinit var binding: FragmentTeamInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentTeamInfoBinding.inflate(inflater, container, false)
        return binding.root
    }
}
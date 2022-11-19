package io.github.seoj17.footballscore.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.seoj17.footballscore.databinding.FragmentTeamSquadBinding

class TeamSquadFragment : Fragment() {
    private lateinit var binding: FragmentTeamSquadBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentTeamSquadBinding.inflate(inflater, container, false)
        return binding.root
    }
}
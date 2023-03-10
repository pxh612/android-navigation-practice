package com.example.pxh612_trivia_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pxh612_trivia_practice.databinding.FragmentGameOverBinding


class GameOverFragment : Fragment(), View.OnClickListener {

    private lateinit var binding : FragmentGameOverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game_over,container,false)

        binding.retry.setOnClickListener(this)
        return binding.root
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.retry -> {
                restartGame()
            }
        }
    }

    private fun restartGame() {
        requireView().findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
    }
}
package es.vag.vmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationBarView
import es.vag.vmusic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bottomNavigation.setOnItemSelectedListener(this)

    }

    override  fun onNavigationItemSelected(item: MenuItem) = when(item.itemId){
        R.id.item_genero -> {
            Toast.makeText(this,getString(R.string.Genero),Toast.LENGTH_SHORT).show()
            true
        }
        R.id.item_buscar -> {
            Toast.makeText(this,getString(R.string.Buscar),Toast.LENGTH_SHORT).show()
            true
        }
        R.id.item_tendencia -> {
            Toast.makeText(this,getString(R.string.Tendencias),Toast.LENGTH_SHORT).show()
            true
        }
        R.id.item_usuario -> {
            Toast.makeText(this,getString(R.string.Usuario),Toast.LENGTH_SHORT).show()
            true
        }
        else -> false
    }
}
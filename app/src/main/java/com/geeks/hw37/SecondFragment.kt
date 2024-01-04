import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.SongAdapter
import com.geeks.hw37.MainActivity
import com.geeks.hw37.R

class SecondFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recycler, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        SongAdapter(this.getSongList()) { position ->
            val selectedSong = getSongList()[position]
            val intent = Intent(activity, SecondActivity::class.java)
            intent.putExtra("songTitle", selectedSong.title)
            startActivity(intent)
        }.also { recyclerView.adapter = it }

        return view
    }

    private fun getSongList(): List<MainActivity.Song> {
        return listOf(
            MainActivity.Song("Shape of You", "Ed Sheeran"),
            MainActivity.Song("Blinding Lights", "The Weeknd"),
            MainActivity.Song("Dance Monkey", "Tones and I"),
            MainActivity.Song("Watermelon Sugar", "Harry Styles"),
            MainActivity.Song("Someone You Loved", "Lewis Capaldi"),
            MainActivity.Song("Savage Love", "Jawsh 685, Jason Derulo"),
            MainActivity.Song("Rockstar", "DaBaby ft. Roddy Ricch"),
            MainActivity.Song("Levitating", "Dua Lipa"),
            MainActivity.Song("Peaches", "Justin Bieber ft. Daniel Caesar, Giveon"),
            MainActivity.Song("Save Your Tears", "The Weeknd & Ariana Grande")
        )
    }

    }


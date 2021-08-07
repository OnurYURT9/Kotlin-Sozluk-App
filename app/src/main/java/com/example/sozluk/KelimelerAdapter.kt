package com.example.sozluk
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
class KelimelerAdapter(private val mContext:Context,private val kelimelerListe:List<Kelimeler>)
    : RecyclerView.Adapter<KelimelerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim: View) : RecyclerView.ViewHolder(tasarim){
        var kelime_card:CardView
        var textviewingilizce:TextView
        var textViewturkce:TextView
        init {
            kelime_card = tasarim.findViewById(R.id.kelime_kart)
            textviewingilizce = tasarim.findViewById(R.id.textviewingilizce)
            textViewturkce = tasarim.findViewById(R.id.textViewturkce)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim,parent,false)
        return CardTasarimTutucu(tasarim)
    }
    override fun getItemCount(): Int {
        return kelimelerListe.size
    }
    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kelime = kelimelerListe.get(position)
        holder.textviewingilizce.text = kelime.ingilizce
        holder.textViewturkce.text = kelime.turkce
        holder.kelime_card.setOnClickListener{
        }
    }
}
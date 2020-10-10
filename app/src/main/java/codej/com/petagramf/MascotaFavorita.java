package codej.com.petagramf;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import codej.com.petagramf.adapter.MascotaAdaptador;
import codej.com.petagramf.pojo.Mascota;

public class MascotaFavorita extends AppCompatActivity {

    ArrayList<Mascota> mascotasFavoitas;
    private RecyclerView listaMascotasFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota_favorita);

        androidx.appcompat.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        listaMascotasFav = (RecyclerView) findViewById(R.id.rvMasFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotasFav.setLayoutManager(llm);
        inicializarListaMascotasFav();
        inicializarlistaAdaptador();
    }

    public void inicializarListaMascotasFav() {
        mascotasFavoitas = new ArrayList<Mascota>();
        mascotasFavoitas.add(new Mascota( R.drawable.mascota4,"Caty","4"));
        mascotasFavoitas.add(new Mascota( R.drawable.mascota2, "Rony","6"));
        mascotasFavoitas.add(new Mascota( R.drawable.terror, "Terror","9"));
        mascotasFavoitas.add(new Mascota( R.drawable.mascota5,"Pink","8"));
        mascotasFavoitas.add(new Mascota( R.drawable.mascota1, "Cheko","7"));
}
    public void inicializarlistaAdaptador(){
        MascotaAdaptador madaptador = new MascotaAdaptador(mascotasFavoitas, this);
        listaMascotasFav.setAdapter(madaptador);
    }
}
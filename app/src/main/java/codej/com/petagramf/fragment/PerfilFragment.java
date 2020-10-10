package codej.com.petagramf.fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import codej.com.petagramf.R;
import codej.com.petagramf.adapter.MascotaAdaptador;
import codej.com.petagramf.pojo.Mascota;

import static android.widget.Toast.LENGTH_LONG;

public class PerfilFragment extends  Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaPerfiles;
    Activity actividad;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);


        listaPerfiles = (RecyclerView) v.findViewById(R.id.rvPerfil);

        listaPerfiles.setLayoutManager(new GridLayoutManager(this.actividad,3));
        listaPerfiles.setHasFixedSize(true);

        inicializarListaMascotas();
        inicializarlistaAdaptador();
        return v;
    }

    public void inicializarlistaAdaptador(){
        MascotaAdaptador madaptador = new MascotaAdaptador(mascotas, getActivity());
        listaPerfiles.setAdapter(madaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota( R.drawable.mascota5, "4"));
        mascotas.add(new Mascota( R.drawable.mascota5,"3"));
        mascotas.add(new Mascota( R.drawable.mascota5,"5"));
        mascotas.add(new Mascota( R.drawable.mascota5,"8"));
        mascotas.add(new Mascota( R.drawable.mascota5,"2"));
        mascotas.add(new Mascota( R.drawable.mascota5,"9"));
        mascotas.add(new Mascota( R.drawable.mascota5,"4"));
        mascotas.add(new Mascota( R.drawable.mascota5,"6"));
        mascotas.add(new Mascota( R.drawable.mascota5,"3"));
        mascotas.add(new Mascota( R.drawable.mascota5,"5"));
        mascotas.add(new Mascota( R.drawable.mascota5,"8"));
        mascotas.add(new Mascota( R.drawable.mascota5,"6"));
        mascotas.add(new Mascota( R.drawable.mascota5,"4"));
        mascotas.add(new Mascota( R.drawable.mascota5,"9"));
        mascotas.add(new Mascota( R.drawable.mascota5,"2"));
        mascotas.add(new Mascota( R.drawable.mascota5,"7"));
        mascotas.add(new Mascota( R.drawable.mascota5,"8"));
        mascotas.add(new Mascota( R.drawable.mascota5,"4"));


    }


}
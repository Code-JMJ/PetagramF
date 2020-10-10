package codej.com.petagramf.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import codej.com.petagramf.R;
import codej.com.petagramf.adapter.MascotaAdaptador;
import codej.com.petagramf.pojo.Mascota;

public class RecyclerViewFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarlistaAdaptador();

        return v;
    }

    public void inicializarlistaAdaptador(){
        MascotaAdaptador madaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(madaptador);
    }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota( R.drawable.mascota4,"Caty","4"));
        mascotas.add(new Mascota( R.drawable.mascota2, "Rony","6"));
        mascotas.add(new Mascota( R.drawable.terror, "Terror","9"));
        mascotas.add(new Mascota( R.drawable.mascota5,"Pink","8"));
        mascotas.add(new Mascota( R.drawable.mascota1, "Cheko","7"));
        mascotas.add(new Mascota( R.drawable.mascota7, "Hansy","5"));
    }
}

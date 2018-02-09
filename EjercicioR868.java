import java.util.ArrayList;
import java.util.*;
public class EjercicioR868
{
    public ArrayList<Alumno> obtenerAlumnosOrdenadorPorNotaMedia(ArrayList<Alumno> alumnosGrupo1, ArrayList<Alumno> alumnosGrupo2) 
    {     
        ArrayList<Alumno> AlumnosAprobados= new ArrayList<>();
        ArrayList<Alumno> AlumnosOrdenadorPorNotaMedia = new ArrayList<>();
        if(alumnosGrupo1.size() > 0 || alumnosGrupo2.size() > 0)
        {
            for(int i=0; i <alumnosGrupo1.size(); i++){
                if(alumnosGrupo1.get(i).getNotaMedia()>0){
                    AlumnosAprobados.add(alumnosGrupo1.get(i));
                }           
            }
            for(int i=0; i <alumnosGrupo2.size(); i++){
                if(alumnosGrupo2.get(i).getNotaMedia()>0){
                    AlumnosAprobados.add(alumnosGrupo2.get(i));
                }           
            }                       
            while(AlumnosAprobados.size() > 0)
            {   
                int posicion =0;
                int posicionMasMedia = 0;
                double mediaMasAlta = AlumnosOrdenadorPorNotaMedia.get(0).getNotaMedia();                
                while(posicion < AlumnosAprobados.size()){                
                    if(AlumnosAprobados.get(posicion).getNotaMedia() >= mediaMasAlta){                        
                        posicionMasMedia = posicion;
                        mediaMasAlta=AlumnosAprobados.get(posicion).getNotaMedia();
                    }
                    posicion++;
                }     
                AlumnosOrdenadorPorNotaMedia.add(AlumnosAprobados.get(posicion));
                AlumnosAprobados.remove(posicionMasMedia);
            }
        }   
        Collections.reverse(AlumnosOrdenadorPorNotaMedia);
        return AlumnosOrdenadorPorNotaMedia;

    }
}

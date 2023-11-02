
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LecturaDatos {
    private List<Medicamento> medicamentos;
    List<String> nombres = new ArrayList<>();

    public LecturaDatos() {
        medicamentos = new ArrayList<>();
        cargarMedicamentoDesdeArchivo();
    }

    private void cargarMedicamentoDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("medicamentos.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosMedicamento = scanner.nextLine().split(",");
                Medicamento medicamento = new Medicamento(datosMedicamento[0], Double.parseDouble(datosMedicamento[1]), datosMedicamento[2]);
                medicamentos.add(medicamento);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
    public int[] medicamentosPorNombre(){
        int mpr[] = new int [nombres.size()];
        int i=0;
        while (i<medicamentos.size()){
            Medicamento temp = medicamentos.get(i);
            if (temp.nombre.contains("ACEITE ESENCIAL DE EUCALIPTO")||temp.nombre.contains("ACEITE DE HÍGADO DE PESCADO")||temp.nombre.contains("ACETAMINOFÉN")||temp.nombre.contains("ACIDO BÓRICO")||temp.nombre.contains("ACIDO FÓLICO")||temp.nombre.contains("ALCANFOR")||temp.nombre.contains("ALCOHOL ETÍLICO")||temp.nombre.contains("ACEITE DE HÍGADO DE BACALAO")||temp.nombre.contains("PALMITATO")||temp.nombre.contains("ACEITE MINERAL")||temp.nombre.contains("ACETATO DE ALUMINIO")||temp.nombre.contains("ACETATO DE CALCIO")||temp.nombre.contains("ACETATO DE ULIPRISTAL")||temp.nombre.contains("ACICLOVIR")||temp.nombre.contains("ÁCIDO ACÉTICO")||temp.nombre.contains("ÁCIDO ACETILSALICÍLICO")||temp.nombre.contains("ÁCIDO ASCÓRBICO")||temp.nombre.contains("ÁCIDO BENZÓICO")||temp.nombre.contains("ÁCIDO CÍTRICO")||temp.nombre.contains("ÁCIDO DEHIDROCÓLICO")||temp.nombre.contains("ÁCIDO ASCÓRBICO")||temp.nombre.contains("ÁCIDO SALICÍLICO")||temp.nombre.contains("ÁCIDO UNDECILÉNICO")||temp.nombre.contains("AESCINA")||temp.nombre.contains("AGUA DE MAR ISOTÓNICA")||temp.nombre.contains("ALANTOÍNA")||temp.nombre.contains("ALCOHOL POLIVINILLICO")||temp.nombre.contains("ALANTOÍNA")||temp.nombre.contains("ALGINATO DE SODIO")||temp.nombre.contains("AMBROXOL")||temp.nombre.contains("ANTOCIANIDINAS")||temp.nombre.contains("AZUFRE")||temp.nombre.contains("BACILOS")||temp.nombre.contains("BACILLUS")||temp.nombre.contains("BENCIDAMINA")||temp.nombre.contains("BENCIL")||temp.nombre.contains("BENOXINATO")||temp.nombre.contains("BENZOCAÍNA")||temp.nombre.contains("BENZOFENONA")||temp.nombre.contains("CARBONATO")||temp.nombre.contains("CARBOXICISTEINA")||temp.nombre.contains("N-ACETILCISTEÍNA")||temp.nombre.contains("CETIRIZINA")||temp.nombre.contains("CLOBUTINOL")||temp.nombre.contains("CLORHEXIDINA")||temp.nombre.contains("CLORURO")||temp.nombre.contains("CLOTRIMAZOL")||temp.nombre.contains("DEXTROMETORFANO")||temp.nombre.contains("DICLOFENACO")||temp.nombre.contains("EUCALIPTOL")||temp.nombre.contains("ECONAZOL")||temp.nombre.contains("FAMOTIDINA")||temp.nombre.contains("FLUORURO")||temp.nombre.contains("GLICERINA")||temp.nombre.contains("GLICERIL")||temp.nombre.contains("HIDRÓXIDO")||temp.nombre.contains("HIDROCORTISONA")||temp.nombre.contains("IBUPROFENO")||temp.nombre.contains("ICTAMOL")||temp.nombre.contains("KETOCONAZOL")||temp.nombre.contains("LACTOBACILLUS")||temp.nombre.contains("LORATADINA")||temp.nombre.contains("MICONAZOL")||temp.nombre.contains("MINOXIDIL")||temp.nombre.contains("NAFAZOLINA")||temp.nombre.contains("NAPROXENO")||temp.nombre.contains("NICOTINA")||temp.nombre.contains("ÓXIDO")||temp.nombre.contains("PANCREATINA")||temp.nombre.contains("PERÓXIDO")||temp.nombre.contains("PICOSULFATO")||temp.nombre.contains("POLISULFATO")||temp.nombre.contains("PRAMIVERINA")||temp.nombre.contains("RUIBARBO")||temp.nombre.contains("SALICILATO")||temp.nombre.contains("SIMETICONA")||temp.nombre.contains("TERBINAFINA")||temp.nombre.contains("TRICLOSÁN")||temp.nombre.contains("YODOPOLIVINILPIRROLIDONA")||temp.nombre.contains("YODO")){
                
            }
            i++;
        }
        return mpr;
    }
    
    public List<String> nombres(){
        
        int i=0;
        
        while (i<medicamentos.size()){
            Medicamento temp = medicamentos.get(i);
            boolean nameregistered = false;
            int j=0;
            while (j < nombres.size()) {
                if(temp.nombre.equals(nombres.get(j))){
                    nameregistered = true; 
                }
                j++;
            }
            if (!nameregistered) {
                nombres.add(temp.nombre);
            }
            i++;
        }
        
        return nombres;
    }
    
}
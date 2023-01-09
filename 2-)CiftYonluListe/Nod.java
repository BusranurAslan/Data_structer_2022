public class Nod {

    String sehir;
    Nod sonraki=null;
    Nod onceki=null;
    
    public String getIsim() {
        return sehir;
    }
    public void setIsim(String sehir) {
        this.sehir = sehir;
    }
    public Nod getSonraki() {
        return sonraki;
    }
    public void setSonraki(Nod sonraki) {
        this.sonraki = sonraki;
    }
    public Nod getOnceki() {
        return onceki;
    }
    public void setOnceki(Nod onceki) {
        this.onceki = onceki;
    }
}
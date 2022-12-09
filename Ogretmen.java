package OOP_Concept.KrediCekme;

public class Ogretmen extends Musteri{
    @Override
    public double krediHesapla(double miktar) {
        return miktar+miktar*0.6;
    }
}

public class MesDonneesJava extends DonneesJava {

    @Override
    public void initialiser(){

        Map<String, Object> laRacine = new HashMap<>();
        this.setRacine(laRacine);

        List<Object> lesVehicules = new ArrayList<>();
        laRacine.put("vehicules", lesVehicules);

        Map<String, Object> vehicule01 = new HashMap<>();
        lesVehicules.add(vehicule01);

        vehicule01.put("nombreDeRoues", 2);
        vehicule01.put("type", "mobilette");

        Map<String, Object> etat01 = new HashMap<>();
        vehicule01.put("etat", etat01);

        etat01.put("kilometrage",14.45);
        etat01.put("besoinChangementHuile",false);

        Map<String, Object> vehicule02 = new HashMap<>();
        lesVehicules.add(vehicule02);

        vehicule02.put("nombreDeRoues", 4);
        vehicule02.put("type", "camion");

        Map<String, Object> etat02 = new HashMap<>();
        vehicule02.put("etat", etat02);

        etat02.put("kilometrage",13344.5);
        etat02.put("besoinChangementHuile",true);
    }
}

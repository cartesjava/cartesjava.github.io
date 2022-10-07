// interface                        implantation
   List<String> listeChaines  = new ArrayList<>(); 
   List<Double> listeReels    = new LinkedList<>(); 


listeChaines.add("sdf");        // ajoute à la fin
listeChaines.add("34g");
listeChaines.add("j554");
listeChaines.add(9,"asdf");     // nouvel élément
listeChaines.set(9,"asdf");     // change la valeur

String chaine = listeChaines.get(2);

ValeurJson[] valeursPossibles = new ValeurJson[] {new MonNullJson(), 
				                                  new MonBooleenJson(), 
				                                  new MaChaineJson(), 
				                                  new MonNombreJson()};
ValeurJson valeurChargee = null;

for(ValeurJson valeurPossible : valeursPossibles) {
	
	try {
		
		resteDuTexteJson = valeurPossible.chargerEtRetournerResteDuTexte(texteJson);
		valeurChargee = valeurPossible;
		break;
		
	} catch(ErreurDeChargement e) {}
}

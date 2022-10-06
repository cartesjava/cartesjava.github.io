// Pour charger ["asdf", null]
ListeJson liste = new MaListeJson();
liste.ajouter(new MaChaineJson("asdf"));
liste.ajouter(new NullJson());

// Pour charger {"cle01":12, "cle02":true} 
ObjetJson objet = new MonObjetJson();
objet.entreposerValeur("cle01", new MonNombreJson(12));
objet.entreposerValeur("cle02", new MonBooleenJson(true));

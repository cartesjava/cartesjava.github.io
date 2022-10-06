Noeud racine = new MonNoeud(3);

Noeud gauche = new MonNoeud(1);
Noeud droite = new MonNoeud(5);

Noeud gaucheGauche = new MonNoeud(0);
Noeud gaucheDroite= new MonNoeud(2);

Noeud droiteGauche = new MonNoeud(4);
Noeud droiteDroite= new MonNoeud(6);

racine.setEnfantGauche(gauche);
racine.setEnfantDroit(droite);

gauche.setEnfantGauche(gaucheGauche);
gauche.setEnfantDroit(gaucheDroite);

droite.setEnfantGauche(droiteGauche);
droite.setEnfantDroit(droiteDroite);

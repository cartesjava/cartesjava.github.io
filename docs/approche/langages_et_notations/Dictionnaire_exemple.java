Dictionnaire<Integer> dico = new MonDictionnaire<>(); 

                                     // {}
dico.entreposerValeur("cle01", 12);  // {"cle01":12}
dico.entreposerValeur("cle01", 42);  // {"cle01":42}
dico.entreposerValeur("cle02", 14);  // {"cle01":42, "cle02":14}

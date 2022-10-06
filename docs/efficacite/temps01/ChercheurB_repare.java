public int trouverIndicePourValeur(Tableau<C> tab, C v) {
	int i,l;

	for(i=0,l=l(tab);--l>0;i=eq(v,v(tab,i))?i:++i);

	return i;
}

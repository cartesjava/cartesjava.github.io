public int trouverIndicePourValeur(Tableau tab, Comparable v) {
	int i,l;

	for(i=0,l=l(tab);l>0;i=eq(v,v(tab,i%l(tab)))?(--l>0?i++:i):++i);

	return i;
}

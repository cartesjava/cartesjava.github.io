char[] tableau = new char[TAILLE];

char element(int position){

    return tableau[position];   // 1 instruction
                                // même si TAILLE est grand
}

char[] tableau = new char[TAILLE];

void modifier(int position, char element){

    tableau[position] = element;   // 1 instruction
                                   // même si TAILLE est grand
}

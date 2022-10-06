ListeJava<Character> liste = new ListeJava<>(Character.class);

liste;             // []
liste.add('a')     // [a]
liste.add('b')     // [a,b]
liste.add('c')     // [a,b,c]
liste.set(1,'d')   // [a,d,c]
liste.remove('a')  // [b,c]

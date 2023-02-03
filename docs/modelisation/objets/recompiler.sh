for i in *.json *.dot;
do 
    sed "s/Carte01/Carte/g" -i $i
    sed "s/Carte02/Carte/g" -i $i
    sed "s/Carte03/Carte/g" -i $i
    sed "s/FilmObjet01/Film/g" -i $i
    sed "s/FilmObjet02/Film/g" -i $i
    sed "s/PersonnageObjet01/Personnage/g" -i $i
    sed "s/PersonnageObjet02/Personnage/g" -i $i
    sed "s/PersonnageObjet03/Personnage/g" -i $i
done

for i in *.dot;
do
    dot $i -Tpng > $(echo $i | sed "s/dot/png/")
done

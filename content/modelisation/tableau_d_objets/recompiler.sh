for i in *.json *.dot;
do 
    sed "s/FilmTableau01/Film/g" -i $i
    sed "s/FilmTableau02/Film/g" -i $i
    sed "s/PersonnageTableau01/Personnage/g" -i $i
    sed "s/PersonnageTableau02/Personnage/g" -i $i
    sed "s/PersonnageTableau03/Personnage/g" -i $i
done

for i in *.dot;
do
    dot $i -Tpng > $(echo $i | sed "s/dot/png/")
done

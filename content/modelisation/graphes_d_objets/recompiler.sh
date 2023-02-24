for i in *.json *.dot;
do 
    sed "s/FilmGraphe/Film/g" -i $i
    sed "s/PersonnageGraphe/Personnage/g" -i $i
done

for i in *.dot;
do
    dot $i -Tpng > $(echo $i | sed "s/dot/png/")
done

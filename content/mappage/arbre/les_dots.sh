for i in *.dot; do dot $i -Tsvg  > $(echo $i | sed "s/dot/svg/"); done

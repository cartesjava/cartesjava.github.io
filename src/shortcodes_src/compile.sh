# compile simply means removing all spaces and newlines

for i in *.html;
do
    target=../../layouts/shortcodes/$i
    cat $i | tr -d '\n' | sed "s/}[[:space:]]\+/}/g" | sed 's/\xc2\xa0//g'>  $target
done


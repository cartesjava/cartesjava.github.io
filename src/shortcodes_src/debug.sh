# compile simple means removing all spaces and newlines

for i in *.html;
do
    target=../layouts/shortcodes/$i
    cp $i $target
done


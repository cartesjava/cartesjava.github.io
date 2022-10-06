# compile simple means removing all spaces and newlines

for i in *.html;
do
    target=../../layouts/partials/functions/$i
    cat $i | sed 's/\xc2\xa0//g'  > $target
done


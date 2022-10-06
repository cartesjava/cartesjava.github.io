if [ "$1" = "" ]; then
    echo usage $0 input_file
    exit
fi


iconv  -f utf-8 -t ascii $1

# Copyright (C) (2019) (Mathieu Bergeron) (mathieu.bergeron@cmontmorency.qc.ca)
#
# This file is part of tp01_menu
#
# aquiletour is free software: you can redistribute it and/or modify
# it under the terms of the GNU Affero General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# aquiletour is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU Affero General Public License for more details.
#
# You should have received a copy of the GNU Affero General Public License
# along with aquiletour.  If not, see <https://www.gnu.org/licenses/>

##### INCLUDE #####
this_dir=$(readlink -f $0)
scripts_dir=$(dirname "$this_dir")
. "$scripts_dir/include.sh"
###################

save_dir

cd "$root_dir"

# refresh publishDir
rm -rf "$publishDir"
hugo

# remove .git 
rm -fr "$publishDir"/.git

# remove .mkv
find "$publishDir" -name "*.mkv" | while read i; do rm -v "$i"; done

# rsync to server
rsync -c -v -r --delete "$publishDir"/* codelescartes.ca:~/codelescartes.ca/

restore_dir

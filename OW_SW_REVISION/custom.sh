#!/bin/bash
#   Copyright (c) 2016 Flitvoye Florian, Dubray Alexandre
#   This program is free software: you can redistribute it and/or modify
#   it under the terms of the GNU Affero General Public License as published by
#   the Free Software Foundation, either version 3 of the License, or
#   (at your option) any later version.
#
#   This program is distributed in the hope that it will be useful,
#   but WITHOUT ANY WARRANTY; without even the implied warranty of
#   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#   GNU Affero General Public License for more details.
#
#   You should have received a copy of the GNU Affero General Public License
#   along with this program.  If not, see <http://www.gnu.org/licenses/>.
MSG="Le fichier sortit n'est pas le bon"
SHA1=$( sha256sum -b $1)
SHA2=$( sha256sum -b $2 )
IFS1=' ' read -a SHA1TAB <<< "${SHA1}"
IFS2=' ' read -a SHA2TAB <<< "${SHA2}"
if [ "${SHA1TAB[0]}" == "${SHA2TAB[0]}" ]
then
	echo 0
else
	echo 1
fi

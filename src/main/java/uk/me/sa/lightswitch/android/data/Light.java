/*
	lightswitch-android - Android Lightswitch Client

	Copyright 2014-2015  Simon Arlott

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package uk.me.sa.lightswitch.android.data;

import uk.me.sa.lightswitch.android.R;

public enum Light {
	LEFT ("R", R.string.left), CENTRE ("C", R.string.centre), RIGHT ("L", R.string.right);

	public final String id;
	public final int name;

	private Light(String id, int name) {
		this.id = id;
		this.name = name;
	}
}

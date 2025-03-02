/*
 * Copyright © 2004-2025 L2J Server
 * 
 * This file is part of L2J Server.
 * 
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.loginserver.network.loginserverpackets;

import com.l2jserver.commons.dao.ServerNameDAO;
import com.l2jserver.commons.network.BaseSendablePacket;

/**
 * @author -Wooden-
 * @version 2.6.1.0
 */
public class AuthResponse extends BaseSendablePacket {
	
	public AuthResponse(int serverId) {
		writeC(0x02);
		writeC(serverId);
		writeS(ServerNameDAO.getServer(serverId));
	}
	
	@Override
	public byte[] getContent() {
		return getBytes();
	}
}

/*
 * SonarQube
 * Copyright (C) 2009-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
/*
 * SonarQube, open source software quality management tool.
 * Copyright (C) 2008-2014 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * SonarQube is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * SonarQube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
/**
 * 使用示例
 * GetRequest get = new GetRequest("api/resources/index");
	    get.setParam("metrics", "alert_status,quality_gate_details");
	    get.setParam("qualifiers", "TRK");
		get.setParam("resource", "jn.cn:DocumentManage");
		Builder builder = new HttpConnector.Builder();
		builder.url("http://localhost:9000");
		builder.credentials("admin", "admin");
		WsConnector wsConnector = builder.build();
		WsResponse wsResponse = wsConnector.call(get).failIfNotSuccessful();
		String body =  wsResponse.content();
 */
@ParametersAreNonnullByDefault
package com.harmazing.framework.util.http.client;

import javax.annotation.ParametersAreNonnullByDefault;

import com.harmazing.framework.util.http.client.HttpConnector.Builder;


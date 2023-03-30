/*
 *  Copyright (c) 2022 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       sovity GmbH - initial API and implementation
 *
 */

package de.sovity.edc.ext.wrapper.api.example.services;

import lombok.RequiredArgsConstructor;
import org.eclipse.edc.spi.system.configuration.Config;

@RequiredArgsConstructor
public class IdsEndpointService {
    private final Config config;

    public String getIdsEndpoint() {
        return config.getString("edc.ids.endpoint");
    }
}
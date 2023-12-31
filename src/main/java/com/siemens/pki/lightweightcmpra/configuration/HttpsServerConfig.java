/*
 *  Copyright (c) 2022 Siemens AG
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may
 *  not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package com.siemens.pki.lightweightcmpra.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class HttpsServerConfig extends HttpServerConfig {

    private VerificationContextImpl serverTrust;
    private SignatureCredentialContextImpl serverCredentials;

    public SignatureCredentialContextImpl getServerCredentials() {
        return serverCredentials;
    }

    public VerificationContextImpl getServerTrust() {
        return serverTrust;
    }

    public boolean isClientAuthenticationNeeded() {
        return serverTrust != null;
    }

    @XmlElement(required = true)
    public void setServerCredentials(final SignatureCredentialContextImpl serverCredentials) {
        this.serverCredentials = serverCredentials;
    }

    @XmlElement(required = true)
    public void setServerTrust(final VerificationContextImpl serverTrust) {
        this.serverTrust = serverTrust;
    }
}

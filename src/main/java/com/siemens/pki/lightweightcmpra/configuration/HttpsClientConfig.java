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
public class HttpsClientConfig extends HttpClientConfig {

    private VerificationContextImpl clientTrust;

    private SignatureCredentialContextImpl clientCredentials;

    private boolean disableHostnameVerification = false;

    public boolean isDisableHostnameVerification() {
        return disableHostnameVerification;
    }

    public void setDisableHostnameVerification(boolean disableHostnameVerification) {
        this.disableHostnameVerification = disableHostnameVerification;
    }

    public SignatureCredentialContextImpl getClientCredentials() {
        return clientCredentials;
    }

    public VerificationContextImpl getClientTrust() {
        return clientTrust;
    }

    @XmlElement(required = true)
    public void setClientCredentials(final SignatureCredentialContextImpl clientCredentials) {
        this.clientCredentials = clientCredentials;
    }

    @XmlElement(required = true)
    public void setClientTrust(final VerificationContextImpl clientTrust) {
        this.clientTrust = clientTrust;
    }
}

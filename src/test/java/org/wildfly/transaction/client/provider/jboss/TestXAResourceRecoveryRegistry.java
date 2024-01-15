/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2022 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.transaction.client.provider.jboss;

import org.jboss.tm.XAResourceRecovery;
import org.jboss.tm.XAResourceRecoveryRegistry;

public class TestXAResourceRecoveryRegistry implements XAResourceRecoveryRegistry {

    private XAResourceRecovery xaResourceRecovery;

    public TestXAResourceRecoveryRegistry(){}

    @Override
    public void addXAResourceRecovery(XAResourceRecovery xaResourceRecovery) {
        this.xaResourceRecovery = xaResourceRecovery;
    }

    @Override
    public void removeXAResourceRecovery(XAResourceRecovery xaResourceRecovery) {
        this.xaResourceRecovery = null;
    }

    public XAResourceRecovery getXaResourceRecovery() {
        return xaResourceRecovery;
    }
}

--
--  Copyright (c) 2023 sovity GmbH
--
--  This program and the accompanying materials are made available under the
--  terms of the Apache License, Version 2.0 which is available at
--  https://www.apache.org/licenses/LICENSE-2.0
--
--  SPDX-License-Identifier: Apache-2.0
--
--  Contributors:
--       sovity GmbH - Update Tables to Milestone-8 EDC
--
--
UPDATE edc_contract_definitions SET validity=60*60*24*365 WHERE validity IS NULL;
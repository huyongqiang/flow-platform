/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.cc.dao;

import com.flow.platform.core.dao.AbstractBaseDao;
import com.flow.platform.domain.CmdLog;
import org.springframework.stereotype.Repository;

/**
 * @author yh@firim
 */
@Repository
public class CmdLogDaoImpl extends AbstractBaseDao<String, CmdLog> implements CmdLogDao{

    @Override
    protected Class<CmdLog> getEntityClass() {
        return CmdLog.class;
    }

    @Override
    protected String getKeyName() {
        return "cmdId";
    }
}

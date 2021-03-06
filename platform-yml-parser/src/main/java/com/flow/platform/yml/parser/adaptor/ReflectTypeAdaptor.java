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

package com.flow.platform.yml.parser.adaptor;

/**
 * @author yh@firim
 */
public class ReflectTypeAdaptor<E> extends YmlAdaptor<Object> {

    private Class<E> componentClazz;

    public ReflectTypeAdaptor(Class<E> componentClazz) {
        this.componentClazz = componentClazz;
    }

    @Override
    public Object read(Object o) {
        return doRead(o, componentClazz);
    }

    @Override
    public Object write(Object object) {
        return doWrite(object);
    }
}

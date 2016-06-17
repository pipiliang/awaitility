/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.awaitility.reflect;

import java.lang.reflect.Field;

class AssignableToFieldTypeMatcherStrategy extends FieldTypeMatcherStrategy {

    /**
     * <p>Constructor for AssignableToFieldTypeMatcherStrategy.</p>
     *
     * @param fieldType a {@link java.lang.Class} object.
     */
    public AssignableToFieldTypeMatcherStrategy(Class<?> fieldType) {
        super(fieldType);
    }

    /** {@inheritDoc} */
    @Override
    public boolean matches(Field field) {
        return expectedFieldType.isAssignableFrom((Class<?>) field.getType());
    }
}
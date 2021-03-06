/*
 * Copyright 2000-2014 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.components.javascriptcomponent;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.JavaScriptComponentState;
import com.vaadin.tests.components.AbstractTestUIWithLog;
import com.vaadin.ui.AbstractJavaScriptComponent;

public class JavaScriptSpan extends AbstractTestUIWithLog {

    @Override
    protected void setup(VaadinRequest request) {
        addComponent(new Span("Hello World"));
    }

    @JavaScript("JavaScriptSpanComponent.js")
    public static class Span extends AbstractJavaScriptComponent {
        public Span(String text) {
            this.getState().text = text;
        }

        @Override
        protected SpanState getState() {
            return (SpanState) super.getState();
        }
    }

    public static class SpanState extends JavaScriptComponentState {
        public String text;
    }
}

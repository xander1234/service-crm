/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package co.com.summan.service_crm;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.MediaType;

/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */

public class Application extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("cxfrs:bean:rest?bindingStyle=SimpleConsumer")
        .setHeader("content-type", simple("text/xml; charset=utf-8"))
        	.to("https://summan.bitrix24.es?bridgeEndpoint=true")
        	//.setBody(simple("<mensaje>Hola expo ingeniería.</mensaje>"))
        	.convertBodyTo(String.class)
        	.log(">>> ${body}");
        	
    }
}

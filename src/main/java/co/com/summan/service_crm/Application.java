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

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */

public class Application extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("cxfrs:bean:rest?bindingStyle=SimpleConsumer")
        	.log("${header.CamelHttpMethod}")
        	//.to("https://summan.bitrix24.es/rest/1/h3s0mp2hu4rlrdll/profile/?bridgeEndpoint=true&okStatusCodeRange=200-500")
            .delay(1000)
            .setBody(simple("{\"result\":{\"ID\":\"1\",\"ADMIN\":true,\"NAME\":\"Camilo\",\"LAST_NAME\":\"Posada\",\"PERSONAL_GENDER\":\"\",\"PERSONAL_PHOTO\":\"https:\\/\\/cdn.bitrix24.es\\/b1719517\\/main\\/ac1\\/ac1a774e5805726d20cada69b8622ec5\\/IMG_1732+2.jpg\",\"TIME_ZONE\":null,\"TIME_ZONE_OFFSET\":-18000},\"time\":{\"start\":1537979195.6189,\"finish\":1537979195.9877,\"duration\":0.36881399154663,\"processing\":0.017263174057007,\"date_start\":\"2018-09-26T19:26:35+03:00\",\"date_finish\":\"2018-09-26T19:26:35+03:00\"}}"))
        	.log(">>> ${body}");
    }
}

/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.mindorks.nybus;


import com.mindorks.nybus.scheduler.TestSchedulerProvider;

import org.junit.Before;

/**
 * Created by amitshekhar on 25/08/17.
 */
public class NYBusTest extends CommonTest{

    @Before
    public void before() throws Exception {
        bus = NYBus.get();
        bus.setSchedulerProvider(new TestSchedulerProvider());
    }

}
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

package com.mindorks.nybus.event;

import com.mindorks.nybus.subscriber.SubscriberHolder;

/**
 * Created by Jyoti on 16/08/17.
 */

/**
 * Holds the data for delivering events.
 */
public class NYEvent {

    /**
     * The event object.
     */
    public Object eventObject;

    /**
     * The target object.
     */
    public Object targetObject;

    /**
     * {@link SubscriberHolder} The subscriber holder.
     */
    public SubscriberHolder subscriberHolder;

    public NYEvent(Object eventObject, Object targetObject, SubscriberHolder subscribedMethod) {
        this.eventObject = eventObject;
        this.targetObject = targetObject;
        this.subscriberHolder = subscribedMethod;
    }

}
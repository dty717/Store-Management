/**
 *    Copyright 2010-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package service;

import domain.Location;
import domain.Thing;
import mapper.ThingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The Class ThingService.
 *
 * @author Eduardo Macarron
 */
@Service
public class ThingService {

    @Autowired
    private ThingMapper thingMapper;

    public List<String>getTags(){

        return thingMapper.getTags();
    }
    public List<Location> getLocation() {
        return thingMapper.getLocation();
    }

//    public Thing getThing(String username, String password) {
//        return thingMapper.getThingByUsernameAndPassword(username, password);
//    }

    /**
     * Insert thing.
     *
     * @param thing the thing
     */
    @Transactional
    public void insertThing(Thing thing) {
        thingMapper.insertThing(thing);
    }

    /**
     * Update thing.
     *
     * @param thing the thing
     */
//    @Transactional
//    public void updateThing(Thing thing) {
//        thingMapper.updateThing(thing);
//        thingMapper.updateProfile(thing);
//
//        if (thing.getPassword() != null && thing.getPassword().length() > 0) {
//            thingMapper.updateSignon(thing);
//        }
//    }

}

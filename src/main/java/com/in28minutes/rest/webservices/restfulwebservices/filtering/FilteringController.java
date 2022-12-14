/*
 * Copyright (c) Jaguar Land Rover Ltd 2022. All rights reserved
 */

package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

  @GetMapping("/filtering")
  public SomeBean filtering(){
    System.out.println("Returning default someBean");
    return new SomeBean("value1", "value2", "value3");
  }

  @GetMapping("/dynamicFiltering")
  public MappingJacksonValue dynamicFiltering(){

    SomeBean someBean = new SomeBean("aaaaaaaaaaaa","value2", "value3");

    MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);

    SimpleBeanPropertyFilter filter =
        SimpleBeanPropertyFilter.filterOutAllExcept( "field2");

    FilterProvider filters =
        new SimpleFilterProvider().addFilter("SomeBeanFilter", filter );

    mappingJacksonValue.setFilters(filters );


    return mappingJacksonValue;
  }

}

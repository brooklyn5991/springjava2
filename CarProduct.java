package com.Gifttech1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarProduct implements CarCompany{

        @Override
        public String getBmw() {
            return "BMW car";
        }

        @Override
        public String getLexus() {
            return "BMW lexus";
        }



}

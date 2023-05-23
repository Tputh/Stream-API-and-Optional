package com.klyucherov.streamapiandoptional.service.impl;

import com.klyucherov.streamapiandoptional.exception.IncorrectException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    public String validate(String name, String surname) {
        if (StringUtils.isAlpha(name + surname)) {
            throw new IncorrectException();
        }
        return StringUtils.capitalize(name.toLowerCase() + surname.toLowerCase());
    }

}

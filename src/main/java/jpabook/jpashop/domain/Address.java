package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Getter;
import org.springframework.web.service.annotation.GetExchange;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}

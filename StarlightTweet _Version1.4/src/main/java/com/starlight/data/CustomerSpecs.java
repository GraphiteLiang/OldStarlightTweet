package com.starlight.data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

public class CustomerSpecs {
	public static <T> Specification<T> byAuto(final EntityManager entityManager,
			final T example){
		final Class<T> type = (Class<T>) example.getClass();
		return new Specification<T>() {

			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}
	private static String pattern(String str) {
		return "%" + str + "%";
	}

}

package com.umur.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.*;

public class OAuth2AuthoritiesExtractor {

    static final String AUTHORITIES = "roles";

//    @Override
//    public List<GrantedAuthority> extractAuthorities(Map<String, Object> map) {
//        ArrayList<String> authorities = new ArrayList<String>();
//        if (map.containsKey(AUTHORITIES)) {
//            Arrays.stream(((String) map.get(AUTHORITIES)).split(",")).forEach(s -> {
//                authorities.add("ROLE_".concat(s.toUpperCase(Locale.ROOT)));
//            });
//        }
//        return AuthorityUtils.commaSeparatedStringToAuthorityList(String.join(",", authorities));
//    }
}
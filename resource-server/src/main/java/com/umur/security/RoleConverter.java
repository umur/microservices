package com.umur.security;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collection;

public class RoleConverter implements Converter<Jwt, Collection<GrantedAuthority>> {

    @Override
    public Collection<GrantedAuthority> convert(Jwt jwt) {

//        final Map<String, List<String>> realmAccess = (Map<String, List<String>>) jwt.getClaims().get("realm_access");
//        return realmAccess.get("roles")
//                .stream()
//                .map(roleName -> "ROLE_" + roleName) // prefix required by Spring Security for roles.
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());

        var claims = (JSONObject) ((JSONObject) jwt.getClaims().get("resource_access")).get("microservices-client-id");
        var roles = (JSONArray) claims.get("roles");
//        var rolesList = roles
//                .stream()
//                .map(Object::toString)
//                .toList();

        return roles.stream()
                .map(Object::toString)
                .map(l -> "ROLE_" + l)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());


    }
}

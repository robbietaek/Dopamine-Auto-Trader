package com.dopamine.tool;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class JwtTokenManager {

  public static String getJwtToken(String accessKey, String secretKey) {
    Algorithm algorithm = Algorithm.HMAC256(secretKey);

    String jwtToken = JWT.create()
        .withClaim("access_key", accessKey)
        .withClaim("nonce", UUID.randomUUID().toString())
        .sign(algorithm);

    return "Bearer " + jwtToken;
  }

  public static String getJwtToken(String accessKey, String secretKey, String queryString) {
    String queryHash = "";
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-512");
      md.update(queryString.getBytes("UTF-8"));
      queryHash = String.format("%0128x", new BigInteger(1, md.digest()));
    } catch (Exception e) {
      log.error(e.getStackTrace().toString());
    }

    Algorithm algorithm = Algorithm.HMAC256(secretKey);
    String jwtToken = JWT.create()
        .withClaim("access_key", accessKey)
        .withClaim("nonce", UUID.randomUUID().toString())
        .withClaim("query_hash", queryHash)
        .withClaim("query_hash_alg", "SHA512")
        .sign(algorithm);

    return "Bearer " + jwtToken;
  }

}

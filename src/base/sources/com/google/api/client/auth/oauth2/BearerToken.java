package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.api.client.util.Preconditions;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BearerToken {
    static final Pattern INVALID_TOKEN_ERROR = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");
    static final String PARAM_NAME = "access_token";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class AuthorizationHeaderAccessMethod implements Credential.AccessMethod {
        static final String HEADER_PREFIX = "Bearer ";

        AuthorizationHeaderAccessMethod() {
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public String getAccessTokenFromRequest(HttpRequest httpRequest) {
            List<String> authorizationAsList = httpRequest.getHeaders().getAuthorizationAsList();
            if (authorizationAsList == null) {
                return null;
            }
            for (String str : authorizationAsList) {
                if (str.startsWith(HEADER_PREFIX)) {
                    return str.substring(7);
                }
            }
            return null;
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public void intercept(HttpRequest httpRequest, String str) {
            httpRequest.getHeaders().setAuthorization(HEADER_PREFIX + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class FormEncodedBodyAccessMethod implements Credential.AccessMethod {
        FormEncodedBodyAccessMethod() {
        }

        private static Map<String, Object> getData(HttpRequest httpRequest) {
            return Data.mapOf(UrlEncodedContent.getContent(httpRequest).getData());
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public String getAccessTokenFromRequest(HttpRequest httpRequest) {
            Object obj = getData(httpRequest).get(BearerToken.PARAM_NAME);
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public void intercept(HttpRequest httpRequest, String str) {
            Preconditions.checkArgument(!HttpMethods.GET.equals(httpRequest.getRequestMethod()), "HTTP GET method is not supported");
            getData(httpRequest).put(BearerToken.PARAM_NAME, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class QueryParameterAccessMethod implements Credential.AccessMethod {
        QueryParameterAccessMethod() {
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public String getAccessTokenFromRequest(HttpRequest httpRequest) {
            Object obj = httpRequest.getUrl().get(BearerToken.PARAM_NAME);
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public void intercept(HttpRequest httpRequest, String str) {
            httpRequest.getUrl().set(BearerToken.PARAM_NAME, (Object) str);
        }
    }

    public static Credential.AccessMethod authorizationHeaderAccessMethod() {
        return new AuthorizationHeaderAccessMethod();
    }

    public static Credential.AccessMethod formEncodedBodyAccessMethod() {
        return new FormEncodedBodyAccessMethod();
    }

    public static Credential.AccessMethod queryParameterAccessMethod() {
        return new QueryParameterAccessMethod();
    }
}

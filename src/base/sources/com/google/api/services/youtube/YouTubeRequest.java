package com.google.api.services.youtube;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class YouTubeRequest<T> extends AbstractGoogleJsonClientRequest<T> {

    @Key("$.xgafv")
    private String $Xgafv;

    @Key("access_token")
    private String accessToken;

    @Key
    private String alt;

    @Key
    private String callback;

    @Key
    private String fields;

    @Key
    private String key;

    @Key("oauth_token")
    private String oauthToken;

    @Key
    private Boolean prettyPrint;

    @Key
    private String quotaUser;

    @Key("upload_protocol")
    private String uploadProtocol;

    @Key
    private String uploadType;

    public YouTubeRequest(YouTube youTube, String str, String str2, Object obj, Class<T> cls) {
        super(youTube, str, str2, obj, cls);
    }

    public String get$Xgafv() {
        return this.$Xgafv;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getCallback() {
        return this.callback;
    }

    public String getFields() {
        return this.fields;
    }

    public String getKey() {
        return this.key;
    }

    public String getOauthToken() {
        return this.oauthToken;
    }

    public Boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public String getQuotaUser() {
        return this.quotaUser;
    }

    public String getUploadProtocol() {
        return this.uploadProtocol;
    }

    public String getUploadType() {
        return this.uploadType;
    }

    /* JADX INFO: renamed from: set$Xgafv */
    public YouTubeRequest<T> set$Xgafv2(String str) {
        this.$Xgafv = str;
        return this;
    }

    /* JADX INFO: renamed from: setAccessToken */
    public YouTubeRequest<T> setAccessToken2(String str) {
        this.accessToken = str;
        return this;
    }

    /* JADX INFO: renamed from: setAlt */
    public YouTubeRequest<T> setAlt2(String str) {
        this.alt = str;
        return this;
    }

    /* JADX INFO: renamed from: setCallback */
    public YouTubeRequest<T> setCallback2(String str) {
        this.callback = str;
        return this;
    }

    /* JADX INFO: renamed from: setFields */
    public YouTubeRequest<T> setFields2(String str) {
        this.fields = str;
        return this;
    }

    /* JADX INFO: renamed from: setKey */
    public YouTubeRequest<T> setKey2(String str) {
        this.key = str;
        return this;
    }

    /* JADX INFO: renamed from: setOauthToken */
    public YouTubeRequest<T> setOauthToken2(String str) {
        this.oauthToken = str;
        return this;
    }

    /* JADX INFO: renamed from: setPrettyPrint */
    public YouTubeRequest<T> setPrettyPrint2(Boolean bool) {
        this.prettyPrint = bool;
        return this;
    }

    /* JADX INFO: renamed from: setQuotaUser */
    public YouTubeRequest<T> setQuotaUser2(String str) {
        this.quotaUser = str;
        return this;
    }

    /* JADX INFO: renamed from: setUploadProtocol */
    public YouTubeRequest<T> setUploadProtocol2(String str) {
        this.uploadProtocol = str;
        return this;
    }

    /* JADX INFO: renamed from: setUploadType */
    public YouTubeRequest<T> setUploadType2(String str) {
        this.uploadType = str;
        return this;
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public final YouTube getAbstractGoogleClient() {
        return (YouTube) super.getAbstractGoogleClient();
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public YouTubeRequest<T> setDisableGZipContent(boolean z10) {
        return (YouTubeRequest) super.setDisableGZipContent(z10);
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public YouTubeRequest<T> setRequestHeaders(HttpHeaders httpHeaders) {
        return (YouTubeRequest) super.setRequestHeaders(httpHeaders);
    }

    @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
    public YouTubeRequest<T> set(String str, Object obj) {
        return (YouTubeRequest) super.set(str, obj);
    }
}

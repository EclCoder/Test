package com.google.api.services.youtube;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UriTemplate;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;
import com.google.api.services.youtube.model.ActivityListResponse;
import com.google.api.services.youtube.model.Caption;
import com.google.api.services.youtube.model.CaptionListResponse;
import com.google.api.services.youtube.model.Channel;
import com.google.api.services.youtube.model.ChannelBannerResource;
import com.google.api.services.youtube.model.ChannelListResponse;
import com.google.api.services.youtube.model.ChannelSection;
import com.google.api.services.youtube.model.ChannelSectionListResponse;
import com.google.api.services.youtube.model.Comment;
import com.google.api.services.youtube.model.CommentListResponse;
import com.google.api.services.youtube.model.CommentThread;
import com.google.api.services.youtube.model.CommentThreadListResponse;
import com.google.api.services.youtube.model.GuideCategoryListResponse;
import com.google.api.services.youtube.model.I18nLanguageListResponse;
import com.google.api.services.youtube.model.I18nRegionListResponse;
import com.google.api.services.youtube.model.InvideoBranding;
import com.google.api.services.youtube.model.LiveBroadcast;
import com.google.api.services.youtube.model.LiveBroadcastListResponse;
import com.google.api.services.youtube.model.LiveChatBan;
import com.google.api.services.youtube.model.LiveChatMessage;
import com.google.api.services.youtube.model.LiveChatMessageListResponse;
import com.google.api.services.youtube.model.LiveChatModerator;
import com.google.api.services.youtube.model.LiveChatModeratorListResponse;
import com.google.api.services.youtube.model.LiveStream;
import com.google.api.services.youtube.model.LiveStreamListResponse;
import com.google.api.services.youtube.model.MemberListResponse;
import com.google.api.services.youtube.model.MembershipsLevelListResponse;
import com.google.api.services.youtube.model.Playlist;
import com.google.api.services.youtube.model.PlaylistItem;
import com.google.api.services.youtube.model.PlaylistItemListResponse;
import com.google.api.services.youtube.model.PlaylistListResponse;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SponsorListResponse;
import com.google.api.services.youtube.model.Subscription;
import com.google.api.services.youtube.model.SubscriptionListResponse;
import com.google.api.services.youtube.model.SuperChatEventListResponse;
import com.google.api.services.youtube.model.TestItem;
import com.google.api.services.youtube.model.ThumbnailSetResponse;
import com.google.api.services.youtube.model.Video;
import com.google.api.services.youtube.model.VideoAbuseReport;
import com.google.api.services.youtube.model.VideoAbuseReportReasonListResponse;
import com.google.api.services.youtube.model.VideoCategoryListResponse;
import com.google.api.services.youtube.model.VideoListResponse;
import com.google.api.services.youtube.model.VideoRatingListResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class YouTube extends AbstractGoogleJsonClient {
    public static final String DEFAULT_BASE_URL = "https://www.googleapis.com/";
    public static final String DEFAULT_BATCH_PATH = "batch/youtube";
    public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";
    public static final String DEFAULT_SERVICE_PATH = "";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Activities {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<ActivityListResponse> {
            private static final String REST_PATH = "youtube/v3/activities";

            @Key
            private String channelId;

            @Key
            private Boolean home;

            @Key
            private Long maxResults;

            @Key
            private Boolean mine;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            @Key
            private String publishedAfter;

            @Key
            private String publishedBefore;

            @Key
            private String regionCode;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, ActivityListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getChannelId() {
                return this.channelId;
            }

            public Boolean getHome() {
                return this.home;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public Boolean getMine() {
                return this.mine;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getPublishedAfter() {
                return this.publishedAfter;
            }

            public String getPublishedBefore() {
                return this.publishedBefore;
            }

            public String getRegionCode() {
                return this.regionCode;
            }

            public List setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public List setHome(Boolean bool) {
                this.home = bool;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setMine(Boolean bool) {
                this.mine = bool;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setPublishedAfter(String str) {
                this.publishedAfter = str;
                return this;
            }

            public List setPublishedBefore(String str) {
                this.publishedBefore = str;
                return this;
            }

            public List setRegionCode(String str) {
                this.regionCode = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType, reason: merged with bridge method [inline-methods] */
            public YouTubeRequest<ActivityListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public Activities() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder extends AbstractGoogleJsonClient.Builder {
        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
            super(httpTransport, jsonFactory, "https://www.googleapis.com/", "", httpRequestInitializer, false);
            setBatchPath(YouTube.DEFAULT_BATCH_PATH);
        }

        public Builder setYouTubeRequestInitializer(YouTubeRequestInitializer youTubeRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer((GoogleClientRequestInitializer) youTubeRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setBatchPath(String str) {
            return (Builder) super.setBatchPath(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public YouTube build() {
            return new YouTube(this);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setApplicationName(String str) {
            return (Builder) super.setApplicationName(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleClientRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setRootUrl(String str) {
            return (Builder) super.setRootUrl(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setServicePath(String str) {
            return (Builder) super.setServicePath(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressAllChecks(boolean z10) {
            return (Builder) super.setSuppressAllChecks(z10);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressPatternChecks(boolean z10) {
            return (Builder) super.setSuppressPatternChecks(z10);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressRequiredParameterChecks(boolean z10) {
            return (Builder) super.setSuppressRequiredParameterChecks(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class ChannelSections {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/channelSections";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21574id;

            @Key
            private String onBehalfOfContentOwner;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21574id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21574id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public Delete setId(String str) {
                this.f21574id = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<ChannelSection> {
            private static final String REST_PATH = "youtube/v3/channelSections";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, ChannelSection channelSection) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, channelSection, ChannelSection.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Insert setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<ChannelSection> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<ChannelSection> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<ChannelSection> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<ChannelSection> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<ChannelSection> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<ChannelSection> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<ChannelSection> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<ChannelSection> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<ChannelSection> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<ChannelSection> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<ChannelSection> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<ChannelSectionListResponse> {
            private static final String REST_PATH = "youtube/v3/channelSections";

            @Key
            private String channelId;

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21575hl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21576id;

            @Key
            private Boolean mine;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, ChannelSectionListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getChannelId() {
                return this.channelId;
            }

            public String getHl() {
                return this.f21575hl;
            }

            public java.util.List<String> getId() {
                return this.f21576id;
            }

            public Boolean getMine() {
                return this.mine;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public List setHl(String str) {
                this.f21575hl = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21576id = list;
                return this;
            }

            public List setMine(Boolean bool) {
                this.mine = bool;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<ChannelSectionListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<ChannelSectionListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<ChannelSectionListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<ChannelSectionListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<ChannelSectionListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<ChannelSectionListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<ChannelSectionListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<ChannelSectionListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<ChannelSectionListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<ChannelSectionListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<ChannelSectionListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<ChannelSection> {
            private static final String REST_PATH = "youtube/v3/channelSections";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, ChannelSection channelSection) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, channelSection, ChannelSection.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<ChannelSection> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<ChannelSection> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<ChannelSection> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<ChannelSection> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<ChannelSection> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<ChannelSection> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<ChannelSection> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<ChannelSection> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<ChannelSection> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<ChannelSection> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<ChannelSection> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public ChannelSections() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, ChannelSection channelSection) {
            Insert insert = new Insert(list, channelSection);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Update update(java.util.List<String> list, ChannelSection channelSection) {
            Update update = new Update(list, channelSection);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Channels {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<ChannelListResponse> {
            private static final String REST_PATH = "youtube/v3/channels";

            @Key
            private String categoryId;

            @Key
            private String forUsername;

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21577hl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21578id;

            @Key
            private Boolean managedByMe;

            @Key
            private Long maxResults;

            @Key
            private Boolean mine;

            @Key
            private Boolean mySubscribers;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, ChannelListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getCategoryId() {
                return this.categoryId;
            }

            public String getForUsername() {
                return this.forUsername;
            }

            public String getHl() {
                return this.f21577hl;
            }

            public java.util.List<String> getId() {
                return this.f21578id;
            }

            public Boolean getManagedByMe() {
                return this.managedByMe;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public Boolean getMine() {
                return this.mine;
            }

            public Boolean getMySubscribers() {
                return this.mySubscribers;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setCategoryId(String str) {
                this.categoryId = str;
                return this;
            }

            public List setForUsername(String str) {
                this.forUsername = str;
                return this;
            }

            public List setHl(String str) {
                this.f21577hl = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21578id = list;
                return this;
            }

            public List setManagedByMe(Boolean bool) {
                this.managedByMe = bool;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setMine(Boolean bool) {
                this.mine = bool;
                return this;
            }

            public List setMySubscribers(Boolean bool) {
                this.mySubscribers = bool;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<ChannelListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<ChannelListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<ChannelListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<ChannelListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<ChannelListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<ChannelListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<ChannelListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<ChannelListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<ChannelListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<ChannelListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<ChannelListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<Channel> {
            private static final String REST_PATH = "youtube/v3/channels";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, Channel channel) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, channel, Channel.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Channel> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Channel> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Channel> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Channel> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Channel> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Channel> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Channel> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Channel> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Channel> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Channel> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Channel> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public Channels() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Update update(java.util.List<String> list, Channel channel) {
            Update update = new Update(list, channel);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class CommentThreads {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<CommentThread> {
            private static final String REST_PATH = "youtube/v3/commentThreads";

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, CommentThread commentThread) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, commentThread, CommentThread.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<CommentThread> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<CommentThread> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<CommentThread> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<CommentThread> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<CommentThread> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<CommentThread> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<CommentThread> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<CommentThread> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<CommentThread> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<CommentThread> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<CommentThread> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<CommentThreadListResponse> {
            private static final String REST_PATH = "youtube/v3/commentThreads";

            @Key
            private String allThreadsRelatedToChannelId;

            @Key
            private String channelId;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21579id;

            @Key
            private Long maxResults;

            @Key
            private String moderationStatus;

            @Key
            private String order;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            @Key
            private String searchTerms;

            @Key
            private String textFormat;

            @Key
            private String videoId;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, CommentThreadListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getAllThreadsRelatedToChannelId() {
                return this.allThreadsRelatedToChannelId;
            }

            public String getChannelId() {
                return this.channelId;
            }

            public java.util.List<String> getId() {
                return this.f21579id;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getModerationStatus() {
                return this.moderationStatus;
            }

            public String getOrder() {
                return this.order;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getSearchTerms() {
                return this.searchTerms;
            }

            public String getTextFormat() {
                return this.textFormat;
            }

            public String getVideoId() {
                return this.videoId;
            }

            public List setAllThreadsRelatedToChannelId(String str) {
                this.allThreadsRelatedToChannelId = str;
                return this;
            }

            public List setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21579id = list;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setModerationStatus(String str) {
                this.moderationStatus = str;
                return this;
            }

            public List setOrder(String str) {
                this.order = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setSearchTerms(String str) {
                this.searchTerms = str;
                return this;
            }

            public List setTextFormat(String str) {
                this.textFormat = str;
                return this;
            }

            public List setVideoId(String str) {
                this.videoId = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<CommentThreadListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<CommentThreadListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<CommentThreadListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<CommentThreadListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<CommentThreadListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<CommentThreadListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<CommentThreadListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<CommentThreadListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<CommentThreadListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<CommentThreadListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<CommentThreadListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<CommentThread> {
            private static final String REST_PATH = "youtube/v3/commentThreads";

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, CommentThread commentThread) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, commentThread, CommentThread.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<CommentThread> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<CommentThread> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<CommentThread> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<CommentThread> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<CommentThread> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<CommentThread> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<CommentThread> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<CommentThread> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<CommentThread> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<CommentThread> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<CommentThread> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public CommentThreads() {
        }

        public Insert insert(java.util.List<String> list, CommentThread commentThread) {
            Insert insert = new Insert(list, commentThread);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Update update(java.util.List<String> list, CommentThread commentThread) {
            Update update = new Update(list, commentThread);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Comments {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/comments";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21580id;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21580id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21580id;
            }

            public Delete setId(String str) {
                this.f21580id = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<Comment> {
            private static final String REST_PATH = "youtube/v3/comments";

            @Key
            private java.util.List<String> part;

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            protected Insert(java.util.List<String> list, Comment comment) {
                super(YouTube.this, HttpMethods.POST, PAFNPq.RCqaTiatU, comment, Comment.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Comment> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Comment> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Comment> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Comment> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Comment> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Comment> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Comment> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Comment> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Comment> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Comment> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Comment> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<CommentListResponse> {
            private static final String REST_PATH = "youtube/v3/comments";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21581id;

            @Key
            private Long maxResults;

            @Key
            private String pageToken;

            @Key
            private String parentId;

            @Key
            private java.util.List<String> part;

            @Key
            private String textFormat;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, CommentListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public java.util.List<String> getId() {
                return this.f21581id;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public String getParentId() {
                return this.parentId;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getTextFormat() {
                return this.textFormat;
            }

            public List setId(java.util.List<String> list) {
                this.f21581id = list;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setParentId(String str) {
                this.parentId = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setTextFormat(String str) {
                this.textFormat = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<CommentListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<CommentListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<CommentListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<CommentListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<CommentListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<CommentListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<CommentListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<CommentListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<CommentListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<CommentListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<CommentListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class MarkAsSpam extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/comments/markAsSpam";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21582id;

            protected MarkAsSpam(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, null, Void.class);
                this.f21582id = (java.util.List) Preconditions.checkNotNull(list, "Required parameter id must be specified.");
            }

            public java.util.List<String> getId() {
                return this.f21582id;
            }

            public MarkAsSpam setId(java.util.List<String> list) {
                this.f21582id = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (MarkAsSpam) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (MarkAsSpam) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (MarkAsSpam) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (MarkAsSpam) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (MarkAsSpam) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (MarkAsSpam) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (MarkAsSpam) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (MarkAsSpam) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (MarkAsSpam) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (MarkAsSpam) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (MarkAsSpam) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public MarkAsSpam set(String str, Object obj) {
                return (MarkAsSpam) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class SetModerationStatus extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/comments/setModerationStatus";

            @Key
            private Boolean banAuthor;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21583id;

            @Key
            private String moderationStatus;

            protected SetModerationStatus(java.util.List<String> list, String str) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, null, Void.class);
                this.f21583id = (java.util.List) Preconditions.checkNotNull(list, "Required parameter id must be specified.");
                this.moderationStatus = (String) Preconditions.checkNotNull(str, "Required parameter moderationStatus must be specified.");
            }

            public Boolean getBanAuthor() {
                return this.banAuthor;
            }

            public java.util.List<String> getId() {
                return this.f21583id;
            }

            public String getModerationStatus() {
                return this.moderationStatus;
            }

            public boolean isBanAuthor() {
                Boolean bool = this.banAuthor;
                if (bool == null || bool == Data.NULL_BOOLEAN) {
                    return false;
                }
                return bool.booleanValue();
            }

            public SetModerationStatus setBanAuthor(Boolean bool) {
                this.banAuthor = bool;
                return this;
            }

            public SetModerationStatus setId(java.util.List<String> list) {
                this.f21583id = list;
                return this;
            }

            public SetModerationStatus setModerationStatus(String str) {
                this.moderationStatus = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (SetModerationStatus) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (SetModerationStatus) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (SetModerationStatus) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (SetModerationStatus) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (SetModerationStatus) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (SetModerationStatus) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (SetModerationStatus) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (SetModerationStatus) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (SetModerationStatus) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (SetModerationStatus) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (SetModerationStatus) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public SetModerationStatus set(String str, Object obj) {
                return (SetModerationStatus) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<Comment> {
            private static final String REST_PATH = "youtube/v3/comments";

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, Comment comment) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, comment, Comment.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Comment> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Comment> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Comment> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Comment> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Comment> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Comment> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Comment> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Comment> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Comment> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Comment> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Comment> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public Comments() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, Comment comment) {
            Insert insert = new Insert(list, comment);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public MarkAsSpam markAsSpam(java.util.List<String> list) {
            MarkAsSpam markAsSpam = new MarkAsSpam(list);
            YouTube.this.initialize(markAsSpam);
            return markAsSpam;
        }

        public SetModerationStatus setModerationStatus(java.util.List<String> list, String str) {
            SetModerationStatus setModerationStatus = new SetModerationStatus(list, str);
            YouTube.this.initialize(setModerationStatus);
            return setModerationStatus;
        }

        public Update update(java.util.List<String> list, Comment comment) {
            Update update = new Update(list, comment);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class GuideCategories {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<GuideCategoryListResponse> {
            private static final String REST_PATH = "youtube/v3/guideCategories";

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21584hl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21585id;

            @Key
            private java.util.List<String> part;

            @Key
            private String regionCode;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, GuideCategoryListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getHl() {
                return this.f21584hl;
            }

            public java.util.List<String> getId() {
                return this.f21585id;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getRegionCode() {
                return this.regionCode;
            }

            public List setHl(String str) {
                this.f21584hl = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21585id = list;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setRegionCode(String str) {
                this.regionCode = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<GuideCategoryListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<GuideCategoryListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<GuideCategoryListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<GuideCategoryListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<GuideCategoryListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<GuideCategoryListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<GuideCategoryListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<GuideCategoryListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<GuideCategoryListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<GuideCategoryListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<GuideCategoryListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public GuideCategories() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class I18nLanguages {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<I18nLanguageListResponse> {
            private static final String REST_PATH = "youtube/v3/i18nLanguages";

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21586hl;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, I18nLanguageListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getHl() {
                return this.f21586hl;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setHl(String str) {
                this.f21586hl = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<I18nLanguageListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<I18nLanguageListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<I18nLanguageListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<I18nLanguageListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<I18nLanguageListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<I18nLanguageListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<I18nLanguageListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<I18nLanguageListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<I18nLanguageListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<I18nLanguageListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<I18nLanguageListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public I18nLanguages() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class I18nRegions {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<I18nRegionListResponse> {
            private static final String REST_PATH = "youtube/v3/i18nRegions";

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21587hl;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, I18nRegionListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getHl() {
                return this.f21587hl;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setHl(String str) {
                this.f21587hl = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<I18nRegionListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<I18nRegionListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<I18nRegionListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<I18nRegionListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<I18nRegionListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<I18nRegionListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<I18nRegionListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<I18nRegionListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<I18nRegionListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<I18nRegionListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<I18nRegionListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public I18nRegions() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class LiveBroadcasts {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Bind extends YouTubeRequest<LiveBroadcast> {
            private static final String REST_PATH = "youtube/v3/liveBroadcasts/bind";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21588id;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            @Key
            private String streamId;

            protected Bind(String str, java.util.List<String> list) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, null, LiveBroadcast.class);
                this.f21588id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getId() {
                return this.f21588id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getStreamId() {
                return this.streamId;
            }

            public Bind setId(String str) {
                this.f21588id = str;
                return this;
            }

            public Bind setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Bind setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Bind setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public Bind setStreamId(String str) {
                this.streamId = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveBroadcast> set$Xgafv2(String str) {
                return (Bind) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveBroadcast> setAccessToken2(String str) {
                return (Bind) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveBroadcast> setAlt2(String str) {
                return (Bind) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveBroadcast> setCallback2(String str) {
                return (Bind) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveBroadcast> setFields2(String str) {
                return (Bind) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveBroadcast> setKey2(String str) {
                return (Bind) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveBroadcast> setOauthToken2(String str) {
                return (Bind) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveBroadcast> setPrettyPrint2(Boolean bool) {
                return (Bind) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveBroadcast> setQuotaUser2(String str) {
                return (Bind) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveBroadcast> setUploadProtocol2(String str) {
                return (Bind) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveBroadcast> setUploadType2(String str) {
                return (Bind) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Bind set(String str, Object obj) {
                return (Bind) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Control extends YouTubeRequest<LiveBroadcast> {
            private static final String REST_PATH = "youtube/v3/liveBroadcasts/control";

            @Key
            private Boolean displaySlate;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21589id;

            @Key
            private BigInteger offsetTimeMs;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            @Key
            private String walltime;

            protected Control(String str, java.util.List<String> list) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, null, LiveBroadcast.class);
                this.f21589id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public Boolean getDisplaySlate() {
                return this.displaySlate;
            }

            public String getId() {
                return this.f21589id;
            }

            public BigInteger getOffsetTimeMs() {
                return this.offsetTimeMs;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getWalltime() {
                return this.walltime;
            }

            public Control setDisplaySlate(Boolean bool) {
                this.displaySlate = bool;
                return this;
            }

            public Control setId(String str) {
                this.f21589id = str;
                return this;
            }

            public Control setOffsetTimeMs(BigInteger bigInteger) {
                this.offsetTimeMs = bigInteger;
                return this;
            }

            public Control setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Control setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Control setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public Control setWalltime(String str) {
                this.walltime = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveBroadcast> set$Xgafv2(String str) {
                return (Control) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveBroadcast> setAccessToken2(String str) {
                return (Control) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveBroadcast> setAlt2(String str) {
                return (Control) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveBroadcast> setCallback2(String str) {
                return (Control) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveBroadcast> setFields2(String str) {
                return (Control) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveBroadcast> setKey2(String str) {
                return (Control) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveBroadcast> setOauthToken2(String str) {
                return (Control) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveBroadcast> setPrettyPrint2(Boolean bool) {
                return (Control) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveBroadcast> setQuotaUser2(String str) {
                return (Control) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveBroadcast> setUploadProtocol2(String str) {
                return (Control) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveBroadcast> setUploadType2(String str) {
                return (Control) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Control set(String str, Object obj) {
                return (Control) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/liveBroadcasts";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21590id;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21590id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21590id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public Delete setId(String str) {
                this.f21590id = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<LiveBroadcast> {
            private static final String REST_PATH = "youtube/v3/liveBroadcasts";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, LiveBroadcast liveBroadcast) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, liveBroadcast, LiveBroadcast.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Insert setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveBroadcast> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveBroadcast> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveBroadcast> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveBroadcast> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveBroadcast> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveBroadcast> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveBroadcast> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveBroadcast> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveBroadcast> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveBroadcast> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveBroadcast> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<LiveBroadcastListResponse> {
            private static final String REST_PATH = "youtube/v3/liveBroadcasts";

            @Key
            private String broadcastStatus;

            @Key
            private String broadcastType;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21591id;

            @Key
            private Long maxResults;

            @Key
            private Boolean mine;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, LiveBroadcastListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getBroadcastStatus() {
                return this.broadcastStatus;
            }

            public String getBroadcastType() {
                return this.broadcastType;
            }

            public java.util.List<String> getId() {
                return this.f21591id;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public Boolean getMine() {
                return this.mine;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setBroadcastStatus(String str) {
                this.broadcastStatus = str;
                return this;
            }

            public List setBroadcastType(String str) {
                this.broadcastType = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21591id = list;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setMine(Boolean bool) {
                this.mine = bool;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveBroadcastListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveBroadcastListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveBroadcastListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveBroadcastListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveBroadcastListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveBroadcastListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveBroadcastListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveBroadcastListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveBroadcastListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveBroadcastListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveBroadcastListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Transition extends YouTubeRequest<LiveBroadcast> {
            private static final String REST_PATH = "youtube/v3/liveBroadcasts/transition";

            @Key
            private String broadcastStatus;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21592id;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            protected Transition(String str, String str2, java.util.List<String> list) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, null, LiveBroadcast.class);
                this.f21592id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
                this.broadcastStatus = (String) Preconditions.checkNotNull(str2, "Required parameter broadcastStatus must be specified.");
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getBroadcastStatus() {
                return this.broadcastStatus;
            }

            public String getId() {
                return this.f21592id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Transition setBroadcastStatus(String str) {
                this.broadcastStatus = str;
                return this;
            }

            public Transition setId(String str) {
                this.f21592id = str;
                return this;
            }

            public Transition setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Transition setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Transition setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveBroadcast> set$Xgafv2(String str) {
                return (Transition) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveBroadcast> setAccessToken2(String str) {
                return (Transition) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveBroadcast> setAlt2(String str) {
                return (Transition) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveBroadcast> setCallback2(String str) {
                return (Transition) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveBroadcast> setFields2(String str) {
                return (Transition) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveBroadcast> setKey2(String str) {
                return (Transition) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveBroadcast> setOauthToken2(String str) {
                return (Transition) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveBroadcast> setPrettyPrint2(Boolean bool) {
                return (Transition) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveBroadcast> setQuotaUser2(String str) {
                return (Transition) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveBroadcast> setUploadProtocol2(String str) {
                return (Transition) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveBroadcast> setUploadType2(String str) {
                return (Transition) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Transition set(String str, Object obj) {
                return (Transition) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<LiveBroadcast> {
            private static final String REST_PATH = "youtube/v3/liveBroadcasts";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, LiveBroadcast liveBroadcast) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, liveBroadcast, LiveBroadcast.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Update setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveBroadcast> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveBroadcast> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveBroadcast> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveBroadcast> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveBroadcast> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveBroadcast> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveBroadcast> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveBroadcast> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveBroadcast> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveBroadcast> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveBroadcast> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public LiveBroadcasts() {
        }

        public Bind bind(String str, java.util.List<String> list) {
            Bind bind = new Bind(str, list);
            YouTube.this.initialize(bind);
            return bind;
        }

        public Control control(String str, java.util.List<String> list) {
            Control control = new Control(str, list);
            YouTube.this.initialize(control);
            return control;
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, LiveBroadcast liveBroadcast) {
            Insert insert = new Insert(list, liveBroadcast);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Transition transition(String str, String str2, java.util.List<String> list) {
            Transition transition = new Transition(str, str2, list);
            YouTube.this.initialize(transition);
            return transition;
        }

        public Update update(java.util.List<String> list, LiveBroadcast liveBroadcast) {
            Update update = new Update(list, liveBroadcast);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class LiveChatBans {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/liveChat/bans";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21593id;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21593id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21593id;
            }

            public Delete setId(String str) {
                this.f21593id = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<LiveChatBan> {
            private static final String REST_PATH = "youtube/v3/liveChat/bans";

            @Key
            private List<String> part;

            protected Insert(List<String> list, LiveChatBan liveChatBan) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, liveChatBan, LiveChatBan.class);
                this.part = (List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public List<String> getPart() {
                return this.part;
            }

            public Insert setPart(List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveChatBan> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveChatBan> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveChatBan> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveChatBan> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveChatBan> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveChatBan> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveChatBan> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveChatBan> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveChatBan> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveChatBan> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveChatBan> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        public LiveChatBans() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(List<String> list, LiveChatBan liveChatBan) {
            Insert insert = new Insert(list, liveChatBan);
            YouTube.this.initialize(insert);
            return insert;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class LiveChatMessages {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/liveChat/messages";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21594id;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21594id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21594id;
            }

            public Delete setId(String str) {
                this.f21594id = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<LiveChatMessage> {
            private static final String REST_PATH = "youtube/v3/liveChat/messages";

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, LiveChatMessage liveChatMessage) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, liveChatMessage, LiveChatMessage.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveChatMessage> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveChatMessage> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveChatMessage> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveChatMessage> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveChatMessage> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveChatMessage> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveChatMessage> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveChatMessage> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveChatMessage> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveChatMessage> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveChatMessage> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<LiveChatMessageListResponse> {
            private static final String REST_PATH = "youtube/v3/liveChat/messages";

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21595hl;

            @Key
            private String liveChatId;

            @Key
            private Long maxResults;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            @Key
            private Long profileImageSize;

            protected List(String str, java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, LiveChatMessageListResponse.class);
                this.liveChatId = (String) Preconditions.checkNotNull(str, "Required parameter liveChatId must be specified.");
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getHl() {
                return this.f21595hl;
            }

            public String getLiveChatId() {
                return this.liveChatId;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Long getProfileImageSize() {
                return this.profileImageSize;
            }

            public List setHl(String str) {
                this.f21595hl = str;
                return this;
            }

            public List setLiveChatId(String str) {
                this.liveChatId = str;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setProfileImageSize(Long l10) {
                this.profileImageSize = l10;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveChatMessageListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveChatMessageListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveChatMessageListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveChatMessageListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveChatMessageListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveChatMessageListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveChatMessageListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveChatMessageListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveChatMessageListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveChatMessageListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveChatMessageListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public LiveChatMessages() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, LiveChatMessage liveChatMessage) {
            Insert insert = new Insert(list, liveChatMessage);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(String str, java.util.List<String> list) {
            List list2 = new List(str, list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class LiveChatModerators {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/liveChat/moderators";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21596id;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21596id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21596id;
            }

            public Delete setId(String str) {
                this.f21596id = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<LiveChatModerator> {
            private static final String REST_PATH = "youtube/v3/liveChat/moderators";

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, LiveChatModerator liveChatModerator) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, liveChatModerator, LiveChatModerator.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveChatModerator> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveChatModerator> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveChatModerator> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveChatModerator> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveChatModerator> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveChatModerator> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveChatModerator> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveChatModerator> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveChatModerator> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveChatModerator> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveChatModerator> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<LiveChatModeratorListResponse> {
            private static final String REST_PATH = "youtube/v3/liveChat/moderators";

            @Key
            private String liveChatId;

            @Key
            private Long maxResults;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(String str, java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, LiveChatModeratorListResponse.class);
                this.liveChatId = (String) Preconditions.checkNotNull(str, "Required parameter liveChatId must be specified.");
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getLiveChatId() {
                return this.liveChatId;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setLiveChatId(String str) {
                this.liveChatId = str;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveChatModeratorListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveChatModeratorListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveChatModeratorListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveChatModeratorListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveChatModeratorListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveChatModeratorListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveChatModeratorListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveChatModeratorListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveChatModeratorListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveChatModeratorListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveChatModeratorListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public LiveChatModerators() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, LiveChatModerator liveChatModerator) {
            Insert insert = new Insert(list, liveChatModerator);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(String str, java.util.List<String> list) {
            List list2 = new List(str, list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class LiveStreams {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/liveStreams";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21597id;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21597id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21597id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public Delete setId(String str) {
                this.f21597id = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<LiveStream> {
            private static final String REST_PATH = "youtube/v3/liveStreams";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, LiveStream liveStream) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, liveStream, LiveStream.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Insert setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveStream> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveStream> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveStream> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveStream> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveStream> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveStream> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveStream> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveStream> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveStream> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveStream> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveStream> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<LiveStreamListResponse> {
            private static final String REST_PATH = "youtube/v3/liveStreams";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21598id;

            @Key
            private Long maxResults;

            @Key
            private Boolean mine;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, LiveStreamListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public java.util.List<String> getId() {
                return this.f21598id;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public Boolean getMine() {
                return this.mine;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setId(java.util.List<String> list) {
                this.f21598id = list;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setMine(Boolean bool) {
                this.mine = bool;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveStreamListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveStreamListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveStreamListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveStreamListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveStreamListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveStreamListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveStreamListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveStreamListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveStreamListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveStreamListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveStreamListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<LiveStream> {
            private static final String REST_PATH = "youtube/v3/liveStreams";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, LiveStream liveStream) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, liveStream, LiveStream.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Update setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<LiveStream> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<LiveStream> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<LiveStream> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<LiveStream> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<LiveStream> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<LiveStream> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<LiveStream> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<LiveStream> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<LiveStream> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<LiveStream> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<LiveStream> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public LiveStreams() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, LiveStream liveStream) {
            Insert insert = new Insert(list, liveStream);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Update update(java.util.List<String> list, LiveStream liveStream) {
            Update update = new Update(list, liveStream);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Members {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<MemberListResponse> {
            private static final String REST_PATH = "youtube/v3/members";

            @Key
            private String filterByMemberChannelId;

            @Key
            private String hasAccessToLevel;

            @Key
            private Long maxResults;

            @Key
            private String mode;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, MemberListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFilterByMemberChannelId() {
                return this.filterByMemberChannelId;
            }

            public String getHasAccessToLevel() {
                return this.hasAccessToLevel;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getMode() {
                return this.mode;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setFilterByMemberChannelId(String str) {
                this.filterByMemberChannelId = str;
                return this;
            }

            public List setHasAccessToLevel(String str) {
                this.hasAccessToLevel = str;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setMode(String str) {
                this.mode = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<MemberListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<MemberListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<MemberListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<MemberListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<MemberListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<MemberListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<MemberListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<MemberListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<MemberListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<MemberListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<MemberListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public Members() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class MembershipsLevels {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<MembershipsLevelListResponse> {
            private static final String REST_PATH = "youtube/v3/membershipsLevels";

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, MembershipsLevelListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<MembershipsLevelListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<MembershipsLevelListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<MembershipsLevelListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<MembershipsLevelListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<MembershipsLevelListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<MembershipsLevelListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<MembershipsLevelListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<MembershipsLevelListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<MembershipsLevelListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<MembershipsLevelListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<MembershipsLevelListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public MembershipsLevels() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class PlaylistItems {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/playlistItems";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21599id;

            @Key
            private String onBehalfOfContentOwner;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21599id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21599id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public Delete setId(String str) {
                this.f21599id = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<PlaylistItem> {
            private static final String REST_PATH = "youtube/v3/playlistItems";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, PlaylistItem playlistItem) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, playlistItem, PlaylistItem.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<PlaylistItem> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<PlaylistItem> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<PlaylistItem> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<PlaylistItem> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<PlaylistItem> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<PlaylistItem> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<PlaylistItem> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<PlaylistItem> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<PlaylistItem> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<PlaylistItem> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<PlaylistItem> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<PlaylistItemListResponse> {
            private static final String REST_PATH = "youtube/v3/playlistItems";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21600id;

            @Key
            private Long maxResults;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            @Key
            private String playlistId;

            @Key
            private String videoId;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, PlaylistItemListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public java.util.List<String> getId() {
                return this.f21600id;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getPlaylistId() {
                return this.playlistId;
            }

            public String getVideoId() {
                return this.videoId;
            }

            public List setId(java.util.List<String> list) {
                this.f21600id = list;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setPlaylistId(String str) {
                this.playlistId = str;
                return this;
            }

            public List setVideoId(String str) {
                this.videoId = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<PlaylistItemListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<PlaylistItemListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<PlaylistItemListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<PlaylistItemListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<PlaylistItemListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<PlaylistItemListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<PlaylistItemListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<PlaylistItemListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<PlaylistItemListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<PlaylistItemListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<PlaylistItemListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<PlaylistItem> {
            private static final String REST_PATH = "youtube/v3/playlistItems";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, PlaylistItem playlistItem) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, playlistItem, PlaylistItem.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<PlaylistItem> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<PlaylistItem> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<PlaylistItem> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<PlaylistItem> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<PlaylistItem> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<PlaylistItem> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<PlaylistItem> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<PlaylistItem> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<PlaylistItem> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<PlaylistItem> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<PlaylistItem> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public PlaylistItems() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, PlaylistItem playlistItem) {
            Insert insert = new Insert(list, playlistItem);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Update update(java.util.List<String> list, PlaylistItem playlistItem) {
            Update update = new Update(list, playlistItem);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Playlists {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/playlists";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21601id;

            @Key
            private String onBehalfOfContentOwner;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21601id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21601id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public Delete setId(String str) {
                this.f21601id = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<Playlist> {
            private static final String REST_PATH = "youtube/v3/playlists";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, Playlist playlist) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, playlist, Playlist.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Insert setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Playlist> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Playlist> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Playlist> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Playlist> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Playlist> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Playlist> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Playlist> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Playlist> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Playlist> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Playlist> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Playlist> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<PlaylistListResponse> {
            private static final String REST_PATH = "youtube/v3/playlists";

            @Key
            private String channelId;

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21602hl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21603id;

            @Key
            private Long maxResults;

            @Key
            private Boolean mine;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, PlaylistListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getChannelId() {
                return this.channelId;
            }

            public String getHl() {
                return this.f21602hl;
            }

            public java.util.List<String> getId() {
                return this.f21603id;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public Boolean getMine() {
                return this.mine;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public List setHl(String str) {
                this.f21602hl = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21603id = list;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setMine(Boolean bool) {
                this.mine = bool;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<PlaylistListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<PlaylistListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<PlaylistListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<PlaylistListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<PlaylistListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<PlaylistListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<PlaylistListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<PlaylistListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<PlaylistListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<PlaylistListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<PlaylistListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<Playlist> {
            private static final String REST_PATH = "youtube/v3/playlists";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, Playlist playlist) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, playlist, Playlist.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Playlist> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Playlist> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Playlist> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Playlist> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Playlist> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Playlist> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Playlist> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Playlist> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Playlist> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Playlist> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Playlist> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public Playlists() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, Playlist playlist) {
            Insert insert = new Insert(list, playlist);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Update update(java.util.List<String> list, Playlist playlist) {
            Update update = new Update(list, playlist);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Search {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<SearchListResponse> {
            private static final String REST_PATH = "youtube/v3/search";

            @Key
            private String channelId;

            @Key
            private String channelType;

            @Key
            private String eventType;

            @Key
            private Boolean forContentOwner;

            @Key
            private Boolean forDeveloper;

            @Key
            private Boolean forMine;

            @Key
            private String location;

            @Key
            private String locationRadius;

            @Key
            private Long maxResults;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String order;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            @Key
            private String publishedAfter;

            @Key
            private String publishedBefore;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            @Key
            private String f21604q;

            @Key
            private String regionCode;

            @Key
            private String relatedToVideoId;

            @Key
            private String relevanceLanguage;

            @Key
            private String safeSearch;

            @Key
            private String topicId;

            @Key
            private java.util.List<String> type;

            @Key
            private String videoCaption;

            @Key
            private String videoCategoryId;

            @Key
            private String videoDefinition;

            @Key
            private String videoDimension;

            @Key
            private String videoDuration;

            @Key
            private String videoEmbeddable;

            @Key
            private String videoLicense;

            @Key
            private String videoSyndicated;

            @Key
            private String videoType;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, SearchListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getChannelId() {
                return this.channelId;
            }

            public String getChannelType() {
                return this.channelType;
            }

            public String getEventType() {
                return this.eventType;
            }

            public Boolean getForContentOwner() {
                return this.forContentOwner;
            }

            public Boolean getForDeveloper() {
                return this.forDeveloper;
            }

            public Boolean getForMine() {
                return this.forMine;
            }

            public String getLocation() {
                return this.location;
            }

            public String getLocationRadius() {
                return this.locationRadius;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOrder() {
                return this.order;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getPublishedAfter() {
                return this.publishedAfter;
            }

            public String getPublishedBefore() {
                return this.publishedBefore;
            }

            public String getQ() {
                return this.f21604q;
            }

            public String getRegionCode() {
                return this.regionCode;
            }

            public String getRelatedToVideoId() {
                return this.relatedToVideoId;
            }

            public String getRelevanceLanguage() {
                return this.relevanceLanguage;
            }

            public String getSafeSearch() {
                return this.safeSearch;
            }

            public String getTopicId() {
                return this.topicId;
            }

            public java.util.List<String> getType() {
                return this.type;
            }

            public String getVideoCaption() {
                return this.videoCaption;
            }

            public String getVideoCategoryId() {
                return this.videoCategoryId;
            }

            public String getVideoDefinition() {
                return this.videoDefinition;
            }

            public String getVideoDimension() {
                return this.videoDimension;
            }

            public String getVideoDuration() {
                return this.videoDuration;
            }

            public String getVideoEmbeddable() {
                return this.videoEmbeddable;
            }

            public String getVideoLicense() {
                return this.videoLicense;
            }

            public String getVideoSyndicated() {
                return this.videoSyndicated;
            }

            public String getVideoType() {
                return this.videoType;
            }

            public List setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public List setChannelType(String str) {
                this.channelType = str;
                return this;
            }

            public List setEventType(String str) {
                this.eventType = str;
                return this;
            }

            public List setForContentOwner(Boolean bool) {
                this.forContentOwner = bool;
                return this;
            }

            public List setForDeveloper(Boolean bool) {
                this.forDeveloper = bool;
                return this;
            }

            public List setForMine(Boolean bool) {
                this.forMine = bool;
                return this;
            }

            public List setLocation(String str) {
                this.location = str;
                return this;
            }

            public List setLocationRadius(String str) {
                this.locationRadius = str;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setOrder(String str) {
                this.order = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setPublishedAfter(String str) {
                this.publishedAfter = str;
                return this;
            }

            public List setPublishedBefore(String str) {
                this.publishedBefore = str;
                return this;
            }

            public List setQ(String str) {
                this.f21604q = str;
                return this;
            }

            public List setRegionCode(String str) {
                this.regionCode = str;
                return this;
            }

            public List setRelatedToVideoId(String str) {
                this.relatedToVideoId = str;
                return this;
            }

            public List setRelevanceLanguage(String str) {
                this.relevanceLanguage = str;
                return this;
            }

            public List setSafeSearch(String str) {
                this.safeSearch = str;
                return this;
            }

            public List setTopicId(String str) {
                this.topicId = str;
                return this;
            }

            public List setType(java.util.List<String> list) {
                this.type = list;
                return this;
            }

            public List setVideoCaption(String str) {
                this.videoCaption = str;
                return this;
            }

            public List setVideoCategoryId(String str) {
                this.videoCategoryId = str;
                return this;
            }

            public List setVideoDefinition(String str) {
                this.videoDefinition = str;
                return this;
            }

            public List setVideoDimension(String str) {
                this.videoDimension = str;
                return this;
            }

            public List setVideoDuration(String str) {
                this.videoDuration = str;
                return this;
            }

            public List setVideoEmbeddable(String str) {
                this.videoEmbeddable = str;
                return this;
            }

            public List setVideoLicense(String str) {
                this.videoLicense = str;
                return this;
            }

            public List setVideoSyndicated(String str) {
                this.videoSyndicated = str;
                return this;
            }

            public List setVideoType(String str) {
                this.videoType = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<SearchListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<SearchListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<SearchListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<SearchListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<SearchListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<SearchListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<SearchListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<SearchListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<SearchListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<SearchListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<SearchListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public Search() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Sponsors {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<SponsorListResponse> {
            private static final String REST_PATH = "youtube/v3/sponsors";

            @Key
            private String filter;

            @Key
            private Long maxResults;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, SponsorListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getFilter() {
                return this.filter;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setFilter(String str) {
                this.filter = str;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<SponsorListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<SponsorListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<SponsorListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<SponsorListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<SponsorListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<SponsorListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<SponsorListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<SponsorListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<SponsorListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<SponsorListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<SponsorListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public Sponsors() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Subscriptions {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/subscriptions";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21605id;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21605id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21605id;
            }

            public Delete setId(String str) {
                this.f21605id = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<Subscription> {
            private static final String REST_PATH = "youtube/v3/subscriptions";

            @Key
            private java.util.List<String> part;

            protected Insert(java.util.List<String> list, Subscription subscription) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, subscription, Subscription.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Subscription> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Subscription> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Subscription> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Subscription> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Subscription> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Subscription> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Subscription> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Subscription> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Subscription> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Subscription> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Subscription> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<SubscriptionListResponse> {
            private static final String REST_PATH = "youtube/v3/subscriptions";

            @Key
            private String channelId;

            @Key
            private String forChannelId;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21606id;

            @Key
            private Long maxResults;

            @Key
            private Boolean mine;

            @Key
            private Boolean myRecentSubscribers;

            @Key
            private Boolean mySubscribers;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private String order;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, SubscriptionListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getChannelId() {
                return this.channelId;
            }

            public String getForChannelId() {
                return this.forChannelId;
            }

            public java.util.List<String> getId() {
                return this.f21606id;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public Boolean getMine() {
                return this.mine;
            }

            public Boolean getMyRecentSubscribers() {
                return this.myRecentSubscribers;
            }

            public Boolean getMySubscribers() {
                return this.mySubscribers;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public String getOrder() {
                return this.order;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public List setForChannelId(String str) {
                this.forChannelId = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21606id = list;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setMine(Boolean bool) {
                this.mine = bool;
                return this;
            }

            public List setMyRecentSubscribers(Boolean bool) {
                this.myRecentSubscribers = bool;
                return this;
            }

            public List setMySubscribers(Boolean bool) {
                this.mySubscribers = bool;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public List setOrder(String str) {
                this.order = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<SubscriptionListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<SubscriptionListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<SubscriptionListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<SubscriptionListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<SubscriptionListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<SubscriptionListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<SubscriptionListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<SubscriptionListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<SubscriptionListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<SubscriptionListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<SubscriptionListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public Subscriptions() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Insert insert(java.util.List<String> list, Subscription subscription) {
            Insert insert = new Insert(list, subscription);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class SuperChatEvents {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<SuperChatEventListResponse> {
            private static final String REST_PATH = "youtube/v3/superChatEvents";

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21607hl;

            @Key
            private Long maxResults;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, SuperChatEventListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getHl() {
                return this.f21607hl;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setHl(String str) {
                this.f21607hl = str;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<SuperChatEventListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<SuperChatEventListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<SuperChatEventListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<SuperChatEventListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<SuperChatEventListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<SuperChatEventListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<SuperChatEventListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<SuperChatEventListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<SuperChatEventListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<SuperChatEventListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<SuperChatEventListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public SuperChatEvents() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class VideoAbuseReportReasons {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<VideoAbuseReportReasonListResponse> {
            private static final String REST_PATH = "youtube/v3/videoAbuseReportReasons";

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21608hl;

            @Key
            private java.util.List<String> part;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, VideoAbuseReportReasonListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getHl() {
                return this.f21608hl;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public List setHl(String str) {
                this.f21608hl = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<VideoAbuseReportReasonListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public VideoAbuseReportReasons() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class VideoCategories {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<VideoCategoryListResponse> {
            private static final String REST_PATH = "youtube/v3/videoCategories";

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21609hl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21610id;

            @Key
            private java.util.List<String> part;

            @Key
            private String regionCode;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, VideoCategoryListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getHl() {
                return this.f21609hl;
            }

            public java.util.List<String> getId() {
                return this.f21610id;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getRegionCode() {
                return this.regionCode;
            }

            public List setHl(String str) {
                this.f21609hl = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21610id = list;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setRegionCode(String str) {
                this.regionCode = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<VideoCategoryListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<VideoCategoryListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<VideoCategoryListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<VideoCategoryListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<VideoCategoryListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<VideoCategoryListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<VideoCategoryListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<VideoCategoryListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<VideoCategoryListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<VideoCategoryListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<VideoCategoryListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public VideoCategories() {
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Youtube {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class V3 {

            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public class Tests {

                /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
                public class Create extends YouTubeRequest<TestItem> {
                    private static final String REST_PATH = "youtube/v3/tests";

                    @Key
                    private List<String> part;

                    protected Create(TestItem testItem) {
                        super(YouTube.this, HttpMethods.POST, REST_PATH, testItem, TestItem.class);
                    }

                    public List<String> getPart() {
                        return this.part;
                    }

                    public Create setPart(List<String> list) {
                        this.part = list;
                        return this;
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: set$Xgafv */
                    public YouTubeRequest<TestItem> set$Xgafv2(String str) {
                        return (Create) super.set$Xgafv2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setAccessToken */
                    public YouTubeRequest<TestItem> setAccessToken2(String str) {
                        return (Create) super.setAccessToken2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setAlt */
                    public YouTubeRequest<TestItem> setAlt2(String str) {
                        return (Create) super.setAlt2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setCallback */
                    public YouTubeRequest<TestItem> setCallback2(String str) {
                        return (Create) super.setCallback2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setFields */
                    public YouTubeRequest<TestItem> setFields2(String str) {
                        return (Create) super.setFields2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setKey */
                    public YouTubeRequest<TestItem> setKey2(String str) {
                        return (Create) super.setKey2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setOauthToken */
                    public YouTubeRequest<TestItem> setOauthToken2(String str) {
                        return (Create) super.setOauthToken2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setPrettyPrint */
                    public YouTubeRequest<TestItem> setPrettyPrint2(Boolean bool) {
                        return (Create) super.setPrettyPrint2(bool);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setQuotaUser */
                    public YouTubeRequest<TestItem> setQuotaUser2(String str) {
                        return (Create) super.setQuotaUser2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setUploadProtocol */
                    public YouTubeRequest<TestItem> setUploadProtocol2(String str) {
                        return (Create) super.setUploadProtocol2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest
                    /* JADX INFO: renamed from: setUploadType */
                    public YouTubeRequest<TestItem> setUploadType2(String str) {
                        return (Create) super.setUploadType2(str);
                    }

                    @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                    public Create set(String str, Object obj) {
                        return (Create) super.set(str, obj);
                    }
                }

                public Tests() {
                }

                public Create create(TestItem testItem) {
                    Create create = new Create(testItem);
                    YouTube.this.initialize(create);
                    return create;
                }
            }

            public V3() {
            }

            public Tests tests() {
                return new Tests();
            }
        }

        public Youtube() {
        }

        public V3 v3() {
            return new V3();
        }
    }

    static {
        Preconditions.checkState(GoogleUtils.MAJOR_VERSION.intValue() == 1 && GoogleUtils.MINOR_VERSION.intValue() >= 15, "You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.30.9 of the YouTube Data API v3 library.", GoogleUtils.VERSION);
    }

    public YouTube(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
        this(new Builder(httpTransport, jsonFactory, httpRequestInitializer));
    }

    public Activities activities() {
        return new Activities();
    }

    public Captions captions() {
        return new Captions();
    }

    public ChannelBanners channelBanners() {
        return new ChannelBanners();
    }

    public ChannelSections channelSections() {
        return new ChannelSections();
    }

    public Channels channels() {
        return new Channels();
    }

    public CommentThreads commentThreads() {
        return new CommentThreads();
    }

    public Comments comments() {
        return new Comments();
    }

    public GuideCategories guideCategories() {
        return new GuideCategories();
    }

    public I18nLanguages i18nLanguages() {
        return new I18nLanguages();
    }

    public I18nRegions i18nRegions() {
        return new I18nRegions();
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClient
    protected void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) {
        super.initialize(abstractGoogleClientRequest);
    }

    public LiveBroadcasts liveBroadcasts() {
        return new LiveBroadcasts();
    }

    public LiveChatBans liveChatBans() {
        return new LiveChatBans();
    }

    public LiveChatMessages liveChatMessages() {
        return new LiveChatMessages();
    }

    public LiveChatModerators liveChatModerators() {
        return new LiveChatModerators();
    }

    public LiveStreams liveStreams() {
        return new LiveStreams();
    }

    public Members members() {
        return new Members();
    }

    public MembershipsLevels membershipsLevels() {
        return new MembershipsLevels();
    }

    public PlaylistItems playlistItems() {
        return new PlaylistItems();
    }

    public Playlists playlists() {
        return new Playlists();
    }

    public Search search() {
        return new Search();
    }

    public Sponsors sponsors() {
        return new Sponsors();
    }

    public Subscriptions subscriptions() {
        return new Subscriptions();
    }

    public SuperChatEvents superChatEvents() {
        return new SuperChatEvents();
    }

    public Thumbnails thumbnails() {
        return new Thumbnails();
    }

    public VideoAbuseReportReasons videoAbuseReportReasons() {
        return new VideoAbuseReportReasons();
    }

    public VideoCategories videoCategories() {
        return new VideoCategories();
    }

    public Videos videos() {
        return new Videos();
    }

    public Watermarks watermarks() {
        return new Watermarks();
    }

    public Youtube youtube() {
        return new Youtube();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Captions {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/captions";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21571id;

            @Key
            private String onBehalfOf;

            @Key
            private String onBehalfOfContentOwner;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21571id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21571id;
            }

            public String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public Delete setId(String str) {
                this.f21571id = str;
                return this;
            }

            public Delete setOnBehalfOf(String str) {
                this.onBehalfOf = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Download extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/captions/{id}";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21572id;

            @Key
            private String onBehalfOf;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String tfmt;

            @Key
            private String tlang;

            protected Download(String str) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, Void.class);
                this.f21572id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
                initializeMediaDownload();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public GenericUrl buildHttpRequestUrl() {
                String baseUrl;
                if ("media".equals(get("alt")) && getMediaHttpUploader() == null) {
                    baseUrl = YouTube.this.getRootUrl() + "download/" + YouTube.this.getServicePath();
                } else {
                    baseUrl = YouTube.this.getBaseUrl();
                }
                return new GenericUrl(UriTemplate.expand(baseUrl, getUriTemplate(), this, true));
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeMedia() {
                return super.executeMedia();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public void executeMediaAndDownloadTo(OutputStream outputStream) throws IOException {
                super.executeMediaAndDownloadTo(outputStream);
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public InputStream executeMediaAsInputStream() {
                return super.executeMediaAsInputStream();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getId() {
                return this.f21572id;
            }

            public String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getTfmt() {
                return this.tfmt;
            }

            public String getTlang() {
                return this.tlang;
            }

            public Download setId(String str) {
                this.f21572id = str;
                return this;
            }

            public Download setOnBehalfOf(String str) {
                this.onBehalfOf = str;
                return this;
            }

            public Download setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Download setTfmt(String str) {
                this.tfmt = str;
                return this;
            }

            public Download setTlang(String str) {
                this.tlang = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Download) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Download) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Download) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Download) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Download) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Download) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Download) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Download) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Download) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Download) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Download) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Download set(String str, Object obj) {
                return (Download) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<Caption> {
            private static final String REST_PATH = "youtube/v3/captions";

            @Key
            private String onBehalfOf;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            @Key
            private Boolean sync;

            protected Insert(java.util.List<String> list, Caption caption) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, caption, Caption.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Boolean getSync() {
                return this.sync;
            }

            public Insert setOnBehalfOf(String str) {
                this.onBehalfOf = str;
                return this;
            }

            public Insert setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public Insert setSync(Boolean bool) {
                this.sync = bool;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Caption> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Caption> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Caption> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Caption> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Caption> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Caption> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Caption> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Caption> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Caption> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Caption> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Caption> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            protected Insert(java.util.List<String> list, Caption caption, AbstractInputStreamContent abstractInputStreamContent) {
                super(YouTube.this, HttpMethods.POST, "/upload/" + YouTube.this.getServicePath() + REST_PATH, caption, Caption.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
                initializeMediaUpload(abstractInputStreamContent);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<CaptionListResponse> {
            private static final String REST_PATH = "youtube/v3/captions";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21573id;

            @Key
            private String onBehalfOf;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            @Key
            private String videoId;

            protected List(String str, java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, CaptionListResponse.class);
                this.videoId = (String) Preconditions.checkNotNull(str, "Required parameter videoId must be specified.");
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public java.util.List<String> getId() {
                return this.f21573id;
            }

            public String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getVideoId() {
                return this.videoId;
            }

            public List setId(java.util.List<String> list) {
                this.f21573id = list;
                return this;
            }

            public List setOnBehalfOf(String str) {
                this.onBehalfOf = str;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setVideoId(String str) {
                this.videoId = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<CaptionListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<CaptionListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<CaptionListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<CaptionListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<CaptionListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<CaptionListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<CaptionListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<CaptionListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<CaptionListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<CaptionListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<CaptionListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<Caption> {
            private static final String REST_PATH = "youtube/v3/captions";

            @Key
            private String onBehalfOf;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            @Key
            private Boolean sync;

            protected Update(java.util.List<String> list, Caption caption) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, caption, Caption.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
                checkRequiredParameter(caption, "content");
                checkRequiredParameter(caption.getId(), "Caption.getId()");
            }

            public String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Boolean getSync() {
                return this.sync;
            }

            public Update setOnBehalfOf(String str) {
                this.onBehalfOf = str;
                return this;
            }

            public Update setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public Update setSync(Boolean bool) {
                this.sync = bool;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Caption> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Caption> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Caption> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Caption> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Caption> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Caption> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Caption> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Caption> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Caption> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Caption> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Caption> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }

            protected Update(java.util.List<String> list, Caption caption, AbstractInputStreamContent abstractInputStreamContent) {
                super(YouTube.this, HttpMethods.PUT, "/upload/" + YouTube.this.getServicePath() + REST_PATH, caption, Caption.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
                initializeMediaUpload(abstractInputStreamContent);
            }
        }

        public Captions() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public Download download(String str) {
            Download download = new Download(str);
            YouTube.this.initialize(download);
            return download;
        }

        public Insert insert(java.util.List<String> list, Caption caption) {
            Insert insert = new Insert(list, caption);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(String str, java.util.List<String> list) {
            List list2 = new List(str, list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Update update(java.util.List<String> list, Caption caption) {
            Update update = new Update(list, caption);
            YouTube.this.initialize(update);
            return update;
        }

        public Insert insert(java.util.List<String> list, Caption caption, AbstractInputStreamContent abstractInputStreamContent) {
            Insert insert = new Insert(list, caption, abstractInputStreamContent);
            YouTube.this.initialize(insert);
            return insert;
        }

        public Update update(java.util.List<String> list, Caption caption, AbstractInputStreamContent abstractInputStreamContent) {
            Update update = new Update(list, caption, abstractInputStreamContent);
            YouTube.this.initialize(update);
            return update;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class ChannelBanners {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<ChannelBannerResource> {
            private static final String REST_PATH = "youtube/v3/channelBanners/insert";

            @Key
            private String channelId;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            protected Insert(ChannelBannerResource channelBannerResource) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, channelBannerResource, ChannelBannerResource.class);
            }

            public String getChannelId() {
                return this.channelId;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public Insert setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public Insert setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Insert setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<ChannelBannerResource> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<ChannelBannerResource> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<ChannelBannerResource> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<ChannelBannerResource> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<ChannelBannerResource> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<ChannelBannerResource> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<ChannelBannerResource> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<ChannelBannerResource> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<ChannelBannerResource> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<ChannelBannerResource> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<ChannelBannerResource> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            protected Insert(ChannelBannerResource channelBannerResource, AbstractInputStreamContent abstractInputStreamContent) {
                super(YouTube.this, HttpMethods.POST, "/upload/" + YouTube.this.getServicePath() + REST_PATH, channelBannerResource, ChannelBannerResource.class);
                initializeMediaUpload(abstractInputStreamContent);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        public ChannelBanners() {
        }

        public Insert insert(ChannelBannerResource channelBannerResource) {
            Insert insert = new Insert(channelBannerResource);
            YouTube.this.initialize(insert);
            return insert;
        }

        public Insert insert(ChannelBannerResource channelBannerResource, AbstractInputStreamContent abstractInputStreamContent) {
            Insert insert = new Insert(channelBannerResource, abstractInputStreamContent);
            YouTube.this.initialize(insert);
            return insert;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Thumbnails {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Set extends YouTubeRequest<ThumbnailSetResponse> {
            private static final String REST_PATH = "youtube/v3/thumbnails/set";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String videoId;

            protected Set(String str) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, null, ThumbnailSetResponse.class);
                this.videoId = (String) Preconditions.checkNotNull(str, "Required parameter videoId must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getVideoId() {
                return this.videoId;
            }

            public Set setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Set setVideoId(String str) {
                this.videoId = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<ThumbnailSetResponse> set$Xgafv2(String str) {
                return (Set) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<ThumbnailSetResponse> setAccessToken2(String str) {
                return (Set) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<ThumbnailSetResponse> setAlt2(String str) {
                return (Set) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<ThumbnailSetResponse> setCallback2(String str) {
                return (Set) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<ThumbnailSetResponse> setFields2(String str) {
                return (Set) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<ThumbnailSetResponse> setKey2(String str) {
                return (Set) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<ThumbnailSetResponse> setOauthToken2(String str) {
                return (Set) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<ThumbnailSetResponse> setPrettyPrint2(Boolean bool) {
                return (Set) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<ThumbnailSetResponse> setQuotaUser2(String str) {
                return (Set) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<ThumbnailSetResponse> setUploadProtocol2(String str) {
                return (Set) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<ThumbnailSetResponse> setUploadType2(String str) {
                return (Set) super.setUploadType2(str);
            }

            protected Set(String str, AbstractInputStreamContent abstractInputStreamContent) {
                super(YouTube.this, HttpMethods.POST, "/upload/" + YouTube.this.getServicePath() + REST_PATH, null, ThumbnailSetResponse.class);
                this.videoId = (String) Preconditions.checkNotNull(str, "Required parameter videoId must be specified.");
                initializeMediaUpload(abstractInputStreamContent);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Set set(String str, Object obj) {
                return (Set) super.set(str, obj);
            }
        }

        public Thumbnails() {
        }

        public Set set(String str) {
            Set set = new Set(str);
            YouTube.this.initialize(set);
            return set;
        }

        public Set set(String str, AbstractInputStreamContent abstractInputStreamContent) {
            Set set = new Set(str, abstractInputStreamContent);
            YouTube.this.initialize(set);
            return set;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Videos {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Delete extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/videos";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21611id;

            @Key
            private String onBehalfOfContentOwner;

            protected Delete(String str) {
                super(YouTube.this, HttpMethods.DELETE, REST_PATH, null, Void.class);
                this.f21611id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
            }

            public String getId() {
                return this.f21611id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public Delete setId(String str) {
                this.f21611id = str;
                return this;
            }

            public Delete setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class GetRating extends YouTubeRequest<VideoRatingListResponse> {
            private static final String REST_PATH = "youtube/v3/videos/getRating";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21612id;

            @Key
            private String onBehalfOfContentOwner;

            protected GetRating(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, VideoRatingListResponse.class);
                this.f21612id = (java.util.List) Preconditions.checkNotNull(list, "Required parameter id must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public java.util.List<String> getId() {
                return this.f21612id;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public GetRating setId(java.util.List<String> list) {
                this.f21612id = list;
                return this;
            }

            public GetRating setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<VideoRatingListResponse> set$Xgafv2(String str) {
                return (GetRating) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<VideoRatingListResponse> setAccessToken2(String str) {
                return (GetRating) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<VideoRatingListResponse> setAlt2(String str) {
                return (GetRating) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<VideoRatingListResponse> setCallback2(String str) {
                return (GetRating) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<VideoRatingListResponse> setFields2(String str) {
                return (GetRating) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<VideoRatingListResponse> setKey2(String str) {
                return (GetRating) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<VideoRatingListResponse> setOauthToken2(String str) {
                return (GetRating) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<VideoRatingListResponse> setPrettyPrint2(Boolean bool) {
                return (GetRating) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<VideoRatingListResponse> setQuotaUser2(String str) {
                return (GetRating) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<VideoRatingListResponse> setUploadProtocol2(String str) {
                return (GetRating) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<VideoRatingListResponse> setUploadType2(String str) {
                return (GetRating) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public GetRating set(String str, Object obj) {
                return (GetRating) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Insert extends YouTubeRequest<Video> {
            private static final String REST_PATH = "youtube/v3/videos";

            @Key
            private Boolean autoLevels;

            @Key
            private Boolean notifySubscribers;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String onBehalfOfContentOwnerChannel;

            @Key
            private java.util.List<String> part;

            @Key
            private Boolean stabilize;

            protected Insert(java.util.List<String> list, Video video) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, video, Video.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public Boolean getAutoLevels() {
                return this.autoLevels;
            }

            public Boolean getNotifySubscribers() {
                return this.notifySubscribers;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getOnBehalfOfContentOwnerChannel() {
                return this.onBehalfOfContentOwnerChannel;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Boolean getStabilize() {
                return this.stabilize;
            }

            public boolean isNotifySubscribers() {
                Boolean bool = this.notifySubscribers;
                if (bool == null || bool == Data.NULL_BOOLEAN) {
                    return true;
                }
                return bool.booleanValue();
            }

            public Insert setAutoLevels(Boolean bool) {
                this.autoLevels = bool;
                return this;
            }

            public Insert setNotifySubscribers(Boolean bool) {
                this.notifySubscribers = bool;
                return this;
            }

            public Insert setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Insert setOnBehalfOfContentOwnerChannel(String str) {
                this.onBehalfOfContentOwnerChannel = str;
                return this;
            }

            public Insert setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public Insert setStabilize(Boolean bool) {
                this.stabilize = bool;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Video> set$Xgafv2(String str) {
                return (Insert) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Video> setAccessToken2(String str) {
                return (Insert) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Video> setAlt2(String str) {
                return (Insert) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Video> setCallback2(String str) {
                return (Insert) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Video> setFields2(String str) {
                return (Insert) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Video> setKey2(String str) {
                return (Insert) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Video> setOauthToken2(String str) {
                return (Insert) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Video> setPrettyPrint2(Boolean bool) {
                return (Insert) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Video> setQuotaUser2(String str) {
                return (Insert) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Video> setUploadProtocol2(String str) {
                return (Insert) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Video> setUploadType2(String str) {
                return (Insert) super.setUploadType2(str);
            }

            protected Insert(java.util.List<String> list, Video video, AbstractInputStreamContent abstractInputStreamContent) {
                super(YouTube.this, HttpMethods.POST, "/upload/" + YouTube.this.getServicePath() + REST_PATH, video, Video.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
                initializeMediaUpload(abstractInputStreamContent);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Insert set(String str, Object obj) {
                return (Insert) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class List extends YouTubeRequest<VideoListResponse> {
            private static final String REST_PATH = "youtube/v3/videos";

            @Key
            private String chart;

            /* JADX INFO: renamed from: hl, reason: collision with root package name */
            @Key
            private String f21613hl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private java.util.List<String> f21614id;

            @Key
            private String locale;

            @Key
            private Integer maxHeight;

            @Key
            private Long maxResults;

            @Key
            private Integer maxWidth;

            @Key
            private String myRating;

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private String pageToken;

            @Key
            private java.util.List<String> part;

            @Key
            private String regionCode;

            @Key
            private String videoCategoryId;

            protected List(java.util.List<String> list) {
                super(YouTube.this, HttpMethods.GET, REST_PATH, null, VideoListResponse.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getChart() {
                return this.chart;
            }

            public String getHl() {
                return this.f21613hl;
            }

            public java.util.List<String> getId() {
                return this.f21614id;
            }

            public String getLocale() {
                return this.locale;
            }

            public Integer getMaxHeight() {
                return this.maxHeight;
            }

            public Long getMaxResults() {
                return this.maxResults;
            }

            public Integer getMaxWidth() {
                return this.maxWidth;
            }

            public String getMyRating() {
                return this.myRating;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public String getRegionCode() {
                return this.regionCode;
            }

            public String getVideoCategoryId() {
                return this.videoCategoryId;
            }

            public List setChart(String str) {
                this.chart = str;
                return this;
            }

            public List setHl(String str) {
                this.f21613hl = str;
                return this;
            }

            public List setId(java.util.List<String> list) {
                this.f21614id = list;
                return this;
            }

            public List setLocale(String str) {
                this.locale = str;
                return this;
            }

            public List setMaxHeight(Integer num) {
                this.maxHeight = num;
                return this;
            }

            public List setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public List setMaxWidth(Integer num) {
                this.maxWidth = num;
                return this;
            }

            public List setMyRating(String str) {
                this.myRating = str;
                return this;
            }

            public List setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public List setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            public List setRegionCode(String str) {
                this.regionCode = str;
                return this;
            }

            public List setVideoCategoryId(String str) {
                this.videoCategoryId = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<VideoListResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<VideoListResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<VideoListResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<VideoListResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<VideoListResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<VideoListResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<VideoListResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<VideoListResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<VideoListResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<VideoListResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<VideoListResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Rate extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/videos/rate";

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @Key
            private String f21615id;

            @Key
            private String rating;

            protected Rate(String str, String str2) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, null, Void.class);
                this.f21615id = (String) Preconditions.checkNotNull(str, "Required parameter id must be specified.");
                this.rating = (String) Preconditions.checkNotNull(str2, "Required parameter rating must be specified.");
            }

            public String getId() {
                return this.f21615id;
            }

            public String getRating() {
                return this.rating;
            }

            public Rate setId(String str) {
                this.f21615id = str;
                return this;
            }

            public Rate setRating(String str) {
                this.rating = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Rate) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Rate) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Rate) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Rate) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Rate) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Rate) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Rate) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Rate) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Rate) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Rate) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Rate) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Rate set(String str, Object obj) {
                return (Rate) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class ReportAbuse extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/videos/reportAbuse";

            @Key
            private String onBehalfOfContentOwner;

            protected ReportAbuse(VideoAbuseReport videoAbuseReport) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, videoAbuseReport, Void.class);
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public ReportAbuse setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (ReportAbuse) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (ReportAbuse) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (ReportAbuse) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (ReportAbuse) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (ReportAbuse) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (ReportAbuse) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (ReportAbuse) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (ReportAbuse) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (ReportAbuse) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (ReportAbuse) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (ReportAbuse) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public ReportAbuse set(String str, Object obj) {
                return (ReportAbuse) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Update extends YouTubeRequest<Video> {
            private static final String REST_PATH = "youtube/v3/videos";

            @Key
            private String onBehalfOfContentOwner;

            @Key
            private java.util.List<String> part;

            protected Update(java.util.List<String> list, Video video) {
                super(YouTube.this, HttpMethods.PUT, REST_PATH, video, Video.class);
                this.part = (java.util.List) Preconditions.checkNotNull(list, "Required parameter part must be specified.");
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public java.util.List<String> getPart() {
                return this.part;
            }

            public Update setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            public Update setPart(java.util.List<String> list) {
                this.part = list;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Video> set$Xgafv2(String str) {
                return (Update) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Video> setAccessToken2(String str) {
                return (Update) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Video> setAlt2(String str) {
                return (Update) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Video> setCallback2(String str) {
                return (Update) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Video> setFields2(String str) {
                return (Update) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Video> setKey2(String str) {
                return (Update) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Video> setOauthToken2(String str) {
                return (Update) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Video> setPrettyPrint2(Boolean bool) {
                return (Update) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Video> setQuotaUser2(String str) {
                return (Update) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Video> setUploadProtocol2(String str) {
                return (Update) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Video> setUploadType2(String str) {
                return (Update) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Update set(String str, Object obj) {
                return (Update) super.set(str, obj);
            }
        }

        public Videos() {
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            YouTube.this.initialize(delete);
            return delete;
        }

        public GetRating getRating(java.util.List<String> list) {
            GetRating getRating = new GetRating(list);
            YouTube.this.initialize(getRating);
            return getRating;
        }

        public Insert insert(java.util.List<String> list, Video video) {
            Insert insert = new Insert(list, video);
            YouTube.this.initialize(insert);
            return insert;
        }

        public List list(java.util.List<String> list) {
            List list2 = new List(list);
            YouTube.this.initialize(list2);
            return list2;
        }

        public Rate rate(String str, String str2) {
            Rate rate = new Rate(str, str2);
            YouTube.this.initialize(rate);
            return rate;
        }

        public ReportAbuse reportAbuse(VideoAbuseReport videoAbuseReport) {
            ReportAbuse reportAbuse = new ReportAbuse(videoAbuseReport);
            YouTube.this.initialize(reportAbuse);
            return reportAbuse;
        }

        public Update update(java.util.List<String> list, Video video) {
            Update update = new Update(list, video);
            YouTube.this.initialize(update);
            return update;
        }

        public Insert insert(java.util.List<String> list, Video video, AbstractInputStreamContent abstractInputStreamContent) {
            Insert insert = new Insert(list, video, abstractInputStreamContent);
            YouTube.this.initialize(insert);
            return insert;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Watermarks {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Set extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/watermarks/set";

            @Key
            private String channelId;

            @Key
            private String onBehalfOfContentOwner;

            protected Set(String str, InvideoBranding invideoBranding) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, invideoBranding, Void.class);
                this.channelId = (String) Preconditions.checkNotNull(str, "Required parameter channelId must be specified.");
            }

            public String getChannelId() {
                return this.channelId;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public Set setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public Set setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Set) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Set) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Set) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Set) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Set) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Set) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Set) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Set) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Set) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Set) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Set) super.setUploadType2(str);
            }

            protected Set(String str, InvideoBranding invideoBranding, AbstractInputStreamContent abstractInputStreamContent) {
                super(YouTube.this, HttpMethods.POST, "/upload/" + YouTube.this.getServicePath() + REST_PATH, invideoBranding, Void.class);
                this.channelId = (String) Preconditions.checkNotNull(str, "Required parameter channelId must be specified.");
                initializeMediaUpload(abstractInputStreamContent);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Set set(String str, Object obj) {
                return (Set) super.set(str, obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public class Unset extends YouTubeRequest<Void> {
            private static final String REST_PATH = "youtube/v3/watermarks/unset";

            @Key
            private String channelId;

            @Key
            private String onBehalfOfContentOwner;

            protected Unset(String str) {
                super(YouTube.this, HttpMethods.POST, REST_PATH, null, Void.class);
                this.channelId = (String) Preconditions.checkNotNull(str, "Required parameter channelId must be specified.");
            }

            public String getChannelId() {
                return this.channelId;
            }

            public String getOnBehalfOfContentOwner() {
                return this.onBehalfOfContentOwner;
            }

            public Unset setChannelId(String str) {
                this.channelId = str;
                return this;
            }

            public Unset setOnBehalfOfContentOwner(String str) {
                this.onBehalfOfContentOwner = str;
                return this;
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: set$Xgafv */
            public YouTubeRequest<Void> set$Xgafv2(String str) {
                return (Unset) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAccessToken */
            public YouTubeRequest<Void> setAccessToken2(String str) {
                return (Unset) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setAlt */
            public YouTubeRequest<Void> setAlt2(String str) {
                return (Unset) super.setAlt2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setCallback */
            public YouTubeRequest<Void> setCallback2(String str) {
                return (Unset) super.setCallback2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setFields */
            public YouTubeRequest<Void> setFields2(String str) {
                return (Unset) super.setFields2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setKey */
            public YouTubeRequest<Void> setKey2(String str) {
                return (Unset) super.setKey2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setOauthToken */
            public YouTubeRequest<Void> setOauthToken2(String str) {
                return (Unset) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setPrettyPrint */
            public YouTubeRequest<Void> setPrettyPrint2(Boolean bool) {
                return (Unset) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setQuotaUser */
            public YouTubeRequest<Void> setQuotaUser2(String str) {
                return (Unset) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadProtocol */
            public YouTubeRequest<Void> setUploadProtocol2(String str) {
                return (Unset) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest
            /* JADX INFO: renamed from: setUploadType */
            public YouTubeRequest<Void> setUploadType2(String str) {
                return (Unset) super.setUploadType2(str);
            }

            @Override // com.google.api.services.youtube.YouTubeRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Unset set(String str, Object obj) {
                return (Unset) super.set(str, obj);
            }
        }

        public Watermarks() {
        }

        public Set set(String str, InvideoBranding invideoBranding) {
            Set set = new Set(str, invideoBranding);
            YouTube.this.initialize(set);
            return set;
        }

        public Unset unset(String str) {
            Unset unset = new Unset(str);
            YouTube.this.initialize(unset);
            return unset;
        }

        public Set set(String str, InvideoBranding invideoBranding, AbstractInputStreamContent abstractInputStreamContent) {
            Set set = new Set(str, invideoBranding, abstractInputStreamContent);
            YouTube.this.initialize(set);
            return set;
        }
    }

    YouTube(Builder builder) {
        super(builder);
    }
}

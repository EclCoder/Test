package com.vungle.ads.internal.network;

import com.vungle.ads.internal.util.p;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static final b Companion = new b(null);
    private static final int PRIORITY_MAX_RETRY_COUNT = 3;
    private static final int REGULAR_MAX_RETRY_COUNT = 5;
    private final String body;
    private final Map<String, String> headers;
    private final p logEntry;
    private final d method;
    private final Boolean priorityRetry;
    private final int priorityRetryCount;
    private final boolean regularRetry;
    private final int regularRetryCount;
    private final String tpatKey;
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        private String body;
        private Map<String, String> headers;
        private p logEntry;
        private d method;
        private Boolean priorityRetry;
        private int priorityRetryCount;
        private boolean regularRetry;
        private int regularRetryCount;
        private String tpatKey;
        private final String url;

        public a(String url) {
            s.h(url, "url");
            this.url = url;
            this.method = d.GET;
            this.priorityRetryCount = 3;
            this.regularRetry = true;
            this.regularRetryCount = 5;
        }

        public final a body(String str) {
            this.body = str;
            return this;
        }

        public final g build() {
            return new g(this.url, this.method, this.headers, this.body, this.priorityRetry, this.priorityRetryCount, this.regularRetry, this.regularRetryCount, this.tpatKey, this.logEntry, null);
        }

        public final a get() {
            this.method = d.GET;
            return this;
        }

        public final String getUrl() {
            return this.url;
        }

        public final a headers(Map<String, String> map) {
            this.headers = map;
            return this;
        }

        public final a method(d method) {
            s.h(method, "method");
            this.method = method;
            return this;
        }

        public final a post() {
            this.method = d.POST;
            return this;
        }

        public final a priorityRetry(boolean z10) {
            this.priorityRetry = Boolean.valueOf(z10);
            return this;
        }

        public final a priorityRetryCount(int i10) {
            this.priorityRetryCount = i10;
            return this;
        }

        public final a regularRetry(boolean z10) {
            this.regularRetry = z10;
            return this;
        }

        public final a regularRetryCount(int i10) {
            this.regularRetryCount = i10;
            return this;
        }

        public final a tpatKey(String str) {
            this.tpatKey = str;
            return this;
        }

        public final a withLogEntry(p pVar) {
            this.logEntry = pVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ g(String str, d dVar, Map map, String str2, Boolean bool, int i10, boolean z10, int i11, String str3, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, map, str2, bool, i10, z10, i11, str3, pVar);
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final p getLogEntry() {
        return this.logEntry;
    }

    public final d getMethod() {
        return this.method;
    }

    public final Boolean getPriorityRetry() {
        return this.priorityRetry;
    }

    public final int getPriorityRetryCount() {
        return this.priorityRetryCount;
    }

    public final boolean getRegularRetry() {
        return this.regularRetry;
    }

    public final int getRegularRetryCount() {
        return this.regularRetryCount;
    }

    public final String getTpatKey() {
        return this.tpatKey;
    }

    public final String getUrl() {
        return this.url;
    }

    private g(String str, d dVar, Map<String, String> map, String str2, Boolean bool, int i10, boolean z10, int i11, String str3, p pVar) {
        this.url = str;
        this.method = dVar;
        this.headers = map;
        this.body = str2;
        this.priorityRetry = bool;
        this.priorityRetryCount = i10;
        this.regularRetry = z10;
        this.regularRetryCount = i11;
        this.tpatKey = str3;
        this.logEntry = pVar;
    }
}

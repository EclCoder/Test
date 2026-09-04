package com.vungle.ads.internal.load;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    public static final a Companion = new a(null);
    public static final String RTA_DEBUG_ENDPOINT = "https://events.ads.vungle.com/rtadebugging";
    private final com.vungle.ads.internal.network.k apiClient;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(com.vungle.ads.internal.network.k apiClient) {
        s.h(apiClient, "apiClient");
        this.apiClient = apiClient;
    }

    public final void reportAdMarkup(String adm) {
        s.h(adm, "adm");
        this.apiClient.sendAdMarkup(adm, RTA_DEBUG_ENDPOINT);
    }
}

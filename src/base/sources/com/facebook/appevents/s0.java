package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14999b = new a(null);
    private static final long serialVersionUID = 20160629001L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f15000a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15001b = new a(null);
        private static final long serialVersionUID = 20160629001L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f15002a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(HashMap proxyEvents) {
            kotlin.jvm.internal.s.h(proxyEvents, "proxyEvents");
            this.f15002a = proxyEvents;
        }

        private final Object readResolve() {
            return new s0(this.f15002a);
        }
    }

    public s0() {
        this.f15000a = new HashMap();
    }

    private final Object writeReplace() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return new b(this.f15000a);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final void a(com.facebook.appevents.a accessTokenAppIdPair, List appEvents) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(accessTokenAppIdPair, "accessTokenAppIdPair");
            kotlin.jvm.internal.s.h(appEvents, "appEvents");
            if (!this.f15000a.containsKey(accessTokenAppIdPair)) {
                this.f15000a.put(accessTokenAppIdPair, gl.r.L0(appEvents));
                return;
            }
            List list = (List) this.f15000a.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final Set d() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            Set setEntrySet = this.f15000a.entrySet();
            kotlin.jvm.internal.s.g(setEntrySet, "events.entries");
            return setEntrySet;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public s0(HashMap appEventMap) {
        kotlin.jvm.internal.s.h(appEventMap, "appEventMap");
        HashMap map = new HashMap();
        this.f15000a = map;
        map.putAll(appEventMap);
    }
}

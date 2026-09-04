package com.apm.insight.k;

import com.apm.insight.CrashType;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f10783a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10784a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f10784a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10784a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10784a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f10785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f10786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashType f10787c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.f10787c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f10785a = ((JSONArray) jSONObject.opt(DataSchemeDataSource.SCHEME_DATA)).optJSONObject(0);
            } else {
                this.f10785a = jSONObject;
            }
            this.f10786b = jSONObject.optJSONObject("header");
        }

        public final String a() {
            return this.f10785a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f10785a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i10 = AnonymousClass1.f10784a[this.f10787c.ordinal()];
            if (i10 == 1) {
                return this.f10785a.optString(DataSchemeDataSource.SCHEME_DATA, null);
            }
            if (i10 == 2) {
                return this.f10785a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f10785a.optString(DataSchemeDataSource.SCHEME_DATA, null);
        }
    }

    static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f10783a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f10783a.isEmpty()) {
            f10783a.poll();
        }
        f10783a = null;
    }
}

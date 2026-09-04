package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2883c9 extends AbstractC2953f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2883c9 f26313c = new C2883c9();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f26314d = new AtomicBoolean(true);

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f26314d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j10 = this.f26525a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j10));
            }
            int i10 = this.f26526b;
            if (i10 > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i10));
            }
            Context context = Xi.f26021a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "banner_audio_pref_file");
                kotlin.jvm.internal.s.h("user_mute_count", "key");
                int i11 = laA.f25198a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i11));
                }
            }
        }
        return jSONObject;
    }
}

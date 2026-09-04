package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24208d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24205a = z10;
        this.f24206b = f10;
        this.f24207c = z11;
        this.f24208d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f24205a);
            if (this.f24205a) {
                jSONObject.put("skipOffset", this.f24206b);
            }
            jSONObject.put("autoPlay", this.f24207c);
            jSONObject.put("position", this.f24208d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f24208d;
    }

    public Float getSkipOffset() {
        return this.f24206b;
    }

    public boolean isAutoPlay() {
        return this.f24207c;
    }

    public boolean isSkippable() {
        return this.f24205a;
    }
}

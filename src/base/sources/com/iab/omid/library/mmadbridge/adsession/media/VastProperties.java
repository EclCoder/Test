package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.utils.d;
import com.iab.omid.library.mmadbridge.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24073d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24070a = z10;
        this.f24071b = f10;
        this.f24072c = z11;
        this.f24073d = position;
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
            jSONObject.put("skippable", this.f24070a);
            if (this.f24070a) {
                jSONObject.put("skipOffset", this.f24071b);
            }
            jSONObject.put("autoPlay", this.f24072c);
            jSONObject.put("position", this.f24073d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f24073d;
    }

    public Float getSkipOffset() {
        return this.f24071b;
    }

    public boolean isAutoPlay() {
        return this.f24072c;
    }

    public boolean isSkippable() {
        return this.f24070a;
    }
}

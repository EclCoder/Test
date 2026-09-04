package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f23801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f23803d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f23800a = z10;
        this.f23801b = f10;
        this.f23802c = z11;
        this.f23803d = position;
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
            jSONObject.put("skippable", this.f23800a);
            if (this.f23800a) {
                jSONObject.put("skipOffset", this.f23801b);
            }
            jSONObject.put("autoPlay", this.f23802c);
            jSONObject.put("position", this.f23803d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f23803d;
    }

    public Float getSkipOffset() {
        return this.f23801b;
    }

    public boolean isAutoPlay() {
        return this.f23802c;
    }

    public boolean isSkippable() {
        return this.f23800a;
    }
}

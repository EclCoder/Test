package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.utils.d;
import com.iab.omid.library.inmobi.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f23930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f23932d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f23929a = z10;
        this.f23930b = f10;
        this.f23931c = z11;
        this.f23932d = position;
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
            jSONObject.put("skippable", this.f23929a);
            if (this.f23929a) {
                jSONObject.put("skipOffset", this.f23930b);
            }
            jSONObject.put("autoPlay", this.f23931c);
            jSONObject.put("position", this.f23932d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f23932d;
    }

    public Float getSkipOffset() {
        return this.f23930b;
    }

    public boolean isAutoPlay() {
        return this.f23931c;
    }

    public boolean isSkippable() {
        return this.f23929a;
    }
}

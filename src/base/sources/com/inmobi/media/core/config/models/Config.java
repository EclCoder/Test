package com.inmobi.media.core.config.models;

import com.inmobi.media.AbstractC3323ta;
import com.inmobi.media.C2832aa;
import com.inmobi.media.E8;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/inmobi/media/core/config/models/Config;", "", "<init>", "()V", "Lcom/inmobi/media/aa;", "getIncludeIdParams", "()Lcom/inmobi/media/aa;", "", "getType", "()Ljava/lang/String;", "", "isValid", "()Z", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "includeIds", "Lcom/inmobi/media/aa;", "getIncludeIds", "setIncludeIds", "(Lcom/inmobi/media/aa;)V", "", "lastUpdateTimeStamp", "J", "getLastUpdateTimeStamp", "()J", "setLastUpdateTimeStamp", "(J)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Config {
    private C2832aa includeIds = new C2832aa(false, 1, null);

    @E8
    private long lastUpdateTimeStamp;

    public boolean equals(Object other) {
        return (other instanceof Config) && s.c(getType(), ((Config) other).getType());
    }

    /* JADX INFO: renamed from: getIncludeIdParams, reason: from getter */
    public final C2832aa getIncludeIds() {
        return this.includeIds;
    }

    public final C2832aa getIncludeIds() {
        return this.includeIds;
    }

    public final long getLastUpdateTimeStamp() {
        return this.lastUpdateTimeStamp;
    }

    public abstract String getType();

    public int hashCode() {
        return getType().hashCode();
    }

    public abstract boolean isValid();

    public final void setIncludeIds(C2832aa c2832aa) {
        s.h(c2832aa, "<set-?>");
        this.includeIds = c2832aa;
    }

    public final void setLastUpdateTimeStamp(long j10) {
        this.lastUpdateTimeStamp = j10;
    }

    public final JSONObject toJson() {
        s.h(this, "obj");
        JSONObject jSONObjectA = AbstractC3323ta.a(this, getClass());
        return jSONObjectA == null ? new JSONObject() : jSONObjectA;
    }
}

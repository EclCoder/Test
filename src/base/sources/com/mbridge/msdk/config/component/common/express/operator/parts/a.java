package com.mbridge.msdk.config.component.common.express.operator.parts;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28623b;

    private a(boolean z10, Object obj) {
        this.f28622a = z10;
        this.f28623b = obj;
    }

    public static a a(Object obj) {
        return new a(true, obj);
    }

    public static a c() {
        return new a(false, null);
    }

    public boolean b() {
        return this.f28622a;
    }

    public Object a() {
        Object obj = this.f28623b;
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        return obj instanceof Integer ? String.valueOf(obj) : obj;
    }
}

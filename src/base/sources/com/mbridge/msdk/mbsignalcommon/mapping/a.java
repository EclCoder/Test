package com.mbridge.msdk.mbsignalcommon.mapping;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f31658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31659b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f31658a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.f31659b = str;
    }
}

package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f29953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f29954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class<?> f29955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f29956d;

    SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f29953a = method;
        this.f29954b = threadMode;
        this.f29955c = cls;
    }

    private synchronized void a() {
        if (this.f29956d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f29953a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f29953a.getName());
            sb2.append('(');
            sb2.append(this.f29955c.getName());
            this.f29956d = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f29956d.equals(((SubscriberMethod) obj).f29956d);
    }

    public int hashCode() {
        return this.f29953a.hashCode();
    }
}

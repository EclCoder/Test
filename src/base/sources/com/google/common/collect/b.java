package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC0320b f21659a = EnumC0320b.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f21660b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21661a;

        static {
            int[] iArr = new int[EnumC0320b.values().length];
            f21661a = iArr;
            try {
                iArr[EnumC0320b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21661a[EnumC0320b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum EnumC0320b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f21659a = EnumC0320b.FAILED;
        this.f21660b = a();
        if (this.f21659a == EnumC0320b.DONE) {
            return false;
        }
        this.f21659a = EnumC0320b.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f21659a = EnumC0320b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sc.p.v(this.f21659a != EnumC0320b.FAILED);
        int i10 = a.f21661a[this.f21659a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f21659a = EnumC0320b.NOT_READY;
        Object objA = u0.a(this.f21660b);
        this.f21660b = null;
        return objA;
    }
}

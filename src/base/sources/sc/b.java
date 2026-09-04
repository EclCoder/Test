package sc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC0799b f52281a = EnumC0799b.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f52282b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52283a;

        static {
            int[] iArr = new int[EnumC0799b.values().length];
            f52283a = iArr;
            try {
                iArr[EnumC0799b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52283a[EnumC0799b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: sc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum EnumC0799b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f52281a = EnumC0799b.FAILED;
        this.f52282b = a();
        if (this.f52281a == EnumC0799b.DONE) {
            return false;
        }
        this.f52281a = EnumC0799b.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f52281a = EnumC0799b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p.v(this.f52281a != EnumC0799b.FAILED);
        int i10 = a.f52283a[this.f52281a.ordinal()];
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
        this.f52281a = EnumC0799b.NOT_READY;
        Object objA = k.a(this.f52282b);
        this.f52282b = null;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

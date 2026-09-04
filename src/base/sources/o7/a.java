package o7;

import gl.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0743a f48219d = new C0743a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f48220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f48222c;

    /* JADX INFO: renamed from: o7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0743a {
        public /* synthetic */ C0743a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i10 = iArr[0];
            j0 it = new yl.f(1, gl.j.U(iArr)).iterator();
            while (it.hasNext()) {
                i10 *= iArr[it.nextInt()];
            }
            return i10;
        }

        private C0743a() {
        }
    }

    public a(int[] shape) {
        s.h(shape, "shape");
        this.f48220a = shape;
        int iB = f48219d.b(shape);
        this.f48221b = iB;
        this.f48222c = new float[iB];
    }

    public final float[] a() {
        return this.f48222c;
    }

    public final int b(int i10) {
        return this.f48220a[i10];
    }

    public final int c() {
        return this.f48220a.length;
    }

    public final void d(int[] shape) {
        s.h(shape, "shape");
        this.f48220a = shape;
        int iB = f48219d.b(shape);
        float[] fArr = new float[iB];
        System.arraycopy(this.f48222c, 0, fArr, 0, Math.min(this.f48221b, iB));
        this.f48222c = fArr;
        this.f48221b = iB;
    }
}

package androidx.work;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f7988a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f7989b = 20;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7990c;

        public a(int i10) {
            super(i10);
            this.f7990c = i10;
        }

        @Override // androidx.work.l
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f7990c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.l
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f7990c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.l
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f7990c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.l
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f7990c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.l
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f7990c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public l(int i10) {
    }

    public static synchronized l c() {
        try {
            if (f7988a == null) {
                f7988a = new a(3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f7988a;
    }

    public static synchronized void e(l lVar) {
        f7988a = lVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f7989b;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}

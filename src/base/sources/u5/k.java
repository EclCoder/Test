package u5;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f54155k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f54156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f54157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f54159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f54160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54165j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    k(long j10, l lVar, Set set) {
        this.f54158c = j10;
        this.f54160e = j10;
        this.f54156a = lVar;
        this.f54157b = set;
        this.f54159d = new b();
    }

    private static void g(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap h(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f54155k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void i() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            j();
        }
    }

    private void j() {
        Log.v("LruBitmapPool", "Hits=" + this.f54162g + ", misses=" + this.f54163h + ", puts=" + this.f54164i + ", evictions=" + this.f54165j + ", currentSize=" + this.f54161f + ", maxSize=" + this.f54160e + "\nStrategy=" + this.f54156a);
    }

    private void k() {
        r(this.f54160e);
    }

    private static Set l() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l m() {
        return new o();
    }

    private synchronized Bitmap n(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapE;
        try {
            g(config);
            bitmapE = this.f54156a.e(i10, i11, config != null ? config : f54155k);
            if (bitmapE == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f54156a.b(i10, i11, config));
                }
                this.f54163h++;
            } else {
                this.f54162g++;
                this.f54161f -= (long) this.f54156a.c(bitmapE);
                this.f54159d.a(bitmapE);
                q(bitmapE);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f54156a.b(i10, i11, config));
            }
            i();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapE;
    }

    private static void p(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void q(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        p(bitmap);
    }

    private synchronized void r(long j10) {
        while (this.f54161f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f54156a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        j();
                    }
                    this.f54161f = 0L;
                    return;
                }
                this.f54159d.a(bitmapRemoveLast);
                this.f54161f -= (long) this.f54156a.c(bitmapRemoveLast);
                this.f54165j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f54156a.a(bitmapRemoveLast));
                }
                i();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u5.d
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            r(o() / 2);
        }
    }

    @Override // u5.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        r(0L);
    }

    @Override // u5.d
    public synchronized void c(float f10) {
        this.f54160e = Math.round(this.f54158c * f10);
        k();
    }

    @Override // u5.d
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f54156a.c(bitmap) <= this.f54160e && this.f54157b.contains(bitmap.getConfig())) {
                int iC = this.f54156a.c(bitmap);
                this.f54156a.d(bitmap);
                this.f54159d.b(bitmap);
                this.f54164i++;
                this.f54161f += (long) iC;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f54156a.a(bitmap));
                }
                i();
                k();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f54156a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f54157b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // u5.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapN = n(i10, i11, config);
        if (bitmapN == null) {
            return h(i10, i11, config);
        }
        bitmapN.eraseColor(0);
        return bitmapN;
    }

    @Override // u5.d
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapN = n(i10, i11, config);
        return bitmapN == null ? h(i10, i11, config) : bitmapN;
    }

    public long o() {
        return this.f54160e;
    }

    public k(long j10) {
        this(j10, m(), l());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements a {
        b() {
        }

        @Override // u5.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // u5.k.a
        public void b(Bitmap bitmap) {
        }
    }
}

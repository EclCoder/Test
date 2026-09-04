package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ScheduledThreadPoolExecutor f50185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f50186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f50187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f50188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Paint f50189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Bitmap f50190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final GifInfoHandle f50191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ConcurrentLinkedQueue f50192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ColorStateList f50193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PorterDuffColorFilter f50194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f50195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f50196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final h f50197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l f50198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f50199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ScheduledFuture f50200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f50201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f50202r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends m {
        a(b bVar) {
            super(bVar);
        }

        @Override // pl.droidsonroids.gif.m
        public void a() {
            if (b.this.f50191g.t()) {
                b.this.start();
            }
        }
    }

    /* JADX INFO: renamed from: pl.droidsonroids.gif.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0769b extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50204b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0769b(b bVar, int i10) {
            super(bVar);
            this.f50204b = i10;
        }

        @Override // pl.droidsonroids.gif.m
        public void a() {
            b bVar = b.this;
            bVar.f50191g.x(this.f50204b, bVar.f50190f);
            this.f50249a.f50197m.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public b(Resources resources, int i10) {
        this(resources.openRawResourceFd(i10));
        float fB = f.b(resources, i10);
        this.f50202r = (int) (this.f50191g.f() * fB);
        this.f50201q = (int) (this.f50191g.l() * fB);
    }

    private void a() {
        ScheduledFuture scheduledFuture = this.f50200p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f50197m.removeMessages(-1);
    }

    private void g() {
        if (this.f50196l && this.f50186b) {
            long j10 = this.f50187c;
            if (j10 != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j10 - SystemClock.uptimeMillis());
                this.f50187c = Long.MIN_VALUE;
                this.f50185a.remove(this.f50198n);
                this.f50200p = this.f50185a.schedule(this.f50198n, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    private void i() {
        this.f50186b = false;
        this.f50197m.removeMessages(-1);
        this.f50191g.r();
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public int b() {
        return this.f50191g.b();
    }

    public int c() {
        int iC = this.f50191g.c();
        return (iC == 0 || iC < this.f50191g.g()) ? iC : iC - 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return d() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return d() > 1;
    }

    public int d() {
        return this.f50191g.j();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        if (this.f50194j == null || this.f50189e.getColorFilter() != null) {
            z10 = false;
        } else {
            this.f50189e.setColorFilter(this.f50194j);
            z10 = true;
        }
        canvas.drawBitmap(this.f50190f, this.f50199o, this.f50188d, this.f50189e);
        if (z10) {
            this.f50189e.setColorFilter(null);
        }
    }

    public boolean e() {
        return this.f50191g.n();
    }

    public void f() {
        this.f50185a.execute(new a(this));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f50189e.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f50189e.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f50191g.d();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f50191g.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f50202r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f50201q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f50191g.m() || this.f50189e.getAlpha() < 255) ? -2 : -1;
    }

    public void h(int i10) {
        this.f50191g.y(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        g();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f50186b;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f50186b;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f50193i;
        return colorStateList != null && colorStateList.isStateful();
    }

    void j(long j10) {
        if (this.f50196l) {
            this.f50187c = 0L;
            this.f50197m.sendEmptyMessageAtTime(-1, 0L);
        } else {
            a();
            this.f50200p = this.f50185a.schedule(this.f50198n, Math.max(j10, 0L), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f50188d.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f50193i;
        if (colorStateList == null || (mode = this.f50195k) == null) {
            return false;
        }
        this.f50194j = k(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f50185a.execute(new C0769b(this, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f50189e.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f50189e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f50189e.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f50189e.setFilterBitmap(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f50193i = colorStateList;
        this.f50194j = k(colorStateList, this.f50195k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f50195k = mode;
        this.f50194j = k(this.f50193i, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.f50196l) {
            if (z10) {
                if (z11) {
                    f();
                }
                if (visible) {
                    start();
                    return visible;
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            try {
                if (this.f50186b) {
                    return;
                }
                this.f50186b = true;
                j(this.f50191g.u());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            try {
                if (this.f50186b) {
                    this.f50186b = false;
                    a();
                    this.f50191g.w();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f50191g.l()), Integer.valueOf(this.f50191g.f()), Integer.valueOf(this.f50191g.j()), Integer.valueOf(this.f50191g.h()));
    }

    public b(AssetFileDescriptor assetFileDescriptor) {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public b(ContentResolver contentResolver, Uri uri) {
        this(GifInfoHandle.p(contentResolver, uri), null, null, true);
    }

    b(GifInfoHandle gifInfoHandle, b bVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10) {
        this.f50186b = true;
        this.f50187c = Long.MIN_VALUE;
        this.f50188d = new Rect();
        this.f50189e = new Paint(6);
        this.f50192h = new ConcurrentLinkedQueue();
        l lVar = new l(this);
        this.f50198n = lVar;
        this.f50196l = z10;
        this.f50185a = scheduledThreadPoolExecutor == null ? d.h() : scheduledThreadPoolExecutor;
        this.f50191g = gifInfoHandle;
        Bitmap bitmap = null;
        if (bVar != null) {
            synchronized (bVar.f50191g) {
                try {
                    if (!bVar.f50191g.n() && bVar.f50191g.f() >= gifInfoHandle.f() && bVar.f50191g.l() >= gifInfoHandle.l()) {
                        bVar.i();
                        bitmap = bVar.f50190f;
                        bitmap.eraseColor(0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (bitmap == null) {
            this.f50190f = Bitmap.createBitmap(gifInfoHandle.l(), gifInfoHandle.f(), Bitmap.Config.ARGB_8888);
        } else {
            this.f50190f = bitmap;
        }
        this.f50190f.setHasAlpha(!gifInfoHandle.m());
        this.f50199o = new Rect(0, 0, gifInfoHandle.l(), gifInfoHandle.f());
        this.f50197m = new h(this);
        lVar.a();
        this.f50201q = gifInfoHandle.l();
        this.f50202r = gifInfoHandle.f();
    }
}

package d6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.List;
import r5.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f36213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f36221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f36222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f36223k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f36224a;

        a(g gVar) {
            this.f36224a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, q5.a aVar, k kVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.e(context), aVar, i10, i11, kVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f36222j == null) {
            this.f36222j = new Rect();
        }
        return this.f36222j;
    }

    private Paint h() {
        if (this.f36221i == null) {
            this.f36221i = new Paint(2);
        }
        return this.f36221i;
    }

    private void j() {
        List list = this.f36223k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f36223k.get(i10)).b(this);
            }
        }
    }

    private void l() {
        this.f36218f = 0;
    }

    private void n() {
        m6.k.b(!this.f36216d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f36213a.f36224a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f36214b) {
                return;
            }
            this.f36214b = true;
            this.f36213a.f36224a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f36214b = false;
        this.f36213a.f36224a.s(this);
    }

    @Override // d6.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f36218f++;
        }
        int i10 = this.f36219g;
        if (i10 == -1 || this.f36218f < i10) {
            return;
        }
        stop();
        j();
    }

    public ByteBuffer c() {
        return this.f36213a.f36224a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f36216d) {
            return;
        }
        if (this.f36220h) {
            Gravity.apply(Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f36220h = false;
        }
        canvas.drawBitmap(this.f36213a.f36224a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f36213a.f36224a.e();
    }

    public int f() {
        return this.f36213a.f36224a.f();
    }

    public int g() {
        return this.f36213a.f36224a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f36213a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f36213a.f36224a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f36213a.f36224a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f36213a.f36224a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f36214b;
    }

    public void k() {
        this.f36216d = true;
        this.f36213a.f36224a.a();
    }

    public void m(k kVar, Bitmap bitmap) {
        this.f36213a.f36224a.o(kVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f36220h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        m6.k.b(!this.f36216d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f36217e = z10;
        if (!z10) {
            o();
        } else if (this.f36215c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f36215c = true;
        l();
        if (this.f36217e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f36215c = false;
        o();
    }

    c(a aVar) {
        this.f36217e = true;
        this.f36219g = -1;
        this.f36213a = (a) m6.k.e(aVar);
    }
}

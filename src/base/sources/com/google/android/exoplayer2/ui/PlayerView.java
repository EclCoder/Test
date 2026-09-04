package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.x1;
import com.google.android.exoplayer2.z0;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import java.util.ArrayList;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f18455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f18456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f18457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f18459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SubtitleView f18460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f18461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f18462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PlayerControlView f18463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final FrameLayout f18464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f18465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private x1 f18466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PlayerControlView.e f18468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f18470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f18472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f18473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f18475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f18478y;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements x1.d, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h2.b f18479a = new h2.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f18480b;

        public a() {
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void H(i2 i2Var) {
            x1 x1Var = (x1) ob.a.e(PlayerView.this.f18466m);
            h2 currentTimeline = x1Var.getCurrentTimeline();
            if (currentTimeline.u()) {
                this.f18480b = null;
            } else if (x1Var.e().c()) {
                Object obj = this.f18480b;
                if (obj != null) {
                    int iF = currentTimeline.f(obj);
                    if (iF != -1) {
                        if (x1Var.l() == currentTimeline.j(iF, this.f18479a).f17000c) {
                            return;
                        }
                    }
                    this.f18480b = null;
                }
            } else {
                this.f18480b = currentTimeline.k(x1Var.getCurrentPeriodIndex(), this.f18479a, true).f16999b;
            }
            PlayerView.this.L(false);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.F();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PlayerView.o((TextureView) view, PlayerView.this.f18478y);
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            PlayerView.this.H();
            PlayerView.this.J();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onPlaybackStateChanged(int i10) {
            PlayerView.this.H();
            PlayerView.this.K();
            PlayerView.this.J();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onRenderedFirstFrame() {
            if (PlayerView.this.f18456c != null) {
                PlayerView.this.f18456c.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.e
        public void q(int i10) {
            PlayerView.this.I();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void s(bb.f fVar) {
            if (PlayerView.this.f18460g != null) {
                PlayerView.this.f18460g.setCues(fVar.f8779a);
            }
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void w(pb.z zVar) {
            PlayerView.this.G();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void x(x1.e eVar, x1.e eVar2, int i10) {
            if (PlayerView.this.w() && PlayerView.this.f18476w) {
                PlayerView.this.u();
            }
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean A(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                y(this.f18455b, intrinsicWidth / intrinsicHeight);
                this.f18459f.setImageDrawable(drawable);
                this.f18459f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void B(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean C() {
        x1 x1Var = this.f18466m;
        if (x1Var == null) {
            return true;
        }
        int playbackState = x1Var.getPlaybackState();
        if (this.f18475v) {
            return playbackState == 1 || playbackState == 4 || !this.f18466m.getPlayWhenReady();
        }
        return false;
    }

    private void E(boolean z10) {
        if (N()) {
            this.f18463j.setShowTimeoutMs(z10 ? 0 : this.f18474u);
            this.f18463j.K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        if (!N() || this.f18466m == null) {
            return;
        }
        if (!this.f18463j.D()) {
            x(true);
        } else if (this.f18477x) {
            this.f18463j.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        x1 x1Var = this.f18466m;
        pb.z zVarI = x1Var != null ? x1Var.i() : pb.z.f49991e;
        int i10 = zVarI.f49997a;
        int i11 = zVarI.f49998b;
        int i12 = zVarI.f49999c;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * zVarI.f50000d) / i11;
        View view = this.f18457d;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.f18478y != 0) {
                view.removeOnLayoutChangeListener(this.f18454a);
            }
            this.f18478y = i12;
            if (i12 != 0) {
                this.f18457d.addOnLayoutChangeListener(this.f18454a);
            }
            o((TextureView) this.f18457d, this.f18478y);
        }
        y(this.f18455b, this.f18458e ? 0.0f : f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void H() {
        boolean z10;
        if (this.f18461h != null) {
            x1 x1Var = this.f18466m;
            if (x1Var == null || x1Var.getPlaybackState() != 2) {
                z10 = false;
            } else {
                int i10 = this.f18471r;
                z10 = true;
                if (i10 != 2 && (i10 != 1 || !this.f18466m.getPlayWhenReady())) {
                    z10 = false;
                }
            }
            this.f18461h.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        PlayerControlView playerControlView = this.f18463j;
        if (playerControlView == null || !this.f18467n) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.f18477x ? getResources().getString(mb.q.f45492e) : null);
        } else {
            setContentDescription(getResources().getString(mb.q.f45499l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (w() && this.f18476w) {
            u();
        } else {
            x(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        TextView textView = this.f18462i;
        if (textView != null) {
            CharSequence charSequence = this.f18473t;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f18462i.setVisibility(0);
            } else {
                x1 x1Var = this.f18466m;
                if (x1Var != null) {
                    x1Var.d();
                }
                this.f18462i.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(boolean z10) {
        x1 x1Var = this.f18466m;
        if (x1Var == null || !x1Var.t(30) || x1Var.e().c()) {
            if (this.f18472s) {
                return;
            }
            t();
            p();
            return;
        }
        if (z10 && !this.f18472s) {
            p();
        }
        if (x1Var.e().d(2)) {
            t();
            return;
        }
        p();
        if (M() && (z(x1Var.I()) || A(this.f18470q))) {
            return;
        }
        t();
    }

    private boolean M() {
        if (!this.f18469p) {
            return false;
        }
        ob.a.i(this.f18459f);
        return true;
    }

    private boolean N() {
        if (!this.f18467n) {
            return false;
        }
        ob.a.i(this.f18463j);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    private void p() {
        View view = this.f18456c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void q(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(r0.W(context, resources, mb.k.f45435f));
        imageView.setBackgroundColor(resources.getColor(mb.i.f45425a));
    }

    private static void r(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(r0.W(context, resources, mb.k.f45435f));
        imageView.setBackgroundColor(resources.getColor(mb.i.f45425a, null));
    }

    private void t() {
        ImageView imageView = this.f18459f;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f18459f.setVisibility(4);
        }
    }

    private boolean v(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        x1 x1Var = this.f18466m;
        return x1Var != null && x1Var.isPlayingAd() && this.f18466m.getPlayWhenReady();
    }

    private void x(boolean z10) {
        if (!(w() && this.f18476w) && N()) {
            boolean z11 = this.f18463j.D() && this.f18463j.getShowTimeoutMs() <= 0;
            boolean zC = C();
            if (z10 || z11 || zC) {
                E(zC);
            }
        }
    }

    private boolean z(z0 z0Var) {
        byte[] bArr = z0Var.f19162j;
        if (bArr == null) {
            return false;
        }
        return A(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public void D() {
        E(C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        x1 x1Var = this.f18466m;
        if (x1Var != null && x1Var.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zV = v(keyEvent.getKeyCode());
        if (zV && N() && !this.f18463j.D()) {
            x(true);
            return true;
        }
        if (s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            x(true);
            return true;
        }
        if (zV && N()) {
            x(true);
        }
        return false;
    }

    public List<mb.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f18465l;
        if (frameLayout != null) {
            arrayList.add(new mb.a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f18463j;
        if (playerControlView != null) {
            arrayList.add(new mb.a(playerControlView, 1));
        }
        return com.google.common.collect.c0.x(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) ob.a.j(this.f18464k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f18475v;
    }

    public boolean getControllerHideOnTouch() {
        return this.f18477x;
    }

    public int getControllerShowTimeoutMs() {
        return this.f18474u;
    }

    public Drawable getDefaultArtwork() {
        return this.f18470q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f18465l;
    }

    public x1 getPlayer() {
        return this.f18466m;
    }

    public int getResizeMode() {
        ob.a.i(this.f18455b);
        return this.f18455b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f18460g;
    }

    public boolean getUseArtwork() {
        return this.f18469p;
    }

    public boolean getUseController() {
        return this.f18467n;
    }

    public View getVideoSurfaceView() {
        return this.f18457d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!N() || this.f18466m == null) {
            return false;
        }
        x(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        F();
        return super.performClick();
    }

    public boolean s(KeyEvent keyEvent) {
        return N() && this.f18463j.y(keyEvent);
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        ob.a.i(this.f18455b);
        this.f18455b.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f18475v = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f18476w = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        ob.a.i(this.f18463j);
        this.f18477x = z10;
        I();
    }

    public void setControllerShowTimeoutMs(int i10) {
        ob.a.i(this.f18463j);
        this.f18474u = i10;
        if (this.f18463j.D()) {
            D();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.e eVar) {
        ob.a.i(this.f18463j);
        PlayerControlView.e eVar2 = this.f18468o;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.f18463j.E(eVar2);
        }
        this.f18468o = eVar;
        if (eVar != null) {
            this.f18463j.w(eVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        ob.a.g(this.f18462i != null);
        this.f18473t = charSequence;
        K();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f18470q != drawable) {
            this.f18470q = drawable;
            L(false);
        }
    }

    public void setErrorMessageProvider(ob.m mVar) {
        if (mVar != null) {
            K();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f18472s != z10) {
            this.f18472s = z10;
            L(false);
        }
    }

    public void setPlayer(x1 x1Var) {
        ob.a.g(Looper.myLooper() == Looper.getMainLooper());
        ob.a.a(x1Var == null || x1Var.w() == Looper.getMainLooper());
        x1 x1Var2 = this.f18466m;
        if (x1Var2 == x1Var) {
            return;
        }
        if (x1Var2 != null) {
            x1Var2.o(this.f18454a);
            if (x1Var2.t(27)) {
                View view = this.f18457d;
                if (view instanceof TextureView) {
                    x1Var2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    x1Var2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f18460g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f18466m = x1Var;
        if (N()) {
            this.f18463j.setPlayer(x1Var);
        }
        H();
        K();
        L(true);
        if (x1Var == null) {
            u();
            return;
        }
        if (x1Var.t(27)) {
            View view2 = this.f18457d;
            if (view2 instanceof TextureView) {
                x1Var.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                x1Var.setVideoSurfaceView((SurfaceView) view2);
            }
            G();
        }
        if (this.f18460g != null && x1Var.t(28)) {
            this.f18460g.setCues(x1Var.s().f8779a);
        }
        x1Var.E(this.f18454a);
        x(false);
    }

    public void setRepeatToggleModes(int i10) {
        ob.a.i(this.f18463j);
        this.f18463j.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        ob.a.i(this.f18455b);
        this.f18455b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f18471r != i10) {
            this.f18471r = i10;
            H();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        ob.a.i(this.f18463j);
        this.f18463j.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        ob.a.i(this.f18463j);
        this.f18463j.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        ob.a.i(this.f18463j);
        this.f18463j.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        ob.a.i(this.f18463j);
        this.f18463j.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        ob.a.i(this.f18463j);
        this.f18463j.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        ob.a.i(this.f18463j);
        this.f18463j.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f18456c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        ob.a.g((z10 && this.f18459f == null) ? false : true);
        if (this.f18469p != z10) {
            this.f18469p = z10;
            L(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        ob.a.g((z10 && this.f18463j == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f18467n == z10) {
            return;
        }
        this.f18467n = z10;
        if (N()) {
            this.f18463j.setPlayer(this.f18466m);
        } else {
            PlayerControlView playerControlView = this.f18463j;
            if (playerControlView != null) {
                playerControlView.A();
                this.f18463j.setPlayer(null);
            }
        }
        I();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f18457d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public void u() {
        PlayerControlView playerControlView = this.f18463j;
        if (playerControlView != null) {
            playerControlView.A();
        }
    }

    protected void y(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        boolean z10;
        int i12;
        int integer;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        int i16;
        boolean z17;
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f18454a = aVar;
        if (isInEditMode()) {
            this.f18455b = null;
            this.f18456c = null;
            this.f18457d = null;
            this.f18458e = false;
            this.f18459f = null;
            this.f18460g = null;
            this.f18461h = null;
            this.f18462i = null;
            this.f18463j = null;
            this.f18464k = null;
            this.f18465l = null;
            ImageView imageView = new ImageView(context);
            if (r0.f48425a >= 23) {
                r(context, getResources(), imageView);
            } else {
                q(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = mb.o.f45480c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, mb.s.H, i10, 0);
            try {
                int i18 = mb.s.R;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i18);
                int color = typedArrayObtainStyledAttributes.getColor(i18, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(mb.s.N, i17);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(mb.s.T, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(mb.s.J, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(mb.s.U, true);
                int i19 = typedArrayObtainStyledAttributes.getInt(mb.s.S, 1);
                int i20 = typedArrayObtainStyledAttributes.getInt(mb.s.O, 0);
                int i21 = typedArrayObtainStyledAttributes.getInt(mb.s.Q, 5000);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(mb.s.L, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(mb.s.I, true);
                integer = typedArrayObtainStyledAttributes.getInteger(mb.s.P, 0);
                this.f18472s = typedArrayObtainStyledAttributes.getBoolean(mb.s.M, this.f18472s);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(mb.s.K, true);
                typedArrayObtainStyledAttributes.recycle();
                i17 = resourceId;
                i11 = i21;
                z11 = z22;
                z12 = z20;
                z10 = z21;
                i12 = i20;
                z15 = zHasValue;
                i14 = color;
                i13 = i19;
                z14 = z19;
                i15 = resourceId2;
                z13 = z18;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            z10 = true;
            i12 = 0;
            integer = 0;
            z11 = true;
            z12 = true;
            i13 = 1;
            i14 = 0;
            z13 = true;
            i15 = 0;
            z14 = true;
            z15 = false;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(mb.m.f45458i);
        this.f18455b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            B(aspectRatioFrameLayout, i12);
        }
        View viewFindViewById = findViewById(mb.m.O);
        this.f18456c = viewFindViewById;
        if (viewFindViewById != null && z15) {
            viewFindViewById.setBackgroundColor(i14);
        }
        if (aspectRatioFrameLayout == null || i13 == 0) {
            this.f18457d = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 != 2) {
                if (i13 == 3) {
                    try {
                        int i22 = qb.l.f50581m;
                        this.f18457d = (View) qb.l.class.getConstructor(Context.class).newInstance(context);
                        z17 = true;
                    } catch (Exception e10) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                } else if (i13 != 4) {
                    this.f18457d = new SurfaceView(context);
                } else {
                    try {
                        int i23 = pb.i.f49920b;
                        this.f18457d = (View) pb.i.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e11) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
                this.f18457d.setLayoutParams(layoutParams);
                this.f18457d.setOnClickListener(aVar);
                this.f18457d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f18457d, 0);
                z16 = z17;
            } else {
                this.f18457d = new TextureView(context);
            }
            z17 = false;
            this.f18457d.setLayoutParams(layoutParams);
            this.f18457d.setOnClickListener(aVar);
            this.f18457d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f18457d, 0);
            z16 = z17;
        }
        this.f18458e = z16;
        this.f18464k = (FrameLayout) findViewById(mb.m.f45450a);
        this.f18465l = (FrameLayout) findViewById(mb.m.A);
        ImageView imageView2 = (ImageView) findViewById(mb.m.f45451b);
        this.f18459f = imageView2;
        this.f18469p = z13 && imageView2 != null;
        if (i15 != 0) {
            this.f18470q = androidx.core.content.a.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(mb.m.R);
        this.f18460g = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(mb.m.f45455f);
        this.f18461h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f18471r = integer;
        TextView textView = (TextView) findViewById(mb.m.f45463n);
        this.f18462i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i24 = mb.m.f45459j;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i24);
        View viewFindViewById3 = findViewById(mb.m.f45460k);
        if (playerControlView != null) {
            this.f18463j = playerControlView;
            i16 = 0;
        } else if (viewFindViewById3 != null) {
            i16 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f18463j = playerControlView2;
            playerControlView2.setId(i24);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i16 = 0;
            this.f18463j = null;
        }
        PlayerControlView playerControlView3 = this.f18463j;
        this.f18474u = playerControlView3 != null ? i11 : i16;
        this.f18477x = z12;
        this.f18475v = z10;
        this.f18476w = z11;
        this.f18467n = (!z14 || playerControlView3 == null) ? i16 : 1;
        if (playerControlView3 != null) {
            playerControlView3.A();
            this.f18463j.w(aVar);
        }
        if (z14) {
            setClickable(true);
        }
        I();
    }
}

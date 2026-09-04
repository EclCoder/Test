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
import com.google.api.client.googleapis.media.MediaHttpUploader;
import java.util.ArrayList;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class StyledPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f18555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f18556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f18557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f18559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SubtitleView f18560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f18561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f18562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final StyledPlayerControlView f18563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final FrameLayout f18564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f18565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private x1 f18566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private StyledPlayerControlView.m f18568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f18570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f18572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f18573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f18575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f18578y;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements x1.d, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.m, StyledPlayerControlView.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h2.b f18579a = new h2.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f18580b;

        public a() {
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void H(i2 i2Var) {
            x1 x1Var = (x1) ob.a.e(StyledPlayerView.this.f18566m);
            h2 currentTimeline = x1Var.t(17) ? x1Var.getCurrentTimeline() : h2.f16987a;
            if (currentTimeline.u()) {
                this.f18580b = null;
            } else if (!x1Var.t(30) || x1Var.e().c()) {
                Object obj = this.f18580b;
                if (obj != null) {
                    int iF = currentTimeline.f(obj);
                    if (iF != -1) {
                        if (x1Var.l() == currentTimeline.j(iF, this.f18579a).f17000c) {
                            return;
                        }
                    }
                    this.f18580b = null;
                }
            } else {
                this.f18580b = currentTimeline.k(x1Var.getCurrentPeriodIndex(), this.f18579a, true).f16999b;
            }
            StyledPlayerView.this.N(false);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerView.this.H();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            StyledPlayerView.q((TextureView) view, StyledPlayerView.this.f18578y);
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            StyledPlayerView.this.J();
            StyledPlayerView.this.L();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onPlaybackStateChanged(int i10) {
            StyledPlayerView.this.J();
            StyledPlayerView.this.M();
            StyledPlayerView.this.L();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onRenderedFirstFrame() {
            if (StyledPlayerView.this.f18556c != null) {
                StyledPlayerView.this.f18556c.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.m
        public void q(int i10) {
            StyledPlayerView.this.K();
            StyledPlayerView.g(StyledPlayerView.this);
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void s(bb.f fVar) {
            if (StyledPlayerView.this.f18560g != null) {
                StyledPlayerView.this.f18560g.setCues(fVar.f8779a);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.d
        public void u(boolean z10) {
            StyledPlayerView.h(StyledPlayerView.this);
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void w(pb.z zVar) {
            if (zVar.equals(pb.z.f49991e) || StyledPlayerView.this.f18566m == null || StyledPlayerView.this.f18566m.getPlaybackState() == 1) {
                return;
            }
            StyledPlayerView.this.I();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void x(x1.e eVar, x1.e eVar2, int i10) {
            if (StyledPlayerView.this.y() && StyledPlayerView.this.f18576w) {
                StyledPlayerView.this.w();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean B(x1 x1Var) {
        byte[] bArr;
        if (x1Var.t(18) && (bArr = x1Var.I().f19162j) != null) {
            return C(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
        }
        return false;
    }

    private boolean C(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f18569p == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                A(this.f18555b, width);
                this.f18559f.setScaleType(scaleType);
                this.f18559f.setImageDrawable(drawable);
                this.f18559f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void D(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean E() {
        x1 x1Var = this.f18566m;
        if (x1Var == null) {
            return true;
        }
        int playbackState = x1Var.getPlaybackState();
        if (!this.f18575v) {
            return false;
        }
        if (this.f18566m.t(17) && this.f18566m.getCurrentTimeline().u()) {
            return false;
        }
        return playbackState == 1 || playbackState == 4 || !((x1) ob.a.e(this.f18566m)).getPlayWhenReady();
    }

    private void G(boolean z10) {
        if (P()) {
            this.f18563j.setShowTimeoutMs(z10 ? 0 : this.f18574u);
            this.f18563j.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        if (!P() || this.f18566m == null) {
            return;
        }
        if (!this.f18563j.b0()) {
            z(true);
        } else if (this.f18577x) {
            this.f18563j.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        x1 x1Var = this.f18566m;
        pb.z zVarI = x1Var != null ? x1Var.i() : pb.z.f49991e;
        int i10 = zVarI.f49997a;
        int i11 = zVarI.f49998b;
        int i12 = zVarI.f49999c;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * zVarI.f50000d) / i11;
        View view = this.f18557d;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.f18578y != 0) {
                view.removeOnLayoutChangeListener(this.f18554a);
            }
            this.f18578y = i12;
            if (i12 != 0) {
                this.f18557d.addOnLayoutChangeListener(this.f18554a);
            }
            q((TextureView) this.f18557d, this.f18578y);
        }
        A(this.f18555b, this.f18558e ? 0.0f : f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void J() {
        boolean z10;
        if (this.f18561h != null) {
            x1 x1Var = this.f18566m;
            if (x1Var == null || x1Var.getPlaybackState() != 2) {
                z10 = false;
            } else {
                int i10 = this.f18571r;
                z10 = true;
                if (i10 != 2 && (i10 != 1 || !this.f18566m.getPlayWhenReady())) {
                    z10 = false;
                }
            }
            this.f18561h.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        StyledPlayerControlView styledPlayerControlView = this.f18563j;
        if (styledPlayerControlView == null || !this.f18567n) {
            setContentDescription(null);
        } else if (styledPlayerControlView.b0()) {
            setContentDescription(this.f18577x ? getResources().getString(mb.q.f45492e) : null);
        } else {
            setContentDescription(getResources().getString(mb.q.f45499l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (y() && this.f18576w) {
            w();
        } else {
            z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        TextView textView = this.f18562i;
        if (textView != null) {
            CharSequence charSequence = this.f18573t;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f18562i.setVisibility(0);
            } else {
                x1 x1Var = this.f18566m;
                if (x1Var != null) {
                    x1Var.d();
                }
                this.f18562i.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z10) {
        x1 x1Var = this.f18566m;
        if (x1Var == null || !x1Var.t(30) || x1Var.e().c()) {
            if (this.f18572s) {
                return;
            }
            v();
            r();
            return;
        }
        if (z10 && !this.f18572s) {
            r();
        }
        if (x1Var.e().d(2)) {
            v();
            return;
        }
        r();
        if (O() && (B(x1Var) || C(this.f18570q))) {
            return;
        }
        v();
    }

    private boolean O() {
        if (this.f18569p == 0) {
            return false;
        }
        ob.a.i(this.f18559f);
        return true;
    }

    private boolean P() {
        if (!this.f18567n) {
            return false;
        }
        ob.a.i(this.f18563j);
        return true;
    }

    static /* synthetic */ b g(StyledPlayerView styledPlayerView) {
        styledPlayerView.getClass();
        return null;
    }

    static /* synthetic */ c h(StyledPlayerView styledPlayerView) {
        styledPlayerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(TextureView textureView, int i10) {
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

    private void r() {
        View view = this.f18556c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void s(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(r0.W(context, resources, mb.k.f45435f));
        imageView.setBackgroundColor(resources.getColor(mb.i.f45425a));
    }

    private static void t(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(r0.W(context, resources, mb.k.f45435f));
        imageView.setBackgroundColor(resources.getColor(mb.i.f45425a, null));
    }

    private void v() {
        ImageView imageView = this.f18559f;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f18559f.setVisibility(4);
        }
    }

    private boolean x(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        x1 x1Var = this.f18566m;
        return x1Var != null && x1Var.t(16) && this.f18566m.isPlayingAd() && this.f18566m.getPlayWhenReady();
    }

    private void z(boolean z10) {
        if (!(y() && this.f18576w) && P()) {
            boolean z11 = this.f18563j.b0() && this.f18563j.getShowTimeoutMs() <= 0;
            boolean zE = E();
            if (z10 || z11 || zE) {
                G(zE);
            }
        }
    }

    protected void A(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void F() {
        G(E());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        x1 x1Var = this.f18566m;
        if (x1Var != null && x1Var.t(16) && this.f18566m.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zX = x(keyEvent.getKeyCode());
        if (zX && P() && !this.f18563j.b0()) {
            z(true);
            return true;
        }
        if (u(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            z(true);
            return true;
        }
        if (zX && P()) {
            z(true);
        }
        return false;
    }

    public List<mb.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f18565l;
        if (frameLayout != null) {
            arrayList.add(new mb.a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        StyledPlayerControlView styledPlayerControlView = this.f18563j;
        if (styledPlayerControlView != null) {
            arrayList.add(new mb.a(styledPlayerControlView, 1));
        }
        return com.google.common.collect.c0.x(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) ob.a.j(this.f18564k, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f18569p;
    }

    public boolean getControllerAutoShow() {
        return this.f18575v;
    }

    public boolean getControllerHideOnTouch() {
        return this.f18577x;
    }

    public int getControllerShowTimeoutMs() {
        return this.f18574u;
    }

    public Drawable getDefaultArtwork() {
        return this.f18570q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f18565l;
    }

    public x1 getPlayer() {
        return this.f18566m;
    }

    public int getResizeMode() {
        ob.a.i(this.f18555b);
        return this.f18555b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f18560g;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f18569p != 0;
    }

    public boolean getUseController() {
        return this.f18567n;
    }

    public View getVideoSurfaceView() {
        return this.f18557d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!P() || this.f18566m == null) {
            return false;
        }
        z(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        H();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        ob.a.g(i10 == 0 || this.f18559f != null);
        if (this.f18569p != i10) {
            this.f18569p = i10;
            N(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        ob.a.i(this.f18555b);
        this.f18555b.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f18575v = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f18576w = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18577x = z10;
        K();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(StyledPlayerControlView.d dVar) {
        ob.a.i(this.f18563j);
        this.f18563j.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        ob.a.i(this.f18563j);
        this.f18574u = i10;
        if (this.f18563j.b0()) {
            F();
        }
    }

    public void setControllerVisibilityListener(b bVar) {
        if (bVar != null) {
            setControllerVisibilityListener((StyledPlayerControlView.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        ob.a.g(this.f18562i != null);
        this.f18573t = charSequence;
        M();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f18570q != drawable) {
            this.f18570q = drawable;
            N(false);
        }
    }

    public void setErrorMessageProvider(ob.m mVar) {
        if (mVar != null) {
            M();
        }
    }

    public void setFullscreenButtonClickListener(c cVar) {
        ob.a.i(this.f18563j);
        this.f18563j.setOnFullScreenModeChangedListener(this.f18554a);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f18572s != z10) {
            this.f18572s = z10;
            N(false);
        }
    }

    public void setPlayer(x1 x1Var) {
        ob.a.g(Looper.myLooper() == Looper.getMainLooper());
        ob.a.a(x1Var == null || x1Var.w() == Looper.getMainLooper());
        x1 x1Var2 = this.f18566m;
        if (x1Var2 == x1Var) {
            return;
        }
        if (x1Var2 != null) {
            x1Var2.o(this.f18554a);
            if (x1Var2.t(27)) {
                View view = this.f18557d;
                if (view instanceof TextureView) {
                    x1Var2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    x1Var2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f18560g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f18566m = x1Var;
        if (P()) {
            this.f18563j.setPlayer(x1Var);
        }
        J();
        M();
        N(true);
        if (x1Var == null) {
            w();
            return;
        }
        if (x1Var.t(27)) {
            View view2 = this.f18557d;
            if (view2 instanceof TextureView) {
                x1Var.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                x1Var.setVideoSurfaceView((SurfaceView) view2);
            }
            if (!x1Var.t(30) || x1Var.e().e(2)) {
                I();
            }
        }
        if (this.f18560g != null && x1Var.t(28)) {
            this.f18560g.setCues(x1Var.s().f8779a);
        }
        x1Var.E(this.f18554a);
        z(false);
    }

    public void setRepeatToggleModes(int i10) {
        ob.a.i(this.f18563j);
        this.f18563j.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        ob.a.i(this.f18555b);
        this.f18555b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f18571r != i10) {
            this.f18571r = i10;
            J();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18563j.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18563j.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18563j.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18563j.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18563j.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18563j.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18563j.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        ob.a.i(this.f18563j);
        this.f18563j.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f18556c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        ob.a.g((z10 && this.f18563j == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f18567n == z10) {
            return;
        }
        this.f18567n = z10;
        if (P()) {
            this.f18563j.setPlayer(this.f18566m);
        } else {
            StyledPlayerControlView styledPlayerControlView = this.f18563j;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.X();
                this.f18563j.setPlayer(null);
            }
        }
        K();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f18557d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public boolean u(KeyEvent keyEvent) {
        return P() && this.f18563j.T(keyEvent);
    }

    public void w() {
        StyledPlayerControlView styledPlayerControlView = this.f18563j;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.X();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        boolean z15;
        boolean z16;
        int i18;
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f18554a = aVar;
        if (isInEditMode()) {
            this.f18555b = null;
            this.f18556c = null;
            this.f18557d = null;
            this.f18558e = false;
            this.f18559f = null;
            this.f18560g = null;
            this.f18561h = null;
            this.f18562i = null;
            this.f18563j = null;
            this.f18564k = null;
            this.f18565l = null;
            ImageView imageView = new ImageView(context);
            if (r0.f48425a >= 23) {
                t(context, getResources(), imageView);
            } else {
                s(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i19 = mb.o.f45482e;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, mb.s.f45534j0, i10, 0);
            try {
                int i20 = mb.s.f45556u0;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i20);
                int color = typedArrayObtainStyledAttributes.getColor(i20, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(mb.s.f45548q0, i19);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45560w0, true);
                int i21 = typedArrayObtainStyledAttributes.getInt(mb.s.f45536k0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(mb.s.f45540m0, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45562x0, true);
                int i22 = typedArrayObtainStyledAttributes.getInt(mb.s.f45558v0, 1);
                int i23 = typedArrayObtainStyledAttributes.getInt(mb.s.f45550r0, 0);
                int i24 = typedArrayObtainStyledAttributes.getInt(mb.s.f45554t0, 5000);
                z11 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45544o0, true);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45538l0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(mb.s.f45552s0, 0);
                this.f18572s = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45546p0, this.f18572s);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45542n0, true);
                typedArrayObtainStyledAttributes.recycle();
                z10 = z19;
                i13 = integer;
                z15 = zHasValue;
                i15 = resourceId2;
                z13 = z17;
                i16 = color;
                i14 = i23;
                z12 = z20;
                i19 = resourceId;
                i11 = i24;
                i12 = i22;
                z14 = z18;
                i17 = i21;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            z10 = true;
            z11 = true;
            z12 = true;
            i12 = 1;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            z13 = true;
            i17 = 1;
            z14 = true;
            z15 = false;
        }
        LayoutInflater.from(context).inflate(i19, this);
        setDescendantFocusability(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(mb.m.f45458i);
        this.f18555b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            D(aspectRatioFrameLayout, i14);
        }
        View viewFindViewById = findViewById(mb.m.O);
        this.f18556c = viewFindViewById;
        if (viewFindViewById != null && z15) {
            viewFindViewById.setBackgroundColor(i16);
        }
        if (aspectRatioFrameLayout == null || i12 == 0) {
            this.f18557d = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i12 != 2) {
                if (i12 == 3) {
                    try {
                        int i25 = qb.l.f50581m;
                        this.f18557d = (View) qb.l.class.getConstructor(Context.class).newInstance(context);
                        z16 = true;
                    } catch (Exception e10) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                } else if (i12 != 4) {
                    this.f18557d = new SurfaceView(context);
                } else {
                    try {
                        int i26 = pb.i.f49920b;
                        this.f18557d = (View) pb.i.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e11) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
                this.f18557d.setLayoutParams(layoutParams);
                this.f18557d.setOnClickListener(aVar);
                this.f18557d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f18557d, 0);
            } else {
                this.f18557d = new TextureView(context);
            }
            z16 = false;
            this.f18557d.setLayoutParams(layoutParams);
            this.f18557d.setOnClickListener(aVar);
            this.f18557d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f18557d, 0);
        }
        this.f18558e = z16;
        this.f18564k = (FrameLayout) findViewById(mb.m.f45450a);
        this.f18565l = (FrameLayout) findViewById(mb.m.A);
        ImageView imageView2 = (ImageView) findViewById(mb.m.f45451b);
        this.f18559f = imageView2;
        this.f18569p = (!z13 || i17 == 0 || imageView2 == null) ? 0 : i17;
        if (i15 != 0) {
            this.f18570q = androidx.core.content.a.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(mb.m.R);
        this.f18560g = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(mb.m.f45455f);
        this.f18561h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f18571r = i13;
        TextView textView = (TextView) findViewById(mb.m.f45463n);
        this.f18562i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i27 = mb.m.f45459j;
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(i27);
        View viewFindViewById3 = findViewById(mb.m.f45460k);
        if (styledPlayerControlView != null) {
            this.f18563j = styledPlayerControlView;
            i18 = 0;
        } else if (viewFindViewById3 != null) {
            i18 = 0;
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attributeSet);
            this.f18563j = styledPlayerControlView2;
            styledPlayerControlView2.setId(i27);
            styledPlayerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(styledPlayerControlView2, iIndexOfChild);
        } else {
            i18 = 0;
            this.f18563j = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.f18563j;
        this.f18574u = styledPlayerControlView3 != null ? i11 : i18;
        this.f18577x = z11;
        this.f18575v = z10;
        this.f18576w = z12;
        this.f18567n = (!z14 || styledPlayerControlView3 == null) ? i18 : 1;
        if (styledPlayerControlView3 != null) {
            styledPlayerControlView3.Y();
            this.f18563j.R(aVar);
        }
        if (z14) {
            setClickable(true);
        }
        K();
    }

    @Deprecated
    public void setControllerVisibilityListener(StyledPlayerControlView.m mVar) {
        ob.a.i(this.f18563j);
        StyledPlayerControlView.m mVar2 = this.f18568o;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f18563j.i0(mVar2);
        }
        this.f18568o = mVar;
        if (mVar != null) {
            this.f18563j.R(mVar);
            setControllerVisibilityListener((b) null);
        }
    }
}

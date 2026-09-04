package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.x1;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import ob.f0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class PlayerControlView extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    private x1 G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private long T;
    private long[] U;
    private boolean[] V;
    private long[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f18423a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean[] f18424a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f18425b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f18426b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f18427c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f18428c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f18429d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f18430d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f18431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f18432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f18433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f18434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageView f18435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageView f18436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f18437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final TextView f18438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TextView f18439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c0 f18440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StringBuilder f18441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Formatter f18442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final h2.b f18443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h2.d f18444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f18445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f18446t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Drawable f18447u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Drawable f18448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Drawable f18449w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f18450x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f18451y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f18452z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements x1.d, c0.a, View.OnClickListener {
        private c() {
        }

        @Override // com.google.android.exoplayer2.ui.c0.a
        public void E(c0 c0Var, long j10) {
            PlayerControlView.this.K = true;
            if (PlayerControlView.this.f18439m != null) {
                PlayerControlView.this.f18439m.setText(r0.k0(PlayerControlView.this.f18441o, PlayerControlView.this.f18442p, j10));
            }
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void L(x1 x1Var, x1.c cVar) {
            if (cVar.b(4, 5)) {
                PlayerControlView.this.O();
            }
            if (cVar.b(4, 5, 7)) {
                PlayerControlView.this.P();
            }
            if (cVar.a(8)) {
                PlayerControlView.this.Q();
            }
            if (cVar.a(9)) {
                PlayerControlView.this.R();
            }
            if (cVar.b(8, 9, 11, 0, 13)) {
                PlayerControlView.this.N();
            }
            if (cVar.b(11, 0)) {
                PlayerControlView.this.S();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x1 x1Var = PlayerControlView.this.G;
            if (x1Var == null) {
                return;
            }
            if (PlayerControlView.this.f18429d == view) {
                x1Var.y();
                return;
            }
            if (PlayerControlView.this.f18427c == view) {
                x1Var.r();
                return;
            }
            if (PlayerControlView.this.f18433g == view) {
                if (x1Var.getPlaybackState() != 4) {
                    x1Var.G();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f18434h == view) {
                x1Var.H();
                return;
            }
            if (PlayerControlView.this.f18431e == view) {
                r0.s0(x1Var);
                return;
            }
            if (PlayerControlView.this.f18432f == view) {
                r0.r0(x1Var);
            } else if (PlayerControlView.this.f18435i == view) {
                x1Var.setRepeatMode(f0.a(x1Var.getRepeatMode(), PlayerControlView.this.N));
            } else if (PlayerControlView.this.f18436j == view) {
                x1Var.setShuffleModeEnabled(!x1Var.getShuffleModeEnabled());
            }
        }

        @Override // com.google.android.exoplayer2.ui.c0.a
        public void q(c0 c0Var, long j10) {
            if (PlayerControlView.this.f18439m != null) {
                PlayerControlView.this.f18439m.setText(r0.k0(PlayerControlView.this.f18441o, PlayerControlView.this.f18442p, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.c0.a
        public void u(c0 c0Var, long j10, boolean z10) {
            PlayerControlView.this.K = false;
            if (z10 || PlayerControlView.this.G == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.I(playerControlView.G, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void q(int i10);
    }

    static {
        o9.n.a("goog.exo.ui");
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        removeCallbacks(this.f18446t);
        if (this.L <= 0) {
            this.T = C.TIME_UNSET;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.L;
        this.T = jUptimeMillis + ((long) i10);
        if (this.H) {
            postDelayed(this.f18446t, i10);
        }
    }

    private static boolean C(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    private void F() {
        View view;
        View view2;
        boolean zX0 = r0.X0(this.G);
        if (zX0 && (view2 = this.f18431e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zX0 || (view = this.f18432f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void G() {
        View view;
        View view2;
        boolean zX0 = r0.X0(this.G);
        if (zX0 && (view2 = this.f18431e) != null) {
            view2.requestFocus();
        } else {
            if (zX0 || (view = this.f18432f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void H(x1 x1Var, int i10, long j10) {
        x1Var.seekTo(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(x1 x1Var, long j10) {
        int iL;
        h2 currentTimeline = x1Var.getCurrentTimeline();
        if (this.J && !currentTimeline.u()) {
            int iT = currentTimeline.t();
            iL = 0;
            while (true) {
                long jF = currentTimeline.r(iL, this.f18444r).f();
                if (j10 < jF) {
                    break;
                }
                if (iL == iT - 1) {
                    j10 = jF;
                    break;
                } else {
                    j10 -= jF;
                    iL++;
                }
            }
        } else {
            iL = x1Var.l();
        }
        H(x1Var, iL, j10);
        P();
    }

    private void L() {
        O();
        N();
        Q();
        R();
        S();
    }

    private void M(boolean z10, boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.C : this.D);
        view.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        boolean zT;
        boolean zT2;
        boolean zT3;
        boolean zT4;
        boolean zT5;
        if (D() && this.H) {
            x1 x1Var = this.G;
            if (x1Var != null) {
                zT = x1Var.t(5);
                zT3 = x1Var.t(7);
                zT4 = x1Var.t(11);
                zT5 = x1Var.t(12);
                zT2 = x1Var.t(9);
            } else {
                zT = false;
                zT2 = false;
                zT3 = false;
                zT4 = false;
                zT5 = false;
            }
            M(this.Q, zT3, this.f18427c);
            M(this.O, zT4, this.f18434h);
            M(this.P, zT5, this.f18433g);
            M(this.R, zT2, this.f18429d);
            c0 c0Var = this.f18440n;
            if (c0Var != null) {
                c0Var.setEnabled(zT);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        boolean z10;
        boolean z11;
        if (D() && this.H) {
            boolean zX0 = r0.X0(this.G);
            View view = this.f18431e;
            boolean z12 = true;
            if (view != null) {
                z10 = !zX0 && view.isFocused();
                if (r0.f48425a < 21) {
                    z11 = z10;
                } else {
                    z11 = !zX0 && b.a(this.f18431e);
                }
                this.f18431e.setVisibility(zX0 ? 0 : 8);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f18432f;
            if (view2 != null) {
                z10 |= zX0 && view2.isFocused();
                if (r0.f48425a < 21) {
                    z12 = z10;
                } else if (!zX0 || !b.a(this.f18432f)) {
                    z12 = false;
                }
                z11 |= z12;
                this.f18432f.setVisibility(zX0 ? 8 : 0);
            }
            if (z10) {
                G();
            }
            if (z11) {
                F();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        long contentPosition;
        long jF;
        if (D() && this.H) {
            x1 x1Var = this.G;
            if (x1Var != null) {
                contentPosition = this.f18426b0 + x1Var.getContentPosition();
                jF = this.f18426b0 + x1Var.F();
            } else {
                contentPosition = 0;
                jF = 0;
            }
            boolean z10 = contentPosition != this.f18428c0;
            this.f18428c0 = contentPosition;
            this.f18430d0 = jF;
            TextView textView = this.f18439m;
            if (textView != null && !this.K && z10) {
                textView.setText(r0.k0(this.f18441o, this.f18442p, contentPosition));
            }
            c0 c0Var = this.f18440n;
            if (c0Var != null) {
                c0Var.setPosition(contentPosition);
                this.f18440n.setBufferedPosition(jF);
            }
            removeCallbacks(this.f18445s);
            int playbackState = x1Var == null ? 1 : x1Var.getPlaybackState();
            if (x1Var == null || !x1Var.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f18445s, 1000L);
                return;
            }
            c0 c0Var2 = this.f18440n;
            long jMin = Math.min(c0Var2 != null ? c0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f10 = x1Var.getPlaybackParameters().f18942a;
            postDelayed(this.f18445s, r0.r(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.M, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        ImageView imageView;
        if (D() && this.H && (imageView = this.f18435i) != null) {
            if (this.N == 0) {
                M(false, false, imageView);
                return;
            }
            x1 x1Var = this.G;
            if (x1Var == null) {
                M(true, false, imageView);
                this.f18435i.setImageDrawable(this.f18447u);
                this.f18435i.setContentDescription(this.f18450x);
                return;
            }
            M(true, true, imageView);
            int repeatMode = x1Var.getRepeatMode();
            if (repeatMode == 0) {
                this.f18435i.setImageDrawable(this.f18447u);
                this.f18435i.setContentDescription(this.f18450x);
            } else if (repeatMode == 1) {
                this.f18435i.setImageDrawable(this.f18448v);
                this.f18435i.setContentDescription(this.f18451y);
            } else if (repeatMode == 2) {
                this.f18435i.setImageDrawable(this.f18449w);
                this.f18435i.setContentDescription(this.f18452z);
            }
            this.f18435i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        ImageView imageView;
        if (D() && this.H && (imageView = this.f18436j) != null) {
            x1 x1Var = this.G;
            if (!this.S) {
                M(false, false, imageView);
                return;
            }
            if (x1Var == null) {
                M(true, false, imageView);
                this.f18436j.setImageDrawable(this.B);
                this.f18436j.setContentDescription(this.F);
            } else {
                M(true, true, imageView);
                this.f18436j.setImageDrawable(x1Var.getShuffleModeEnabled() ? this.A : this.B);
                this.f18436j.setContentDescription(x1Var.getShuffleModeEnabled() ? this.E : this.F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        int i10;
        h2.d dVar;
        long j10;
        x1 x1Var = this.G;
        if (x1Var == null) {
            return;
        }
        boolean z10 = true;
        this.J = this.I && x(x1Var.getCurrentTimeline(), this.f18444r);
        long j11 = 0;
        this.f18426b0 = 0L;
        h2 currentTimeline = x1Var.getCurrentTimeline();
        if (currentTimeline.u()) {
            i10 = 0;
        } else {
            int iL = x1Var.l();
            boolean z11 = this.J;
            int i11 = z11 ? 0 : iL;
            int iT = z11 ? currentTimeline.t() - 1 : iL;
            i10 = 0;
            long j12 = 0;
            while (i11 <= iT) {
                if (i11 == iL) {
                    this.f18426b0 = r0.i1(j12);
                }
                currentTimeline.r(i11, this.f18444r);
                h2.d dVar2 = this.f18444r;
                if (dVar2.f17031n == C.TIME_UNSET) {
                    ob.a.g(this.J ^ z10);
                    break;
                }
                int i12 = dVar2.f17032o;
                while (true) {
                    dVar = this.f18444r;
                    if (i12 <= dVar.f17033p) {
                        currentTimeline.j(i12, this.f18443q);
                        int iR = this.f18443q.r();
                        int iF = this.f18443q.f();
                        while (iR < iF) {
                            long jI = this.f18443q.i(iR);
                            if (jI == Long.MIN_VALUE) {
                                j10 = j11;
                                long j13 = this.f18443q.f17001d;
                                if (j13 != C.TIME_UNSET) {
                                    jI = j13;
                                }
                                iR++;
                                j11 = j10;
                            } else {
                                j10 = j11;
                            }
                            long jQ = jI + this.f18443q.q();
                            if (jQ >= j10) {
                                long[] jArr = this.U;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.U = Arrays.copyOf(jArr, length);
                                    this.V = Arrays.copyOf(this.V, length);
                                }
                                this.U[i10] = r0.i1(j12 + jQ);
                                this.V[i10] = this.f18443q.s(iR);
                                i10++;
                            }
                            iR++;
                            j11 = j10;
                        }
                        i12++;
                    }
                }
                j12 += dVar.f17031n;
                i11++;
                j11 = j11;
                z10 = true;
            }
            j11 = j12;
        }
        long jI1 = r0.i1(j11);
        TextView textView = this.f18438l;
        if (textView != null) {
            textView.setText(r0.k0(this.f18441o, this.f18442p, jI1));
        }
        c0 c0Var = this.f18440n;
        if (c0Var != null) {
            c0Var.setDuration(jI1);
            int length2 = this.W.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.U;
            if (i13 > jArr2.length) {
                this.U = Arrays.copyOf(jArr2, i13);
                this.V = Arrays.copyOf(this.V, i13);
            }
            System.arraycopy(this.W, 0, this.U, i10, length2);
            System.arraycopy(this.f18424a0, 0, this.V, i10, length2);
            this.f18440n.b(this.U, this.V, i13);
        }
        P();
    }

    private static boolean x(h2 h2Var, h2.d dVar) {
        if (h2Var.t() > 100) {
            return false;
        }
        int iT = h2Var.t();
        for (int i10 = 0; i10 < iT; i10++) {
            if (h2Var.r(i10, dVar).f17031n == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private static int z(TypedArray typedArray, int i10) {
        return typedArray.getInt(mb.s.f45564z, i10);
    }

    public void A() {
        if (D()) {
            setVisibility(8);
            Iterator it = this.f18425b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).q(getVisibility());
            }
            removeCallbacks(this.f18445s);
            removeCallbacks(this.f18446t);
            this.T = C.TIME_UNSET;
        }
    }

    public boolean D() {
        return getVisibility() == 0;
    }

    public void E(e eVar) {
        this.f18425b.remove(eVar);
    }

    public void J(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.W = new long[0];
            this.f18424a0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) ob.a.e(zArr);
            ob.a.a(jArr.length == zArr2.length);
            this.W = jArr;
            this.f18424a0 = zArr2;
        }
        S();
    }

    public void K() {
        if (!D()) {
            setVisibility(0);
            Iterator it = this.f18425b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).q(getVisibility());
            }
            L();
            G();
            F();
        }
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return y(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f18446t);
        } else if (motionEvent.getAction() == 1) {
            B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public x1 getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.N;
    }

    public boolean getShowShuffleButton() {
        return this.S;
    }

    public int getShowTimeoutMs() {
        return this.L;
    }

    public boolean getShowVrButton() {
        View view = this.f18437k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
        long j10 = this.T;
        if (j10 != C.TIME_UNSET) {
            long jUptimeMillis = j10 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                A();
            } else {
                postDelayed(this.f18446t, jUptimeMillis);
            }
        } else if (D()) {
            B();
        }
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        removeCallbacks(this.f18445s);
        removeCallbacks(this.f18446t);
    }

    public void setPlayer(x1 x1Var) {
        ob.a.g(Looper.myLooper() == Looper.getMainLooper());
        ob.a.a(x1Var == null || x1Var.w() == Looper.getMainLooper());
        x1 x1Var2 = this.G;
        if (x1Var2 == x1Var) {
            return;
        }
        if (x1Var2 != null) {
            x1Var2.o(this.f18423a);
        }
        this.G = x1Var;
        if (x1Var != null) {
            x1Var.E(this.f18423a);
        }
        L();
    }

    public void setRepeatToggleModes(int i10) {
        this.N = i10;
        x1 x1Var = this.G;
        if (x1Var != null) {
            int repeatMode = x1Var.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.G.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.G.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.G.setRepeatMode(2);
            }
        }
        Q();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.P = z10;
        N();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.I = z10;
        S();
    }

    public void setShowNextButton(boolean z10) {
        this.R = z10;
        N();
    }

    public void setShowPreviousButton(boolean z10) {
        this.Q = z10;
        N();
    }

    public void setShowRewindButton(boolean z10) {
        this.O = z10;
        N();
    }

    public void setShowShuffleButton(boolean z10) {
        this.S = z10;
        R();
    }

    public void setShowTimeoutMs(int i10) {
        this.L = i10;
        if (D()) {
            B();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f18437k;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.M = r0.q(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f18437k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            M(getShowVrButton(), onClickListener != null, this.f18437k);
        }
    }

    public void w(e eVar) {
        ob.a.e(eVar);
        this.f18425b.add(eVar);
    }

    public boolean y(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        x1 x1Var = this.G;
        if (x1Var == null || !C(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (x1Var.getPlaybackState() == 4) {
                return true;
            }
            x1Var.G();
            return true;
        }
        if (keyCode == 89) {
            x1Var.H();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            r0.t0(x1Var);
            return true;
        }
        if (keyCode == 87) {
            x1Var.y();
            return true;
        }
        if (keyCode == 88) {
            x1Var.r();
            return true;
        }
        if (keyCode == 126) {
            r0.s0(x1Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        r0.r0(x1Var);
        return true;
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int resourceId = mb.o.f45479b;
        this.L = 5000;
        this.N = 0;
        this.M = 200;
        this.T = C.TIME_UNSET;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, mb.s.f45561x, i10, 0);
            try {
                this.L = typedArrayObtainStyledAttributes.getInt(mb.s.F, this.L);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(mb.s.f45563y, resourceId);
                this.N = z(typedArrayObtainStyledAttributes, this.N);
                this.O = typedArrayObtainStyledAttributes.getBoolean(mb.s.D, this.O);
                this.P = typedArrayObtainStyledAttributes.getBoolean(mb.s.A, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(mb.s.C, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(mb.s.B, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(mb.s.E, this.S);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(mb.s.G, this.M));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f18425b = new CopyOnWriteArrayList();
        this.f18443q = new h2.b();
        this.f18444r = new h2.d();
        StringBuilder sb2 = new StringBuilder();
        this.f18441o = sb2;
        this.f18442p = new Formatter(sb2, Locale.getDefault());
        this.U = new long[0];
        this.V = new boolean[0];
        this.W = new long[0];
        this.f18424a0 = new boolean[0];
        c cVar = new c();
        this.f18423a = cVar;
        this.f18445s = new Runnable() { // from class: mb.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f45422a.P();
            }
        };
        this.f18446t = new Runnable() { // from class: mb.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f45423a.A();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        int i11 = mb.m.H;
        c0 c0Var = (c0) findViewById(i11);
        View viewFindViewById = findViewById(mb.m.I);
        if (c0Var != null) {
            this.f18440n = c0Var;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i11);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f18440n = defaultTimeBar;
        } else {
            this.f18440n = null;
        }
        this.f18438l = (TextView) findViewById(mb.m.f45462m);
        this.f18439m = (TextView) findViewById(mb.m.F);
        c0 c0Var2 = this.f18440n;
        if (c0Var2 != null) {
            c0Var2.a(cVar);
        }
        View viewFindViewById2 = findViewById(mb.m.C);
        this.f18431e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(mb.m.B);
        this.f18432f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        View viewFindViewById4 = findViewById(mb.m.G);
        this.f18427c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(cVar);
        }
        View viewFindViewById5 = findViewById(mb.m.f45473x);
        this.f18429d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(mb.m.K);
        this.f18434h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(mb.m.f45466q);
        this.f18433g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(mb.m.J);
        this.f18435i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(mb.m.N);
        this.f18436j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View viewFindViewById8 = findViewById(mb.m.U);
        this.f18437k = viewFindViewById8;
        setShowVrButton(false);
        M(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(mb.n.f45477b) / 100.0f;
        this.D = resources.getInteger(mb.n.f45476a) / 100.0f;
        this.f18447u = r0.W(context, resources, mb.k.f45431b);
        this.f18448v = r0.W(context, resources, mb.k.f45432c);
        this.f18449w = r0.W(context, resources, mb.k.f45430a);
        this.A = r0.W(context, resources, mb.k.f45434e);
        this.B = r0.W(context, resources, mb.k.f45433d);
        this.f18450x = resources.getString(mb.q.f45497j);
        this.f18451y = resources.getString(mb.q.f45498k);
        this.f18452z = resources.getString(mb.q.f45496i);
        this.E = resources.getString(mb.q.f45501n);
        this.F = resources.getString(mb.q.f45500m);
        this.f18428c0 = C.TIME_UNSET;
        this.f18430d0 = C.TIME_UNSET;
    }

    public void setProgressUpdateListener(d dVar) {
    }
}

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.x1;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import ob.f0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class StyledPlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final float[] f18482x0;
    private final View A;
    private final View B;
    private final TextView C;
    private final TextView D;
    private final c0 E;
    private final StringBuilder F;
    private final Formatter G;
    private final h2.b H;
    private final h2.d I;
    private final Runnable J;
    private final Drawable K;
    private final Drawable L;
    private final Drawable M;
    private final String N;
    private final String O;
    private final String P;
    private final Drawable Q;
    private final Drawable R;
    private final float S;
    private final float T;
    private final String U;
    private final String V;
    private final Drawable W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f18483a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Drawable f18484a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f18485b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final String f18486b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f18487c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final String f18488c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f18489d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Drawable f18490d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RecyclerView f18491e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Drawable f18492e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f18493f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final String f18494f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f18495g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final String f18496g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f18497h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private x1 f18498h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f18499i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private d f18500i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final mb.w f18501j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f18502j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PopupWindow f18503k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f18504k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f18505l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f18506l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f18507m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f18508m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f18509n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f18510n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final View f18511o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f18512o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final View f18513p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f18514p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f18515q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f18516q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f18517r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private long[] f18518r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TextView f18519s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean[] f18520s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f18521t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long[] f18522t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ImageView f18523u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean[] f18524u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View f18525v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f18526v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ImageView f18527w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f18528w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ImageView f18529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ImageView f18530y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final View f18531z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class b extends l {
        private b() {
            super();
        }

        public static /* synthetic */ void l(b bVar, View view) {
            if (StyledPlayerControlView.this.f18498h0 == null || !StyledPlayerControlView.this.f18498h0.t(29)) {
                return;
            }
            ((x1) r0.j(StyledPlayerControlView.this.f18498h0)).q(StyledPlayerControlView.this.f18498h0.x().A().B(1).J(1, false).A());
            StyledPlayerControlView.this.f18493f.i(1, StyledPlayerControlView.this.getResources().getString(mb.q.f45510w));
            StyledPlayerControlView.this.f18503k.dismiss();
        }

        private boolean m(lb.y yVar) {
            for (int i10 = 0; i10 < this.f18552a.size(); i10++) {
                if (yVar.f44264y.containsKey(((k) this.f18552a.get(i10)).f18549a.b())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void i(i iVar) {
            iVar.f18546b.setText(mb.q.f45510w);
            iVar.f18547c.setVisibility(m(((x1) ob.a.e(StyledPlayerControlView.this.f18498h0)).x()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.b.l(this.f18634a, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void k(String str) {
            StyledPlayerControlView.this.f18493f.i(1, str);
        }

        public void n(List list) {
            this.f18552a = list;
            lb.y yVarX = ((x1) ob.a.e(StyledPlayerControlView.this.f18498h0)).x();
            if (list.isEmpty()) {
                StyledPlayerControlView.this.f18493f.i(1, StyledPlayerControlView.this.getResources().getString(mb.q.f45511x));
                return;
            }
            if (!m(yVarX)) {
                StyledPlayerControlView.this.f18493f.i(1, StyledPlayerControlView.this.getResources().getString(mb.q.f45510w));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = (k) list.get(i10);
                if (kVar.a()) {
                    StyledPlayerControlView.this.f18493f.i(1, kVar.f18551c);
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements x1.d, c0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // com.google.android.exoplayer2.ui.c0.a
        public void E(c0 c0Var, long j10) {
            StyledPlayerControlView.this.f18510n0 = true;
            if (StyledPlayerControlView.this.D != null) {
                StyledPlayerControlView.this.D.setText(r0.k0(StyledPlayerControlView.this.F, StyledPlayerControlView.this.G, j10));
            }
            StyledPlayerControlView.this.f18483a.R();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void L(x1 x1Var, x1.c cVar) {
            if (cVar.b(4, 5, 13)) {
                StyledPlayerControlView.this.t0();
            }
            if (cVar.b(4, 5, 7, 13)) {
                StyledPlayerControlView.this.v0();
            }
            if (cVar.b(8, 13)) {
                StyledPlayerControlView.this.w0();
            }
            if (cVar.b(9, 13)) {
                StyledPlayerControlView.this.A0();
            }
            if (cVar.b(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.s0();
            }
            if (cVar.b(11, 0, 13)) {
                StyledPlayerControlView.this.B0();
            }
            if (cVar.b(12, 13)) {
                StyledPlayerControlView.this.u0();
            }
            if (cVar.b(2, 13)) {
                StyledPlayerControlView.this.C0();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x1 x1Var = StyledPlayerControlView.this.f18498h0;
            if (x1Var == null) {
                return;
            }
            StyledPlayerControlView.this.f18483a.S();
            if (StyledPlayerControlView.this.f18509n == view) {
                if (x1Var.t(9)) {
                    x1Var.y();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f18507m == view) {
                if (x1Var.t(7)) {
                    x1Var.r();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f18513p == view) {
                if (x1Var.getPlaybackState() == 4 || !x1Var.t(12)) {
                    return;
                }
                x1Var.G();
                return;
            }
            if (StyledPlayerControlView.this.f18515q == view) {
                if (x1Var.t(11)) {
                    x1Var.H();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f18511o == view) {
                r0.t0(x1Var);
                return;
            }
            if (StyledPlayerControlView.this.f18521t == view) {
                if (x1Var.t(15)) {
                    x1Var.setRepeatMode(f0.a(x1Var.getRepeatMode(), StyledPlayerControlView.this.f18516q0));
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f18523u == view) {
                if (x1Var.t(14)) {
                    x1Var.setShuffleModeEnabled(!x1Var.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f18531z == view) {
                StyledPlayerControlView.this.f18483a.R();
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.U(styledPlayerControlView.f18493f, StyledPlayerControlView.this.f18531z);
                return;
            }
            if (StyledPlayerControlView.this.A == view) {
                StyledPlayerControlView.this.f18483a.R();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.U(styledPlayerControlView2.f18495g, StyledPlayerControlView.this.A);
            } else if (StyledPlayerControlView.this.B == view) {
                StyledPlayerControlView.this.f18483a.R();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.U(styledPlayerControlView3.f18499i, StyledPlayerControlView.this.B);
            } else if (StyledPlayerControlView.this.f18527w == view) {
                StyledPlayerControlView.this.f18483a.R();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.U(styledPlayerControlView4.f18497h, StyledPlayerControlView.this.f18527w);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.f18528w0) {
                StyledPlayerControlView.this.f18483a.S();
            }
        }

        @Override // com.google.android.exoplayer2.ui.c0.a
        public void q(c0 c0Var, long j10) {
            if (StyledPlayerControlView.this.D != null) {
                StyledPlayerControlView.this.D.setText(r0.k0(StyledPlayerControlView.this.F, StyledPlayerControlView.this.G, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.c0.a
        public void u(c0 c0Var, long j10, boolean z10) {
            StyledPlayerControlView.this.f18510n0 = false;
            if (!z10 && StyledPlayerControlView.this.f18498h0 != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.k0(styledPlayerControlView.f18498h0, j10);
            }
            StyledPlayerControlView.this.f18483a.S();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void u(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class e extends RecyclerView.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f18534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f18535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18536c;

        public e(String[] strArr, float[] fArr) {
            this.f18534a = strArr;
            this.f18535b = fArr;
        }

        public static /* synthetic */ void f(e eVar, int i10, View view) {
            if (i10 != eVar.f18536c) {
                StyledPlayerControlView.this.setPlaybackSpeed(eVar.f18535b[i10]);
            }
            StyledPlayerControlView.this.f18503k.dismiss();
        }

        public String g() {
            return this.f18534a[this.f18536c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f18534a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.f18534a;
            if (i10 < strArr.length) {
                iVar.f18546b.setText(strArr[i10]);
            }
            if (i10 == this.f18536c) {
                iVar.itemView.setSelected(true);
                iVar.f18547c.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f18547c.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.e.f(this.f18635a, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(mb.o.f45485h, viewGroup, false));
        }

        public void j(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f18535b;
                if (i10 >= fArr.length) {
                    this.f18536c = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class g extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f18538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TextView f18539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ImageView f18540d;

        public g(View view) {
            super(view);
            if (r0.f48425a < 26) {
                view.setFocusable(true);
            }
            this.f18538b = (TextView) view.findViewById(mb.m.f45470u);
            this.f18539c = (TextView) view.findViewById(mb.m.P);
            this.f18540d = (ImageView) view.findViewById(mb.m.f45469t);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StyledPlayerControlView.g gVar = this.f18637a;
                    StyledPlayerControlView.this.h0(gVar.getAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends RecyclerView.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f18542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f18543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Drawable[] f18544c;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f18542a = strArr;
            this.f18543b = new String[strArr.length];
            this.f18544c = drawableArr;
        }

        private boolean j(int i10) {
            if (StyledPlayerControlView.this.f18498h0 == null) {
                return false;
            }
            if (i10 == 0) {
                return StyledPlayerControlView.this.f18498h0.t(13);
            }
            if (i10 != 1) {
                return true;
            }
            return StyledPlayerControlView.this.f18498h0.t(30) && StyledPlayerControlView.this.f18498h0.t(29);
        }

        public boolean f() {
            return j(1) || j(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            if (j(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.r(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.r(0, 0));
            }
            gVar.f18538b.setText(this.f18542a[i10]);
            if (this.f18543b[i10] == null) {
                gVar.f18539c.setVisibility(8);
            } else {
                gVar.f18539c.setText(this.f18543b[i10]);
            }
            if (this.f18544c[i10] == null) {
                gVar.f18540d.setVisibility(8);
            } else {
                gVar.f18540d.setImageDrawable(this.f18544c[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f18542a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return StyledPlayerControlView.this.new g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(mb.o.f45484g, viewGroup, false));
        }

        public void i(int i10, String str) {
            this.f18543b[i10] = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class i extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f18546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f18547c;

        public i(View view) {
            super(view);
            if (r0.f48425a < 26) {
                view.setFocusable(true);
            }
            this.f18546b = (TextView) view.findViewById(mb.m.S);
            this.f18547c = view.findViewById(mb.m.f45457h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.a f18549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18551c;

        public k(i2 i2Var, int i10, int i11, String str) {
            this.f18549a = (i2.a) i2Var.b().get(i10);
            this.f18550b = i11;
            this.f18551c = str;
        }

        public boolean a() {
            return this.f18549a.h(this.f18550b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    abstract class l extends RecyclerView.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected List f18552a = new ArrayList();

        protected l() {
        }

        public static /* synthetic */ void f(l lVar, x1 x1Var, ra.v vVar, k kVar, View view) {
            lVar.getClass();
            if (x1Var.t(29)) {
                x1Var.q(x1Var.x().A().G(new lb.w(vVar, com.google.common.collect.c0.D(Integer.valueOf(kVar.f18550b)))).J(kVar.f18549a.d(), false).A());
                lVar.k(kVar.f18551c);
                StyledPlayerControlView.this.f18503k.dismiss();
            }
        }

        protected void g() {
            this.f18552a = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f18552a.isEmpty()) {
                return 0;
            }
            return this.f18552a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: h */
        public void onBindViewHolder(i iVar, int i10) {
            final x1 x1Var = StyledPlayerControlView.this.f18498h0;
            if (x1Var == null) {
                return;
            }
            if (i10 == 0) {
                i(iVar);
                return;
            }
            final k kVar = (k) this.f18552a.get(i10 - 1);
            final ra.v vVarB = kVar.f18549a.b();
            boolean z10 = x1Var.x().f44264y.get(vVarB) != null && kVar.a();
            iVar.f18546b.setText(kVar.f18551c);
            iVar.f18547c.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.l.f(this.f18639a, x1Var, vVarB, kVar, view);
                }
            });
        }

        protected abstract void i(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(mb.o.f45485h, viewGroup, false));
        }

        protected abstract void k(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface m {
        void q(int i10);
    }

    static {
        o9.n.a("goog.exo.ui");
        f18482x0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        ImageView imageView;
        if (d0() && this.f18504k0 && (imageView = this.f18523u) != null) {
            x1 x1Var = this.f18498h0;
            if (!this.f18483a.A(imageView)) {
                o0(false, this.f18523u);
                return;
            }
            if (x1Var == null || !x1Var.t(14)) {
                o0(false, this.f18523u);
                this.f18523u.setImageDrawable(this.R);
                this.f18523u.setContentDescription(this.V);
            } else {
                o0(true, this.f18523u);
                this.f18523u.setImageDrawable(x1Var.getShuffleModeEnabled() ? this.Q : this.R);
                this.f18523u.setContentDescription(x1Var.getShuffleModeEnabled() ? this.U : this.V);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public void B0() {
        int i10;
        long jH0;
        h2.d dVar;
        long j10;
        x1 x1Var = this.f18498h0;
        if (x1Var == null) {
            return;
        }
        boolean z10 = true;
        this.f18508m0 = this.f18506l0 && S(x1Var, this.I);
        long j11 = 0;
        this.f18526v0 = 0L;
        h2 currentTimeline = x1Var.t(17) ? x1Var.getCurrentTimeline() : h2.f16987a;
        boolean zU = currentTimeline.u();
        long j12 = C.TIME_UNSET;
        if (!zU) {
            int iL = x1Var.l();
            boolean z11 = this.f18508m0;
            int i11 = z11 ? 0 : iL;
            int iT = z11 ? currentTimeline.t() - 1 : iL;
            i10 = 0;
            long j13 = 0;
            while (i11 <= iT) {
                if (i11 == iL) {
                    this.f18526v0 = r0.i1(j13);
                }
                currentTimeline.r(i11, this.I);
                h2.d dVar2 = this.I;
                boolean z12 = z10;
                long j14 = j11;
                if (dVar2.f17031n == j12) {
                    ob.a.g(this.f18508m0 ^ z12);
                    break;
                }
                int i12 = dVar2.f17032o;
                while (true) {
                    dVar = this.I;
                    if (i12 <= dVar.f17033p) {
                        currentTimeline.j(i12, this.H);
                        int iR = this.H.r();
                        int iF = this.H.f();
                        while (iR < iF) {
                            long jI = this.H.i(iR);
                            if (jI == Long.MIN_VALUE) {
                                j10 = j12;
                                long j15 = this.H.f17001d;
                                if (j15 != j10) {
                                    jI = j15;
                                }
                                iR++;
                                j12 = j10;
                            } else {
                                j10 = j12;
                            }
                            long jQ = jI + this.H.q();
                            if (jQ >= j14) {
                                long[] jArr = this.f18518r0;
                                if (i10 == jArr.length) {
                                    ?? length = jArr.length == 0 ? z12 : jArr.length * 2;
                                    this.f18518r0 = Arrays.copyOf(jArr, (int) length);
                                    this.f18520s0 = Arrays.copyOf(this.f18520s0, (int) length);
                                }
                                this.f18518r0[i10] = r0.i1(j13 + jQ);
                                this.f18520s0[i10] = this.H.s(iR);
                                i10++;
                            }
                            iR++;
                            j12 = j10;
                        }
                        i12++;
                    }
                }
                j13 += dVar.f17031n;
                i11++;
                z10 = z12;
                j11 = j14;
            }
            jH0 = j13;
        } else if (x1Var.t(16)) {
            long jC = x1Var.C();
            if (jC != C.TIME_UNSET) {
                jH0 = r0.H0(jC);
                i10 = 0;
            } else {
                i10 = 0;
                jH0 = 0;
            }
        } else {
            i10 = 0;
            jH0 = 0;
        }
        long jI1 = r0.i1(jH0);
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(r0.k0(this.F, this.G, jI1));
        }
        c0 c0Var = this.E;
        if (c0Var != null) {
            c0Var.setDuration(jI1);
            int length2 = this.f18522t0.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.f18518r0;
            if (i13 > jArr2.length) {
                this.f18518r0 = Arrays.copyOf(jArr2, i13);
                this.f18520s0 = Arrays.copyOf(this.f18520s0, i13);
            }
            System.arraycopy(this.f18522t0, 0, this.f18518r0, i10, length2);
            System.arraycopy(this.f18524u0, 0, this.f18520s0, i10, length2);
            this.E.b(this.f18518r0, this.f18520s0, i13);
        }
        v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        Z();
        o0(this.f18497h.getItemCount() > 0, this.f18527w);
        y0();
    }

    private static boolean S(x1 x1Var, h2.d dVar) {
        h2 currentTimeline;
        int iT;
        if (!x1Var.t(17) || (iT = (currentTimeline = x1Var.getCurrentTimeline()).t()) <= 1 || iT > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iT; i10++) {
            if (currentTimeline.r(i10, dVar).f17031n == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(RecyclerView.h hVar, View view) {
        this.f18491e.setAdapter(hVar);
        z0();
        this.f18528w0 = false;
        this.f18503k.dismiss();
        this.f18528w0 = true;
        this.f18503k.showAsDropDown(view, (getWidth() - this.f18503k.getWidth()) - this.f18505l, (-this.f18503k.getHeight()) - this.f18505l);
    }

    private com.google.common.collect.c0 V(i2 i2Var, int i10) {
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        com.google.common.collect.c0 c0VarB = i2Var.b();
        for (int i11 = 0; i11 < c0VarB.size(); i11++) {
            i2.a aVar2 = (i2.a) c0VarB.get(i11);
            if (aVar2.d() == i10) {
                for (int i12 = 0; i12 < aVar2.f17053a; i12++) {
                    if (aVar2.i(i12)) {
                        v0 v0VarC = aVar2.c(i12);
                        if ((v0VarC.f18860d & 2) == 0) {
                            aVar.a(new k(i2Var, i11, i12, this.f18501j.a(v0VarC)));
                        }
                    }
                }
            }
        }
        return aVar.m();
    }

    private static int W(TypedArray typedArray, int i10) {
        return typedArray.getInt(mb.s.Z, i10);
    }

    private void Z() {
        this.f18497h.g();
        this.f18499i.g();
        x1 x1Var = this.f18498h0;
        if (x1Var != null && x1Var.t(30) && this.f18498h0.t(29)) {
            i2 i2VarE = this.f18498h0.e();
            this.f18499i.n(V(i2VarE, 1));
            if (this.f18483a.A(this.f18527w)) {
                this.f18497h.m(V(i2VarE, 3));
            } else {
                this.f18497h.m(com.google.common.collect.c0.C());
            }
        }
    }

    private static void a0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private static boolean c0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(View view) {
        if (this.f18500i0 == null) {
            return;
        }
        boolean z10 = !this.f18502j0;
        this.f18502j0 = z10;
        q0(this.f18529x, z10);
        q0(this.f18530y, this.f18502j0);
        d dVar = this.f18500i0;
        if (dVar != null) {
            dVar.u(this.f18502j0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f18503k.isShowing()) {
            z0();
            this.f18503k.update(view, (getWidth() - this.f18503k.getWidth()) - this.f18505l, (-this.f18503k.getHeight()) - this.f18505l, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i10) {
        if (i10 == 0) {
            U(this.f18495g, (View) ob.a.e(this.f18531z));
        } else if (i10 == 1) {
            U(this.f18499i, (View) ob.a.e(this.f18531z));
        } else {
            this.f18503k.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(x1 x1Var, long j10) {
        if (this.f18508m0) {
            if (x1Var.t(17) && x1Var.t(10)) {
                h2 currentTimeline = x1Var.getCurrentTimeline();
                int iT = currentTimeline.t();
                int i10 = 0;
                while (true) {
                    long jF = currentTimeline.r(i10, this.I).f();
                    if (j10 < jF) {
                        break;
                    }
                    if (i10 == iT - 1) {
                        j10 = jF;
                        break;
                    } else {
                        j10 -= jF;
                        i10++;
                    }
                }
                x1Var.seekTo(i10, j10);
            }
        } else if (x1Var.t(5)) {
            x1Var.seekTo(j10);
        }
        v0();
    }

    private boolean l0() {
        x1 x1Var = this.f18498h0;
        if (x1Var == null || !x1Var.t(1)) {
            return false;
        }
        return (this.f18498h0.t(17) && this.f18498h0.getCurrentTimeline().u()) ? false : true;
    }

    private void o0(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.S : this.T);
    }

    private void p0() {
        x1 x1Var = this.f18498h0;
        int iD = (int) ((x1Var != null ? x1Var.D() : MBInterstitialActivity.WEB_LOAD_TIME) / 1000);
        TextView textView = this.f18517r;
        if (textView != null) {
            textView.setText(String.valueOf(iD));
        }
        View view = this.f18513p;
        if (view != null) {
            view.setContentDescription(this.f18485b.getQuantityString(mb.p.f45486a, iD, Integer.valueOf(iD)));
        }
    }

    private void q0(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f18490d0);
            imageView.setContentDescription(this.f18494f0);
        } else {
            imageView.setImageDrawable(this.f18492e0);
            imageView.setContentDescription(this.f18496g0);
        }
    }

    private static void r0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        boolean zT;
        boolean zT2;
        boolean zT3;
        boolean zT4;
        boolean zT5;
        if (d0() && this.f18504k0) {
            x1 x1Var = this.f18498h0;
            if (x1Var != null) {
                zT = (this.f18506l0 && S(x1Var, this.I)) ? x1Var.t(10) : x1Var.t(5);
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
            if (zT4) {
                x0();
            }
            if (zT5) {
                p0();
            }
            o0(zT3, this.f18507m);
            o0(zT4, this.f18515q);
            o0(zT5, this.f18513p);
            o0(zT2, this.f18509n);
            c0 c0Var = this.E;
            if (c0Var != null) {
                c0Var.setEnabled(zT);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        x1 x1Var = this.f18498h0;
        if (x1Var == null || !x1Var.t(13)) {
            return;
        }
        x1 x1Var2 = this.f18498h0;
        x1Var2.b(x1Var2.getPlaybackParameters().c(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        if (d0() && this.f18504k0 && this.f18511o != null) {
            boolean zX0 = r0.X0(this.f18498h0);
            int i10 = zX0 ? mb.k.f45440k : mb.k.f45439j;
            int i11 = zX0 ? mb.q.f45494g : mb.q.f45493f;
            ((ImageView) this.f18511o).setImageDrawable(r0.W(getContext(), this.f18485b, i10));
            this.f18511o.setContentDescription(this.f18485b.getString(i11));
            o0(l0(), this.f18511o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        x1 x1Var = this.f18498h0;
        if (x1Var == null) {
            return;
        }
        this.f18495g.j(x1Var.getPlaybackParameters().f18942a);
        this.f18493f.i(0, this.f18495g.g());
        y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        long contentPosition;
        long jF;
        if (d0() && this.f18504k0) {
            x1 x1Var = this.f18498h0;
            if (x1Var == null || !x1Var.t(16)) {
                contentPosition = 0;
                jF = 0;
            } else {
                contentPosition = this.f18526v0 + x1Var.getContentPosition();
                jF = this.f18526v0 + x1Var.F();
            }
            TextView textView = this.D;
            if (textView != null && !this.f18510n0) {
                textView.setText(r0.k0(this.F, this.G, contentPosition));
            }
            c0 c0Var = this.E;
            if (c0Var != null) {
                c0Var.setPosition(contentPosition);
                this.E.setBufferedPosition(jF);
            }
            removeCallbacks(this.J);
            int playbackState = x1Var == null ? 1 : x1Var.getPlaybackState();
            if (x1Var == null || !x1Var.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.J, 1000L);
                return;
            }
            c0 c0Var2 = this.E;
            long jMin = Math.min(c0Var2 != null ? c0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f10 = x1Var.getPlaybackParameters().f18942a;
            postDelayed(this.J, r0.r(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f18514p0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        ImageView imageView;
        if (d0() && this.f18504k0 && (imageView = this.f18521t) != null) {
            if (this.f18516q0 == 0) {
                o0(false, imageView);
                return;
            }
            x1 x1Var = this.f18498h0;
            if (x1Var == null || !x1Var.t(15)) {
                o0(false, this.f18521t);
                this.f18521t.setImageDrawable(this.K);
                this.f18521t.setContentDescription(this.N);
                return;
            }
            o0(true, this.f18521t);
            int repeatMode = x1Var.getRepeatMode();
            if (repeatMode == 0) {
                this.f18521t.setImageDrawable(this.K);
                this.f18521t.setContentDescription(this.N);
            } else if (repeatMode == 1) {
                this.f18521t.setImageDrawable(this.L);
                this.f18521t.setContentDescription(this.O);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f18521t.setImageDrawable(this.M);
                this.f18521t.setContentDescription(this.P);
            }
        }
    }

    private void x0() {
        x1 x1Var = this.f18498h0;
        int iJ = (int) ((x1Var != null ? x1Var.J() : 5000L) / 1000);
        TextView textView = this.f18519s;
        if (textView != null) {
            textView.setText(String.valueOf(iJ));
        }
        View view = this.f18515q;
        if (view != null) {
            view.setContentDescription(this.f18485b.getQuantityString(mb.p.f45487b, iJ, Integer.valueOf(iJ)));
        }
    }

    private void y0() {
        o0(this.f18493f.f(), this.f18531z);
    }

    private void z0() {
        this.f18491e.measure(0, 0);
        this.f18503k.setWidth(Math.min(this.f18491e.getMeasuredWidth(), getWidth() - (this.f18505l * 2)));
        this.f18503k.setHeight(Math.min(getHeight() - (this.f18505l * 2), this.f18491e.getMeasuredHeight()));
    }

    public void R(m mVar) {
        ob.a.e(mVar);
        this.f18489d.add(mVar);
    }

    public boolean T(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        x1 x1Var = this.f18498h0;
        if (x1Var == null || !c0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (x1Var.getPlaybackState() == 4 || !x1Var.t(12)) {
                return true;
            }
            x1Var.G();
            return true;
        }
        if (keyCode == 89 && x1Var.t(11)) {
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
            if (!x1Var.t(9)) {
                return true;
            }
            x1Var.y();
            return true;
        }
        if (keyCode == 88) {
            if (!x1Var.t(7)) {
                return true;
            }
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

    public void X() {
        this.f18483a.C();
    }

    public void Y() {
        this.f18483a.F();
    }

    public boolean b0() {
        return this.f18483a.I();
    }

    public boolean d0() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return T(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    void e0() {
        Iterator it = this.f18489d.iterator();
        while (it.hasNext()) {
            ((m) it.next()).q(getVisibility());
        }
    }

    public x1 getPlayer() {
        return this.f18498h0;
    }

    public int getRepeatToggleModes() {
        return this.f18516q0;
    }

    public boolean getShowShuffleButton() {
        return this.f18483a.A(this.f18523u);
    }

    public boolean getShowSubtitleButton() {
        return this.f18483a.A(this.f18527w);
    }

    public int getShowTimeoutMs() {
        return this.f18512o0;
    }

    public boolean getShowVrButton() {
        return this.f18483a.A(this.f18525v);
    }

    public void i0(m mVar) {
        this.f18489d.remove(mVar);
    }

    void j0() {
        View view = this.f18511o;
        if (view != null) {
            view.requestFocus();
        }
    }

    public void m0() {
        this.f18483a.X();
    }

    void n0() {
        t0();
        s0();
        w0();
        A0();
        C0();
        u0();
        B0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18483a.K();
        this.f18504k0 = true;
        if (b0()) {
            this.f18483a.S();
        }
        n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18483a.L();
        this.f18504k0 = false;
        removeCallbacks(this.J);
        this.f18483a.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f18483a.M(z10, i10, i11, i12, i13);
    }

    public void setAnimationEnabled(boolean z10) {
        this.f18483a.T(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f18500i0 = dVar;
        r0(this.f18529x, dVar != null);
        r0(this.f18530y, dVar != null);
    }

    public void setPlayer(x1 x1Var) {
        ob.a.g(Looper.myLooper() == Looper.getMainLooper());
        ob.a.a(x1Var == null || x1Var.w() == Looper.getMainLooper());
        x1 x1Var2 = this.f18498h0;
        if (x1Var2 == x1Var) {
            return;
        }
        if (x1Var2 != null) {
            x1Var2.o(this.f18487c);
        }
        this.f18498h0 = x1Var;
        if (x1Var != null) {
            x1Var.E(this.f18487c);
        }
        n0();
    }

    public void setRepeatToggleModes(int i10) {
        this.f18516q0 = i10;
        x1 x1Var = this.f18498h0;
        if (x1Var != null && x1Var.t(15)) {
            int repeatMode = this.f18498h0.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.f18498h0.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.f18498h0.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.f18498h0.setRepeatMode(2);
            }
        }
        this.f18483a.U(this.f18521t, i10 != 0);
        w0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f18483a.U(this.f18513p, z10);
        s0();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f18506l0 = z10;
        B0();
    }

    public void setShowNextButton(boolean z10) {
        this.f18483a.U(this.f18509n, z10);
        s0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f18483a.U(this.f18507m, z10);
        s0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f18483a.U(this.f18515q, z10);
        s0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f18483a.U(this.f18523u, z10);
        A0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f18483a.U(this.f18527w, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f18512o0 = i10;
        if (b0()) {
            this.f18483a.S();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f18483a.U(this.f18525v, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f18514p0 = r0.q(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f18525v;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            o0(onClickListener != null, this.f18525v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v35, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v36, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v38, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v39, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v56, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup, com.google.android.exoplayer2.ui.StyledPlayerControlView$a] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ?? r10;
        Context context2;
        boolean z19;
        super(context, attributeSet, i10);
        int resourceId = mb.o.f45481d;
        this.f18512o0 = 5000;
        this.f18516q0 = 0;
        this.f18514p0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, mb.s.W, i10, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(mb.s.Y, resourceId);
                this.f18512o0 = typedArrayObtainStyledAttributes.getInt(mb.s.f45528g0, this.f18512o0);
                this.f18516q0 = W(typedArrayObtainStyledAttributes, this.f18516q0);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45522d0, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45516a0, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45520c0, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45518b0, true);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45524e0, false);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45526f0, false);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(mb.s.f45530h0, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(mb.s.f45532i0, this.f18514p0));
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(mb.s.X, true);
                typedArrayObtainStyledAttributes.recycle();
                z11 = z24;
                z12 = z25;
                z10 = z26;
                z14 = z20;
                z15 = z21;
                z16 = z22;
                z13 = z27;
                z17 = z23;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        c cVar = new c();
        this.f18487c = cVar;
        this.f18489d = new CopyOnWriteArrayList();
        this.H = new h2.b();
        this.I = new h2.d();
        StringBuilder sb2 = new StringBuilder();
        this.F = sb2;
        this.G = new Formatter(sb2, Locale.getDefault());
        this.f18518r0 = new long[0];
        this.f18520s0 = new boolean[0];
        this.f18522t0 = new long[0];
        this.f18524u0 = new boolean[0];
        this.J = new Runnable() { // from class: mb.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f45565a.v0();
            }
        };
        this.C = (TextView) findViewById(mb.m.f45462m);
        this.D = (TextView) findViewById(mb.m.F);
        ImageView imageView = (ImageView) findViewById(mb.m.Q);
        this.f18527w = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(mb.m.f45468s);
        this.f18529x = imageView2;
        a0(imageView2, new View.OnClickListener() { // from class: mb.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45566a.f0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(mb.m.f45472w);
        this.f18530y = imageView3;
        a0(imageView3, new View.OnClickListener() { // from class: mb.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45566a.f0(view);
            }
        });
        View viewFindViewById = findViewById(mb.m.M);
        this.f18531z = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = findViewById(mb.m.E);
        this.A = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(mb.m.f45452c);
        this.B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        int i11 = mb.m.H;
        c0 c0Var = (c0) findViewById(i11);
        View viewFindViewById4 = findViewById(mb.m.I);
        if (c0Var != null) {
            this.E = c0Var;
            z18 = z10;
            r10 = 0;
            context2 = context;
        } else if (viewFindViewById4 != null) {
            z18 = z10;
            r10 = 0;
            context2 = context;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet2, mb.r.f45514a);
            defaultTimeBar.setId(i11);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.E = defaultTimeBar;
        } else {
            z18 = z10;
            r10 = 0;
            context2 = context;
            this.E = null;
        }
        c0 c0Var2 = this.E;
        if (c0Var2 != null) {
            c0Var2.a(cVar);
        }
        View viewFindViewById5 = findViewById(mb.m.D);
        this.f18511o = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(mb.m.G);
        this.f18507m = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(mb.m.f45473x);
        this.f18509n = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        Typeface typefaceG = d0.h.g(context2, mb.l.f45449a);
        ?? FindViewById = findViewById(mb.m.K);
        ?? r11 = FindViewById == 0 ? (TextView) findViewById(mb.m.L) : r10;
        this.f18519s = r11;
        if (r11 != 0) {
            r11.setTypeface(typefaceG);
        }
        FindViewById = FindViewById == 0 ? r11 : FindViewById;
        this.f18515q = FindViewById;
        if (FindViewById != 0) {
            FindViewById.setOnClickListener(cVar);
        }
        ?? FindViewById2 = findViewById(mb.m.f45466q);
        ?? r12 = FindViewById2 == 0 ? (TextView) findViewById(mb.m.f45467r) : r10;
        this.f18517r = r12;
        if (r12 != 0) {
            r12.setTypeface(typefaceG);
        }
        FindViewById2 = FindViewById2 == 0 ? r12 : FindViewById2;
        this.f18513p = FindViewById2;
        if (FindViewById2 != 0) {
            FindViewById2.setOnClickListener(cVar);
        }
        ImageView imageView4 = (ImageView) findViewById(mb.m.J);
        this.f18521t = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) findViewById(mb.m.N);
        this.f18523u = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        Resources resources = context2.getResources();
        this.f18485b = resources;
        this.S = resources.getInteger(mb.n.f45477b) / 100.0f;
        this.T = resources.getInteger(mb.n.f45476a) / 100.0f;
        View viewFindViewById8 = findViewById(mb.m.U);
        this.f18525v = viewFindViewById8;
        if (viewFindViewById8 != null) {
            o0(false, viewFindViewById8);
        }
        x xVar = new x(this);
        this.f18483a = xVar;
        xVar.T(z13);
        h hVar = new h(new String[]{resources.getString(mb.q.f45495h), resources.getString(mb.q.f45512y)}, new Drawable[]{r0.W(context2, resources, mb.k.f45446q), r0.W(context2, resources, mb.k.f45436g)});
        this.f18493f = hVar;
        this.f18505l = resources.getDimensionPixelSize(mb.j.f45426a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(mb.o.f45483f, r10);
        this.f18491e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f18503k = popupWindow;
        if (r0.f48425a < 23) {
            z19 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z19 = false;
        }
        popupWindow.setOnDismissListener(cVar);
        this.f18528w0 = true;
        this.f18501j = new mb.e(getResources());
        this.W = r0.W(context2, resources, mb.k.f45448s);
        this.f18484a0 = r0.W(context2, resources, mb.k.f45447r);
        this.f18486b0 = resources.getString(mb.q.f45489b);
        this.f18488c0 = resources.getString(mb.q.f45488a);
        this.f18497h = new j();
        this.f18499i = new b();
        this.f18495g = new e(resources.getStringArray(mb.h.f45424a), f18482x0);
        this.f18490d0 = r0.W(context2, resources, mb.k.f45438i);
        this.f18492e0 = r0.W(context2, resources, mb.k.f45437h);
        this.K = r0.W(context2, resources, mb.k.f45442m);
        this.L = r0.W(context2, resources, mb.k.f45443n);
        this.M = r0.W(context2, resources, mb.k.f45441l);
        this.Q = r0.W(context2, resources, mb.k.f45445p);
        this.R = r0.W(context2, resources, mb.k.f45444o);
        this.f18494f0 = resources.getString(mb.q.f45491d);
        this.f18496g0 = resources.getString(mb.q.f45490c);
        this.N = resources.getString(mb.q.f45497j);
        this.O = resources.getString(mb.q.f45498k);
        this.P = resources.getString(mb.q.f45496i);
        this.U = this.f18485b.getString(mb.q.f45501n);
        this.V = this.f18485b.getString(mb.q.f45500m);
        this.f18483a.U((ViewGroup) findViewById(mb.m.f45454e), true);
        this.f18483a.U(this.f18513p, z15);
        this.f18483a.U(this.f18515q, z14);
        this.f18483a.U(this.f18507m, z16);
        this.f18483a.U(this.f18509n, z17);
        this.f18483a.U(this.f18523u, z11);
        this.f18483a.U(this.f18527w, z12);
        this.f18483a.U(this.f18525v, z18);
        this.f18483a.U(this.f18521t, this.f18516q0 != 0 ? true : z19);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mb.v
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                this.f45567a.g0(view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class j extends l {
        private j() {
            super();
        }

        public static /* synthetic */ void l(j jVar, View view) {
            if (StyledPlayerControlView.this.f18498h0 == null || !StyledPlayerControlView.this.f18498h0.t(29)) {
                return;
            }
            StyledPlayerControlView.this.f18498h0.q(StyledPlayerControlView.this.f18498h0.x().A().B(3).F(-3).A());
            StyledPlayerControlView.this.f18503k.dismiss();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l, androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                iVar.f18547c.setVisibility(((k) this.f18552a.get(i10 + (-1))).a() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void i(i iVar) {
            boolean z10;
            iVar.f18546b.setText(mb.q.f45511x);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f18552a.size()) {
                    z10 = true;
                    break;
                } else {
                    if (((k) this.f18552a.get(i10)).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f18547c.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.j.l(this.f18638a, view);
                }
            });
        }

        public void m(List list) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (((k) list.get(i10)).a()) {
                    z10 = true;
                    break;
                }
            }
            if (StyledPlayerControlView.this.f18527w != null) {
                ImageView imageView = StyledPlayerControlView.this.f18527w;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z10 ? styledPlayerControlView.W : styledPlayerControlView.f18484a0);
                StyledPlayerControlView.this.f18527w.setContentDescription(z10 ? StyledPlayerControlView.this.f18486b0 : StyledPlayerControlView.this.f18488c0);
            }
            this.f18552a = list;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void k(String str) {
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }
}

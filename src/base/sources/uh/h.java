package uh;

import android.app.Application;
import androidx.lifecycle.v0;
import com.google.android.exoplayer2.x1;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends androidx.lifecycle.a implements androidx.lifecycle.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f54490l = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ng.d f54491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f54496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.lifecycle.p0 f54497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.lifecycle.p0 f54498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.lifecycle.n0 f54499k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(int i10) {
            int iIndexOf = sh.b.u().indexOf(Integer.valueOf(i10));
            return iIndexOf >= 1 ? ((Number) sh.b.u().get(iIndexOf - 1)).intValue() : i10;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f54500a;

        b(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f54500a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f54500a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f54500a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Application application, ng.d video) {
        super(application);
        kotlin.jvm.internal.s.h(application, "application");
        kotlin.jvm.internal.s.h(video, "video");
        this.f54491c = video;
        this.f54492d = new androidx.lifecycle.p0();
        this.f54494f = new androidx.lifecycle.p0(0L);
        this.f54495g = 720;
        this.f54497i = new androidx.lifecycle.p0(Float.valueOf(720.0f));
        this.f54498j = new androidx.lifecycle.p0(Float.valueOf(0.8f));
        final androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0();
        n0Var.r(this.f54497i, new b(new Function1() { // from class: uh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.n(n0Var, this, (Float) obj);
            }
        }));
        n0Var.r(this.f54498j, new b(new Function1() { // from class: uh.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.o(n0Var, this, (Float) obj);
            }
        }));
        this.f54499k = n0Var;
        this.f54495g = video.A() <= video.p() ? video.A() : video.p();
        this.f54496h = ((float) Math.rint((video.w() * 10.0f) / 1048576.0f)) / 10.0f;
        this.f54497i.q(Float.valueOf(f54490l.a(this.f54495g)));
        v0.f4510i.a().getLifecycle().a(this);
    }

    private final float m(float f10, float f11) {
        return ((float) Math.rint((sh.b.k(this.f54491c.w(), this.f54495g, f10, f11) * 10.0f) / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) / 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 n(androidx.lifecycle.n0 n0Var, h hVar, Float f10) {
        kotlin.jvm.internal.s.e(f10);
        float fFloatValue = f10.floatValue();
        Object objF = hVar.f54498j.f();
        kotlin.jvm.internal.s.e(objF);
        n0Var.q(Float.valueOf(hVar.m(fFloatValue, ((Number) objF).floatValue())));
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 o(androidx.lifecycle.n0 n0Var, h hVar, Float f10) {
        Object objF = hVar.f54497i.f();
        kotlin.jvm.internal.s.e(objF);
        float fFloatValue = ((Number) objF).floatValue();
        kotlin.jvm.internal.s.e(f10);
        n0Var.q(Float.valueOf(hVar.m(fFloatValue, f10.floatValue())));
        return fl.g0.f38750a;
    }

    private final void w() {
        androidx.lifecycle.p0 p0Var = this.f54492d;
        com.google.android.exoplayer2.k kVarE = new com.google.android.exoplayer2.k.b(j()).e();
        kVarE.A(y0.d(this.f54491c.b()));
        kVarE.setPlayWhenReady(this.f54493e);
        Long l10 = (Long) this.f54494f.f();
        if (l10 != null) {
            kVarE.seekTo(l10.longValue());
        }
        kVarE.a();
        p0Var.q(kVarE);
    }

    private final void x() {
        x1 x1Var = (x1) this.f54492d.f();
        if (x1Var != null) {
            this.f54494f.q(Long.valueOf(x1Var.getCurrentPosition()));
            this.f54493e = x1Var.getPlayWhenReady();
            x1Var.release();
        }
        this.f54492d.q(null);
    }

    @Override // androidx.lifecycle.p1
    protected void g() {
        super.g();
        x();
        v0.f4510i.a().getLifecycle().d(this);
    }

    @Override // androidx.lifecycle.j
    public void h(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        super.h(owner);
        if (ob.r0.f48425a <= 23 || this.f54492d.f() == null) {
            w();
        }
    }

    @Override // androidx.lifecycle.j
    public void i(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        super.i(owner);
        if (ob.r0.f48425a <= 23) {
            x();
        }
    }

    @Override // androidx.lifecycle.j
    public void onStart(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        super.onStart(owner);
        if (ob.r0.f48425a > 23) {
            w();
        }
    }

    @Override // androidx.lifecycle.j
    public void onStop(androidx.lifecycle.b0 owner) {
        kotlin.jvm.internal.s.h(owner, "owner");
        super.onStop(owner);
        if (ob.r0.f48425a > 23) {
            x();
        }
    }

    public final fl.q p(lg.a preferenceManager) {
        String string;
        int i10;
        kotlin.jvm.internal.s.h(preferenceManager, "preferenceManager");
        String str = nh.e.l(j(), preferenceManager) + File.separator + nh.e.d("_compress") + ".mp4";
        if (this.f54491c.A() <= this.f54491c.p()) {
            StringBuilder sb2 = new StringBuilder();
            Object objF = this.f54497i.f();
            kotlin.jvm.internal.s.e(objF);
            sb2.append(((Number) objF).floatValue());
            sb2.append(":-2");
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("-2:");
            Object objF2 = this.f54497i.f();
            kotlin.jvm.internal.s.e(objF2);
            sb3.append(((Number) objF2).floatValue());
            string = sb3.toString();
        }
        Float f10 = (Float) this.f54498j.f();
        if (kotlin.jvm.internal.s.a(f10, ((Number) sh.b.m().get(0)).floatValue())) {
            i10 = 35;
        } else {
            i10 = kotlin.jvm.internal.s.a(f10, ((Number) sh.b.m().get(1)).floatValue()) ? 29 : 23;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(" -y -i ");
        sb4.append('\"' + this.f54491c.t() + '\"');
        sb4.append(" -vf \"fps=30,scale=" + string + '\"');
        sb4.append(" -crf " + i10 + ' ');
        sb4.append("-c:v libx264 -c:a copy ");
        sb4.append(str);
        wp.a.a(sb4.toString(), new Object[0]);
        return new fl.q(sb4.toString(), str);
    }

    public final androidx.lifecycle.n0 q() {
        return this.f54499k;
    }

    public final int r() {
        return this.f54495g;
    }

    public final float s() {
        return this.f54496h;
    }

    public final androidx.lifecycle.k0 t() {
        return this.f54492d;
    }

    public final androidx.lifecycle.p0 u() {
        return this.f54498j;
    }

    public final androidx.lifecycle.p0 v() {
        return this.f54497i;
    }
}

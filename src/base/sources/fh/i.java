package fh;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.lifecycle.k0;
import androidx.lifecycle.p0;
import androidx.lifecycle.p1;
import androidx.lifecycle.q1;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import em.o0;
import fl.g0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xf.a f38681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f38682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p0 f38683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p0 f38684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p0 f38685f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f38686r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f38687s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ XmlResourceParser f38689u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(XmlResourceParser xmlResourceParser, kl.f fVar) {
            super(2, fVar);
            this.f38689u = xmlResourceParser;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return i.this.new a(this.f38689u, fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r6.j(r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r5.f38687s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r6)
                goto L55
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f38686r
                androidx.lifecycle.p0 r1 = (androidx.lifecycle.p0) r1
                fl.s.b(r6)
                goto L3e
            L22:
                fl.s.b(r6)
                fh.i r6 = fh.i.this
                androidx.lifecycle.p0 r1 = r6.r()
                fh.i r6 = fh.i.this
                xf.a r6 = r6.q()
                android.content.res.XmlResourceParser r4 = r5.f38689u
                r5.f38686r = r1
                r5.f38687s = r3
                java.lang.Object r6 = r6.b(r4, r5)
                if (r6 != r0) goto L3e
                goto L54
            L3e:
                wg.c r6 = (wg.c) r6
                java.lang.Object r6 = wg.d.a(r6)
                r1.q(r6)
                fh.i r6 = fh.i.this
                r1 = 0
                r5.f38686r = r1
                r5.f38687s = r2
                java.lang.Object r6 = r6.j(r5)
                if (r6 != r0) goto L55
            L54:
                return r0
            L55:
                fl.g0 r6 = fl.g0.f38750a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fh.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f38690r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ EncodeParam f38692t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EncodeParam encodeParam, kl.f fVar) {
            super(2, fVar);
            this.f38692t = encodeParam;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return i.this.new b(this.f38692t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f38690r;
            if (i10 == 0) {
                fl.s.b(obj);
                i iVar = i.this;
                EncodeParam encodeParam = this.f38692t;
                this.f38690r = 1;
                if (iVar.w(encodeParam, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    public i(xf.a parseAutoParamsUseCase) {
        kotlin.jvm.internal.s.h(parseAutoParamsUseCase, "parseAutoParamsUseCase");
        this.f38681b = parseAutoParamsUseCase;
        this.f38682c = new p0();
        this.f38683d = new p0();
        this.f38684e = new p0();
        this.f38685f = new p0();
    }

    protected abstract Object j(kl.f fVar);

    public final void k(Resources res) {
        kotlin.jvm.internal.s.h(res, "res");
        XmlResourceParser xml = res.getXml(R.xml.live_auto_params);
        kotlin.jvm.internal.s.g(xml, "getXml(...)");
        em.k.d(q1.a(this), null, null, new a(xml, null), 3, null);
    }

    public final k0 l() {
        return this.f38684e;
    }

    public final k0 m() {
        return this.f38685f;
    }

    public abstract k0 n();

    public final k0 o() {
        return this.f38683d;
    }

    public final k0 p() {
        return this.f38682c;
    }

    protected xf.a q() {
        return this.f38681b;
    }

    protected final p0 r() {
        return this.f38684e;
    }

    protected final p0 s() {
        return this.f38685f;
    }

    public abstract void t();

    public final void u() {
        this.f38683d.q(new wg.a(g0.f38750a));
    }

    public final void v() {
        this.f38682c.q(new wg.a(g0.f38750a));
    }

    protected abstract Object w(EncodeParam encodeParam, kl.f fVar);

    public final void x(String resolutionName) {
        kotlin.jvm.internal.s.h(resolutionName, "resolutionName");
        List<EncodeParam> list = (List) this.f38684e.f();
        if (list != null) {
            for (EncodeParam encodeParam : list) {
                if (encodeParam.getResolution().getName().equals(resolutionName)) {
                    this.f38685f.q(encodeParam);
                    em.k.d(q1.a(this), null, null, new b(encodeParam, null), 3, null);
                    return;
                }
            }
        }
    }
}

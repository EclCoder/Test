package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.inmobi.media.Nj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Nj extends AbstractC3082k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em.o0 f25358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Oj f25359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm.v f25360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3348u9 f25361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Tj f25363g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nj(Context context, em.o0 coroutineScope, Oj staticExperienceModel, hm.v mediaEventFlow, C3348u9 c3348u9) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(staticExperienceModel, "staticExperienceModel");
        kotlin.jvm.internal.s.h(mediaEventFlow, "mediaEventFlow");
        this.f25358b = coroutineScope;
        this.f25359c = staticExperienceModel;
        this.f25360d = mediaEventFlow;
        this.f25361e = c3348u9;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        this.f25362f = "Static-Image-" + string;
        int i10 = Tj.f25768b;
        kotlin.jvm.internal.s.h(context, "context");
        this.f25363g = new Tj(context);
    }

    @Override // com.inmobi.media.AbstractC3082k2
    public final void a(hm.w windowFlow) {
        kotlin.jvm.internal.s.h(windowFlow, "windowFlow");
    }

    @Override // com.inmobi.media.AbstractC3082k2
    public final void b() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3082k2
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) throws C3118lc {
        Ij ij2;
        List listZ0;
        if (dVar instanceof Ij) {
            ij2 = (Ij) dVar;
            int i10 = ij2.f25027c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ij2.f25027c = i10 - Integer.MIN_VALUE;
            } else {
                ij2 = new Ij(this, dVar);
            }
        } else {
            ij2 = new Ij(this, dVar);
        }
        Object obj = ij2.f25025a;
        Object objF = ll.b.f();
        int i11 = ij2.f25027c;
        if (i11 == 0) {
            fl.s.b(obj);
            C3348u9 c3348u9 = this.f25361e;
            if (c3348u9 != null) {
                c3348u9.a("StaticExperienceManager", "load Called - imageAssets count: " + this.f25359c.f25430a.size());
            }
            Map mapA = AbstractC3487zk.a(this.f25359c.f25431b.f25845a);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("MainImageLoadStarted", mapA, EnumC3281rk.SDK);
            List images = this.f25359c.f25430a;
            kotlin.jvm.internal.s.h(images, "images");
            ArrayList images2 = new ArrayList();
            for (Object obj2 : images) {
                Image image = (Image) obj2;
                if (URLUtil.isHttpUrl(image.getUrl()) || URLUtil.isHttpsUrl(image.getUrl())) {
                    images2.add(obj2);
                }
            }
            if (images2.isEmpty()) {
                C3348u9 c3348u10 = this.f25361e;
                if (c3348u10 != null) {
                    c3348u10.a("StaticExperienceManager", "Sanitized Images Empty - no valid images to load");
                }
                Map mapV = gl.l0.v(AbstractC3487zk.a(this.f25359c.f25431b.f25845a));
                mapV.put("errorCode", (short) 2351);
                C3178nk c3178nk2 = C3178nk.f27064a;
                C3178nk.b(obFGmWgqyy.iXMTLqe, mapV, EnumC3281rk.SDK);
                throw new C3118lc();
            }
            kotlin.jvm.internal.s.h(images2, "images");
            if (images2.size() > 1) {
                int iA = C5.a();
                int iOrdinal = C4.a().ordinal();
                if (iOrdinal == 2) {
                    listZ0 = images2;
                    listZ0 = gl.r.z0(images2, new Qj(iA));
                } else if (iOrdinal != 3) {
                    listZ0 = images2;
                    listZ0 = gl.r.z0(images2, new Rj());
                } else if (iA > 720) {
                    listZ0 = images2;
                    listZ0 = gl.r.z0(images2, new Sj());
                } else {
                    listZ0 = images2;
                    listZ0 = gl.r.z0(images2, new Pj(iA));
                }
            }
            listZ0 = images2;
            ImageView imageView = this.f25363g;
            ij2.f25027c = 1;
            if (a(listZ0, imageView, ij2) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        C3348u9 c3348u11 = this.f25361e;
        if (c3348u11 != null) {
            c3348u11.a("StaticExperienceManager", "Static Load Success");
        }
        Map mapA2 = AbstractC3487zk.a(this.f25359c.f25431b.f25845a);
        C3178nk c3178nk3 = C3178nk.f27064a;
        C3178nk.b("MainImageLoadSuccess", mapA2, EnumC3281rk.SDK);
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.AbstractC3082k2
    public final Object a(FrameLayout frameLayout, C3299sc c3299sc) {
        Object objJ = em.i.j(em.c1.c(), new Hj(this, frameLayout, null), c3299sc);
        return objJ == ll.b.f() ? objJ : fl.g0.f38750a;
    }

    @Override // com.inmobi.media.AbstractC3082k2
    public final void a() {
        ViewParent parent = this.f25363g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = Yf.f26082a;
        Yf.b(this.f26834a).cancelTag(this.f25362f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (em.i.j(r11, r0, r7) == r8) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r14, android.widget.ImageView r15, kotlin.coroutines.jvm.internal.d r16) {
        /*
            r13 = this;
            r0 = r16
            boolean r1 = r0 instanceof com.inmobi.media.Jj
            if (r1 == 0) goto L16
            r1 = r0
            com.inmobi.media.Jj r1 = (com.inmobi.media.Jj) r1
            int r3 = r1.f25083f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r1.f25083f = r3
        L14:
            r7 = r1
            goto L1c
        L16:
            com.inmobi.media.Jj r1 = new com.inmobi.media.Jj
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f25081d
            java.lang.Object r8 = ll.b.f()
            int r1 = r7.f25083f
            r9 = 2
            r3 = 1
            r10 = 0
            if (r1 == 0) goto L48
            if (r1 == r3) goto L3a
            if (r1 != r9) goto L32
            fl.s.b(r0)
            goto Lab
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.jvm.internal.g0 r1 = r7.f25080c
            android.widget.ImageView r3 = r7.f25079b
            java.util.List r4 = r7.f25078a
            fl.s.b(r0)
            r12 = r3
            r3 = r1
            r1 = r4
            r4 = r12
            goto L8e
        L48:
            fl.s.b(r0)
            com.inmobi.media.u9 r0 = r13.f25361e
            if (r0 == 0) goto L6e
            int r1 = r14.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadImagesIntoImageView - attempting to load "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " images"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "StaticExperienceManager"
            r0.a(r4, r1)
        L6e:
            kotlin.jvm.internal.g0 r1 = new kotlin.jvm.internal.g0
            r1.<init>()
            em.i2 r0 = em.c1.c()
            com.inmobi.media.Lj r4 = new com.inmobi.media.Lj
            r4.<init>(r13, r10)
            r7.f25078a = r14
            r7.f25079b = r15
            r7.f25080c = r1
            r7.f25083f = r3
            java.lang.Object r0 = em.i.j(r0, r4, r7)
            if (r0 != r8) goto L8b
            goto Laa
        L8b:
            r4 = r15
            r3 = r1
            r1 = r14
        L8e:
            r5 = r0
            android.graphics.Bitmap$Config r5 = (android.graphics.Bitmap.Config) r5
            em.k0 r11 = em.c1.b()
            com.inmobi.media.Kj r0 = new com.inmobi.media.Kj
            r6 = 0
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f25078a = r10
            r7.f25079b = r10
            r7.f25080c = r10
            r7.f25083f = r9
            java.lang.Object r0 = em.i.j(r11, r0, r7)
            if (r0 != r8) goto Lab
        Laa:
            return r8
        Lab:
            fl.g0 r0 = fl.g0.f38750a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Nj.a(java.util.List, android.widget.ImageView, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a(ImageView imageView, final Image image) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: yh.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Nj.a(this.f57917a, image, view);
            }
        });
    }

    public static final void a(Nj nj2, Image image, View view) {
        C3348u9 c3348u9 = nj2.f25361e;
        if (c3348u9 != null) {
            c3348u9.a("StaticExperienceManager", "Static Click Event");
        }
        em.k.d(nj2.f25358b, null, null, new Mj(image, nj2, null), 3, null);
    }
}

package com.inmobi.media;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.media.Kj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.squareup.picasso.Picasso;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Kj extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Nj f25131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f25132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView f25133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap.Config f25134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kj(List list, Nj nj2, kotlin.jvm.internal.g0 g0Var, ImageView imageView, Bitmap.Config config, kl.f fVar) {
        super(2, fVar);
        this.f25130b = list;
        this.f25131c = nj2;
        this.f25132d = g0Var;
        this.f25133e = imageView;
        this.f25134f = config;
    }

    public static final void a(Nj nj2, ImageView imageView, fl.q qVar) {
        C3348u9 c3348u9 = nj2.f25361e;
        if (c3348u9 != null) {
            c3348u9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        nj2.a(imageView, (Image) qVar.i());
        imageView.setImageBitmap((Bitmap) qVar.h());
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Kj kj2 = new Kj(this.f25130b, this.f25131c, this.f25132d, this.f25133e, this.f25134f, fVar);
        kj2.f25129a = obj;
        return kj2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Kj) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws C3118lc {
        final fl.q qVar;
        Object objB;
        ll.b.f();
        fl.s.b(obj);
        List list = this.f25130b;
        Nj nj2 = this.f25131c;
        Bitmap.Config config = this.f25134f;
        kotlin.jvm.internal.g0 g0Var = this.f25132d;
        Iterator it = list.iterator();
        do {
            qVar = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            C3348u9 c3348u9 = nj2.f25361e;
            if (c3348u9 != null) {
                c3348u9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                fl.r.a aVar = fl.r.f38769b;
                Picasso picasso = Yf.f26082a;
                objB = fl.r.b(Yf.b(nj2.f26834a).load(image.getUrl()).tag(nj2.f25362f).transform(new Tf(config)).get());
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                objB = fl.r.b(fl.s.a(th2));
            }
            Throwable thE = fl.r.e(objB);
            if (thE != null) {
                C3348u9 c3348u10 = nj2.f25361e;
                if (c3348u10 != null) {
                    c3348u10.a("StaticExperienceManager", "Bitmap Failure " + image.getUrl() + " " + thE.getMessage());
                }
                if (thE instanceof C3040ib) {
                    g0Var.f43588a = true;
                }
            }
            if (fl.r.h(objB)) {
                objB = null;
            }
            Bitmap bitmap = (Bitmap) objB;
            if (bitmap != null) {
                qVar = new fl.q(bitmap, image);
            }
        } while (qVar == null);
        if (qVar != null) {
            final ImageView imageView = this.f25133e;
            final Nj nj3 = this.f25131c;
            return kotlin.coroutines.jvm.internal.b.a(imageView.post(new Runnable() { // from class: yh.y1
                @Override // java.lang.Runnable
                public final void run() {
                    Kj.a(nj3, imageView, qVar);
                }
            }));
        }
        C3348u9 c3348u11 = this.f25131c.f25361e;
        if (c3348u11 != null) {
            c3348u11.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
        }
        Nj nj4 = this.f25131c;
        boolean z10 = this.f25132d.f43588a;
        nj4.getClass();
        short s10 = z10 ? (short) 81 : (short) 82;
        Map mapV = gl.l0.v(AbstractC3487zk.a(nj4.f25359c.f25431b.f25845a));
        mapV.put("errorCode", Short.valueOf(s10));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("MainImageLoadFailure", mapV, EnumC3281rk.SDK);
        throw new C3118lc();
    }
}

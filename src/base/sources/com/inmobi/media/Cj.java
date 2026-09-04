package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.Cj;
import com.squareup.picasso.Picasso;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Cj extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Tj f24619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ej f24620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bitmap.Config f24622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj(Tj tj2, Ej ej2, String str, Bitmap.Config config, kl.f fVar) {
        super(2, fVar);
        this.f24619b = tj2;
        this.f24620c = ej2;
        this.f24621d = str;
        this.f24622e = config;
    }

    public static final void a(Tj tj2, Bitmap bitmap) {
        tj2.setImageBitmap(bitmap);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Cj cj2 = new Cj(this.f24619b, this.f24620c, this.f24621d, this.f24622e, fVar);
        cj2.f24618a = obj;
        return cj2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Cj) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws C3092kc {
        Object objB;
        C3348u9 c3348u9;
        ll.b.f();
        fl.s.b(obj);
        Ej ej2 = this.f24620c;
        String str = this.f24621d;
        Bitmap.Config config = this.f24622e;
        try {
            fl.r.a aVar = fl.r.f38769b;
            Picasso picasso = Yf.f26082a;
            objB = fl.r.b(Yf.b(ej2.f24728a).load(str).tag(ej2.f24730c).transform(new Tf(config)).get());
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        Ej ej3 = this.f24620c;
        Throwable thE = fl.r.e(objB);
        if (thE != null && (c3348u9 = ej3.f24729b) != null) {
            c3348u9.b("StaticCompanionLoader", "Companion Load Exception: " + thE.getMessage());
        }
        if (fl.r.h(objB)) {
            objB = null;
        }
        final Bitmap bitmap = (Bitmap) objB;
        if (bitmap == null) {
            throw new C3092kc("Companion Load Error");
        }
        final Tj tj2 = this.f24619b;
        return kotlin.coroutines.jvm.internal.b.a(tj2.post(new Runnable() { // from class: yh.c1
            @Override // java.lang.Runnable
            public final void run() {
                Cj.a(tj2, bitmap);
            }
        }));
    }
}

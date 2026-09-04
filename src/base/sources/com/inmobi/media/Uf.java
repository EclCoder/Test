package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Uf extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nm.a f25837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f25838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f25841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uf(Context context, kl.f fVar) {
        super(2, fVar);
        this.f25841e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Uf uf2 = new Uf(this.f25841e, fVar);
        uf2.f25840d = obj;
        return uf2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Uf uf2 = new Uf(this.f25841e, (kl.f) obj2);
        uf2.f25840d = (em.o0) obj;
        return uf2.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        nm.a aVar;
        Context context;
        WeakReference weakReference;
        Object objF = ll.b.f();
        int i10 = this.f25839c;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f25840d;
            aVar = Yf.f26083b;
            Context context2 = this.f25841e;
            this.f25840d = o0Var;
            this.f25837a = aVar;
            this.f25838b = context2;
            this.f25839c = 1;
            if (aVar.e(null, this) == objF) {
                return objF;
            }
            context = context2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.f25838b;
            aVar = this.f25837a;
            fl.s.b(obj);
        }
        try {
            int size = Yf.f26084c.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = Yf.f26084c;
                if (kotlin.jvm.internal.s.c((Context) ((WeakReference) arrayList.get(i11)).get(), context)) {
                    weakReference = (WeakReference) arrayList.get(i11);
                    break;
                }
                i11++;
            }
            if (weakReference == null) {
                Yf.f26084c.add(new WeakReference(context));
            }
            Picasso picassoA = Yf.f26082a;
            if (picassoA == null) {
                Xi.a(context, Yf.f26085d);
                picassoA = Yf.a(context);
                Yf.f26082a = picassoA;
            }
            return picassoA;
        } finally {
            aVar.f(null);
        }
    }
}

package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3380vf extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f27723a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3380vf(Context context, kl.f fVar) {
        super(2, fVar);
        this.f27723a = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3380vf(this.f27723a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3380vf(this.f27723a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C3432xf c3432xf = C3432xf.f27854a;
        Context context = this.f27723a;
        Af af2 = C3432xf.f27856c;
        if (af2 == null) {
            af2 = new Af(context);
            C3432xf.f27856c = af2;
        }
        String strA = af2.f24474a.a("omid_js_string");
        if (strA != null) {
            return strA;
        }
        Context context2 = this.f27723a;
        int i10 = R.raw.inmobi_omid_js;
        kotlin.jvm.internal.s.h(context2, "<this>");
        try {
            InputStream inputStreamOpenRawResource = context2.getResources().openRawResource(i10);
            kotlin.jvm.internal.s.g(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, bm.d.f9079b), 8192);
            try {
                String strC = ql.k.c(bufferedReader);
                ql.b.a(bufferedReader, null);
                return strC;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }
}

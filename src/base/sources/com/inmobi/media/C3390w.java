package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3390w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f27750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.AdChoiceConfig f27751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3348u9 f27752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27753e;

    public C3390w(Context context, Image image, AdConfig.AdChoiceConfig adChoiceConfig, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(adChoiceConfig, "adChoiceConfig");
        this.f27749a = context;
        this.f27750b = image;
        this.f27751c = adChoiceConfig;
        this.f27752d = c3348u9;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        this.f27753e = "AdChoice-Image-" + string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C3390w c3390w, Tj tj2, String str, int i10, kotlin.coroutines.jvm.internal.d dVar) {
        C3286s c3286s;
        c3390w.getClass();
        if (dVar instanceof C3286s) {
            c3286s = (C3286s) dVar;
            int i11 = c3286s.f27422c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3286s.f27422c = i11 - Integer.MIN_VALUE;
            } else {
                c3286s = new C3286s(c3390w, dVar);
            }
        } else {
            c3286s = new C3286s(c3390w, dVar);
        }
        Object objD = c3286s.f27420a;
        Object objF = ll.b.f();
        int i12 = c3286s.f27422c;
        if (i12 == 0) {
            fl.s.b(objD);
            C3364v c3364v = new C3364v(c3390w, str, tj2, null);
            c3286s.f27422c = 1;
            objD = em.z2.d(i10, c3364v, c3286s);
            if (objD == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objD);
        }
        Boolean bool = (Boolean) objD;
        return kotlin.coroutines.jvm.internal.b.a(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    public final Object a(Gd gd2) {
        String url;
        int width;
        int height;
        Image image = this.f27750b;
        if (image == null || (url = image.getUrl()) == null) {
            url = this.f27751c.getUrl();
        } else {
            if (!URLUtil.isNetworkUrl(url)) {
                url = null;
            }
            if (url == null) {
                url = this.f27751c.getUrl();
            }
        }
        String str = url;
        Image image2 = this.f27750b;
        if (image2 != null) {
            int width2 = image2.getWidth();
            Integer numValueOf = Integer.valueOf(width2);
            if (width2 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                width = numValueOf.intValue();
            } else {
                width = this.f27751c.getWidth();
            }
        } else {
            width = this.f27751c.getWidth();
        }
        int i10 = width;
        Image image3 = this.f27750b;
        if (image3 != null) {
            int height2 = image3.getHeight();
            Integer numValueOf2 = height2 > 0 ? Integer.valueOf(height2) : null;
            if (numValueOf2 != null) {
                height = numValueOf2.intValue();
            } else {
                height = this.f27751c.getHeight();
            }
        } else {
            height = this.f27751c.getHeight();
        }
        int i11 = height;
        int loadTimeout = this.f27751c.getLoadTimeout();
        if (!URLUtil.isNetworkUrl(str)) {
            C3348u9 c3348u9 = this.f27752d;
            if (c3348u9 != null) {
                c3348u9.b("AdChoiceViewManager", "Invalid URL: " + str);
            }
            throw new C3118lc();
        }
        return em.i.j(em.c1.c(), new r(this, str, loadTimeout, i10, i11, null), gd2);
    }
}

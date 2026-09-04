package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Picasso f26082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nm.a f26083b = nm.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f26084c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Xf f26085d = new Xf();

    public static final Picasso a(Context context) {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        Picasso picassoBuild = new Picasso.Builder(context).downloader(new OkHttp3Downloader(new gn.b0.a().a(new F8(((long) ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getNative().getAssetConfig().getMaxImageSize()) * 1024 * ((long) UserVerificationMethods.USER_VERIFY_ALL))).c())).build();
        kotlin.jvm.internal.s.g(picassoBuild, "build(...)");
        return picassoBuild;
    }

    public static Picasso b(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        return (Picasso) em.j.b(null, new Uf(context, null), 1, null);
    }
}
